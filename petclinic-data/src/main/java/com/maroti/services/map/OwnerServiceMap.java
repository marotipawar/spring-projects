package com.maroti.services.map;

import com.maroti.model.Owner;
import com.maroti.services.OwnerServices;
import org.springframework.stereotype.Service;


import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapServices<Owner, Integer> implements OwnerServices {

    @Override
    public Owner findById(Integer id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner);
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
