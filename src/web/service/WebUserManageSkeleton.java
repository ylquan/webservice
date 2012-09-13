/**
 * WebUserManageSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.0  Built on : May 17, 2011 (04:19:43 IST)
 */
package web.service;



import org.apache.bcel.generic.NEW;

import org.omg.CORBA.CTX_RESTRICT_SCOPE;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;



import bio.dto.xsd.AuthorityRespDto;
import bio.dto.xsd.BaseRespDto;
import bio.dto.xsd.FeedbackRespDto;
import bio.dto.xsd.FileServerRespDto;
import bio.dto.xsd.RoleRespDto;
import bio.dto.xsd.UserRespDto;
import bio.user.manager.UserManage;
import bio.web.service.AddFeedbackResponse;
import bio.web.service.AddFileServerResponse;
import bio.web.service.AddOperationResponse;
import bio.web.service.AddResourceResponse;
import bio.web.service.AddRoleOperationsResponse;
import bio.web.service.AddRoleResourceResponse;
import bio.web.service.AddRoleResponse;
import bio.web.service.AddUserResponse;
import bio.web.service.AddUserRoleResponse;
import bio.web.service.DelFeedbackResponse;
import bio.web.service.DelFileServerResponse;
import bio.web.service.DelOperationResponse;
import bio.web.service.DelResourceResponse;
import bio.web.service.DelRoleOperationsResponse;
import bio.web.service.DelRoleResourceResponse;
import bio.web.service.DelRoleResponse;
import bio.web.service.DelUserResponse;
import bio.web.service.LoginResponse;
import bio.web.service.LogoutResponse;
import bio.web.service.ModFileServerResponse;
import bio.web.service.ModRoleStatusResponse;
import bio.web.service.ModUserRoleResponse;
import bio.web.service.ModUserStatusResponse;
import bio.web.service.ReplyFeedbackResponse;
import bio.web.service.ViewAllFileServerResponse;
import bio.web.service.ViewFeedbackResponse;
import bio.web.service.ViewFileServerResponse;
import bio.web.service.ViewOperationResponse;
import bio.web.service.ViewOperationsResponse;
import bio.web.service.ViewResourceResponse;
import bio.web.service.ViewResourcesResponse;
import bio.web.service.ViewRoleResponse;
import bio.web.service.ViewRoleStatusResponse;
import bio.web.service.ViewSubAdminBaseResponse;
import bio.web.service.ViewSubAdminDetailResponse;
import bio.web.service.ViewSubAdminRoleResponse;
import bio.web.service.ViewSubAdminSystemResponse;
import bio.web.service.ViewSubRoleResponse;
import bio.web.service.ViewSubUserBaseResponse;
import bio.web.service.ViewSubUserDetailResponse;
import bio.web.service.ViewSubUserRoleResponse;
import bio.web.service.ViewSubUserSystemResponse;
import bio.web.service.ViewSubUsersBaseResponse;
import bio.web.service.ViewSubUsersDetailResponse;
import bio.web.service.ViewSubUsersSystemResponse;
import bio.web.service.ViewUserBaseResponse;
import bio.web.service.ViewUserDetailResponse;
import bio.web.service.ViewUserRoleResponse;
import bio.web.service.ViewUserStatusResponse;
import bio.web.service.ViewUserSystemResponse;

/**
 * WebUserManageSkeleton java skeleton for the axisService
 */
public class WebUserManageSkeleton {

	/**
	 * Auto generated method signature
	 * 
	 * @param viewRoleStatus
	 * @return viewRoleStatusResponse
	 */
	//ApplicationContext context = ApplicationContextHolder.getContext();
	


	//	UserManage userManage=(UserManage)context.getBean("userManage");
		
	/*ApplicationContext context=new FileSystemXmlApplicationContext("applicationContext.xml");
	UserManage userManage=(UserManage)context.getBean("userManage");*/
	public UserManage userManage;
	/*UserManage userManage=new UserManage();*/
	
	
	public UserManage getUserManage() {
		return userManage;
	}

	public void setUserManage(UserManage userManage) {
		this.userManage = userManage;
	}

