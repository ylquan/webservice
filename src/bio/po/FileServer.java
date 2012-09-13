package bio.po;

import java.util.HashSet;
import java.util.Set;

/**
 * FileServer entity. @author MyEclipse Persistence Tools
 */

public class FileServer implements java.io.Serializable {

	// Fields

	private String id;
	private String ipaddr;
	private Integer type;
	private Integer portnum;
	private String servername;
	//private Set users = new HashSet();

	// Constructors


	/** default constructor */
	public FileServer() {
	}

	/** full constructor */
	public FileServer(String ipaddr, Integer type, Integer portnum,
			String servername) {
		this.ipaddr = ipaddr;
		this.type = type;
		this.portnum = portnum;
		this.servername = servername;
		//this.users = users;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIpaddr() {
		return this.ipaddr;
	}

	public void setIpaddr(String ipaddr) {
		this.ipaddr = ipaddr;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getPortnum() {
		return this.portnum;
	}

	public void setPortnum(Integer portnum) {
		this.portnum = portnum;
	}

	public String getServername() {
		return this.servername;
	}

	public void setServername(String servername) {
		this.servername = servername;
	}


	/*public Set getUsers() {
		return users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}*/
}