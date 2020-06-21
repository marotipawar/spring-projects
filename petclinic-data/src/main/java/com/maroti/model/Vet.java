package com.maroti.model;

import java.util.Set;

public class Vet extends Person {
    private Set<Specility> specialties;

    public Set<Specility> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specility> specialties) {
        this.specialties = specialties;
    }
}
