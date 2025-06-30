package com.hms.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "property")
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "no_of_guest", nullable = false)
    private Integer no_of_guest;

    @Column(name = "no_of_bedrooms", nullable = false)
    private Integer no_of_bedrooms;

    @Column(name = "no_of_bathrooms", nullable = false)
    private Integer no_of_bathrooms;

    @Column(name = "no_of_beds", nullable = false)
    private Integer no_of_beds;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    // --- Getters and Setters ---

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNo_of_guest() {
        return no_of_guest;
    }

    public void setNo_of_guest(Integer no_of_guest) {
        this.no_of_guest = no_of_guest;
    }

    public Integer getNo_of_bedrooms() {
        return no_of_bedrooms;
    }

    public void setNo_of_bedrooms(Integer no_of_bedrooms) {
        this.no_of_bedrooms = no_of_bedrooms;
    }

    public Integer getNo_of_bathrooms() {
        return no_of_bathrooms;
    }

    public void setNo_of_bathrooms(Integer no_of_bathrooms) {
        this.no_of_bathrooms = no_of_bathrooms;
    }

    public Integer getNo_of_beds() {
        return no_of_beds;
    }

    public void setNo_of_beds(Integer no_of_beds) {
        this.no_of_beds = no_of_beds;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
