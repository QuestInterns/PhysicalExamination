package me.salisuwy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

    // CUSTOM QUERY
    
//    @Query(value = "SELECT * from qpd_trans where id = 1", nativeQuery = true)
//    List<Blog> findCustomQuery();
	
	@Query(value = "SELECT CONCAT (LastName, ', ', FirstName, ' ', MiddleName) as fullname, f.* FROM qpd_patient f ORDER BY f.PatientID DESC", nativeQuery = true)
	List<Patient> findAll();
	
	@Query(value = "SELECT CONCAT (LastName, ', ', FirstName, ' ', MiddleName) as fullname, f.* FROM qpd_patient f where PatientId = :#{#id}", nativeQuery = true)
	List<Patient> findById(@Param("id") int pID);
}
