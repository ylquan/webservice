package bio.dao;
import bio.po.Feedback;
import java.util.List;
public interface FeedbackDao {
	boolean addFeedback(Feedback fb);
    boolean delFeedback(String fb_id);
    boolean replyFeedback(Feedback fb);
    List<Feedback> viewFeedback(String user_id);
    List<Feedback> viewAllFeedback(int pageNow,int pageSize);
}
