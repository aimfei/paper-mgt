package com.paper.papermgt.model;import com.common.framework.base.BaseModel;public class DeptModel extends BaseModel {	private String id;//	private String dname;//	private String collegeid;//	public String getId() {	    return this.id;	}	public void setId(String id) {	    this.id=id;	}	public String getDname() {	    return this.dname;	}	public void setDname(String dname) {	    this.dname=dname;	}	public String getCollegeid() {	    return this.collegeid;	}	public void setCollegeid(String collegeid) {	    this.collegeid=collegeid;	}}