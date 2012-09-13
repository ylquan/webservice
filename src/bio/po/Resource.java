package bio.po;

/**
 * Resource entity. @author MyEclipse Persistence Tools
 */

public class Resource implements java.io.Serializable {

	// Fields

	private String resid;
	private String resname;
	private Integer restype;

	// Constructors

	/** default constructor */
	public Resource() {
	}

	/** minimal constructor */
	public Resource(String resid) {
		this.resid = resid;
	}

	/** full constructor */
	public Resource(String resid, String resname, Integer restype) {
		this.resid = resid;
		this.resname = resname;
		this.restype = restype;
	}

	// Property accessors

	public String getResid() {
		return this.resid;
	}

	public void setResid(String resid) {
		this.resid = resid;
	}

	public String getResname() {
		return this.resname;
	}

	public void setResname(String resname) {
		this.resname = resname;
	}

	public Integer getRestype() {
		return this.restype;
	}

	public void setRestype(Integer restype) {
		this.restype = restype;
	}

}