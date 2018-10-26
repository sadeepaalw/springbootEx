package com.Materials.manage.controllers;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Materials.manage.model.Material;
import com.Materials.manage.service.MaterialService;

@Controller
public class MaterialController {

	@Autowired
	MaterialService matservice;
	
	@RequestMapping(value="/create")
	public String showCreate() {
		System.out.println("method Called");
		return "cmaterial";
	}
	@RequestMapping("/saved")
	public String saveMaterial(@ModelAttribute("material")Material mat,ModelMap map) {
		
		Material saveMatrl = matservice.saveMaterial(mat);
		String msg = "location saved with id "+saveMatrl.getId();
		map.addAttribute("msg1", msg);
		return "cmaterial";
	}
	@RequestMapping("/displayAll")
	public String display(ModelMap map1){
		System.out.println("display method called");
		List<Material> allMaterial = matservice.getAllMaterial();
		map1.addAttribute("allMat",allMaterial);
		return "displays";
	}
	@RequestMapping("/deleteByID")
	public String delete(@RequestParam("id")int id,ModelMap map1){
	//	Optional<Material> materialById = matservice.getMaterialById(id);
		/*List<Material> allMaterial = matservice.getAllMaterial();
		Iterator<Material> iterator = allMaterial.iterator();
		Material del = null;
		while(iterator.hasNext()){
			Material next = iterator.next();
			if(next.getId()==id){
				del=next;
			}
		}*/
		Material material = new Material();
		material.setId(id);
		matservice.delMaterial(material);
		List<Material> allMaterial = matservice.getAllMaterial();
		map1.addAttribute("allMat",allMaterial);
		
		return "displays";
	}
	@RequestMapping("updateByID")
	public String update(@RequestParam("id")int id,@RequestParam("name")String name,ModelMap map){
		
		Material mat = new Material();
		mat.setId(id);
		mat.setMaterialname(name);
		matservice.updateMaterial(mat);
		List<Material> allMaterial = matservice.getAllMaterial();
		map.addAttribute("allMat",allMaterial);
		
		return "displays";
	}
}
