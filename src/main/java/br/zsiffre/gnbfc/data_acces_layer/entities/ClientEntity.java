package br.zsiffre.gnbfc.data_acces_layer.entities;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity(name="Client")
@Table(name="client",schema = "red_thread")
@Data
public class ClientEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer Id;
    @Column(name="client_name",nullable = false)
    private String clientName;

    @OneToMany(targetEntity = WorkEntity.class, mappedBy= "clientEntities")
    private List<WorkEntity> work;
}
