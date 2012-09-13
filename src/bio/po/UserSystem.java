package bio.po;

/**
 * UserSystem entity. @author MyEclipse Persistence Tools
 */

public class UserSystem implements java.io.Serializable {

	// Fields

	private String id;
	private String fatherid;
	private String clusteruid;
	private String clustergid;
	private String cluseraccount;
	private String cluserpasswd;
	private String clusterdatapath;
	private Integer status;

	// Constructors

	/** default constructor */
	public UserSystem() {
	}

	/** minimal constructor */
	public UserSystem(String fatherid, Integer status) {
		this.fatherid = fatherid;
		this.status = status;
	}

	/** full constructor */
	public UserSystem(String fatherid, String clusteruid, String clustergid,
			String cluseraccount, String cluserpasswd, String clusterdatapath,
			Integer status) {
		this.fatherid = fatherid;
		this.clusteruid = clusteruid;
		this.clustergid = clustergid;
		this.cluseraccount = cluseraccount;
		this.cluserpasswd = cluserpasswd;
		this.clusterdatapath = clusterdatapath;
		this.status = status;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFatherid() {
		return this.fatherid;
	}

	public void setFatherid(String fatherid) {
		this.fatherid = fatherid;
	}

	public String getClusteruid() {
		return this.clusteruid;
	}

	public void setClusteruid(String clusteruid) {
		this.clusteruid = clusteruid;
	}

	public String getClustergid() {
		return this.clustergid;
	}

	public void setClustergid(String clustergid) {
		this.clustergid = clustergid;
	}

	public String getCluseraccount() {
		return this.cluseraccount;
	}

	public void setCluseraccount(String cluseraccount) {
		this.cluseraccount = cluseraccount;
	}

	public String getCluserpasswd() {
		return this.cluserpasswd;
	}

	public void setCluserpasswd(String cluserpasswd) {
		this.cluserpasswd = cluserpasswd;
	}

	public String getClusterdatapath() {
		return this.clusterdatapath;
	}

	public void setClusterdatapath(String clusterdatapath) {
		this.clusterdatapath = clusterdatapath;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}