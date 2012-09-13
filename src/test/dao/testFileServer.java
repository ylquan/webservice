package test.dao;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


import bio.po.FileServer;
import bio.user.manager.UserManage;
import bio.util.po2dto;
import bio.dao.FileServerDao;



public class testFileServer {
	public static void main(String[] args) throws Exception {
	ApplicationContext context=new FileSystemXmlApplicationContext("src/applicationContext.xml");
	FileServerDao fileServerDao=(FileServerDao)context.getBean("fileServerDao");
	
	/*测试添加已成功
	 * FileServer fileserver = new FileServer();
	fileserver.setId("3");
	fileserver.setIpaddr("10.0.0.2");
	fileserver.setType(10);
	fileserver.setPortnum(21);
	fileserver.setServername("fileserver");
	fileServerDao.addFileServer(fileserver);*/
	
	//测试删除 已成功
	//System.out.println(fileServerDao.delFileServer("2c958ec337a10bf80137a10bfcda0001"));
	
	
	/*boolean modFileServerIpAddr(String serverid,String serveripaddr);//修改文件服务器ip地址
	boolean modFileServerType(String serverid,int type);//修改文件服务器类型
	boolean modFileServerPortNum(String serverid,int portnum);//修改文件服务器端口号
	boolean modFileServerName(String serverid,String servername);//修改文件服务器名字
	FileServer viewFileServer(String serverid);//获取某个文件服务器
	List<FileServer>   viewAllFileServer(int pageNow,int pageSize);//获取所以文件服务器信息
	 */	
	
	//测试修改ip地址已成功
	//System.out.println(fileServerDao.modFileServerIpAddr("1", "172.21.14.67"));
	
	//测试修改文件服务器类型 已成功
	//System.out.println(fileServerDao.modFileServerType("1", 1));
	
	//测试修改文件服务器名字 已成功
	//	System.out.println(fileServerDao.modFileServerName("1", "microsoft 2003"));
	
	//测试修改文件服务器端口已成功
	//	System.out.println(fileServerDao.modFileServerPortNum("1", 22));
	
	//测试查看某个文件服务器 已成功
		System.out.println(fileServerDao.viewFileServer("1").getIpaddr());
	
	//测试查看所有文件服务器  已成功
	/*List<FileServer> list = fileServerDao.viewAllFileServer();
	System.out.println(list.size());*/
	
	
	//测试查看所有文件服务器  已成功 包含当前页面的信息(即实现了分页功能)
	/*List<FileServer> list = fileServerDao.viewAllFileServer(0,5);
	System.out.println(list.size());
	System.out.println(((FileServer)list.get(0)).getServername());
	System.out.println(((FileServer)list.get(1)).getServername());*/
	}
}
