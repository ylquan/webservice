package bio.dao;
import bio.po.Resource;
public interface ResourceDao {
	boolean addResource(Resource resource);

    boolean delResource(String resource_id);  

    Resource viewResource(String resource_id);
}
