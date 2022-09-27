package com.drucare.moviecatelogueservice.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.drucare.moviecatelogueservice.catelogueModel.Catelogue;
@Service
public class CatelogueService {

	public List<Catelogue> getAllCatelogue() {
		List<Catelogue> catalogues=new ArrayList<>();
		return Collections.singletonList(new Catelogue ("Major","Army Efferts",8));
		
	}

}
