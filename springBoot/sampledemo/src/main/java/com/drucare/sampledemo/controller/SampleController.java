package com.drucare.sampledemo.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SampleController {
	
	@RequestMapping("/sowmya")
	public List<String> fruitList() {

		List<String> fruitslist=new LinkedList<String>();  
		fruitslist.add("Mango");  
		fruitslist.add("Apple");  
		fruitslist.add("Banana");  
		fruitslist.add("Plum");  
		fruitslist.add("Grapes");  
		fruitslist.add("Avocado");  
		fruitslist.add("BlackBerry");  
		fruitslist.add("Gova");  

		return fruitslist;
	}

}
