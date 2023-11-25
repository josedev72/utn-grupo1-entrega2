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
    int id_tecnicos;
    String dni;
    String nombre;
    String apellido;
    String celular;
    String tecnicoscol;
    String medio_de_notificacion;
}
