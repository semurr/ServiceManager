package com.semurr.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "User")
public class User implements Serializable {

	@Id
	@GeneratedValue	
	@Column(name = "userid", unique = true, nullable = false)
	private long	userid;

	@Column(name = "username", nullable = false)
	private String	username;

	@Column(name = "useremail", unique = true, nullable = false)
	private String	useremail;

	@Column(name = "userpassword", nullable = false)
	private String	userpassword;

	@Column(name = "usersalt", unique = true, nullable = false)
	private String	salt;

	/**
	 * @return the salt
	 */
	public String getSalt() {
		return salt;
	}

	/**
	 * @param salt
	 *            the salt to set
	 */
	public void setSalt(String salt) {
		this.salt = salt;
	}

	/**
	 * @return the userid
	 */
	public long getUserid() {
		return userid;
	}

	/**
	 * @param userid
	 *            the userid to set
	 */
	public void setUserid(long userid) {
		this.userid = userid;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the useremail
	 */
	public String getUseremail() {
		return useremail;
	}

	/**
	 * @param useremail
	 *            the useremail to set
	 */
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	/**
	 * @return the userpassword
	 */
	public String getUserpassword() {
		return userpassword;
	}

	/**
	 * @param userpassword
	 *            the userpassword to set
	 */
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

}
