package bio.dao;

import bio.po.UserFileserver;
import java.util.List;

public interface UserFileServerDao {
	boolean addUserFileServer(UserFileserver userfileserver);//����û��������˺�
	boolean delUserFileServer(String usrid,String serverid);//ɾ���û��˺���Ϣ
	boolean modUserFileServerPassword(String usrid, String serverid,String usrpasswd);//�޸��û��˺����루Ŀǰֻ�����޸����벻�����޸��˺ţ�
	
	
	
	boolean modUserFileServerFilePath(String usrid, String serverid,String path);//�޸��û��ļ���������·������
	
	
	List <UserFileserver> viewAllUserFileServer(int pageNow,int pageSize);//�鿴���е��û��˺���Ϣ
	UserFileserver viewUserFileServer(String usrid,String serverid);//�鿴ĳ���˺���Ϣ
	
	List<UserFileserver> viewAllUserFileServer();
}
