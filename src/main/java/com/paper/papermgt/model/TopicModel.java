package com.paper.papermgt.model;import com.common.framework.base.BaseModel;public class TopicModel extends BaseModel {	private Integer id;//	private String topicName;//	private String topicDesc;//	private String stuId;//	private String teaId;//	private String state;	private java.util.Date createTime;//	private java.util.Date modifyTime;//	public Integer getId() {	    return this.id;	}	public void setId(Integer id) {	    this.id=id;	}	public String getTopicName() {	    return this.topicName;	}	public void setTopicName(String topicName) {	    this.topicName=topicName;	}	public String getTopicDesc() {	    return this.topicDesc;	}	public void setTopicDesc(String topicDesc) {	    this.topicDesc=topicDesc;	}	public String getStuId() {	    return this.stuId;	}	public void setStuId(String stuId) {	    this.stuId=stuId;	}	public String getTeaId() {	    return this.teaId;	}	public void setTeaId(String teaId) {	    this.teaId=teaId;	}	public java.util.Date getCreateTime() {	    return this.createTime;	}	public void setCreateTime(java.util.Date createTime) {	    this.createTime=createTime;	}	public java.util.Date getModifyTime() {	    return this.modifyTime;	}	public void setModifyTime(java.util.Date modifyTime) {	    this.modifyTime=modifyTime;	}	public String getState() {		return state;	}	public void setState(String state) {		this.state = state;	}}