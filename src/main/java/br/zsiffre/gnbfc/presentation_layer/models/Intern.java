package br.zsiffre.gnbfc.presentation_layer.models;

import br.zsiffre.gnbfc.data_acces_layer.entities.InternEntity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Intern {
    private Integer id;
    private String firstName;
    private String lastName;
    public static Intern fromBll(InternEntity bll){
        return new InternBuilder()
                .id(bll.getId())
                .firstName(bll.getFirstName())
                .lastName(bll.getFirstName())
                .build();

    }
}
