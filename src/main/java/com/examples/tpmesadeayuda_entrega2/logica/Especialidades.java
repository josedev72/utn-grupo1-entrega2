package com.examples.tpmesadeayuda_entrega2.logica;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

@Entity
@Table(name = "especialidades")
public class Especialidades {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id_especialidades;
    String nombre;
    String descripcion;
}
