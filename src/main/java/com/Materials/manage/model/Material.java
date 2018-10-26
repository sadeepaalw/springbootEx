package com.Materials.manage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Material {

	@Id
	@Column(name="material_id")
	int id;
	@Column(name="material_name")
	String materialname;
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Material [id=" + id + ", materialname=" + materialname + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMaterialname() {
		return materialname;
	}
	public void setMaterialname(String materialname) {
		this.materialname = materialname;
	}
	
}
