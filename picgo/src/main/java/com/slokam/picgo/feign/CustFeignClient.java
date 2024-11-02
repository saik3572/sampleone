package com.slokam.picgo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="demo", fallback = FallBack.class)
public interface CustFeignClient {

	@GetMapping("getData")
	public Integer getData();
	// restTemplate.getForEntity("cust://getData",)
	
}
