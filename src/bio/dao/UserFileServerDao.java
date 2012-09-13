package bio.dao;

import bio.po.UserFileserver;
import java.util.List;

public interface UserFileServerDao {
	boolean addUserFileServer(UserFileserver userfileserver);//添加用户服务器账号
	boolean delUserFileServer(String usrid,String serverid);//删除用户账号信息
	boolean modUserFileServerPassword(String usrid, String serverid,String usrpasswd);//修改用户账号密码（目前只允许修改密码不允许修改账号）
	
	
	
	boolean modUserFileServerFilePath(String usrid, String serverid,String path);//修改用户文件服务器的路径名称
	
	
	List <UserFileserver> viewAllUserFileServer(int pageNow,int pageSize);//查看所有的用户账号信息
	UserFileserver viewUserFileServer(String usrid,String serverid);//查看某个账号信息
	
	List<UserFileserver> viewAllUserFileServer();
}
