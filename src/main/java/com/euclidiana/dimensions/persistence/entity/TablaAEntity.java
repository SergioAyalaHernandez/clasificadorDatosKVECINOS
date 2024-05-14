package com.euclidiana.dimensions.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "tabla_a")
public class TablaAEntity {
    @Id
    @Column(name = "id_a")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTablaA;
    @Column(name = "column_x")
    private Integer x;
    @Column(name = "column_y")
    private Integer y;
    @Column(name = "obs_a")
    private String observacion;
}
