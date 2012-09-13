package bio.dao.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import bio.dao.UserInfoDao;
import bio.po.Role;
import bio.po.UserInfo;

public class UserInfoDaoImpl extends HibernateDaoSupport implements UserInfoDao  {

	public boolean addUserInfo(UserInfo user) {
		// TODO Auto-generated method stub
		/*UUID应该在用户提交申请时加上*/
		//user.setId(UUID.randomUUID().toString().toString().replaceAll("-",""));写在usermanage中
		user.setPasswd(getMD5Str(user.getPasswd()));
		try {
			getHibernateTemplate().save(user);
			// log.debug("save successful");
		} catch (RuntimeException ex ) {
			// log.error("save failed", re);
		}
		return true;
	}

	public int countSubUser(String user_id) {
		// TODO Auto-generated method stub
		String hql = 	"from UserInfo where fatherid = ? ";
		List<UserInfo> list = getHibernateTemplate().find(hql,user_id);		
		if(list==null)
			return 0;
		return list.size();
	}

	public boolean delUserInfo(String user_id) {
		// TODO Auto-generated method stub
		try {
			Object userinfo = getHibernateTemplate().load(UserInfo.class, user_id);
			getHibernateTemplate().delete(userinfo);
		} catch (RuntimeException e) {
			// TODO: handle exception
		}
		return true;
	}

	public boolean isExistAccount(String user_account, String user_password) {
		// TODO Auto-generated method stub
		String hql = "from UserInfo where account = ? and passwd = ?";
		String password = getMD5Str(user_password);
        Object[] params = new Object[]{user_account, password};
		List<UserInfo> list = getHibernateTemplate().find(hql, params);
		if(list.size() > 0)
			return true;
		else
		    return false;
	}

	public boolean isExistRelation(String user_id, String child_user_id) {
		// TODO Auto-generated method stub
		String hql = "from UserInfo where id = ? and fatherid = ?";
        Object[] params = new Object[]{child_user_id, user_id};
		List<UserInfo> list = getHibernateTemplate().find(hql, params);
		if(list.size() > 0)
			return true;
		else
		    return false;
	}

	public boolean modUserInfo(UserInfo user) {
		// TODO Auto-generated method stub
		return false;
	}


	public List<UserInfo> viewSubUsersInfo(String user_id) {
		// TODO Auto-generated method stub
		String hql = 	"from UserInfo where fatherid = ? ";
		List<UserInfo> list = getHibernateTemplate().find(hql,user_id);		
		return list;
	}

	public UserInfo viewUserInfo(String user_account) {
		// TODO Auto-generated method stub
		String hql = 	"from UserInfo where account = ? ";
		List<UserInfo> list = getHibernateTemplate().find(hql,user_account);		
		if(list==null)
			return null;
		return list.get(0);
	}
	
	private String getMD5Str(String str) {  
        MessageDigest messageDigest = null;  
  
        try {  
            messageDigest = MessageDigest.getInstance("MD5");  
  
            messageDigest.reset();  
  
            messageDigest.update(str.getBytes("UTF-8"));  
        } catch (NoSuchAlgorithmException e) {  
            System.out.println("NoSuchAlgorithmException caught!");  
            System.exit(-1);  
        } catch (UnsupportedEncodingException e) {  
            e.printStackTrace();  
        }  
  
        byte[] byteArray = messageDigest.digest();  
  
        StringBuffer md5StrBuff = new StringBuffer();  
  
        for (int i = 0; i < byteArray.length; i++) {              
            if (Integer.toHexString(0xFF & byteArray[i]).length() == 1)  
                md5StrBuff.append("0").append(Integer.toHexString(0xFF & byteArray[i]));  
            else  
                md5StrBuff.append(Integer.toHexString(0xFF & byteArray[i]));  
        }  
  
        return md5StrBuff.toString();  
    }

	public boolean modUserStatus(String user_id,int state) {
		// TODO Auto-generated method stub
		UserInfo userInfo = (UserInfo) getHibernateTemplate().get(UserInfo.class, user_id);
		if (userInfo == null)
			return false;
		else {
			userInfo.setStatus(state);
			getHibernateTemplate().update(userInfo);
			return true;
		}
	}

	public List<UserInfo> viewUserInfoStatus(int state) {
		// TODO Auto-generated method stub
		String hql = 	"from UserInfo where type = ? ";
		List<UserInfo> list = getHibernateTemplate().find(hql,state);		
		return list;
	}  
	public String getId(String account)
	{
		String hql="select UserInfo.id from UserInfo where account = ?";
		List<String> list=getHibernateTemplate().find(hql, account);
		if(list==null)
			return "";
		return list.get(0);
	}
}
