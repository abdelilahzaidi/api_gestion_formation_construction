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

    @Column(name="date_work",nullable=false)
    private LocalDate dateTravail;
    @Column(name="duration",nullable=false)
    private LocalDate duration;

    @ElementCollection()
    private ArrayList<String> photos=new ArrayList<String>();

    @Column(name="comment",nullable=false)
    private String commentaire;

    @OneToMany(targetEntity = InternEntity.class, mappedBy="work")
    private List<InternEntity> interns;
}
