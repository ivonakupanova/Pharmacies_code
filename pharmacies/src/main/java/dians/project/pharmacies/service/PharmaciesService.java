package dians.project.pharmacies.service;


import dians.project.pharmacies.model.Pharmacy;

import java.util.List;

public interface PharmaciesService {
    List<Pharmacy> findAll();
    List<Pharmacy> findByName(String name);
}
