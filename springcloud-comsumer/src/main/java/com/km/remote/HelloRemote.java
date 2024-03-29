package com.km.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by km on 2019/03/17.
 */
@FeignClient(name= "spring-cloud-producer")
public interface HelloRemote {

	@RequestMapping(value = "/hello")
	public String hello(@RequestParam(value = "name") String name);


}

