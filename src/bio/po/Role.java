package bio.po;

/**
 * Role entity. @author MyEclipse Persistence Tools
 */

public class Role implements java.io.Serializable {

	// Fields

	private String id;
	private String name;
	private Integer type;
	private String description;
	private String fatherid;
	private Integer status;

	// Constructors

	/** default constructor */
	public Role() {
	}

	/** full constructor */
	public Role(String name, Integer type, String description, String fatherid,
			Integer status) {
		this.name = name;
		this.type = type;
		this.description = description;
		this.fatherid = fatherid;
		this.status = status;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFatherid() {
		return this.fatherid;
	}

	public void setFatherid(String fatherid) {
		this.fatherid = fatherid;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String toString(){
		String string = null;
		string = id +" "+name +" "+type +" "+description+" "+fatherid+" "+status;
		return string;
	}
}