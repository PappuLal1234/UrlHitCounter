package com.hit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hit.service.HitService;
@RequestMapping("/api/v1/visitor-count-app")
@RestController
public class HitController {
	
	@Autowired
	private HitService hitService;
	
	@GetMapping("/username/{name}/count")
	public String getHitCount(@PathVariable String name)
	{
		return  "{ "+
			"username : "+name+" , "+
			"  hitcount : "+hitService.getHitCount()
			+" }";
				
	}

}
