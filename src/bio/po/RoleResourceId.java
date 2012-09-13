package bio.po;

/**
 * RoleResourceId entity. @author MyEclipse Persistence Tools
 */

public class RoleResourceId implements java.io.Serializable {

	// Fields

	private String roleid;
	private String resid;

	// Constructors

	/** default constructor */
	public RoleResourceId() {
	}

	/** full constructor */
	public RoleResourceId(String roleid, String resid) {
		this.roleid = roleid;
		this.resid = resid;
	}

	// Property accessors

	public String getRoleid() {
		return this.roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

	public String getResid() {
		return this.resid;
	}

	public void setResid(String resid) {
		this.resid = resid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RoleResourceId))
			return false;
		RoleResourceId castOther = (RoleResourceId) other;

		return ((this.getRoleid() == castOther.getRoleid()) || (this
				.getRoleid() != null && castOther.getRoleid() != null && this
				.getRoleid().equals(castOther.getRoleid())))
				&& ((this.getResid() == castOther.getResid()) || (this
						.getResid() != null && castOther.getResid() != null && this
						.getResid().equals(castOther.getResid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRoleid() == null ? 0 : this.getRoleid().hashCode());
		result = 37 * result
				+ (getResid() == null ? 0 : this.getResid().hashCode());
		return result;
	}

}