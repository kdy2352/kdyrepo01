package com.vsb.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vsb.web.mapper.TestMapper;

@RestController
public class TestController {

	@Autowired
	TestMapper testMapper;
	
//	@RequestMapping("/list")
	@GetMapping("/list")
	public List<Map<String, String>> listTest() {
//		List<Map<String, String>> list = new ArrayList<>();
//		list.add(new HashMap<>());
//		list.get(0).put("name", "kdy");
//		list.get(0).put("age", "34");
//		return list;
		return testMapper.list();
	}
	
}
