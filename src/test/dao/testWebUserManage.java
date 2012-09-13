package test.dao;

import org.apache.bcel.generic.IXOR;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import web.service.WebUserManageSkeleton;
import bio.dao.FileServerDao;
import bio.dto.xsd.BaseRespDto;
import bio.dto.xsd.FileServerDto;
import bio.dto.xsd.FileServerRespDto;
import bio.dto.xsd.UserFileServerRespDto;
import bio.dto.xsd.UserRespDto;
import bio.service.FileServerService;
import bio.user.manager.UserManage;

public class testWebUserManage {
	
	public static void main(String[] args) throws Exception {
		ApplicationContext context=new FileSystemXmlApplicationContext("src/applicationContext.xml");
		UserManage userManage=(UserManage)context.getBean("userManage");
/*		
		

	   

	    
	   
	   
	   
	
	    
	    
	   
	    BaseRespDto modFileServerAccount(String user_id,String server_id,String user_account,String user_password);//修改文件服务器上用户自己的账号和密码
	     */
	//adddFileServer(FileServer server)测试已通过
	/*FileServer fileserver = new FileServer();
	fileserver.setIpaddr("172.0.0.35");
	fileserver.setPortnum("21");
	fileserver.setServername("ftpsserver");
	fileserver.setType("100");
	webmng.addFileServer(fileserver);*/
		
	//测试删除文件服务器 已通过
	//System.out.println(userManage.delFileServer("2c958ec337a10d660137a10d6a0d0001").getMessage());
	
	//查看某个文件服务器 测试已通过
		/*FileServerRespDto fileServerRespDto = new FileServerRespDto();
		System.out.print(userManage.viewFileServer("1").getIpaddr());*/
	
		//测试修改文件服务器 已通过
	/*FileServer fileServer = new FileServer();
	fileServer.setId("1");
	fileServer.setIpaddr("123.32.52.6");
	fileServer.setPortnum("8080");
	fileServer.setServername("sun weblogic");
	fileServer.setType("1000");
	userManage.modFileServer("1", fileServer);*/
		
		
		
		//测试用户登录 已通过
		/*UserFileServerRespDto userFileServerRespDto = new UserFileServerRespDto();
		userFileServerRespDto = userManage.getFileServer("testHibernate", "1");
		System.out.println(userFileServerRespDto.getFilepath());
		System.out.println(userFileServerRespDto.getMessage());
		System.out.println(userFileServerRespDto.getUsrname());
		System.out.println(userFileServerRespDto.getUsrpasswd());*/
		
		
		
		//测试通过 测试显示所有文件服务器已通过测试
		//userManage.viewAllFileServer();
		UserRespDto loginRespDto = 	userManage.login("fafa", "123456");
		System.out.println(loginRespDto.getFlag());
		System.out.println(loginRespDto.getAccount());
		
		
		//测试修改密码 已通过
		//BaseRespDto baseRespDto = userManage.modFileServerAccount("testHibernate","1","ftpadmin","888888");
	
	
	}
}
