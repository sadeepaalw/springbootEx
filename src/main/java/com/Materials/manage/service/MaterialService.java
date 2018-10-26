package com.Materials.manage.service;

import java.util.List;
import java.util.Optional;

import com.Materials.manage.model.Material;

public interface MaterialService {

	Material saveMaterial(Material mat);
	Material updateMaterial(Material mat);
	void delMaterial(Material mat);
	//Material getMaterialById(int id);
	List<Material> getAllMaterial();
	
}
