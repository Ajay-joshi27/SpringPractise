package com.ajay.Entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "NaukriTable")
public class Naukriplatform implements Serializable {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer nid;

	private String nname;

	private Integer nexperience;

	public Integer getNid() {
		return nid;
	}

	public void setNid(Integer nid) {
		this.nid = nid;
	}

	public String getNname() {
		return nname;
	}

	public void setNname(String nname) {
		this.nname = nname;
	}

	public Integer getNexperience() {
		return nexperience;
	}

	public void setNexperience(Integer nexperience) {
		this.nexperience = nexperience;
	}

	public Naukriplatform() {
		super();
	}

	public Naukriplatform(Integer nid, String nname, Integer nexperience) {
		super();
		this.nid = nid;
		this.nname = nname;
		this.nexperience = nexperience;
	}

	@Override
	public String toString() {
		return "Naukri [nid=" + nid + ", nname=" + nname + ", nexperience=" + nexperience + "]";
	}

}
