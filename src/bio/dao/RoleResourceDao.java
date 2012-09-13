package bio.dao;

import java.util.List;

import bio.po.RoleResource;


public interface RoleResourceDao {
	boolean  addRoleResources(String role_id, String[] resource_id);
    boolean  delRoleResources(String role_id, String[] resource_id);
    List<RoleResource> viewResources(String role_id);
}
