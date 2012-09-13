package bio.po;

import java.sql.Timestamp;

/**
 * Feedback entity. @author MyEclipse Persistence Tools
 */

public class Feedback implements java.io.Serializable {

	// Fields

	private String id;
	private String userid;
	private Timestamp time;
	private String description;
	private String action;
	private Timestamp actiontime;

	// Constructors

	/** default constructor */
	public Feedback() {
	}

	/** minimal constructor */
	public Feedback(String id, String userid, String description) {
		this.id = id;
		this.userid = userid;
		this.description = description;
	}

	/** full constructor */
	public Feedback(String id, String userid, Timestamp time,
			String description, String action, Timestamp actiontime) {
		this.id = id;
		this.userid = userid;
		this.time = time;
		this.description = description;
		this.action = action;
		this.actiontime = actiontime;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Timestamp getActiontime() {
		return this.actiontime;
	}

	public void setActiontime(Timestamp actiontime) {
		this.actiontime = actiontime;
	}

}