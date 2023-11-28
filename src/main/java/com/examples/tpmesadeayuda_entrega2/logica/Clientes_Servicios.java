package com.examples.tpmesadeayuda_entrega2.logica;

import javax.persistence.Entity;
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
@Table(name = "clientes_servicios")
public class Clientes_Servicios {
    @Id
    private int id_clientes;
    private int id_servicios;
}
