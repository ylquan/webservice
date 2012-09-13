package test.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import bio.dao.FileServerDao;
import bio.dao.UserFileServerDao;
import bio.dto.xsd.UserRespDto;
import bio.po.UserFileserver;
import bio.po.UserFileserverId;
import bio.po.UserInfo;
import bio.user.manager.UserManage;
import bio.util.dto2po;

public class testUserFileServerDao {
	/*boolean addUserFileServer(UserFileserver userfileserver);//添加用户服务器账号
	boolean delUserFileServer(String usrid,String serverid);//删除用户账号信息
	boolean modUserFileServerPassword(String usrid, String serverid,String usrpasswd);//修改用户账号密码（目前只允许修改密码不允许修改账号）
	
	
	
	boolean modUserFileServerFilePath(String usrid, String serverid,String path);//修改用户文件服务器的路径名称
	
	
	List <UserFileserver> viewAllUserFileServer(int pageNow,int pageSize);//查看所有的用户账号信息
	UserFileserver viewUserFileServer(String usrid,String serverid);//查看某个账号信息
*/
	public static void main(String[] args) throws Exception {
		ApplicationContext context=new FileSystemXmlApplicationContext("src/applicationContext.xml");
		UserFileServerDao userfileserverdao=(UserFileServerDao)context.getBean("userFileServerDao");
		
		//测试添加已成功
		
		  /*UserFileserverId usid = new UserFileserverId();
		  usid.setUsrid("testHibernate");
		  usid.setServerid("1");
		  UserFileserver userfileserver = new UserFileserver();
		  userfileserver.setId(usid);
		  userfileserver.setUsrname("ftpadmin");
		  userfileserver.setFilepath("asdfasdf");
		  userfileserver.setUsrpasswd("ftppassword");
		  
		  userfileserverdao.addUserFileServer(userfileserver);*/
		  
		
		//测试删除 已成功
		//System.out.println(userfileserverdao.delUserFileServer("testHibernate", "1"));
		
		
		
		//测试修改密码 已成功
		//	System.out.println(userfileserverdao.modUserFileServerPassword("testHibernate", "1", "123456"));
		
		//测试修改文件路径 已成功
		//	System.out.println(userfileserverdao.modUserFileServerFilePath("testHibernate", "1", "123456"));
		
		//测试修改密码 已成功
			System.out.println(userfileserverdao.viewUserFileServer("testHibernate", "1").getFilepath());
		//测试分页
		/*List<UserFileserver> list = userfileserverdao.viewAllUserFileServer(0, 5);
		System.out.println(list.get(0).getUsrname());*/
		/*List<UserFileserver> list = userfileserverdao.viewAllUserFileServer();
		System.out.println(list.get(0).getUsrname());*/
		
		}
}
