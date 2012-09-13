package bio.po;

/**
 * UserFileserverId entity. @author MyEclipse Persistence Tools
 */

public class UserFileserverId implements java.io.Serializable {

	// Fields

	private String usrid;
	private String serverid;

	// Constructors

	/** default constructor */
	public UserFileserverId() {
	}

	/** full constructor */
	public UserFileserverId(String usrid, String serverid) {
		this.usrid = usrid;
		this.serverid = serverid;
	}

	// Property accessors

	public String getUsrid() {
		return this.usrid;
	}

	public void setUsrid(String usrid) {
		this.usrid = usrid;
	}

	public String getServerid() {
		return this.serverid;
	}

	public void setServerid(String serverid) {
		this.serverid = serverid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UserFileserverId))
			return false;
		UserFileserverId castOther = (UserFileserverId) other;

		return ((this.getUsrid() == castOther.getUsrid()) || (this.getUsrid() != null
				&& castOther.getUsrid() != null && this.getUsrid().equals(
				castOther.getUsrid())))
				&& ((this.getServerid() == castOther.getServerid()) || (this
						.getServerid() != null
						&& castOther.getServerid() != null && this
						.getServerid().equals(castOther.getServerid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getUsrid() == null ? 0 : this.getUsrid().hashCode());
		result = 37 * result
				+ (getServerid() == null ? 0 : this.getServerid().hashCode());
		return result;
	}

}