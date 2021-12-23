package dians.project.pharmacies.repository;

import dians.project.pharmacies.model.Municipality;
import dians.project.pharmacies.model.Pharmacy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PharmacyRepository extends JpaRepository<Pharmacy, Long> {
    List<Pharmacy> findPharmaciesByName(String name);
    List<Pharmacy> findPharmaciesByOpstina(Municipality opstina);
}
