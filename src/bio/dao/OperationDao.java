package bio.dao;
import bio.po.Operation;
public interface OperationDao {
	boolean addOperation(Operation operation);

    boolean delOperation(String operation_id);

    Operation viewOperation(String operation_id);
}
