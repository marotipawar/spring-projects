package com.maroti.services.map;

import com.maroti.model.Owner;
import com.maroti.services.OwnerServices;


import java.util.Set;

public class OwnerServiceMap extends AbstractMapServices<Owner, Integer> implements OwnerServices {

    @Override
    public Owner findById(Integer id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public Set<Owner> findAll() {
        return  super.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner t) {
        super.delete(t);
    }
}
