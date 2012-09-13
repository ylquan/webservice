package bio.service;
import java.util.List;

import bio.po.Resource;
public interface ResourceService {
	boolean addResource(Resource resource);

    boolean delResource(String resource_id);  

    Resource viewResource(String resource_id);
    
    List<Resource> viewRoleResources(String role_id);
}
