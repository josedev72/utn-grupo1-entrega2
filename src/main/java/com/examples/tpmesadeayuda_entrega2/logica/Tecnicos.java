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
@Table(name = "tecnicos")
public class Tecnicos {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id_tecnicos;
    private String dni;
    private String nombre;
    private String apellido;
    private String celular;
    private String tecnicoscol;
    private String medio_de_notificacion;
}
