package bio.user.manager;


import java.sql.Timestamp;
import java.util.List;

import org.springframework.context.ApplicationContext;



import bio.dto.xsd.*;
import bio.po.*;
import bio.po.FileServer;
import bio.service.FeedbackService;
import bio.service.FileServerService;
import bio.service.OperationService;
import bio.service.ResourceService;
import bio.service.RoleOperationService;
import bio.service.RoleResourceService;
import bio.service.RoleService;
import bio.service.UserDetailService;
import bio.service.UserFileServerService;
import bio.service.UserInfoService;
import bio.service.UserRoleService;
import bio.service.UserSystemService;
import bio.service.impl.FeedbackManage;
import bio.service.impl.OperationManage;
import bio.service.impl.ResourceManage;
import bio.service.impl.RoleOperationManage;
import bio.service.impl.RoleResourceManage;
import bio.service.impl.UserInfoManage;
import bio.web.user.manage.WebUserManage;
import bio.util.*;

public class UserManage implements WebUserManage {
	//使用spring的设置注入



	private FeedbackService feedbackService;
	private OperationService operationService;
	private ResourceService resourceService;
	private RoleService roleService;
	private RoleOperationService roleOperationService;
	private RoleResourceService roleResourceService;
	private UserDetailService userDetailService;
	private UserInfoService userInfoService;
	private UserRoleService userRoleService;
	private UserSystemService userSystemService;
	private FileServerService fileServerService;
	private UserFileServerService userFileServerService;
	
	
	
	public void setFeedbackService(FeedbackService feedbackService) {
		this.feedbackService = feedbackService;
	}

	public void setOperationService(OperationService operationService) {
		this.operationService = operationService;
	}

