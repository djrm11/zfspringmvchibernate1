package com.bsm.ssh.modle;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TUser entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T_USER", schema = "")
public class TUser implements java.io.Serializable {

	// Fields

	private String namename;
	private Long ageage;
	private String qqno;
	private String email;
	private String phoneno;
	private Date createTime;

	// Constructors

	/** default constructor */
	public TUser() {
	}

	/** minimal constructor */
	public TUser(String namename) {
		this.namename = namename;
	}

	/** full constructor */
	public TUser(String namename, Long ageage, String qqno, String email, String phoneno, Date createTime) {
		this.namename = namename;
		this.ageage = ageage;
		this.qqno = qqno;
		this.email = email;
		this.phoneno = phoneno;
		this.createTime = createTime;
	}

	// Property accessors
	@Id
	@Column(name = "NAMENAME",  nullable = false, length = 120)
	public String getNamename() {
		return this.namename;
	}

	public void setNamename(String namename) {
		this.namename = namename;
	}

	@Column(name = "AGEAGE", precision = 10, scale = 0)
	public Long getAgeage() {
		return this.ageage;
	}

	public void setAgeage(Long ageage) {
		this.ageage = ageage;
	}

	@Column(name = "QQNO", length = 30)
	public String getQqno() {
		return this.qqno;
	}

	public void setQqno(String qqno) {
		this.qqno = qqno;
	}

	@Column(name = "EMAIL", length = 60)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "PHONENO", length = 30)
	public String getPhoneno() {
		return this.phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATE_TIME", length = 7)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}