package ch.morrolan.shipme;

import org.springframework.data.repository.CrudRepository;

import ch.morrolan.shipme.ITruck;

public interface TruckRepository extends CrudRepository<ITruck, Integer> {
}
