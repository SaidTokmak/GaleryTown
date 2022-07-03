package com.said.galerytown.controller;

import com.said.galerytown.entity.Location;
import com.said.galerytown.service.ILocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/api")
public class LocationController {

    private final ILocationService locationService;

    @RequestMapping(value = "/locations", produces = {"application/json"}, method = RequestMethod.GET)
    public ResponseEntity<List<Location>> getAllLocations() {
        return ResponseEntity.ok(locationService.getAllLocations());
    }

    @RequestMapping(value = "/location", produces = {"application/json"}, method = RequestMethod.POST)
    public ResponseEntity<Location> insertLocation(@RequestBody Location location) {
        return ResponseEntity.ok(locationService.insertLocation(location));
    }
}
