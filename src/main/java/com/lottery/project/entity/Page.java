package com.lottery.project.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Page")
public class Page implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "namePage")
	private String namePage;
	
	@Column(name = "pathController")
	private String pathController;
	

	@Column(name = "Status")
	private int Status;
	
	@Column(name = "icon")
	private String icon;
	
	@Column(name = "level1")
	private String level1;
	
	@Column(name = "level2Ref1")
	private String level2Ref1;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createDate") 
	private Date createDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updateDate") 
	private Date updateDate;
	
	 
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNamePage() {
		return namePage;
	}

	public void setNamePage(String namePage) {
		this.namePage = namePage;
	}

	public String getPathController() {
		return pathController;
	}

	public void setPathController(String pathController) {
		this.pathController = pathController;
	}

	public int getStatus() {
		return Status;
	}

	public void setStatus(int status) {
		Status = status;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getLevel1() {
		return level1;
	}

	public void setLevel1(String level1) {
		this.level1 = level1;
	}

	public String getLevel2Ref1() {
		return level2Ref1;
	}

	public void setLevel2Ref1(String level2Ref1) {
		this.level2Ref1 = level2Ref1;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	
}
