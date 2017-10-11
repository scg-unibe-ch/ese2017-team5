package ch.morrolan.shipme;

import org.springframework.data.repository.CrudRepository;

import ch.morrolan.shipme.Driver;

public interface DriverRepository extends CrudRepository<Driver, Long> {
}
