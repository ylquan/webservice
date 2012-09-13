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
	
	/*��������ѳɹ�
	 * FileServer fileserver = new FileServer();
	fileserver.setId("3");
	fileserver.setIpaddr("10.0.0.2");
	fileserver.setType(10);
	fileserver.setPortnum(21);
	fileserver.setServername("fileserver");
	fileServerDao.addFileServer(fileserver);*/
	
	//����ɾ�� �ѳɹ�
	//System.out.println(fileServerDao.delFileServer("2c958ec337a10bf80137a10bfcda0001"));
	
	
	/*boolean modFileServerIpAddr(String serverid,String serveripaddr);//�޸��ļ�������ip��ַ
	boolean modFileServerType(String serverid,int type);//�޸��ļ�����������
	boolean modFileServerPortNum(String serverid,int portnum);//�޸��ļ��������˿ں�
	boolean modFileServerName(String serverid,String servername);//�޸��ļ�����������
	FileServer viewFileServer(String serverid);//��ȡĳ���ļ�������
	List<FileServer>   viewAllFileServer(int pageNow,int pageSize);//��ȡ�����ļ���������Ϣ
	 */	
	
	//�����޸�ip��ַ�ѳɹ�
	//System.out.println(fileServerDao.modFileServerIpAddr("1", "172.21.14.67"));
	
	//�����޸��ļ����������� �ѳɹ�
	//System.out.println(fileServerDao.modFileServerType("1", 1));
	
	//�����޸��ļ����������� �ѳɹ�
	//	System.out.println(fileServerDao.modFileServerName("1", "microsoft 2003"));
	
	//�����޸��ļ��������˿��ѳɹ�
	//	System.out.println(fileServerDao.modFileServerPortNum("1", 22));
	
	//���Բ鿴ĳ���ļ������� �ѳɹ�
		System.out.println(fileServerDao.viewFileServer("1").getIpaddr());
	
	//���Բ鿴�����ļ�������  �ѳɹ�
	/*List<FileServer> list = fileServerDao.viewAllFileServer();
	System.out.println(list.size());*/
	
	
	//���Բ鿴�����ļ�������  �ѳɹ� ������ǰҳ�����Ϣ(��ʵ���˷�ҳ����)
	/*List<FileServer> list = fileServerDao.viewAllFileServer(0,5);
	System.out.println(list.size());
	System.out.println(((FileServer)list.get(0)).getServername());
	System.out.println(((FileServer)list.get(1)).getServername());*/
	}
}
