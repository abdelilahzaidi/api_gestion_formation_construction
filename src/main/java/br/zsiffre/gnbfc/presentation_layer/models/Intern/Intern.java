package br.zsiffre.gnbfc.presentation_layer.models.Intern;

import br.zsiffre.gnbfc.data_acces_layer.entities.InternEntity;
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
