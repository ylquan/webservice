package bio.po;

/**
 * UserRole entity. @author MyEclipse Persistence Tools
 */

public class UserRole implements java.io.Serializable {

	// Fields

	private String userid;
	private String roleid;

	// Constructors

	/** default constructor */
	public UserRole() {
	}

	/** minimal constructor */
	public UserRole(String userid) {
		this.userid = userid;
	}

	/** full constructor */
	public UserRole(String userid, String roleid) {
		this.userid = userid;
		this.roleid = roleid;
	}

	// Property accessors

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getRoleid() {
		return this.roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

}