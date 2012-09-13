package bio.po;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * UserInfo entity. @author MyEclipse Persistence Tools
 */

public class UserInfo implements java.io.Serializable {

	// Fields

	private String id;
	private String account;
	private String passwd;
	private String name;
	private Integer gender;
	private Date birth;
	private String email;
	private String cell;
	private Integer status;
	private String fatherid;
	
	//ÐÂÔö¼Ó@quanyuelong
	//private Set fileservers = new HashSet();

	// Constructors

	/*public Set getFileservers() {
		return fileservers;
	}

	public void setFileservers(Set fileservers) {
		this.fileservers = fileservers;
	}*/

	/** default constructor */
	public UserInfo() {
	}

	/** minimal constructor */
	public UserInfo(String account, String passwd, Integer status,
			String fatherid) {
		this.account = account;
		this.passwd = passwd;
		this.status = status;
		this.fatherid = fatherid;
	}

	/** full constructor */
	public UserInfo(String account, String passwd, String name, Integer gender,
			Date birth, String email, String cell, Integer status,
			String fatherid) {
		this.account = account;
		this.passwd = passwd;
		this.name = name;
		this.gender = gender;
		this.birth = birth;
		this.email = email;
		this.cell = cell;
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

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPasswd() {
		return this.passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getGender() {
		return this.gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Date getBirth() {
		return this.birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCell() {
		return this.cell;
	}

	public void setCell(String cell) {
		this.cell = cell;
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