package guru.springframework.sfgpetclinic.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class PetType {
    String name;
}
