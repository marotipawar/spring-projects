package com.maroti.services;

import com.maroti.model.Vet;

import java.util.Set;

public interface VetServices {

    Vet findById(Integer id);
    Set<Vet> findAll();
    Vet saveVet(Vet v);
}
