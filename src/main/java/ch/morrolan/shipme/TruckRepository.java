package ch.morrolan.shipme;

import org.springframework.data.repository.CrudRepository;

import ch.morrolan.shipme.ITruck;
import org.springframework.stereotype.Repository;

@Repository
public interface TruckRepository extends CrudRepository<VehicleType, Integer> {
}
