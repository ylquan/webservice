package bio.service.impl;

import java.util.List;
import bio.dao.FeedbackDao;
import bio.po.Feedback;
import bio.service.FeedbackService;

public class FeedbackManage implements FeedbackService {
	private FeedbackDao feedbackDao;

	public void setFeedbackDao(FeedbackDao feedbackDao) {
		this.feedbackDao = feedbackDao;
	}

	
	public boolean addFeedback(Feedback fb) {
		return feedbackDao.addFeedback(fb);
	}

	
	public boolean delFeedback(String fb_id) {
		// TODO Auto-generated method stub
		return feedbackDao.delFeedback(fb_id);
	}

	
	public boolean replyFeedback(Feedback fb) {
		// TODO Auto-generated method stub
		return feedbackDao.replyFeedback(fb);
	}

	
	public List<Feedback> viewFeedback(String user_id) {
		return feedbackDao.viewFeedback(user_id);
	}

	
	public List<Feedback> viewAllFeedback(int pageNow, int pageSize) {
		// TODO Auto-generated method stub
		return feedbackDao.viewAllFeedback(pageNow, pageSize);
	}

}
