package bio.po;

/**
 * RoleOperationId entity. @author MyEclipse Persistence Tools
 */

public class RoleOperationId implements java.io.Serializable {

	// Fields

	private String roleid;
	private String opid;

	// Constructors

	/** default constructor */
	public RoleOperationId() {
	}

	/** full constructor */
	public RoleOperationId(String roleid, String opid) {
		this.roleid = roleid;
		this.opid = opid;
	}

	// Property accessors

	public String getRoleid() {
		return this.roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

	public String getOpid() {
		return this.opid;
	}

	public void setOpid(String opid) {
		this.opid = opid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RoleOperationId))
			return false;
		RoleOperationId castOther = (RoleOperationId) other;

		return ((this.getRoleid() == castOther.getRoleid()) || (this
				.getRoleid() != null && castOther.getRoleid() != null && this
				.getRoleid().equals(castOther.getRoleid())))
				&& ((this.getOpid() == castOther.getOpid()) || (this.getOpid() != null
						&& castOther.getOpid() != null && this.getOpid()
						.equals(castOther.getOpid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRoleid() == null ? 0 : this.getRoleid().hashCode());
		result = 37 * result
				+ (getOpid() == null ? 0 : this.getOpid().hashCode());
		return result;
	}

}