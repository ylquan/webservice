package bio.service.impl;

import java.util.List;

import bio.dao.ResourceDao;
import bio.dao.RoleResourceDao;
import bio.po.Operation;
import bio.po.Resource;
import bio.po.RoleOperation;
import bio.po.RoleResource;
import bio.service.ResourceService;
import java.util.ArrayList;
public class ResourceManage implements ResourceService {
	private ResourceDao resourceDao;
	private RoleResourceDao roleResourceDao;
	public void setResourceDao(ResourceDao resourceDao) {
		this.resourceDao = resourceDao;
	}

	public void setRoleResourceDao(RoleResourceDao roleResourceDao) {
		this.roleResourceDao = roleResourceDao;
	}

	
	
	public boolean addResource(Resource resource) {
		// TODO Auto-generated method stub
		return resourceDao.addResource(resource);
	}

	
	public boolean delResource(String resource_id) {
		// TODO Auto-generated method stub
		return resourceDao.delResource(resource_id);
	}

	
	public Resource viewResource(String resource_id) {
		// TODO Auto-generated method stub
		return resourceDao.viewResource(resource_id);
	}

	
	public List<Resource> viewRoleResources(String role_id) {
		// TODO Auto-generated method stub
		List<RoleResource> list=roleResourceDao.viewResources(role_id);
		List<Resource> list1=new ArrayList<Resource>();
		for(int i=0;i<list.size();i++)
		{
			Resource resource=resourceDao.viewResource(list.get(i).getId().getResid());
			list1.add(resource);
		}
		return list1;
	}

}
