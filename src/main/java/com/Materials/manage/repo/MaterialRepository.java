package com.Materials.manage.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Materials.manage.model.Material;

public interface MaterialRepository extends JpaRepository<Material, Integer>{

}
