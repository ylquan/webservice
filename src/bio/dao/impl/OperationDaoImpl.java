package bio.dao.impl;
import java.util.UUID;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import bio.dao.OperationDao;
import bio.po.Operation;
public class OperationDaoImpl extends HibernateDaoSupport implements OperationDao{
	public boolean addOperation(Operation operation)
	{
		boolean flag=false;
		operation.setOpid(UUID.randomUUID().toString().toString().replaceAll("-",
				""));
		try {
			getHibernateTemplate().save(operation);
			flag=true;
		} catch (RuntimeException e) {
			// TODO: handle exception
			throw e;
		}
		return flag;
	}
	public boolean delOperation(String operation_id)
	{
		boolean flag=false;
		try {
			Object operation=getHibernateTemplate().load(Operation.class,operation_id);
			getHibernateTemplate().delete(operation);
			flag=true;
			
		} catch (RuntimeException e) {
			// TODO: handle exception
			throw e;
		}
		return flag;
	}
	public Operation viewOperation(String operation_id)
	{
		return (Operation) getHibernateTemplate().get(Operation.class, operation_id);
		
	}
}
