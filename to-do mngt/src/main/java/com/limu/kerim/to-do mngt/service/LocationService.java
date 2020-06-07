package com.limu.kerim.IssDemo.service;

import com.limu.kerim.IssDemo.models.IssLocator;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LocationService {
    private static final String FAILED = "failed";

    @HystrixCommand(fallbackMethod = "fallback")
    public IssLocator getIssLocation() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://api.open-notify.org/iss-now.json", IssLocator.class);
    }

    public IssLocator fallback() {
        IssLocator issLocator = new IssLocator();
        issLocator.setMessage(FAILED);
        return issLocator;
    }
}
