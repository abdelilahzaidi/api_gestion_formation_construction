package br.zsiffre.gnbfc.data_acces_layer.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;







@Entity(name="Work")
@Table(name="work",schema = "red_thread")
@Data
public class WorkEntity {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(name="date_work")
    private LocalDate dateTravail;
    @Column(name="duration")
    private int duration;

    @ElementCollection
    @CollectionTable(schema = "red_thread")
    private List<String> photos;

    @Column(name="comment")
    private String commentaire;


    @ManyToOne(optional = false)
    @JoinColumn(name = "intern_id")
    private InternEntity internEntities;



    @ManyToOne(optional = false)
    @JoinColumn(name = "client_id")
    private ClientEntity clientEntities;


    @ManyToOne(optional = false)
    @JoinColumn(name = "chario_id")
    private ChariotEntity chariotEntities;


}