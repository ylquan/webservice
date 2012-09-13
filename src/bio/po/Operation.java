package bio.po;

/**
 * Operation entity. @author MyEclipse Persistence Tools
 */

public class Operation implements java.io.Serializable {

	// Fields

	private String opid;
	private String opname;
	private String opdescription;

	// Constructors

	/** default constructor */
	public Operation() {
	}

	/** minimal constructor */
	public Operation(String opid) {
		this.opid = opid;
	}

	/** full constructor */
	public Operation(String opid, String opname, String opdescription) {
		this.opid = opid;
		this.opname = opname;
		this.opdescription = opdescription;
	}

	// Property accessors

	public String getOpid() {
		return this.opid;
	}

	public void setOpid(String opid) {
		this.opid = opid;
	}

	public String getOpname() {
		return this.opname;
	}

	public void setOpname(String opname) {
		this.opname = opname;
	}

	public String getOpdescription() {
		return this.opdescription;
	}

	public void setOpdescription(String opdescription) {
		this.opdescription = opdescription;
	}

}