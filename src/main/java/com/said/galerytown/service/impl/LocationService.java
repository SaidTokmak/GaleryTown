package com.said.galerytown.service.impl;

import com.said.galerytown.entity.Location;
import com.said.galerytown.exception.ApiException;
import com.said.galerytown.exception.enums.UserExceptionEnum;
import com.said.galerytown.repository.ILocationRepository;
import com.said.galerytown.service.ILocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

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

    @Override
    public Location getLocation(int locationId) {
        return locationRepository.findLocationById(locationId);
    }

    @Override
    public Location updateLocation(int locationId, Location location) throws ApiException {
        Location existingLocation = locationRepository.findLocationById(locationId);
        if(Objects.isNull(existingLocation))
            throw new ApiException(UserExceptionEnum.USER_NOT_FOUND.getCode(), UserExceptionEnum.USER_NOT_FOUND.getMessage());
        location.setId(locationId);
        return locationRepository.saveAndFlush(location);
    }

    @Override
    public void deleteLocation(int locationId) {
        locationRepository.deleteById(locationId);
    }
}
