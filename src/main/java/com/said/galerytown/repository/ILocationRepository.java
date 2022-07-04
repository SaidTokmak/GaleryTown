package com.said.galerytown.repository;

import com.said.galerytown.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILocationRepository extends JpaRepository<Location, Integer> {

    Location findLocationById(int locationId);
}
