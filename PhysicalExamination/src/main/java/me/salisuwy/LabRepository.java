package me.salisuwy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LabRepository extends JpaRepository<Lab, Integer>{
	@Query(value = "select * from qpd_labresult order by LabID", nativeQuery = true)
	List<Lab> findAll();
	
	@Query(value = "select * from qpd_labresult where LabId = :#{#id}", nativeQuery = true)
	List<Lab> findById(@Param("id") int pID);
}
