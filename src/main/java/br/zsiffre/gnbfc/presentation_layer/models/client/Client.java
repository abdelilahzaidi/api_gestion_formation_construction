package br.zsiffre.gnbfc.presentation_layer.models.client;

import br.zsiffre.gnbfc.data_acces_layer.entities.ClientEntity;
import br.zsiffre.gnbfc.data_acces_layer.entities.InternEntity;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Client {
    private Integer id;
    private String clientName;

    public static Client fromBll(ClientEntity bll){
        return new ClientBuilder()
                .id(bll.getId())
                .clientName(bll.getClientName())
                .build();

    }
}
