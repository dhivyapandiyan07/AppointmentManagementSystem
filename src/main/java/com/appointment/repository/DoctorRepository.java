
package com.appointment.repository;
import com.appointment.entity.Doctor; import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface DoctorRepository extends JpaRepository<Doctor,Long>{ List<Doctor> findBySpecializationContaining(String s);}
