package br.zsiffre.gnbfc.data_acces_layer.entities;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity(name="Intern")
@Table(name="intern",schema = "red_thread")
@Data
public class InternEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer Id;
    @Column(name="first_name",nullable = false)
    private String firstName;
    @Column(name="last_name",nullable = false)
    private String lastName;
    @OneToMany(targetEntity = WorkEntity.class, mappedBy= "internEntities")
    private List<WorkEntity> work;
}
