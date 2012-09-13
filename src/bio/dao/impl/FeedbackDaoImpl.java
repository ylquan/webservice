package bio.dao.impl;

import java.util.List;

import org.hibernate.*;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import java.util.UUID;
import bio.dao.FeedbackDao;
import bio.po.Feedback;

import java.sql.Timestamp;

public class FeedbackDaoImpl extends HibernateDaoSupport implements FeedbackDao {

	
	public boolean addFeedback(Feedback fb) {
		// TODO Auto-generated method stub
		boolean flag=false;
		fb.setId(UUID.randomUUID().toString().toString().replaceAll("-",
				""));
		try {
			getHibernateTemplate().save(fb);
			flag=true;
		} catch (RuntimeException e) {
			// TODO: handle exception
			throw e;
		}
		return flag;
	}

	
	public boolean delFeedback(String fb_id) {
		// TODO Auto-generated method stub
		boolean flag=false;
		try {
			Object feedback=getHibernateTemplate().load(Feedback.class,fb_id);
			getHibernateTemplate().delete(feedback);
			flag=true;
			
		} catch (RuntimeException e) {
			// TODO: handle exception
			throw e;
		}
		return flag;
	}

	
	public boolean replyFeedback(Feedback fb) {
		// TODO Auto-generated method stub
		boolean flag=false;
		String action=fb.getAction();
		Timestamp actiontime=fb.getActiontime();
		String id=fb.getId();
		try {
			Feedback feedback=(Feedback)getHibernateTemplate().get(Feedback.class, id);
			feedback.setAction(action);
			feedback.setActiontime(actiontime);
			getHibernateTemplate().update(feedback);
			flag=true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return flag;
	}

	
	public List<Feedback> viewFeedback(String user_id) {
		// TODO Auto-generated method stub
		String hql = 	"from Feedback where userid = ? ";
		List<Feedback> list = getHibernateTemplate().find(hql,user_id);		
		return list;
	}

	
	public List<Feedback> viewAllFeedback(int pageNow,int pageSize) {//page search all feedback
		// TODO Auto-generated method stub
		Session session=getHibernateTemplate().getSessionFactory().openSession();
		Transaction ts=session.beginTransaction();
		Query query=session.createQuery("from Feedback");
		int firstResult=(pageNow-1)*pageSize;
		query.setFirstResult(firstResult);
		query.setMaxResults(pageSize);
		List<Feedback> feedbacks=query.list();
		ts.commit();
		session.close();
		session=null;
		return feedbacks;
	}

}