	public bio.web.service.ViewRoleStatusResponse viewRoleStatus(
			bio.web.service.ViewRoleStatus viewRoleStatus) {
		// TODO : fill this with the necessary business logic
		
		RoleRespDto[] roleRespDto = userManage.viewRoleStatus(viewRoleStatus.getArgs0());
		ViewRoleStatusResponse results = new ViewRoleStatusResponse();
		results.set_return(roleRespDto);
		return results;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param addRole
	 * @return addRoleResponse
	 */

	public bio.web.service.AddRoleResponse addRole(
			bio.web.service.AddRole addRole) {
		// TODO : fill this with the necessary business logic
		BaseRespDto baseRespDto = userManage.addRole(addRole.getArgs0());
		AddRoleResponse results = new AddRoleResponse();
		results.set_return(baseRespDto);
		return results;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param viewResources
	 * @return viewResourcesResponse
	 */

	public bio.web.service.ViewResourcesResponse viewResources(
			bio.web.service.ViewResources viewResources) {
		// TODO : fill this with the necessary business logic
		AuthorityRespDto authorityRespDto[] =  userManage.viewResources(viewResources.getArgs0());
		ViewResourcesResponse results = new ViewResourcesResponse();
		results.set_return(authorityRespDto);
		return results;
		
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param viewResource
	 * @return viewResourceResponse
	 */

	public bio.web.service.ViewResourceResponse viewResource(
			bio.web.service.ViewResource viewResource) {
		// TODO : fill this with the necessary business logic
		AuthorityRespDto  authorityRespDto =userManage.viewResource(viewResource.getArgs0());
		ViewResourceResponse results = new ViewResourceResponse();
		results.set_return(authorityRespDto);
		return results;
		
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param delFeedback
	 * @return delFeedbackResponse
	 */

	public bio.web.service.DelFeedbackResponse delFeedback(
			bio.web.service.DelFeedback delFeedback) {
		// TODO : fill this with the necessary business logic
		BaseRespDto baseRespDto = userManage.delFeedback(delFeedback.getArgs0());
		DelFeedbackResponse results = new DelFeedbackResponse();
		results.set_return(baseRespDto);
		return results;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param modUserStatus
	 * @return modUserStatusResponse
	 */

	public bio.web.service.ModUserStatusResponse modUserStatus(
			bio.web.service.ModUserStatus modUserStatus) {
		// TODO : fill this with the necessary business logic
		BaseRespDto baseRespDto =	userManage.modUserStatus(modUserStatus.getArgs0(), modUserStatus.getArgs1(), modUserStatus.getArgs2());
		ModUserStatusResponse results = new ModUserStatusResponse();
		results.set_return(baseRespDto);
		return results;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param delFileServer
	 * @return delFileServerResponse
	 */

	public bio.web.service.DelFileServerResponse delFileServer(
			bio.web.service.DelFileServer delFileServer) {
		// TODO : fill this with the necessary business logic
		BaseRespDto baseRespDto =	userManage.delFileServer(delFileServer.getArgs0());
		DelFileServerResponse results = new DelFileServerResponse();
		results.set_return(baseRespDto);
		return results;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param delRoleResource
	 * @return delRoleResourceResponse
	 */

	public bio.web.service.DelRoleResourceResponse delRoleResource(
			bio.web.service.DelRoleResource delRoleResource) {
		// TODO : fill this with the necessary business logic
		BaseRespDto baseRespDto =	userManage.delRoleResources(delRoleResource.getArgs0(), delRoleResource.getArgs1());
		DelRoleResourceResponse results = new DelRoleResourceResponse();
		results.set_return(baseRespDto);
		return results;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param addRoleOperations
	 * @return addRoleOperationsResponse
	 */

	public bio.web.service.AddRoleOperationsResponse addRoleOperations(
			bio.web.service.AddRoleOperations addRoleOperations) {
		// TODO : fill this with the necessary business logic
		BaseRespDto baseRespDto =userManage.addRoleOperations(addRoleOperations.getArgs0(),addRoleOperations.getArgs1());
		AddRoleOperationsResponse results = new AddRoleOperationsResponse();
		results.set_return(baseRespDto);
		return results;
		
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param addFeedback
	 * @return addFeedbackResponse
	 */

	public bio.web.service.AddFeedbackResponse addFeedback(
			bio.web.service.AddFeedback addFeedback) {
		// TODO : fill this with the necessary business logic
		BaseRespDto baseRespDto = userManage.addFeedback(addFeedback.getArgs0());
		AddFeedbackResponse results = new AddFeedbackResponse();
		results.set_return(baseRespDto);
		return results;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param addResource
	 * @return addResourceResponse
	 */

	public bio.web.service.AddResourceResponse addResource(
			bio.web.service.AddResource addResource) {
		// TODO : fill this with the necessary business logic
		BaseRespDto baseRespDto =	userManage.addResource(addResource.getArgs0());
		AddResourceResponse results = new AddResourceResponse();
		results.set_return(baseRespDto);
		return results;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param viewUserRole
	 * @return viewUserRoleResponse
	 */

	public bio.web.service.ViewUserRoleResponse viewUserRole(
			bio.web.service.ViewUserRole viewUserRole) {
		// TODO : fill this with the necessary business logic
		RoleRespDto  roleRespDto = userManage.viewUserRole(viewUserRole.getArgs0());
		ViewUserRoleResponse results = new ViewUserRoleResponse();
		results.set_return(roleRespDto);
		return results;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param addFileServer
	 * @return addFileServerResponse
	 */

	public bio.web.service.AddFileServerResponse addFileServer(
			bio.web.service.AddFileServer addFileServer) {
		// TODO : fill this with the necessary business logic
		BaseRespDto baseRespDto = userManage.addFileServer(addFileServer.getArgs0());
		AddFileServerResponse results = new AddFileServerResponse();
		results.set_return(baseRespDto);
		return results;
		
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param viewSubAdminDetail
	 * @return viewSubAdminDetailResponse
	 */

	public bio.web.service.ViewSubAdminDetailResponse viewSubAdminDetail(
			bio.web.service.ViewSubAdminDetail viewSubAdminDetail) {
		// TODO : fill this with the necessary business logic
		UserRespDto[] userRespDto = userManage.viewSubAdminDetail(viewSubAdminDetail.getArgs0());
		ViewSubAdminDetailResponse results = new ViewSubAdminDetailResponse();
		results.set_return(userRespDto);
		return results;
		
		
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param viewSubUsersDetail
	 * @return viewSubUsersDetailResponse
	 */

	public bio.web.service.ViewSubUsersDetailResponse viewSubUsersDetail(
			bio.web.service.ViewSubUsersDetail viewSubUsersDetail) {
		// TODO : fill this with the necessary business logic
		UserRespDto[] userRespDto =userManage.viewSubUserDetail(viewSubUsersDetail.getArgs0());
		ViewSubUsersDetailResponse results = new ViewSubUsersDetailResponse();
		results.set_return(userRespDto);
		return results;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param viewUserBase
	 * @return viewUserBaseResponse
	 */

	public bio.web.service.ViewUserBaseResponse viewUserBase(
			bio.web.service.ViewUserBase viewUserBase) {
		// TODO : fill this with the necessary business logic
		 UserRespDto userRespDto =	userManage.viewUserBase(viewUserBase.getArgs0());
		 ViewUserBaseResponse results = new ViewUserBaseResponse();
		 results.set_return(userRespDto);
		 return results;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param addUser
	 * @return addUserResponse
	 */

	public bio.web.service.AddUserResponse addUser(
			bio.web.service.AddUser addUser) {
		// TODO : fill this with the necessary business logic
		 BaseRespDto  useBaseRespDto = userManage.addUser(addUser.getArgs0());
		 AddUserResponse results = new AddUserResponse();
		 results.set_return(useBaseRespDto);
		 return results;
		 
		 
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param viewOperations
	 * @return viewOperationsResponse
	 */

	public bio.web.service.ViewOperationsResponse viewOperations(
			bio.web.service.ViewOperations viewOperations) {
		// TODO : fill this with the necessary business logic
		AuthorityRespDto[] authorityRespDtos =	userManage.viewOperations(viewOperations.getArgs0());
		ViewOperationsResponse results = new ViewOperationsResponse();
		results.set_return(authorityRespDtos);
		return results;
		
		
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param viewSubUsersBase
	 * @return viewSubUsersBaseResponse
	 */

	public bio.web.service.ViewSubUsersBaseResponse viewSubUsersBase(
			bio.web.service.ViewSubUsersBase viewSubUsersBase) {
		// TODO : fill this with the necessary business logic
		UserRespDto[]  userRespDtos = userManage.viewSubUserBase(viewSubUsersBase.getArgs0());
		ViewSubUsersBaseResponse results = new ViewSubUsersBaseResponse();
		results.set_return(userRespDtos);
		return results;
		
		
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param replyFeedback
	 * @return replyFeedbackResponse
	 */

	public bio.web.service.ReplyFeedbackResponse replyFeedback(
			bio.web.service.ReplyFeedback replyFeedback) {
		// TODO : fill this with the necessary business logic
		 BaseRespDto baseRespDto  =	userManage.replyFeedback(replyFeedback.getArgs0());
		ReplyFeedbackResponse results  = new ReplyFeedbackResponse();
		results.set_return(baseRespDto);
		return results;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param viewSubUsersSystem
	 * @return viewSubUsersSystemResponse
	 */

	public bio.web.service.ViewSubUsersSystemResponse viewSubUsersSystem(
			bio.web.service.ViewSubUsersSystem viewSubUsersSystem) {
		// TODO : fill this with the necessary business logic
		UserRespDto[] userRespDtos=	userManage.viewSubUsersSystem(viewSubUsersSystem.getArgs0());
		ViewSubUsersSystemResponse results = new ViewSubUsersSystemResponse();
		results.set_return(userRespDtos);
		return results;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param delOperation
	 * @return delOperationResponse
	 */

	public bio.web.service.DelOperationResponse delOperation(
			bio.web.service.DelOperation delOperation) {
		// TODO : fill this with the necessary business logic
		BaseRespDto baseRespDto  =	userManage.delOperation(delOperation.getArgs0());
		DelOperationResponse results = new DelOperationResponse();
		results.set_return(baseRespDto);
		return results;
	
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param viewUserSystem
	 * @return viewUserSystemResponse
	 */

	public bio.web.service.ViewUserSystemResponse viewUserSystem(
			bio.web.service.ViewUserSystem viewUserSystem) {
		// TODO : fill this with the necessary business logic
		UserRespDto userRespDto = userManage.viewUserSystem(viewUserSystem.getArgs0());
		ViewUserSystemResponse results =  new ViewUserSystemResponse();
		results.set_return(userRespDto);
		return results;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param viewUserDetail
	 * @return viewUserDetailResponse
	 */

	public bio.web.service.ViewUserDetailResponse viewUserDetail(
			bio.web.service.ViewUserDetail viewUserDetail) {
		// TODO : fill this with the necessary business logic
		UserRespDto userRespDto =userManage.viewUserDetail(viewUserDetail.getArgs0());
		ViewUserDetailResponse results = new ViewUserDetailResponse();
		results.set_return(userRespDto);
		return results;
		
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param viewSubUserBase
	 * @return viewSubUserBaseResponse
	 */

	public bio.web.service.ViewSubUserBaseResponse viewSubUserBase(
			bio.web.service.ViewSubUserBase viewSubUserBase) {
		// TODO : fill this with the necessary business logic
		UserRespDto[]  userRespDtos =  userManage.viewSubUserBase(viewSubUserBase.getArgs0());
		ViewSubUserBaseResponse results = new ViewSubUserBaseResponse();
		results.set_return(userRespDtos);
		return results;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param viewAllFileServer
	 * @return viewAllFileServerResponse
	 */

	public bio.web.service.ViewAllFileServerResponse viewAllFileServer(
			bio.web.service.ViewAllFileServer viewAllFileServer) {
		// TODO : fill this with the necessary business logic
		FileServerRespDto[] fileserverRespDto =	userManage.viewAllFileServer();
		ViewAllFileServerResponse results = new ViewAllFileServerResponse();
		results.set_return(fileserverRespDto);
		return results;
		
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param viewSubAdminBase
	 * @return viewSubAdminBaseResponse
	 */

	public bio.web.service.ViewSubAdminBaseResponse viewSubAdminBase(
			bio.web.service.ViewSubAdminBase viewSubAdminBase) {
		// TODO : fill this with the necessary business logic
		UserRespDto[] userRespDtos = userManage.viewSubAdminBase(viewSubAdminBase.getArgs0());
		ViewSubAdminBaseResponse results = new ViewSubAdminBaseResponse();
		results.set_return(userRespDtos);
		return results;
		
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param modFileServer
	 * @return modFileServerResponse
	 */

	public bio.web.service.ModFileServerResponse modFileServer(
			bio.web.service.ModFileServer modFileServer) {
		// TODO : fill this with the necessary business logic
		BaseRespDto baseRespDto  =	userManage.modFileServer(modFileServer.getArgs0(), modFileServer.getArgs1());
		
		ModFileServerResponse results = new ModFileServerResponse();
		results.set_return(baseRespDto);
		return results;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param viewSubUserDetail
	 * @return viewSubUserDetailResponse
	 */

	public bio.web.service.ViewSubUserDetailResponse viewSubUserDetail(
			bio.web.service.ViewSubUserDetail viewSubUserDetail) {
		// TODO : fill this with the necessary business logic
		UserRespDto[] userRespDtos =	userManage.viewSubUserDetail(viewSubUserDetail.getArgs0());
		ViewSubUserDetailResponse results = new ViewSubUserDetailResponse();
		results.set_return(userRespDtos);
		return results;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param viewSubAdminRole
	 * @return viewSubAdminRoleResponse
	 */

	public bio.web.service.ViewSubAdminRoleResponse viewSubAdminRole(
			bio.web.service.ViewSubAdminRole viewSubAdminRole) {
		// TODO : fill this with the necessary business logic
		RoleRespDto[]roleRespDtos=	userManage.viewSubAdminRole(viewSubAdminRole.getArgs0());
		ViewSubAdminRoleResponse results = new ViewSubAdminRoleResponse();
		results.set_return(roleRespDtos);
		return results;
		
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param viewFeedback
	 * @return viewFeedbackResponse
	 */

	public bio.web.service.ViewFeedbackResponse viewFeedback(
			bio.web.service.ViewFeedback viewFeedback) {
		// TODO : fill this with the necessary business logic
		FeedbackRespDto[] feedbackRespDto = userManage.viewFeedback(viewFeedback.getArgs0());
		ViewFeedbackResponse results = new ViewFeedbackResponse();
		results.set_return(feedbackRespDto);
		return results;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param addOperation
	 * @return addOperationResponse
	 */

	public bio.web.service.AddOperationResponse addOperation(
			bio.web.service.AddOperation addOperation) {
		// TODO : fill this with the necessary business logic
		BaseRespDto baseRespDto =	userManage.addOperation(addOperation.getArgs0());
		AddOperationResponse results = new AddOperationResponse();
		results.set_return(baseRespDto);
		return results;
		
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param viewSubAdminSystem
	 * @return viewSubAdminSystemResponse
	 */

	public bio.web.service.ViewSubAdminSystemResponse viewSubAdminSystem(
			bio.web.service.ViewSubAdminSystem viewSubAdminSystem) {
		// TODO : fill this with the necessary business logic
		UserRespDto[] userRespDtos =	userManage.viewSubAdminSystem(viewSubAdminSystem.getArgs0());
		ViewSubAdminSystemResponse results = new ViewSubAdminSystemResponse();
		results.set_return(userRespDtos);
		return results;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param logout
	 * @return logoutResponse
	 */

	public bio.web.service.LogoutResponse logout(bio.web.service.Logout logout) {
		// TODO : fill this with the necessary business logic
		BaseRespDto baseRespDto =	userManage.logout(logout.getArgs0());
		LogoutResponse results = new LogoutResponse();
		results.set_return(baseRespDto);
		return results;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param delRole
	 * @return delRoleResponse
	 */

	public bio.web.service.DelRoleResponse delRole(
			bio.web.service.DelRole delRole) {
		// TODO : fill this with the necessary business logic
		BaseRespDto baseRespDto =userManage.delRole(delRole.getArgs0());
		DelRoleResponse results = new DelRoleResponse();
		results.set_return(baseRespDto);
		return results;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param viewOperation
	 * @return viewOperationResponse
	 */

	public bio.web.service.ViewOperationResponse viewOperation(
			bio.web.service.ViewOperation viewOperation) {
		// TODO : fill this with the necessary business logic
		AuthorityRespDto authorityRespDto =	userManage.viewOperation(viewOperation.getArgs0());
		ViewOperationResponse results= new ViewOperationResponse();
		results.set_return(authorityRespDto);
		return results;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param addUserRole
	 * @return addUserRoleResponse
	 */

	public bio.web.service.AddUserRoleResponse addUserRole(
			bio.web.service.AddUserRole addUserRole) {
		// TODO : fill this with the necessary business logic
		BaseRespDto baseRespDto =	userManage.addUserRole(addUserRole.getArgs0(), addUserRole.getArgs1(), addUserRole.getArgs2());
		AddUserRoleResponse results = new AddUserRoleResponse();
		results.set_return(baseRespDto);
		return results	;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param delResource
	 * @return delResourceResponse
	 */

	public bio.web.service.DelResourceResponse delResource(
			bio.web.service.DelResource delResource) {
		// TODO : fill this with the necessary business logic
		BaseRespDto baseRespDto =userManage.delResource(delResource.getArgs0());
		DelResourceResponse results = new DelResourceResponse();
		results.set_return(baseRespDto);
		return results;
		
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param modRoleStatus
	 * @return modRoleStatusResponse
	 */

	public bio.web.service.ModRoleStatusResponse modRoleStatus(
			bio.web.service.ModRoleStatus modRoleStatus) {
		// TODO : fill this with the necessary business logic
		BaseRespDto baseRespDto =	userManage.modRoleStatus(modRoleStatus.getArgs0(), modRoleStatus.getArgs1());
		ModRoleStatusResponse results = new ModRoleStatusResponse();
		results.set_return(baseRespDto);
		return results;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param viewUserStatus
	 * @return viewUserStatusResponse
	 */

	public bio.web.service.ViewUserStatusResponse viewUserStatus(
			bio.web.service.ViewUserStatus viewUserStatus) {
		// TODO : fill this with the necessary business logic
		UserRespDto[] userRespDtos =	userManage.viewUserStatus(viewUserStatus.getArgs1());
		ViewUserStatusResponse results = new ViewUserStatusResponse();
		results.set_return(userRespDtos);
		return results;
				
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param viewFileServer
	 * @return viewFileServerResponse
	 */

	public bio.web.service.ViewFileServerResponse viewFileServer(
			bio.web.service.ViewFileServer viewFileServer) {
		// TODO : fill this with the necessary business logic
		FileServerRespDto  fileServerRespDto =userManage.viewFileServer(viewFileServer.getArgs0());
		ViewFileServerResponse results = new ViewFileServerResponse();
		results.set_return(fileServerRespDto);
		return results;
		
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param addRoleResource
	 * @return addRoleResourceResponse
	 */

	public bio.web.service.AddRoleResourceResponse addRoleResource(
			bio.web.service.AddRoleResource addRoleResource) {
		// TODO : fill this with the necessary business logic
		BaseRespDto baseRespDto =	userManage.addRoleResource(addRoleResource.getArgs0(), addRoleResource.getArgs1());
		AddRoleResourceResponse results  = new AddRoleResourceResponse();
		results.set_return(baseRespDto);
		return results;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param modUserRole
	 * @return modUserRoleResponse
	 */

	public bio.web.service.ModUserRoleResponse modUserRole(
			bio.web.service.ModUserRole modUserRole) {
		// TODO : fill this with the necessary business logic
		BaseRespDto baseRespDto=	userManage.modUserRole(modUserRole.getArgs0(), modUserRole.getArgs1(), modUserRole.getArgs2());
		ModUserRoleResponse results = new ModUserRoleResponse();
		results.set_return(baseRespDto);
		return results;
		
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param delUser
	 * @return delUserResponse
	 */

	public bio.web.service.DelUserResponse delUser(
			bio.web.service.DelUser delUser) {
		// TODO : fill this with the necessary business logic
		BaseRespDto baseRespDto = userManage.delUser(delUser.getArgs0(), delUser.getArgs1());
		DelUserResponse results = new DelUserResponse();
		results.set_return(baseRespDto);
		return results;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param viewSubUserRole
	 * @return viewSubUserRoleResponse
	 */

	public bio.web.service.ViewSubUserRoleResponse viewSubUserRole(
			bio.web.service.ViewSubUserRole viewSubUserRole) {
		// TODO : fill this with the necessary business logic
		RoleRespDto[] roleRespDtos =userManage.viewSubUserRole(viewSubUserRole.getArgs0());
		ViewSubUserRoleResponse results  = new ViewSubUserRoleResponse();
		results.set_return(roleRespDtos);
		return results;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param login
	 * @return loginResponse
	 */

	public bio.web.service.LoginResponse login(bio.web.service.Login login) {
		// TODO : fill this with the necessary business logic
		System.out.println("WebUserManageSkeleton中login方法，判断usermanage是否为空"+(userManage==null));
		System.out.println("账号："+login.getArgs0());
		System.out.println("密码："+login.getArgs1());
		UserRespDto userRespDto =	userManage.login(login.getArgs0(), login.getArgs1());
		System.out.println("UserRespDto中的相关数据："+userRespDto.getAccount());
		LoginResponse results = new LoginResponse();
		results.set_return(userRespDto);
		System.out.println("results中的相关类型"+results.get_return().getAccount());
		return results;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param viewRole
	 * @return viewRoleResponse
	 */

	public bio.web.service.ViewRoleResponse viewRole(
			bio.web.service.ViewRole viewRole) {
		// TODO : fill this with the necessary business logic
		RoleRespDto roleRespDto =	userManage.viewRole(viewRole.getArgs0());
		ViewRoleResponse results = new ViewRoleResponse();
		results.set_return(roleRespDto);
		return results;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param viewSubRole
	 * @return viewSubRoleResponse
	 */

	public bio.web.service.ViewSubRoleResponse viewSubRole(
			bio.web.service.ViewSubRole viewSubRole) {
		// TODO : fill this with the necessary business logic
		RoleRespDto[] respDtos = userManage.viewSubRole(viewSubRole.getArgs0());
		ViewSubRoleResponse results = new ViewSubRoleResponse();
		results.set_return(respDtos);
		return results;
		
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param viewSubUserSystem
	 * @return viewSubUserSystemResponse
	 */

	public bio.web.service.ViewSubUserSystemResponse viewSubUserSystem(
			bio.web.service.ViewSubUserSystem viewSubUserSystem) {
		// TODO : fill this with the necessary business logic
		UserRespDto[]userRespDtos =	userManage.viewSubUserSystem(viewSubUserSystem.getArgs0());
		ViewSubUserSystemResponse results  =new ViewSubUserSystemResponse();
		results.set_return(userRespDtos);
		return results;
		
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param delRoleOperations
	 * @return delRoleOperationsResponse
	 */

	public bio.web.service.DelRoleOperationsResponse delRoleOperations(
			bio.web.service.DelRoleOperations delRoleOperations) {
		// TODO : fill this with the necessary business logic
		BaseRespDto baseRespDto =	userManage.delRoleOperations(delRoleOperations.getArgs0(), delRoleOperations.getArgs1());
		DelRoleOperationsResponse results = new DelRoleOperationsResponse();
		results.set_return(baseRespDto);
		return results;
	}

}
