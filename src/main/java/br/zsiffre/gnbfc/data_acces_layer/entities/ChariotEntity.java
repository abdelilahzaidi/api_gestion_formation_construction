package br.zsiffre.gnbfc.data_acces_layer.entities;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;





@Entity(name="Chariot")
@Table(name="chariot",schema = "red_thread")
@Data
public class ChariotEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer Id;
    @Column(name="chariot_numero",nullable = false)
    private Integer numero;

    @OneToMany(targetEntity = WorkEntity.class, mappedBy= "chariotEntities")
    private List<WorkEntity> work;
}
