package com.said.galerytown.service;

import com.said.galerytown.entity.Location;
import com.said.galerytown.exception.ApiException;

import java.util.List;

public interface ILocationService {
    List<Location> getAllLocations();

    Location insertLocation(Location location);

    Location getLocation(int locationId);

    Location updateLocation(int locationId, Location location) throws ApiException;

    void deleteLocation(int locationId);
}
