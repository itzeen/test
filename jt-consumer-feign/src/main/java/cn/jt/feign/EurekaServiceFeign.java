package cn.jt.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="provider-user")
public interface EurekaServiceFeign {

	//仿照服务提供者方法写一个接口的方法
	
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name);
	
}
