package com.limu.kerim.IssDemo.controllers;

import com.limu.kerim.IssDemo.models.IssLocator;
import com.limu.kerim.IssDemo.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ISSController {

    @Autowired
    private LocationService locationService;

    @GetMapping("/issLocation")
    @CrossOrigin
    public IssLocator getISSLocation() {
        return this.locationService.getIssLocation();
    }
}
