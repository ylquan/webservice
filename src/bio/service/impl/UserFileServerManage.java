package bio.service.impl;

import java.util.List;

import bio.dao.UserFileServerDao;
import bio.po.UserFileserver;
import bio.service.UserFileServerService;

public class UserFileServerManage implements UserFileServerService{

	private UserFileServerDao userfileserverdao;
	
	public void setUserFileServerDao(UserFileServerDao userfileserverdao){
		
		this.userfileserverdao = userfileserverdao;
	}
	
	public boolean addUserFileServer(UserFileserver userfileserver) {
		// TODO Auto-generated method stub
		return this.userfileserverdao.addUserFileServer(userfileserver);
	}

	
	public boolean delUserFileServer(String usrid, String serverid) {
		// TODO Auto-generated method stub
		return this.userfileserverdao.delUserFileServer(usrid, serverid);
	}

	
	public boolean modUserFileServerPassword(String usrid, String serverid,
			String usrpasswd) {
		// TODO Auto-generated method stub
		return this.userfileserverdao.modUserFileServerPassword(usrid, serverid, usrpasswd);
	}

	
	public boolean modUserFileServerFilePath(String usrid, String serverid,
			String path) {
		// TODO Auto-generated method stub
		return this.userfileserverdao.modUserFileServerFilePath(usrid, serverid, path);
	}

	
	public List<UserFileserver> viewAllUserFileServer(int pageNow, int pageSize) {
		// TODO Auto-generated method stub
		return this.userfileserverdao.viewAllUserFileServer(pageNow, pageSize);
	}

	
	public UserFileserver viewUserFileServer(String usrid, String serverid) {
		// TODO Auto-generated method stub
		return this.userfileserverdao.viewUserFileServer(usrid, serverid);
	}

}
