package com.maroti.services.map;

import com.maroti.model.Vet;

import com.maroti.services.VetServices;

import java.util.Set;

public class VetServiceMap extends AbstractMapServices<Vet, Integer> implements VetServices {
    @Override
    public Vet findById(Integer id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet.getId(), vet);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Vet t) {
        super.delete(t);
    }
}
