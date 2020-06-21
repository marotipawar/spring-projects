package com.maroti.services;

import com.maroti.model.Pet;

import java.util.Set;

public interface PetServices {
    Pet findById(Integer id);
    Set<Pet> findAll();
    Pet savePet(Pet p);
}
