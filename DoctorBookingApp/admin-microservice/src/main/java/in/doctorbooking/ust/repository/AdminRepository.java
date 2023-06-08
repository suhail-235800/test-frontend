package in.doctorbooking.ust.repository;

import in.doctorbooking.ust.domain.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Doctor,Integer> {

    Doctor findByDoctorName(String doctorName);
}
