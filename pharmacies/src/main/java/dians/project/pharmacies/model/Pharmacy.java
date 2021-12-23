package dians.project.pharmacies.model;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Pharmacy {
    @Id
    private long id;

    private String name;

    private double coordinatesLon;

    private double coordinatesLat;

    private String address;

    private String workingHours;

    @ManyToOne
    private Municipality opstina;

    public Pharmacy(){}

    public Pharmacy(String name, double coordinatesLon, double coordinatesLat, String workingHours) {
        this.name = name;
        this.coordinatesLon = coordinatesLon;
        this.coordinatesLat = coordinatesLat;
        this.workingHours = workingHours;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Municipality getOpstina() {
        return opstina;
    }

    public void setOpstina(Municipality opstina) {
        this.opstina = opstina;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCoordinatesLon() {
        return coordinatesLon;
    }

    public void setCoordinatesLon(double coordinatesLon) {
        this.coordinatesLon = coordinatesLon;
    }

    public double getCoordinatesLat() {
        return coordinatesLat;
    }

    public void setCoordinatesLat(double coordinatesLat) {
        this.coordinatesLat = coordinatesLat;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }
}
