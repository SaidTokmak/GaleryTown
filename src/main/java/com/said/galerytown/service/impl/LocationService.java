package com.said.galerytown.service.impl;

import com.said.galerytown.entity.Location;
import com.said.galerytown.repository.ILocationRepository;
import com.said.galerytown.service.ILocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LocationService implements ILocationService {

    private final ILocationRepository locationRepository;

    @Override
    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }

    @Override
    public Location insertLocation(Location location) {
        return locationRepository.saveAndFlush(location);
    }
}
