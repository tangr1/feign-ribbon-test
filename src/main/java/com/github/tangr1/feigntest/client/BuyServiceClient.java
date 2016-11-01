package com.github.tangr1.feigntest.client;

import com.github.tangr1.feigntest.domain.Buy;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClientConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "buy-service")
@RibbonClient(name = "buy-service", configuration = RibbonClientConfiguration.class)
public interface BuyServiceClient {

	@RequestMapping(method = RequestMethod.GET, value = "/buys/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	Buy get(@PathVariable("id") Integer id);
}
