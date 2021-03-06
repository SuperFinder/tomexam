package com.coolshow.exam.model.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseNewsCate<M extends BaseNewsCate<M>> extends Model<M> implements IBean {

	public M setId(Integer id) {
		set("id", id);
		return (M)this;
	}

	public Integer getId() {
		return get("id");
	}

	public M setCname(String cname) {
		set("cname", cname);
		return (M)this;
	}

	public String getCname() {
		return get("cname");
	}

	public M setParentid(Integer parentid) {
		set("parentid", parentid);
		return (M)this;
	}

	public Integer getParentid() {
		return get("parentid");
	}

	public M setAdminid(Integer adminid) {
		set("adminid", adminid);
		return (M)this;
	}

	public Integer getAdminid() {
		return get("adminid");
	}

	public M setOrderid(Integer orderid) {
		set("orderid", orderid);
		return (M)this;
	}

	public Integer getOrderid() {
		return get("orderid");
	}

	public M setRemark(String remark) {
		set("remark", remark);
		return (M)this;
	}

	public String getRemark() {
		return get("remark");
	}

}
