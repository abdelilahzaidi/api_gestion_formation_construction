package br.zsiffre.gnbfc.presentation_layer.models.Intern;

import br.zsiffre.gnbfc.data_acces_layer.entities.InternEntity;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;



@Data
public class InternCreateForm {
    @NotBlank(message="last_name field can't be empty")
    private String lastName;
    @NotBlank(message="first_name field can't be empty")
    private String firstName;
    public InternEntity toEntity(){
        InternEntity entity=new InternEntity();
        entity.setFirstName(firstName);
        entity.setLastName(lastName);
        return entity;
    }
}
