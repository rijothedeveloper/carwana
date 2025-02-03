package com.carwana.vehicle.repository;

import com.carwana.vehicle.model.Make;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MakeRepository extends ListCrudRepository<Make, Long> {
    Make findByName(String name);
}
