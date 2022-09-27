package com.drucare.moviecatelogueservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drucare.moviecatelogueservice.catelogueModel.Catelogue;
import com.drucare.moviecatelogueservice.service.CatelogueService;



@RestController
public class CatelogueController {
	@Autowired
	CatelogueService catelogueservice;
	
	@GetMapping("/catelogue")
	public List<Catelogue> getAllCatelogue(){
		return catelogueservice.getAllCatelogue();
	}
	}

