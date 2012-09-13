package bio.service;

import java.util.List;

import bio.dto.xsd.FeedbackDto;
import bio.po.Feedback;

public interface FeedbackService {
	boolean addFeedback(Feedback fb);
    boolean delFeedback(String fb_id);
    boolean replyFeedback(Feedback fb);
    List<Feedback> viewFeedback(String user_id);
    List<Feedback> viewAllFeedback(int pageNow,int pageSize);
}
