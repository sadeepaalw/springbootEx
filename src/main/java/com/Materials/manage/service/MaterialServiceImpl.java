package com.Materials.manage.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Materials.manage.model.Material;
import com.Materials.manage.repo.MaterialRepository;

@Service
public class MaterialServiceImpl implements MaterialService {

	@Autowired
	private MaterialRepository mr;
	
	public MaterialRepository getMr() {
		return mr;
	}

	public void setMr(MaterialRepository mr) {
		this.mr = mr;
	}

	@Override
	public Material saveMaterial(Material mat) {
		return mr.save(mat);
	}

	@Override
	public Material updateMaterial(Material mat) {
		return mr.save(mat);
	}

	@Override
	public void delMaterial(Material mat) {
		mr.delete(mat);
	}

	/*@Override
	public Material getMaterialById(int id) {
		return mr.findById(id);
	}*/

	@Override
	public List<Material> getAllMaterial() {
		return mr.findAll();
		
	}

	/*@Override
	public Material getMaterialById(int id) {
		// TODO Auto-generated method stub
		return mr.findById(id);
	}*/

}
