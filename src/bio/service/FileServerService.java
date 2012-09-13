package bio.service;

import java.util.List;

import bio.po.FileServer;

public interface FileServerService {
	boolean addFileServer(FileServer fileserver);//�����ļ�������
	boolean delFileServer(String serverid);//ɾ���ļ�������
	boolean modFileServerIpAddr(String serverid,String serveripaddr);//�޸��ļ�������ip��ַ
	boolean modFileServerType(String serverid,int type);//�޸��ļ�����������
	boolean modFileServerPortNum(String serverid,int portnum);//�޸��ļ��������˿ں�
	boolean modFileServerName(String serverid,String servername);//�޸��ļ�����������
	FileServer viewFileServer(String serverid);//��ȡĳ���ļ�������
	List<FileServer>   viewAllFileServer(int pageNow,int pageSize);//��ȡ�����ļ���������Ϣ
	List<FileServer> viewFileServer();//��ȡĳ���ļ�������
}
