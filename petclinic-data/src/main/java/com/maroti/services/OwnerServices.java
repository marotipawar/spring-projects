package com.maroti.services;

import com.maroti.model.Owner;

import java.util.Set;

public interface OwnerServices {

    Owner findById(Integer id);
    Owner saveOwner(Owner o);
    Set<Owner> findAll();
}
