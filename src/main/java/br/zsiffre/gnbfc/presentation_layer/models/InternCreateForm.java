package br.zsiffre.gnbfc.presentation_layer.models;

import br.zsiffre.gnbfc.data_acces_layer.entities.InternEntity;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;



@Data
public class InternCreateForm {
    @NotBlank(message="last_name field can't be empty")
    private String last_name;
    @NotBlank(message="first_name field can't be empty")
    private String first_name;
    public InternEntity toEntity(){
        InternEntity entity=new InternEntity();
        entity.setFirstName(first_name);
        entity.setLastName(last_name);
        return entity;
    }
}
