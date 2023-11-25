
package com.examples.tpmesadeayuda_entrega2.logica;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
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
@Table(name = "clientes")
public class Clientes {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id_clientes;
    @Basic
    String cuit;
    String razonSocial;
    String email;
}
