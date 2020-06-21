package com.maroti.services.map;

import com.maroti.model.Pet;
import com.maroti.services.CrudService;

import javax.print.attribute.IntegerSyntax;
import java.util.Set;

public class PetServiceMap extends AbstractMapServices<Pet, Integer> implements CrudService<Pet, Integer> {
    @Override
    public Pet findById(Integer id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(), pet);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet t) {
        super.delete(t);

    }
}
