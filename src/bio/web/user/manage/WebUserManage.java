/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bio.web.user.manage;

import bio.dto.xsd.*;
import bio.po.FileServer;


public interface WebUserManage {

    UserRespDto login(String user_account,String user_password);

    BaseRespDto logout(String user_account);

     UserRespDto[] viewUserStatus(int state);

     RoleRespDto[] viewRoleStatus(int state);
//UserSystem
    BaseRespDto modUserStatus(String user_id, String child_user_id,int state);

    BaseRespDto addUser(UserDto user);

    BaseRespDto delUser(String user_id, String child_user_id);

    UserRespDto viewUserBase(String user_id);

    UserRespDto viewUserSystem(String user_id);

    UserRespDto viewUserDetail(String user_id);

    UserRespDto[] viewSubUsersBase(String user_id);

    UserRespDto[] viewSubAdminBase(String user_id);

    UserRespDto[] viewSubUserBase(String user_id);

    UserRespDto[] viewSubUsersSystem(String user_id);

    UserRespDto[] viewSubAdminSystem(String user_id);

    UserRespDto[] viewSubUserSystem(String user_id);

    UserRespDto[] viewSubUsersDetail(String user_id);

    UserRespDto[] viewSubAdminDetail(String user_id);

    UserRespDto[] viewSubUserDetail(String user_id);
//UserRole
    RoleRespDto viewUserRole(String user_id);//ok

    RoleRespDto[] viewSubRole(String user_id); //ok

    RoleRespDto[] viewSubAdminRole(String user_id);

    RoleRespDto[] viewSubUserRole(String user_id);

    BaseRespDto addUserRole(String user_id, String child_user_id, String role_id);//first add

    BaseRespDto modUserRole(String user_id, String child_user_id, String newroleid);// modify
//Role
    BaseRespDto modRoleStatus(String role_id,int state);

    BaseRespDto addRole(RoleDto role);

    BaseRespDto delRole(String role_id);

    RoleRespDto viewRole(String role_id);
//RoleResource

    BaseRespDto addRoleResource(String role_id, String[] resources);

    BaseRespDto delRoleResources(String role_id, String[] resources);  //绾ц仈鍒犻櫎

    AuthorityRespDto[] viewResources(String role_id);
//Resource

    BaseRespDto addResource(AuthorityDto resource);

    BaseRespDto delResource(String resource_id);

    AuthorityRespDto viewResource(String resource_id);
//RoleOperation

    BaseRespDto addRoleOperations(String role_id, String[] opration_id);

    BaseRespDto delRoleOperations(String role_id, String[] opration_id);

    AuthorityRespDto[] viewOperations(String role_id);
//Operation

    BaseRespDto addOperation(AuthorityDto operation);

    BaseRespDto delOperation(String operation_id);

    AuthorityRespDto viewOperation(String operation_id);
//Feedback

    BaseRespDto addFeedback(FeedbackDto fb);

    BaseRespDto delFeedback(String fb_id);

    BaseRespDto replyFeedback(FeedbackDto fb);

    FeedbackRespDto[] viewFeedback(String usr_id);
    
  //FileServer
    BaseRespDto addFileServer(FileServerDto server);

    BaseRespDto delFileServer(String ser_id);

    FileServerRespDto viewFileServer(String ser_id);
   
    FileServerRespDto[] viewAllFileServer();
   
    BaseRespDto modFileServer(String ser_id,FileServerDto fileServerDto);// modify    
// 用户登录过程
    
    
    UserFileServerRespDto getFileServer(String user_id,String server_id);//获得该用户对应的文件服务器账号密码,输入的是平台上的账号和密码，通过后台得到该账号对应的文件账号

    BaseRespDto modFileServerAccount(String user_id,String server_id,String user_account,String user_password);//修改文件服务器上用户自己的账号和密码
     
    
}
