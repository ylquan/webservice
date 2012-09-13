package bio.po;

/**
 * UserFileserver entity. @author MyEclipse Persistence Tools
 */

public class UserFileserver implements java.io.Serializable {

	// Fields

	private UserFileserverId id;
	private String usrname;
	private String usrpasswd;
	private String filepath;

	// Constructors

	/** default constructor */
	public UserFileserver() {
	}

	/** full constructor */
	public UserFileserver(UserFileserverId id, String usrname,
			String usrpasswd, String filepath) {
		this.id = id;
		this.usrname = usrname;
		this.usrpasswd = usrpasswd;
		this.filepath = filepath;
	}

	// Property accessors

	public UserFileserverId getId() {
		return this.id;
	}

	public void setId(UserFileserverId id) {
		this.id = id;
	}

	public String getUsrname() {
		return this.usrname;
	}

	public void setUsrname(String usrname) {
		this.usrname = usrname;
	}

	public String getUsrpasswd() {
		return this.usrpasswd;
	}

	public void setUsrpasswd(String usrpasswd) {
		this.usrpasswd = usrpasswd;
	}

	public String getFilepath() {
		return this.filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

}