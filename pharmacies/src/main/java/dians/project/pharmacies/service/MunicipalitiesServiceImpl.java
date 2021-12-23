package dians.project.pharmacies.service;

import dians.project.pharmacies.model.Municipality;
import dians.project.pharmacies.model.Pharmacy;
import dians.project.pharmacies.repository.MunicipalityRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MunicipalitiesServiceImpl implements MunicipalitiesService{
    public MunicipalityRepository municipalitiesRepository;
    public MunicipalitiesServiceImpl(MunicipalityRepository municipalitiesRepository)
    {
        this.municipalitiesRepository=municipalitiesRepository;
    }
    @Override
    public List<Municipality> findAll() {
        return municipalitiesRepository.findAll();
    }

    @Override
    public Municipality findByName(String name) {
        return municipalitiesRepository.findMunicipalityByName(name);
    }
//    public List<Pharmacy> findPharmaciesByMunicipalityName(String name)
//    {
//        Municipality municipality = municipalitiesRepository.findMunicipalityByName(name);
//        return municipality.pharmacyList;
//    }
}
