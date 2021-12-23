package dians.project.pharmacies.repository;

import dians.project.pharmacies.model.Municipality;
import dians.project.pharmacies.model.Pharmacy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MunicipalityRepository extends JpaRepository<Municipality, Long> {
    Municipality findMunicipalityByName(String name);
    Municipality findMunicipalityById(Long id);
}
