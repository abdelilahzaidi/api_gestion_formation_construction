package br.zsiffre.gnbfc.presentation_layer.models.Work;

import br.zsiffre.gnbfc.data_acces_layer.entities.InternEntity;
import br.zsiffre.gnbfc.data_acces_layer.entities.WorkEntity;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDate;


@Data
public class WorkCreateForm {
    @NotBlank(message="dataTravail field can't be empty")
    private LocalDate dateTravail;
    @NotBlank(message="duration field can't be empty")
    private LocalDate duration;
    public WorkEntity toEntity(){
        WorkEntity entity=new WorkEntity();
        entity.setFirstName(firstName);
        entity.setLastName(lastName);
        return entity;
    }
}
