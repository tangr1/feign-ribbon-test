package com.github.tangr1.feigntest.web;

import com.github.tangr1.feigntest.client.BuyServiceClient;
import com.github.tangr1.feigntest.domain.Buy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tangrui on 7/13/16.
 */
@RestController
public class BuyController {

    @Autowired
    private BuyServiceClient buyServiceClient;

    @RequestMapping(value = "/buys/{id}", method = RequestMethod.GET)
    public Buy get(final @PathVariable Integer id) {
        return buyServiceClient.get(id);
    }
}
