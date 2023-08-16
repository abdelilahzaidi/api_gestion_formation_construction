package br.zsiffre.gnbfc.presentation_layer.models.Work;

import br.zsiffre.gnbfc.data_acces_layer.entities.InternEntity;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Work {
    private Integer id;
    private String firstName;
    private String lastName;
    public static Work fromBll(InternEntity bll){
        return new Work.InternBuilder()
                .id(bll.getId())
                .firstName(bll.getFirstName())
                .lastName(bll.getFirstName())
                .build();

    }
}
