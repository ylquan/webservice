package bio.po;

/**
 * UserDetail entity. @author MyEclipse Persistence Tools
 */

public class UserDetail implements java.io.Serializable {

	// Fields

	private String id;
	private Integer degree;
	private String univ;
	private String title;
	private String org;
	private String depart;
	private String grp;
	private String fax;
	private String research;
	private Integer status;
	private String fatherid;

	// Constructors

	/** default constructor */
	public UserDetail() {
	}

	/** minimal constructor */
	public UserDetail(String id, Integer status, String fatherid) {
		this.id = id;
		this.status = status;
		this.fatherid = fatherid;
	}

	/** full constructor */
	public UserDetail(String id, Integer degree, String univ, String title,
			String org, String depart, String grp, String fax, String research,
			Integer status, String fatherid) {
		this.id = id;
		this.degree = degree;
		this.univ = univ;
		this.title = title;
		this.org = org;
		this.depart = depart;
		this.grp = grp;
		this.fax = fax;
		this.research = research;
		this.status = status;
		this.fatherid = fatherid;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getDegree() {
		return this.degree;
	}

	public void setDegree(Integer degree) {
		this.degree = degree;
	}

	public String getUniv() {
		return this.univ;
	}

	public void setUniv(String univ) {
		this.univ = univ;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOrg() {
		return this.org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	public String getDepart() {
		return this.depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getGrp() {
		return this.grp;
	}

	public void setGrp(String grp) {
		this.grp = grp;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getResearch() {
		return this.research;
	}

	public void setResearch(String research) {
		this.research = research;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getFatherid() {
		return this.fatherid;
	}

	public void setFatherid(String fatherid) {
		this.fatherid = fatherid;
	}

}