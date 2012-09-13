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
	/*boolean addUserFileServer(UserFileserver userfileserver);//����û��������˺�
	boolean delUserFileServer(String usrid,String serverid);//ɾ���û��˺���Ϣ
	boolean modUserFileServerPassword(String usrid, String serverid,String usrpasswd);//�޸��û��˺����루Ŀǰֻ�����޸����벻�����޸��˺ţ�
	
	
	
	boolean modUserFileServerFilePath(String usrid, String serverid,String path);//�޸��û��ļ���������·������
	
	
	List <UserFileserver> viewAllUserFileServer(int pageNow,int pageSize);//�鿴���е��û��˺���Ϣ
	UserFileserver viewUserFileServer(String usrid,String serverid);//�鿴ĳ���˺���Ϣ
*/
	public static void main(String[] args) throws Exception {
		ApplicationContext context=new FileSystemXmlApplicationContext("src/applicationContext.xml");
		UserFileServerDao userfileserverdao=(UserFileServerDao)context.getBean("userFileServerDao");
		
		//��������ѳɹ�
		
		  /*UserFileserverId usid = new UserFileserverId();
		  usid.setUsrid("testHibernate");
		  usid.setServerid("1");
		  UserFileserver userfileserver = new UserFileserver();
		  userfileserver.setId(usid);
		  userfileserver.setUsrname("ftpadmin");
		  userfileserver.setFilepath("asdfasdf");
		  userfileserver.setUsrpasswd("ftppassword");
		  
		  userfileserverdao.addUserFileServer(userfileserver);*/
		  
		
		//����ɾ�� �ѳɹ�
		//System.out.println(userfileserverdao.delUserFileServer("testHibernate", "1"));
		
		
		
		//�����޸����� �ѳɹ�
		//	System.out.println(userfileserverdao.modUserFileServerPassword("testHibernate", "1", "123456"));
		
		//�����޸��ļ�·�� �ѳɹ�
		//	System.out.println(userfileserverdao.modUserFileServerFilePath("testHibernate", "1", "123456"));
		
		//�����޸����� �ѳɹ�
			System.out.println(userfileserverdao.viewUserFileServer("testHibernate", "1").getFilepath());
		//���Է�ҳ
		/*List<UserFileserver> list = userfileserverdao.viewAllUserFileServer(0, 5);
		System.out.println(list.get(0).getUsrname());*/
		/*List<UserFileserver> list = userfileserverdao.viewAllUserFileServer();
		System.out.println(list.get(0).getUsrname());*/
		
		}
}
