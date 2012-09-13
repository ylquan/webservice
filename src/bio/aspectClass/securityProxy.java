package bio.aspectClass;

import java.util.jar.JarException;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import bio.dto.xsd.UserRespDto;

@Aspect
public class securityProxy {
	private int roletype;
	@AfterReturning(returning="rvt",pointcut="execution(* bio.user.manage.userManage.login(String,String))")
	public void initType(UserRespDto rvt)
	{
		roletype=rvt.getRoletype();
	}
	@Around ("execution(* bio.user.manage.userManage.addOperation(bio.dto.xsd.AuthorityDto))")
	public Object addOperationFunc(ProceedingJoinPoint jp) throws java.lang.Throwable
	{
		Object rtv=new Object();
		if(roletype==1)
		{
			//Object[] args=jp.getArgs(); 
			rtv=jp.proceed();		
		}
		return rtv;	
	}
	@Around ("execution(* bio.user.manage.userManage.addResource(bio.dto.xsd.AuthorityDto))")
	public Object addResourceFunc(ProceedingJoinPoint jp) throws java.lang.Throwable
	{
		Object rtv=new Object();
		if(roletype==1)
		{
			//Object[] args=jp.getArgs(); 
			rtv=jp.proceed();		
		}
		return rtv;	
	}
	@Around ("execution(* bio.user.manage.userManage.addRole(bio.dto.xsd.RoleDto))")
	public Object addRoleFunc(ProceedingJoinPoint jp) throws java.lang.Throwable
	{
		Object rtv=new Object();
		if(roletype==1||roletype==2)
		{
			//Object[] args=jp.getArgs(); 
			rtv=jp.proceed();		
		}
		return rtv;	
	}
	@Around ("execution(* bio.user.manage.userManage.addRoleOperations(String,String[]))")
	public Object addRoleOperationsFunc(ProceedingJoinPoint jp) throws java.lang.Throwable
	{
		Object rtv=new Object();
		if(roletype==1||roletype==2)
		{
			//Object[] args=jp.getArgs(); 
			rtv=jp.proceed();		
		}
		return rtv;	
	}
	@Around ("execution(* bio.user.manage.userManage.addRoleResource(String,String[]))")
	public Object addRoleResourceFunc(ProceedingJoinPoint jp) throws java.lang.Throwable
	{
		Object rtv=new Object();
		if(roletype==1||roletype==2)
		{
			//Object[] args=jp.getArgs(); 
			rtv=jp.proceed();		
		}
		return rtv;	
	}
	@Around ("execution(* bio.user.manage.userManage.addUserRole(String,String,String))")
	public Object addUserRoleFunc(ProceedingJoinPoint jp) throws java.lang.Throwable
	{
		Object rtv=new Object();
		if(roletype==1||roletype==2)
		{
			//Object[] args=jp.getArgs(); 
			rtv=jp.proceed();		
		}
		return rtv;	
	}
	@Around ("execution(* bio.user.manage.userManage.delFeedback(String))")
	public Object delFeedbackFunc(ProceedingJoinPoint jp) throws java.lang.Throwable
	{
		Object rtv=new Object();
		if(roletype==1||roletype==2)
		{
			//Object[] args=jp.getArgs(); 
			rtv=jp.proceed();		
		}
		return rtv;	
	}
	@Around ("execution(* bio.user.manage.userManage.delOperation(String))")
	public Object delOperationFunc(ProceedingJoinPoint jp) throws java.lang.Throwable
	{
		Object rtv=new Object();
		if(roletype==1)
		{
			//Object[] args=jp.getArgs(); 
			rtv=jp.proceed();		
		}
		return rtv;	
	}
	@Around ("execution(* bio.user.manage.userManage.delResource(String))")
	public Object delResourceFunc(ProceedingJoinPoint jp) throws java.lang.Throwable
	{
		Object rtv=new Object();
		if(roletype==1)
		{
			//Object[] args=jp.getArgs(); 
			rtv=jp.proceed();		
		}
		return rtv;	
	}
	@Around ("execution(* bio.user.manage.userManage.delRole(String))")
	public Object delRoleFunc(ProceedingJoinPoint jp) throws java.lang.Throwable
	{
		Object rtv=new Object();
		if(roletype==1)
		{
			//Object[] args=jp.getArgs(); 
			rtv=jp.proceed();		
		}
		return rtv;	
	}
	@Around ("execution(* bio.user.manage.userManage.delRoleOperations(String,String[]))")
	public Object delRoleOperationsFunc(ProceedingJoinPoint jp) throws java.lang.Throwable
	{
		Object rtv=new Object();
		if(roletype==1)
		{
			//Object[] args=jp.getArgs(); 
			rtv=jp.proceed();		
		}
		return rtv;	
	}
	@Around ("execution(* bio.user.manage.userManage.delRoleResources(String,String[]))")
	public Object delRoleResourcesFunc(ProceedingJoinPoint jp) throws java.lang.Throwable
	{
		Object rtv=new Object();
		if(roletype==1)
		{
			//Object[] args=jp.getArgs(); 
			rtv=jp.proceed();		
		}
		return rtv;	
	}
	@Around ("execution(* bio.user.manage.userManage.delUser(String,String))")
	public Object delUserFunc(ProceedingJoinPoint jp) throws java.lang.Throwable
	{
		Object rtv=new Object();
		if(roletype==1)
		{
			//Object[] args=jp.getArgs(); 
			rtv=jp.proceed();		
		}
		return rtv;	
	}
	@Around ("execution(* bio.user.manage.userManage.modRoleStatus(String,int))")
	public Object modRoleStatusFunc(ProceedingJoinPoint jp) throws java.lang.Throwable
	{
		Object rtv=new Object();
		if(roletype==1)
		{
			//Object[] args=jp.getArgs(); 
			rtv=jp.proceed();		
		}
		return rtv;	
	}
	@Around ("execution(* bio.user.manage.userManage.replyFeedback(bio.dto.xsd.FeedbackDto))")
	public Object replyFeedbackFunc(ProceedingJoinPoint jp) throws java.lang.Throwable
	{
		Object rtv=new Object();
		if(roletype==1)
		{
			//Object[] args=jp.getArgs(); 
			rtv=jp.proceed();		
		}
		return rtv;	
	}
	@Around ("execution(* bio.user.manage.userManage.viewFeedback(String))")
	public Object viewFeedbackFunc(ProceedingJoinPoint jp) throws java.lang.Throwable
	{
		Object rtv=new Object();
		if(roletype==1)
		{
			rtv=jp.proceed();		
		}
		return rtv;	
	}
	@Around ("execution(* bio.user.manage.userManage.viewSubAdminBase(String))")
	public Object viewSubAdminBaseFunc(ProceedingJoinPoint jp) throws java.lang.Throwable
	{
		Object rtv=new Object();
		if(roletype==1||roletype==2)
		{
			rtv=jp.proceed();		
		}
		return rtv;	
	}
	@Around ("execution(* bio.user.manage.userManage.viewSubAdminRole(String))")
	public Object viewSubAdminRoleFunc(ProceedingJoinPoint jp) throws java.lang.Throwable
	{
		Object rtv=new Object();
		if(roletype==1||roletype==2)
		{
			rtv=jp.proceed();		
		}
		return rtv;	
	}
	@Around ("execution(* bio.user.manage.userManage.viewSubRole(String))")
	public Object viewSubRoleFunc(ProceedingJoinPoint jp) throws java.lang.Throwable
	{
		Object rtv=new Object();
		if(roletype==1||roletype==2)
		{
			rtv=jp.proceed();		
		}
		return rtv;	
	}
	@Around ("execution(* bio.user.manage.userManage.viewSubUserBase(String))")
	public Object viewSubUserBaseFunc(ProceedingJoinPoint jp) throws java.lang.Throwable
	{
		Object rtv=new Object();
		if(roletype==1||roletype==2)
		{
			rtv=jp.proceed();		
		}
		return rtv;	
	}
	@Around ("execution(* bio.user.manage.userManage.viewSubUserRole(String))")
	public Object viewSubUserRoleFunc(ProceedingJoinPoint jp) throws java.lang.Throwable
	{
		Object rtv=new Object();
		if(roletype==1||roletype==2)
		{
			rtv=jp.proceed();		
		}
		return rtv;	
	}
	@Around ("execution(* bio.user.manage.userManage.viewSubUsersBase(String))")
	public Object viewSubUsersBaseFunc(ProceedingJoinPoint jp) throws java.lang.Throwable
	{
		Object rtv=new Object();
		if(roletype==1||roletype==2)
		{
			rtv=jp.proceed();		
		}
		return rtv;	
	}
	@Around ("execution(* bio.user.manage.userManage.viewUserBase(String))")
	public Object viewUserBaseFunc(ProceedingJoinPoint jp) throws java.lang.Throwable
	{
		Object rtv=new Object();
		if(roletype==1||roletype==2)
		{
			rtv=jp.proceed();		
		}
		return rtv;	
	}
//	@Around ("execution(* bio.user.manage.userManage.viewUserDetail(String))")
//	public Object viewUserDetailFunc(ProceedingJoinPoint jp) throws java.lang.Throwable
//	{
//		Object rtv=new Object();
//		if(roletype==1||roletype==2)
//		{
//			rtv=jp.proceed();		
//		}
//		return rtv;	
//	}
//	@Around ("execution(* bio.user.manage.userManage.viewUserRole(String))")
//	public Object viewUserRoleFunc(ProceedingJoinPoint jp) throws java.lang.Throwable
//	{
//		Object rtv=new Object();
//		if(roletype==1||roletype==2)
//		{
//			rtv=jp.proceed();		
//		}
//		return rtv;	
//	}
//	@Around ("execution(* bio.user.manage.userManage.viewUserSystem(String))")
//	public Object viewUserSystemFunc(ProceedingJoinPoint jp) throws java.lang.Throwable
//	{
//		Object rtv=new Object();
//		if(roletype==1||roletype==2)
//		{
//			rtv=jp.proceed();		
//		}
//		return rtv;	
//	}
	@Around ("execution(* bio.user.manage.userManage.modUserStatus(String,String,int))")
	public Object modUserStatusFunc(ProceedingJoinPoint jp) throws java.lang.Throwable
	{
		Object rtv=new Object();
		if(roletype==1||roletype==2)
		{
			rtv=jp.proceed();		
		}
		return rtv;	
	}
	@Around ("execution(* bio.user.manage.userManage.viewRoleStatus(int))")
	public Object viewRoleStatusFunc(ProceedingJoinPoint jp) throws java.lang.Throwable
	{
		Object rtv=new Object();
		if(roletype==1||roletype==2)
		{
			rtv=jp.proceed();		
		}
		return rtv;	
	}
	@Around ("execution(* bio.user.manage.userManage.viewUserStatus(int))")
	public Object viewUserStatusFunc(ProceedingJoinPoint jp) throws java.lang.Throwable
	{
		Object rtv=new Object();
		if(roletype==1||roletype==2)
		{
			rtv=jp.proceed();		
		}
		return rtv;	
	}
//@Around ("execution(*)")
}
