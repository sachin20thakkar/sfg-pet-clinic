package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.map.OwnerServiceMap;
import guru.springframework.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component

public class DataLoader implements CommandLineRunner {
    private final OwnerServiceMap ownerServiceMap;
    private final VetServiceMap vetServiceMap;

    public DataLoader(OwnerServiceMap ownerServiceMap, VetServiceMap vetServiceMap) {
        this.ownerServiceMap = ownerServiceMap;
        this.vetServiceMap = vetServiceMap;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner = new Owner();
        owner.setFirstName("Sachin");
        owner.setLastName("Thakkar");
        owner.setId(1L);
        ownerServiceMap.save(owner);

        Owner owner1 = new Owner();
        owner.setFirstName("Virat");
        owner.setLastName("Thakkar");
        owner.setId(2L);
        ownerServiceMap.save(owner1);

        Vet vet = new Vet();
        owner.setFirstName("Rahul");
        owner.setLastName("Thakkar");
        owner.setId(1L);
        vetServiceMap.save(vet);

        Vet vet1 = new Vet();
        owner.setFirstName("Anil");
        owner.setLastName("Thakkar");
        owner.setId(2L);
        vetServiceMap.save(vet1);

        System.out.println("Data Loaded ...");
    }
}
