package com.drucare.sampledemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class samplecontroller {
	@SuppressWarnings("rawtypes")
	@RequestMapping("/sowmya")
	public List fruitList() {

		List<String> fruitslist=new ArrayList<String>();  
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
