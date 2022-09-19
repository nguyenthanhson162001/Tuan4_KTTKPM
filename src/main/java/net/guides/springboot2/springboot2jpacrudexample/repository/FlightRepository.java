package net.guides.springboot2.springboot2jpacrudexample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import net.guides.springboot2.springboot2jpacrudexample.model.Flight;
import net.guides.springboot2.springboot2jpacrudexample.model.Plane;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long>{
	
	@Query(value="SELECT * FROM maybay ",nativeQuery = true)
	List<Plane> findFlightGoToDalat();
}
