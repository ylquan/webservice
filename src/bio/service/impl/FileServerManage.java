package bio.service.impl;

import java.util.List;


import bio.dao.FileServerDao;
import bio.po.FileServer;
import bio.service.FileServerService;

public class FileServerManage implements FileServerService{
	
	private FileServerDao fileserverdao; 
	
	public void setFileServerDao(FileServerDao fileserverdao) {
		this.fileserverdao = fileserverdao;
	}
	
	
	public boolean addFileServer(FileServer fileserver) {
		// TODO Auto-generated method stub
		return this.fileserverdao.addFileServer(fileserver);
	}

	
	public boolean delFileServer(String serverid) {
		// TODO Auto-generated method stub
		return this.fileserverdao.delFileServer(serverid);
	}

	
	public boolean modFileServerIpAddr(String serverid, String serveripaddr) {
		// TODO Auto-generated method stub
		return this.fileserverdao.modFileServerIpAddr(serverid, serveripaddr);
	}

	
	public boolean modFileServerType(String serverid, int type) {
		// TODO Auto-generated method stub
		return this.fileserverdao.modFileServerType(serverid, type);
	}

	
	public boolean modFileServerPortNum(String serverid, int portnum) {
		// TODO Auto-generated method stub
		return this.fileserverdao.modFileServerPortNum(serverid, portnum);
	}

	
	public boolean modFileServerName(String serverid, String servername) {
		// TODO Auto-generated method stub
		return this.fileserverdao.modFileServerName(serverid, servername);
	}

	
	public FileServer viewFileServer(String serverid) {
		// TODO Auto-generated method stub
		return this.fileserverdao.viewFileServer(serverid);
	}

	
	public List<FileServer> viewAllFileServer(int pageNow, int pageSize) {
		// TODO Auto-generated method stub
		return this.fileserverdao.viewAllFileServer(pageNow, pageSize);
	}

	
	public List<FileServer> viewFileServer() {
		// TODO Auto-generated method stub
		return this.fileserverdao.viewAllFileServer();
	}

}
