package dians.project.pharmacies.service;

import dians.project.pharmacies.model.Municipality;
import dians.project.pharmacies.model.Pharmacy;
import dians.project.pharmacies.repository.MunicipalityRepository;
import dians.project.pharmacies.repository.PharmacyRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PharmaciesServiceImpl implements PharmaciesService {
    private final PharmacyRepository pharmaciesRepository;
    private final MunicipalityRepository municipalityRepository;
    public PharmaciesServiceImpl(PharmacyRepository pharmaciesRepository, MunicipalityRepository municipalityRepository)
    {
        this.pharmaciesRepository=pharmaciesRepository;
        this.municipalityRepository = municipalityRepository;
    }

    @Override
    public List<Pharmacy> findAll() {
        return pharmaciesRepository.findAll();
    }

    @Override
    public List<Pharmacy> findByName(String name) {
        return pharmaciesRepository.findPharmaciesByName(name);
    }

    public List<Pharmacy> findByMunicipality(Long id) {
        Municipality m = municipalityRepository.findMunicipalityById(id);
        return pharmaciesRepository.findPharmaciesByOpstina(m);}

}
