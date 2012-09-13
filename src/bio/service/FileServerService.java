package bio.service;

import java.util.List;

import bio.po.FileServer;

public interface FileServerService {
	boolean addFileServer(FileServer fileserver);//增加文件服务器
	boolean delFileServer(String serverid);//删除文件服务器
	boolean modFileServerIpAddr(String serverid,String serveripaddr);//修改文件服务器ip地址
	boolean modFileServerType(String serverid,int type);//修改文件服务器类型
	boolean modFileServerPortNum(String serverid,int portnum);//修改文件服务器端口号
	boolean modFileServerName(String serverid,String servername);//修改文件服务器名字
	FileServer viewFileServer(String serverid);//获取某个文件服务器
	List<FileServer>   viewAllFileServer(int pageNow,int pageSize);//获取所以文件服务器信息
	List<FileServer> viewFileServer();//获取某个文件服务器
}
