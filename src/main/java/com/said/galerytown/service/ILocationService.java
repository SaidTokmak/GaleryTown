package com.said.galerytown.service;

import com.said.galerytown.entity.Location;

import java.util.List;

public interface ILocationService {
    List<Location> getAllLocations();

    Location insertLocation(Location location);
}
