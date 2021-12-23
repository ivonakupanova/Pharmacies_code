package dians.project.pharmacies.model;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Data
@Entity
public class Municipality {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private double coordinatesLon;

    private double coordinatesLat;

    public Municipality(){}
    public Municipality(String name, double coordinatesLon, double coordinatesLat) {
        this.name = name;
        this.coordinatesLon = coordinatesLon;
        this.coordinatesLat = coordinatesLat;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
}
