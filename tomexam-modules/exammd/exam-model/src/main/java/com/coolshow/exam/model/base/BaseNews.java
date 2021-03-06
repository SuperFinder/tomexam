package com.coolshow.exam.model.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseNews<M extends BaseNews<M>> extends Model<M> implements IBean {

	public M setId(Integer id) {
		set("id", id);
		return (M)this;
	}

	public Integer getId() {
		return get("id");
	}

	public M setTitle(String title) {
		set("title", title);
		return (M)this;
	}

	public String getTitle() {
		return get("title");
	}

	public M setTitleColor(String titleColor) {
		set("title_color", titleColor);
		return (M)this;
	}

	public String getTitleColor() {
		return get("title_color");
	}

	public M setClassid(Integer classid) {
		set("classid", classid);
		return (M)this;
	}

	public Integer getClassid() {
		return get("classid");
	}

	public M setContent(String content) {
		set("content", content);
		return (M)this;
	}

	public String getContent() {
		return get("content");
	}

	public M setStatus(String status) {
		set("status", status);
		return (M)this;
	}

	public String getStatus() {
		return get("status");
	}

	public M setSummary(String summary) {
		set("summary", summary);
		return (M)this;
	}

	public String getSummary() {
		return get("summary");
	}

	public M setTotop(Integer totop) {
		set("totop", totop);
		return (M)this;
	}

	public Integer getTotop() {
		return get("totop");
	}

	public M setVisit(Integer visit) {
		set("visit", visit);
		return (M)this;
	}

	public Integer getVisit() {
		return get("visit");
	}

	public M setPostdate(java.util.Date postdate) {
		set("postdate", postdate);
		return (M)this;
	}

	public java.util.Date getPostdate() {
		return get("postdate");
	}

	public M setPhoto(String photo) {
		set("photo", photo);
		return (M)this;
	}

	public String getPhoto() {
		return get("photo");
	}

	public M setAuthor(String author) {
		set("author", author);
		return (M)this;
	}

	public String getAuthor() {
		return get("author");
	}

	public M setOutlink(String outlink) {
		set("outlink", outlink);
		return (M)this;
	}

	public String getOutlink() {
		return get("outlink");
	}

	public M setNewsfrom(String newsfrom) {
		set("newsfrom", newsfrom);
		return (M)this;
	}

	public String getNewsfrom() {
		return get("newsfrom");
	}

	public M setAdminid(Integer adminid) {
		set("adminid", adminid);
		return (M)this;
	}

	public Integer getAdminid() {
		return get("adminid");
	}

}
