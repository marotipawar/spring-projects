package com.maroti.bootstrap;

import com.maroti.model.Owner;
import com.maroti.model.Pet;
import com.maroti.model.Vet;
import com.maroti.services.OwnerServices;
import com.maroti.services.PetServices;
import com.maroti.services.VetServices;
import com.maroti.services.map.OwnerServiceMap;
import com.maroti.services.map.PetServiceMap;
import com.maroti.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerServices os;
    private final PetServices ps;
    private final VetServices vs;

    public DataLoader(OwnerServices os, PetServices ps, VetServices vs) {
        this.os = os;
        this.ps = ps;
        this.vs = vs;
    }



    @Override
    public void run(String... args) throws Exception {


        Owner o1 = new Owner();
        o1.setFirstName("Maroti");
        o1.setLastName("Pawar");
        o1.setAddress("Nanded");
        o1.setCity("Nanded");
        o1.setTelephone("9876543210");
        os.save(o1);

        Vet v1 = new Vet();
        v1.setFirstName("Arnav");
        v1.setLastName("Pawar");
        vs.save(v1);

        System.out.println("Loaded Owner ...........");
        System.out.println("Loaded Pet............");
    }
}
