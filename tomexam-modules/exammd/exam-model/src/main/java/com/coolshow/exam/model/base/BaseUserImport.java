package com.coolshow.exam.model.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseUserImport<M extends BaseUserImport<M>> extends Model<M> implements IBean {

	public M setId(Integer id) {
		set("id", id);
		return (M)this;
	}

	public Integer getId() {
		return get("id");
	}

	public M setUserno(String userno) {
		set("userno", userno);
		return (M)this;
	}

	public String getUserno() {
		return get("userno");
	}

	public M setUsername(String username) {
		set("username", username);
		return (M)this;
	}

	public String getUsername() {
		return get("username");
	}

	public M setUserpass(String userpass) {
		set("userpass", userpass);
		return (M)this;
	}

	public String getUserpass() {
		return get("userpass");
	}

	public M setPhoto(String photo) {
		set("photo", photo);
		return (M)this;
	}

	public String getPhoto() {
		return get("photo");
	}

	public M setStatus(String status) {
		set("status", status);
		return (M)this;
	}

	public String getStatus() {
		return get("status");
	}

	public M setRegdate(java.util.Date regdate) {
		set("regdate", regdate);
		return (M)this;
	}

	public java.util.Date getRegdate() {
		return get("regdate");
	}

	public M setRealname(String realname) {
		set("realname", realname);
		return (M)this;
	}

	public String getRealname() {
		return get("realname");
	}

	public M setEmail(String email) {
		set("email", email);
		return (M)this;
	}

	public String getEmail() {
		return get("email");
	}

	public M setMobi(String mobi) {
		set("mobi", mobi);
		return (M)this;
	}

	public String getMobi() {
		return get("mobi");
	}

	public M setRemark(String remark) {
		set("remark", remark);
		return (M)this;
	}

	public String getRemark() {
		return get("remark");
	}

	public M setGid(Integer gid) {
		set("gid", gid);
		return (M)this;
	}

	public Integer getGid() {
		return get("gid");
	}

	public M setLogintimes(Integer logintimes) {
		set("logintimes", logintimes);
		return (M)this;
	}

	public Integer getLogintimes() {
		return get("logintimes");
	}

	public M setLastlogin(java.util.Date lastlogin) {
		set("lastlogin", lastlogin);
		return (M)this;
	}

	public java.util.Date getLastlogin() {
		return get("lastlogin");
	}

	public M setDeptCode(Integer deptCode) {
		set("dept_code", deptCode);
		return (M)this;
	}

	public Integer getDeptCode() {
		return get("dept_code");
	}

	public M setLastmodifytime(java.util.Date lastmodifytime) {
		set("lastmodifytime", lastmodifytime);
		return (M)this;
	}

	public java.util.Date getLastmodifytime() {
		return get("lastmodifytime");
	}

}
