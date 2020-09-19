package guru.springframework.sfgpetclinic.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class Pet {
    PetType petType;
    Owner owner;
    LocalDateTime birthDate;
}
