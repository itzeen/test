package cn.jt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.discovery.converters.Auto;

@RestController
public class HelloController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/hello/{name}")
	@ResponseBody
	public String hello(@PathVariable("name") String name){
		
		String url = "http://provider-user/hello/"+name;   //直接访问
		return this.restTemplate.getForObject(url, String.class);
	}
}