	public void setResourceService(ResourceService resourceService) {
		this.resourceService = resourceService;
	}

	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}

	public void setRoleOperationService(RoleOperationService roleOperationService) {
		this.roleOperationService = roleOperationService;
	}

	public void setRoleResourceService(RoleResourceService roleResourceService) {
		this.roleResourceService = roleResourceService;
	}

	public void setUserDetailService(UserDetailService userDetailService) {
		this.userDetailService = userDetailService;
	}

	public void setUserInfoService(UserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}

	public void setUserRoleService(UserRoleService userRoleService) {
		this.userRoleService = userRoleService;
	}

	public void setUserSystemService(UserSystemService userSystemService) {
		this.userSystemService = userSystemService;
	}
	
	public void setFileServerService(FileServerService fileServerService){
		this.fileServerService = fileServerService;
	}
	
	public void setUserFileServerService(UserFileServerService userFileServerService){
		
		this.userFileServerService = userFileServerService;
	}
	
	public BaseRespDto addFeedback(FeedbackDto fb) {
		// TODO Auto-generated method stub
		BaseRespDto baseRespDto = new BaseRespDto();
		Feedback feedback=new Feedback();
		try {
			//dto2po.convert(fb, feedback);//以后要改dto2po，价格判断类型是否一样
			feedback.setAction(fb.getAction());
			Timestamp time=Timestamp.valueOf(fb.getTime());
			Timestamp actiontime=Timestamp.valueOf(fb.getActiontime());
			feedback.setActiontime(actiontime);
			feedback.setTime(time);
			feedback.setDescription(fb.getDescription());
			feedback.setUserid(fb.getUserid());
			feedbackService.addFeedback(feedback);
			baseRespDto.setFlag(true);
		} catch (Exception e) {
			// TODO: handle exception
			baseRespDto.setFlag(false);
			e.printStackTrace();
		}
		return baseRespDto;
	}

	public BaseRespDto addOperation(AuthorityDto operation) {
		// TODO Auto-generated method stub
		BaseRespDto baseRespDto=new BaseRespDto();
		Operation operation2=new Operation();
		try {
			dto2po.convert(operation, operation2);
			operationService.addOperation(operation2);
			baseRespDto.setFlag(true);
		} catch (Exception e) {
			// TODO: handle exception
			baseRespDto.setFlag(false);
			e.printStackTrace();
		}
		return baseRespDto;
	}

	public BaseRespDto addResource(AuthorityDto resource) {
		// TODO Auto-generated method stub
		BaseRespDto baseRespDto=new BaseRespDto();
		Resource resource2=new Resource();
		try {
			dto2po.convert(resource, resource2);
			resourceService.addResource(resource2);
			baseRespDto.setFlag(true);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			baseRespDto.setFlag(false);
		}
		return baseRespDto;
	}

	public BaseRespDto addRole(RoleDto role) {//not test yet
		BaseRespDto baseRespDto = new BaseRespDto();
		Role ro=new Role();
		try {
			dto2po.convert(role, ro);
			roleService.addRole(ro);
			baseRespDto.setFlag(true);
			return baseRespDto;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			baseRespDto.setFlag(false);
			return baseRespDto;
		}
		
		// TODO Auto-generated method stub
	}

	public BaseRespDto addRoleOperations(String role_id, String[] opration_id) {
		// TODO Auto-generated method stub
		BaseRespDto baseRespDto=new BaseRespDto();
		boolean flag=false;
		try {
			flag=roleOperationService.addRoleOperations(role_id, opration_id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		baseRespDto.setFlag(flag);
		return baseRespDto;
	}

	public BaseRespDto addRoleResource(String role_id, String[] resources) {
		// TODO Auto-generated method stub
		BaseRespDto baseRespDto=new BaseRespDto();
		boolean flag=false;
		try {
			flag=roleResourceService.addRoleResources(role_id, resources);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		baseRespDto.setFlag(flag);
		return baseRespDto;
	}

	public BaseRespDto addUser(UserDto user) {
		// TODO Auto-generated method stub
		BaseRespDto baseRespDto = new BaseRespDto();
		UserInfo userInfo = new UserInfo();
		UserSystem userSystem = new UserSystem();
		UserDetail userDetail = new UserDetail();
		
		try {
			dto2po.convert(user, userInfo);
			dto2po.convert(user, userDetail);
			dto2po.convert(user, userSystem);
			userInfoService.addUserInfo(userInfo);
			userDetailService.addUserDetail(userDetail);
			userSystemService.addUserSystem(userSystem);
			baseRespDto.setFlag(true);
			return baseRespDto;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			baseRespDto.setFlag(false);
			return baseRespDto;
		}
	}

	public BaseRespDto addUserRole(String user_id, String child_user_id,
			String role_id) {
		BaseRespDto baseRespDto = new BaseRespDto();
		try {
			userRoleService.addUserRole(user_id, child_user_id, role_id);
			baseRespDto.setFlag(true);
			return baseRespDto;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			baseRespDto.setFlag(false);
			return baseRespDto;
		}
		// TODO Auto-generated method stub
	}

	public BaseRespDto delFeedback(String fb_id) {
		// TODO Auto-generated method stub
		BaseRespDto baseRespDto = new BaseRespDto();
		boolean flag=false;
		try {
			flag=feedbackService.delFeedback(fb_id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		baseRespDto.setFlag(flag);
		return baseRespDto;
	}

	public BaseRespDto delOperation(String operation_id) {
		// TODO Auto-generated method stub
		BaseRespDto baseRespDto = new BaseRespDto();
		boolean flag=false;
		try {
			flag=operationService.delOperation(operation_id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		baseRespDto.setFlag(flag);
		return baseRespDto;
	}

	public BaseRespDto delResource(String resource_id) {
		// TODO Auto-generated method stub
		BaseRespDto baseRespDto = new BaseRespDto();
		boolean flag=false;
		try {
			flag=resourceService.delResource(resource_id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		baseRespDto.setFlag(flag);
		return baseRespDto;
	}

	public BaseRespDto delRole(String role_id) {
		BaseRespDto baseRespDto=new BaseRespDto();
		try {
			roleService.delRole(role_id);
			baseRespDto.setFlag(true);
			return baseRespDto;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			baseRespDto.setFlag(false);
			baseRespDto.setMessage("there are user with this role");
			return baseRespDto;
		}
		// TODO Auto-generated method stub
	}

	public BaseRespDto delRoleOperations(String role_id, String[] opration_id) {
		// TODO Auto-generated method stub
		BaseRespDto baseRespDto = new BaseRespDto();
		boolean flag=false;
		try {
			flag=roleOperationService.delRoleOperations(role_id, opration_id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		baseRespDto.setFlag(flag);
		return baseRespDto;
	}

	public BaseRespDto delRoleResources(String role_id, String[] resources) {
		// TODO Auto-generated method stub
		BaseRespDto baseRespDto = new BaseRespDto();
		boolean flag=false;
		try {
			flag=roleResourceService.delRoleResources(role_id, resources);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		baseRespDto.setFlag(flag);
		return baseRespDto;
	}

	public BaseRespDto delUser(String user_id, String child_user_id) {
		// TODO Auto-generated method stub
		BaseRespDto baseRespDto = new BaseRespDto();
		try {
		if(userInfoService.isExistRelation(user_id, child_user_id)){
			if(userInfoService.countSubUser(child_user_id)==0){
				userInfoService.delUserInfo(child_user_id);
				userSystemService.delUserSystem(child_user_id);
				userDetailService.delUserDetail(child_user_id);
				baseRespDto.setFlag(true);
				return baseRespDto;
			}else{
				baseRespDto.setFlag(false);
				baseRespDto.setMessage("the child user has the sub users");
				return baseRespDto;
			}
		}else{
			baseRespDto.setFlag(false);
			baseRespDto.setMessage("you dont have the right to delete");
			return baseRespDto;
		}
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			baseRespDto.setFlag(false);
			baseRespDto.setMessage("delete wrong");
			return baseRespDto;
		}
	}

	public UserRespDto login(String user_account, String user_password) {
		// TODO Auto-generated method stub
		System.out.println("UserManage中login函数里得到的账号参数："+user_account);
		UserRespDto userRespDto = null;
		if(userInfoService.isExistAccount(user_account, user_password)){
		   userRespDto = new UserRespDto();	
		   /*收集登陆的用户信息*/
		   UserInfo userInfo = userInfoService.viewUserInfo(user_account);
		   UserSystem userSystem = userSystemService.viewUserSystem(userInfo.getId());
		   UserDetail  userDetail = userDetailService.viewUserDeatil(userInfo.getId());
		   String roleid=userRoleService.viewUserRole(userInfo.getId());
		   
		 // int roletype=viewRole(roleid).getType();
		   try {
			/*po2dto.convert(userInfo, userRespDto);
			po2dto.convert(userSystem, userRespDto);		
			po2dto.convert(userDetail, userRespDto);
			userRespDto.setRoleId(roleid);*/
		//	userRespDto.setRoletype(roletype);
			//在这里要setuserrepdto的roletype
			   //做测试用
			   UserFileserver  userFileserver=  userFileServerService.viewUserFileServer(userInfo.getId(), "1");
			   
			userRespDto.setFlag(true);
			 //  userRespDto.setId(userInfo.getId());
			   userRespDto.setAccount(userInfo.getAccount());
			  //userRespDto.setBirth((String)userInfo.getBirth());
			   
			   //测试用
			   userRespDto.setCell(userFileserver.getFilepath());
			   
			   userRespDto.setFlag(true);
			   userRespDto.setMessage("Success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			userRespDto.setFlag(false);
			System.out.println("我在UserManage的login里的exception");
			e.printStackTrace();
		}
		}
		return userRespDto;
	}

	public BaseRespDto logout(String user_account) {
		// TODO Auto-generated method stub
		return null;
	}

	public BaseRespDto modRoleStatus(String role_id,int state) {
		// TODO Auto-generated method stub
		BaseRespDto baseRespDto=new BaseRespDto();
		try {
			roleService.modRoleStatus(role_id, state);
			baseRespDto.setFlag(true);
			
		} catch (Exception e) {
			baseRespDto.setFlag(false);
			// TODO: handle exception
		}
		return baseRespDto;
	}

	public BaseRespDto modUserRole(String user_id, String child_user_id,
			String newroleid) {
		BaseRespDto baseRespDto=new BaseRespDto();
		try {
			userRoleService.modUserRole(user_id, child_user_id, newroleid);
			baseRespDto.setFlag(true);
		} catch (Exception e) {
			baseRespDto.setFlag(false);
			// TODO: handle exception
		}
		// TODO Auto-generated method stub
		return baseRespDto;
	}

	public BaseRespDto replyFeedback(FeedbackDto fb) {
		// TODO Auto-generated method stub
		BaseRespDto baseRespDto = new BaseRespDto();
		boolean flag=false;
		Feedback feedback=new Feedback();
		try {
			dto2po.convert(fb, feedback);
			flag=feedbackService.replyFeedback(feedback);
		} catch (Exception e) {
			// TODO: handle exception
		}
		baseRespDto.setFlag(flag);
		return baseRespDto;
	}

	public FeedbackRespDto[] viewFeedback(String usr_id) {
		// TODO Auto-generated method stub
		try {
			List<Feedback> list=feedbackService.viewFeedback(usr_id);
			int size=list.size();
			if(size==0)
			{
				FeedbackRespDto[] feedbackRespDtos=new FeedbackRespDto[1];
				feedbackRespDtos[0].setFlag(false);
				feedbackRespDtos[0].setMessage("not have feedback");
				return feedbackRespDtos;
			}
			else {
				FeedbackRespDto[] feedbackRespDtos=new FeedbackRespDto[size];
				for(int i=0;i<size;i++)
				{
					Feedback feedback=list.get(i);
					FeedbackRespDto feedbackRespDto=new FeedbackRespDto();
					po2dto.convert(feedback, feedbackRespDto);
					feedbackRespDtos[i]=feedbackRespDto;	
					feedbackRespDtos[i].setFlag(true);
				}
				return feedbackRespDtos;
			}
		} catch (Exception e) {
			// TODO: handle exception
			FeedbackRespDto[] feedbackRespDtos=new FeedbackRespDto[1];
			feedbackRespDtos[0].setFlag(false);
			feedbackRespDtos[0].setMessage("system wrong");
			return feedbackRespDtos;
		}
	}

	public AuthorityRespDto viewOperation(String operation_id) {
		// TODO Auto-generated method stub
		AuthorityRespDto authorityRespDto=new AuthorityRespDto();
		try {
			Operation operation=operationService.viewOperation(operation_id);
			if(operation==null)
			{
				authorityRespDto.setFlag(false);
				authorityRespDto.setMessage("dont exist this operation");
			}
			else {
				po2dto.convert(operation, authorityRespDto);
				authorityRespDto.setFlag(true);
			}
		} catch (Exception e) {
			// TODO: handle exception
			authorityRespDto.setFlag(false);
			authorityRespDto.setMessage("system wrong");
			e.printStackTrace();
		}
		return authorityRespDto;
	}

	public AuthorityRespDto[] viewOperations(String role_id) {
		// TODO Auto-generated method stub
		try {
			List<Operation> list=operationService.viewRoleOperation(role_id);
			int size=list.size();
			if(size==0)
			{
				AuthorityRespDto[] authorityRespDtos=new AuthorityRespDto[1];
				authorityRespDtos[0].setFlag(false);
				authorityRespDtos[0].setMessage("not have operations");
				return authorityRespDtos;
			}
			else {
				AuthorityRespDto[] authorityRespDtos=new AuthorityRespDto[size];
				for(int i=0;i<size;i++)
				{
					Operation operation=list.get(i);
					AuthorityRespDto authorityRespDto=new AuthorityRespDto(); 
					po2dto.convert(operation, authorityRespDto);
					authorityRespDtos[i]=authorityRespDto;	
					authorityRespDtos[i].setFlag(true);
				}
				return authorityRespDtos;
			}
		} catch (Exception e) {
			// TODO: handle exception
			AuthorityRespDto[] authorityRespDtos=new AuthorityRespDto[1];
			authorityRespDtos[0].setFlag(false);
			authorityRespDtos[0].setMessage("system wrong");
			return authorityRespDtos;
		}
	}

	public AuthorityRespDto viewResource(String resource_id) {
		// TODO Auto-generated method stub
		AuthorityRespDto authorityRespDto=new AuthorityRespDto();
		try {
			Resource resource=resourceService.viewResource(resource_id);
			po2dto.convert(resource, authorityRespDto);
			authorityRespDto.setFlag(true);
		} catch (Exception e) {
			// TODO: handle exception
			authorityRespDto.setFlag(false);
			authorityRespDto.setMessage("system wrong");
			e.printStackTrace();
		}
		return authorityRespDto;
	}

	public AuthorityRespDto[] viewResources(String role_id) {
		// TODO Auto-generated method stub
		try {
			List<Resource> list=resourceService.viewRoleResources(role_id);
			int size=list.size();
			if(size==0)
			{
				AuthorityRespDto[] authorityRespDtos=new AuthorityRespDto[1];
				authorityRespDtos[0].setFlag(false);
				authorityRespDtos[0].setMessage("not have resources");
				return authorityRespDtos;
			}
			else {
				AuthorityRespDto[] authorityRespDtos=new AuthorityRespDto[size];
				for(int i=0;i<size;i++)
				{
					Resource resource=list.get(i);
					AuthorityRespDto authorityRespDto=new AuthorityRespDto(); 
					po2dto.convert(resource, authorityRespDto);
					authorityRespDtos[i]=authorityRespDto;	
					authorityRespDtos[i].setFlag(true);
				}
				return authorityRespDtos;
			}
		} catch (Exception e) {
			// TODO: handle exception
			AuthorityRespDto[] authorityRespDtos=new AuthorityRespDto[1];
			authorityRespDtos[0].setFlag(false);
			authorityRespDtos[0].setMessage("system wrong");
			return authorityRespDtos;
		}
	}

	public RoleRespDto viewRole(String role_id) {//要改
		// TODO Auto-generated method stub
		RoleRespDto roleRespDto=new RoleRespDto();
		try {
			Role role=new Role();
			role=roleService.viewRole(role_id);
			po2dto.convert(role,roleRespDto);
			roleRespDto.setFlag(true);
		} catch (Exception e) {
			roleRespDto.setFlag(false);
			// TODO: handle exception
		}
		return null;
	}

	public UserRespDto[] viewSubAdminBase(String user_id) {
		// TODO Auto-generated method stub
		try {
			List<UserDetail> list=userDetailService.viewSubAdminDetail(user_id);
			List<UserInfo> list1=userInfoService.viewSubAdminInfo(user_id);
			int size=list.size();
			if(size==0)
			{
				UserRespDto[] userRespDtos=new UserRespDto[1];
				userRespDtos[0].setFlag(false);
				userRespDtos[0].setMessage("not have sub admin");
				return userRespDtos;
			}
			else {
				UserRespDto[] userRespDtos=new UserRespDto[size];
				for(int i=0;i<size;i++)
				{
					UserDetail userDetail=list.get(i);
					UserInfo userInfo=list1.get(i);
					UserRespDto userRespDto=new UserRespDto(); 
					po2dto.convert(userDetail, userRespDto);
					po2dto.convert(userInfo, userRespDto);
					userRespDtos[i]=userRespDto;	
					userRespDtos[i].setFlag(true);
				}
				return userRespDtos;
			}
		} catch (Exception e) {
			// TODO: handle exception
			UserRespDto[] userRespDtos=new UserRespDto[1];
			userRespDtos[0].setFlag(false);
			userRespDtos[0].setMessage("system wrong");
			return userRespDtos;
		}
	}

	public UserRespDto[] viewSubAdminDetail(String user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public FileServerService getFileServerService() {
		return fileServerService;
	}

	public void setFileServerSevice(FileServerService fileServerService) {
		this.fileServerService = fileServerService;
	}

	public FeedbackService getFeedbackService() {
		return feedbackService;
	}

	public OperationService getOperationService() {
		return operationService;
	}

	public ResourceService getResourceService() {
		return resourceService;
	}

	public RoleService getRoleService() {
		return roleService;
	}

	public RoleOperationService getRoleOperationService() {
		return roleOperationService;
	}

	public RoleResourceService getRoleResourceService() {
		return roleResourceService;
	}

	public UserDetailService getUserDetailService() {
		return userDetailService;
	}

	public UserInfoService getUserInfoService() {
		return userInfoService;
	}

	public UserRoleService getUserRoleService() {
		return userRoleService;
	}

	public UserSystemService getUserSystemService() {
		return userSystemService;
	}

	public UserFileServerService getUserFileServerService() {
		return userFileServerService;
	}

	public RoleRespDto[] viewSubAdminRole(String user_id) {
		// TODO Auto-generated method stub
		String role_id;
		try {

			role_id = userRoleService.viewUserRole(user_id);
			if (role_id == null || role_id == "") {
				RoleRespDto[] roleRespDtos = new RoleRespDto[1];
				roleRespDtos[0].setFlag(false);
				roleRespDtos[0].setMessage("not have role");
				return roleRespDtos;
			}
			// TODO: handle exception
			else {
				List<Role> list = roleService.viewSubRole(role_id);
				if (list.size() == 0) {
					RoleRespDto[] roleRespDtos = new RoleRespDto[1];
					roleRespDtos[0].setFlag(false);
					roleRespDtos[0].setMessage("not have sub role");
					return roleRespDtos;
				} else {
					RoleRespDto[] roleRespDtos = new RoleRespDto[list.size()];
					for (int i = 0; i < list.size(); i++) {
						bio.po.Role role = list.get(i);
						RoleRespDto roleRespDto = new RoleRespDto();
						po2dto.convert(role, roleRespDto);
						roleRespDtos[i] = roleRespDto;
						roleRespDtos[i].setFlag(true);
					}
					return roleRespDtos;
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			RoleRespDto[] roleRespDtos=new RoleRespDto[1];
			roleRespDtos[0].setFlag(false);
			roleRespDtos[0].setMessage("system wrong");
			return roleRespDtos;
		}
	}

	public UserRespDto[] viewSubAdminSystem(String user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public RoleRespDto[] viewSubRole(String user_id) {
		String role_id;
		try {
			
				role_id=userRoleService.viewUserRole(user_id);
				if(role_id==null||role_id=="")
				{RoleRespDto[] roleRespDtos=new RoleRespDto[1];
				roleRespDtos[0].setFlag(false);
				roleRespDtos[0].setMessage("not have role");
				return roleRespDtos;}
				// TODO: handle exception
				else
			{List<Role> list=roleService.viewSubRole(role_id);
			if(list.size()==0)
				{RoleRespDto[] roleRespDtos=new RoleRespDto[1];
				roleRespDtos[0].setFlag(false);
				roleRespDtos[0].setMessage("not have sub role");
				return roleRespDtos;
				}
			else {
				RoleRespDto[] roleRespDtos=new RoleRespDto[list.size()];
				for (int i = 0; i < list.size(); i++)
				{
					bio.po.Role role = list.get(i);
		            RoleRespDto roleRespDto =new RoleRespDto();
		            po2dto.convert(role, roleRespDto);
		            roleRespDtos[i]=roleRespDto;
		            roleRespDtos[i].setFlag(true);
				}
				return roleRespDtos;
			}
				}
			
		} catch (Exception e) {
			// TODO: handle exception
			RoleRespDto[] roleRespDtos=new RoleRespDto[1];
			roleRespDtos[0].setFlag(false);
			roleRespDtos[0].setMessage("system wrong");
			return roleRespDtos;
		}
		// TODO Auto-generated method stub
	}

	public UserRespDto[] viewSubUserBase(String user_id) {
		try {
			List<UserDetail> list=userDetailService.viewSubUserDetail(user_id);
	        List<UserInfo> list1=userInfoService.viewSubUserInfo(user_id);
	        int size=list.size();
	        if(size==0)
	        {
	        	UserRespDto[] userRespDtos=new UserRespDto[1];
	        	userRespDtos[0].setFlag(false);
	        	userRespDtos[0].setMessage("not sub user");
	        	return userRespDtos;
	        }
	        else {
				UserRespDto[] userRespDtos=new UserRespDto[size];
				for(int i=0;i<size;i++)
				{
					UserDetail userDetail=list.get(i);
					UserInfo userInfo=list1.get(i);
					UserRespDto userRespDto=new UserRespDto();
					po2dto.convert(userDetail, userRespDto);
					po2dto.convert(userInfo, userRespDto);
					userRespDtos[i]=userRespDto;	
					userRespDtos[i].setFlag(true);
				}
				return userRespDtos;
			}
		} catch (Exception e) {
			// TODO: handle exception
			UserRespDto[] userRespDtos=new UserRespDto[1];
        	userRespDtos[0].setFlag(false);
        	userRespDtos[0].setMessage("system wrong");
        	return userRespDtos;
		}
		// TODO Auto-generated method stub
	}

	public UserRespDto[] viewSubUserDetail(String user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public RoleRespDto[] viewSubUserRole(String user_id) {
		// TODO Auto-generated method stub
		String role_id;
		try {
			role_id=userRoleService.viewUserRole(user_id);
			if(role_id==null||role_id=="")
			{
				RoleRespDto[] roleRespDtos=new RoleRespDto[1];
				roleRespDtos[0].setFlag(false);
				roleRespDtos[0].setMessage("not have role");
				return roleRespDtos;
			}
			else {
				List<Role> list=roleService.viewSubUserRole(role_id);
				int size=list.size();
				if(size==0)
				{
					RoleRespDto[] roleRespDtos=new RoleRespDto[1];
					roleRespDtos[0].setFlag(false);
					roleRespDtos[0].setMessage("not have sub user role");
					return roleRespDtos;
				}
				else {
					RoleRespDto[] roleRespDtos=new RoleRespDto[size];
					for(int i=0;i<size;i++)
					{
						Role role=list.get(i);
						RoleRespDto roleRespDto=new RoleRespDto();
						po2dto.convert(role, roleRespDto);
						roleRespDtos[i]=roleRespDto;
						roleRespDtos[i].setFlag(true);
					}
					return roleRespDtos;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			RoleRespDto[] roleRespDtos=new RoleRespDto[1];
			roleRespDtos[0].setFlag(false);
			roleRespDtos[0].setMessage("system wrong");
			return roleRespDtos;
		}
	}

	public UserRespDto[] viewSubUserSystem(String user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserRespDto[] viewSubUsersBase(String user_id) {
		// TODO Auto-generated method stub
		try {
				List<UserDetail> list=userDetailService.viewSubUsersDetail(user_id);
				List<UserInfo> list1=userInfoService.viewSubUsersInfo(user_id);
				int size=list.size();
				if(size==0)
				{
					UserRespDto[] userRespDtos=new UserRespDto[1];
					userRespDtos[0].setFlag(false);
					userRespDtos[0].setMessage("not have sub user role");
					return userRespDtos;
				}
				else {
					UserRespDto[] userRespDtos=new UserRespDto[size];
					for(int i=0;i<size;i++)
					{
						UserDetail userDetail=list.get(i);
						UserInfo userInfo=list1.get(i);
						UserRespDto userRespDto=new UserRespDto();
						po2dto.convert(userDetail, userRespDto);
						po2dto.convert(userInfo, userRespDto);
						userRespDtos[i]=userRespDto;
						userRespDtos[i].setFlag(true);
					}
					return userRespDtos;
				}
			
		} catch (Exception e) {
			// TODO: handle exception
			UserRespDto[] userRespDtos=new UserRespDto[1];
			userRespDtos[0].setFlag(false);
			userRespDtos[0].setMessage("system wrong");
			return userRespDtos;
		}
	}

	public UserRespDto[] viewSubUsersDetail(String user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserRespDto[] viewSubUsersSystem(String user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserRespDto viewUserBase(String user_id) {
		// TODO Auto-generated method stub
		UserRespDto userRespDto = new UserRespDto();
		/*利用账号名查询*/
		try {
			UserInfo userInfo=userInfoService.viewUserInfo(user_id);
			UserDetail userDetail=userDetailService.viewUserDeatil(user_id);
			po2dto.convert(userInfo, userRespDto);
			po2dto.convert(userDetail, userRespDto);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return userRespDto;
	}

	public UserRespDto viewUserDetail(String user_id) {
		// TODO Auto-generated method stub
		UserRespDto userRespDto=new UserRespDto();
		try {
			UserInfo userInfo=userInfoService.viewUserInfo(user_id);
			UserDetail userDetail=userDetailService.viewUserDeatil(user_id);
			po2dto.convert(userInfo, userRespDto);
			po2dto.convert(userDetail, userRespDto);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return userRespDto;
	}

	public RoleRespDto viewUserRole(String user_id) {
		// TODO Auto-generated method stub
		RoleRespDto roleRespDto=new RoleRespDto();
		try {
			String role_id=userRoleService.viewUserRole(user_id);
			if(role_id==null||role_id=="")
			{
				roleRespDto.setFlag(false);
				roleRespDto.setMessage("not have role");
			}
			else {
				Role role=roleService.viewRole(role_id);
				po2dto.convert(role, roleRespDto);
				roleRespDto.setFlag(true);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return roleRespDto;
	}

	public UserRespDto viewUserSystem(String user_id) {
		// TODO Auto-generated method stub
		UserRespDto userRespDto = new UserRespDto();
		UserSystem userSystem = userSystemService.viewUserSystem(user_id);
		try {
			po2dto.convert(userSystem, userRespDto);
			return userRespDto;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return null;		
		}

	}

	public BaseRespDto modUserStatus(String user_id, String child_user_id,int state) {
		// TODO Auto-generated method stub
		BaseRespDto baseRespDto = new BaseRespDto();
		if(userInfoService.isExistRelation(user_id, child_user_id)){
			userInfoService.modUserStatus(child_user_id, state);
			userDetailService.modUserStatus(child_user_id, state);
			userSystemService.modUserStatus(child_user_id, state);
			baseRespDto.setFlag(true);
			baseRespDto.setMessage("mod user status ok");
			return baseRespDto;
		}
		baseRespDto.setFlag(false);
		return baseRespDto;
	}

	public RoleRespDto[] viewRoleStatus(int state) {
		// TODO Auto-generated method stub
     //   AuthorityRespDto[] authorityRespDtos = new AuthorityRespDto[list.size()];
		List<Role> roleList = roleService.viewRoleStatus(state);
		RoleRespDto[] roleRespDtos = new RoleRespDto[roleList.size()];
		for(int i=0;i<roleList.size();i++){
			try {
				po2dto.convert(roleList.get(i),roleRespDtos[i]);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		return roleRespDtos;
	}

	public UserRespDto[] viewUserStatus(int state) {
		// TODO Auto-generated method stub
		List<UserInfo> userList = userInfoService.viewUserStatus(state);
		UserRespDto[] userRespDtos = new UserRespDto[userList.size()];
		for(int i=0;i<userList.size();i++){
			try {
				po2dto.convert(userList.get(i),userRespDtos[i]);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		return userRespDtos;
	}

	
	public BaseRespDto addFileServer(FileServerDto server) {
		// TODO Auto-generated method stub
		BaseRespDto baseRespDto = new BaseRespDto();
		bio.po.FileServer fileserver=new bio.po.FileServer();
		try {
			dto2po.convert( server,fileserver);
			fileServerService.addFileServer(fileserver);
			baseRespDto.setFlag(true);
			return baseRespDto;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			baseRespDto.setFlag(false);
			return baseRespDto;
		}
		
	}

	
	public BaseRespDto delFileServer(String ser_id) {
		// TODO Auto-generated method stub
		BaseRespDto baseRespDto = new BaseRespDto();
		boolean flag=false;
		try {
			flag=fileServerService.delFileServer(ser_id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		baseRespDto.setFlag(flag);
		return baseRespDto;
	}

	
	public FileServerRespDto viewFileServer(String ser_id) {
		// TODO Auto-generated method stub
		FileServerRespDto fileserverRespDto=new FileServerRespDto();
		try {
			bio.po.FileServer fileserver=fileServerService.viewFileServer(ser_id);
			if(fileserver==null)
			{
				fileserverRespDto.setFlag(false);
				fileserverRespDto.setMessage("dont exist this fileserver");
			}
			else {
				po2dto.convert(fileserver, fileserverRespDto);
				fileserverRespDto.setFlag(true);
			}
		} catch (Exception e) {
			// TODO: handle exception
			fileserverRespDto.setFlag(false);
			fileserverRespDto.setMessage("system wrong");
			e.printStackTrace();
		}
		return fileserverRespDto;
	}

	
	public FileServerRespDto[] viewAllFileServer() {
		// TODO Auto-generated method stub
		FileServerRespDto[] fileServerRespDtos=null;
		try {
			List<FileServer> fileServers = fileServerService.viewFileServer();
		 fileServerRespDtos= new FileServerRespDto[fileServers.size()];
		System.out.println(fileServers.size()+"fileserver长度");
		for(int i=0;i<fileServers.size();i++){
			
				
				System.out.println(fileServers.get(i).getId());
				FileServerRespDto fileServerRespDto=new FileServerRespDto();
				fileServerRespDto.setId(fileServers.get(i).getId());
				fileServerRespDto.setIpaddr(fileServers.get(i).getIpaddr());
				
				fileServerRespDto.setPortnum(fileServers.get(i).getPortnum());
				fileServerRespDto.setServername(fileServers.get(i).getServername());
				fileServerRespDto.setType(fileServers.get(i).getType());
				fileServerRespDtos[i]=fileServerRespDto;
				
						
		}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return fileServerRespDtos;
	}

	
	public BaseRespDto modFileServer(String ser_id, FileServerDto server) {
		// TODO Auto-generated method stub
		BaseRespDto baseRespDto=new BaseRespDto();
		try {
			fileServerService.modFileServerIpAddr(ser_id, server.getIpaddr());
			fileServerService.modFileServerName(ser_id, server.getServername());
			fileServerService.modFileServerPortNum(ser_id, server.getPortnum());
			fileServerService.modFileServerType(ser_id, server.getType());
			baseRespDto.setFlag(true);
		} catch (Exception e) {
			baseRespDto.setFlag(false);
			// TODO: handle exception
		}
		// TODO Auto-generated method stub
		return baseRespDto;
	}

	
	public UserFileServerRespDto getFileServer(String user_id, String server_id) {
		// TODO Auto-generated method stub
		UserFileServerRespDto userFileServerRespDto = new UserFileServerRespDto();
		UserFileserver userfileserver = this.userFileServerService.viewUserFileServer(user_id, server_id);
		try {
			
			
			userFileServerRespDto.setUsrid(user_id);
			userFileServerRespDto.setServerid(server_id);
			userFileServerRespDto.setFlag(true);
			userFileServerRespDto.setMessage("Success");
			userFileServerRespDto.setUsrname(userfileserver.getUsrname());
			userFileServerRespDto.setUsrpasswd(userfileserver.getUsrpasswd());
			userFileServerRespDto.setFilepath(userfileserver.getFilepath());
			
			
			return userFileServerRespDto;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;		
		}
	}

	
	public BaseRespDto modFileServerAccount(String user_id, String server_id,
			String user_account, String user_password) {
		// TODO Auto-generated method stub
		BaseRespDto baseRespDto=new BaseRespDto();
		try {
			userFileServerService.modUserFileServerPassword(user_id,server_id,user_password);
			baseRespDto.setFlag(true);
		} catch (Exception e) {
			baseRespDto.setFlag(false);
			// TODO: handle exception
		}
		// TODO Auto-generated method stub
		return baseRespDto;
	}


}
