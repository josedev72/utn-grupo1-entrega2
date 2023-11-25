package com.examples.tpmesadeayuda_entrega2.logica;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
@Table(name = "incidentes")
public class Incidentes {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id_incidentes;
    int id_cliente;
    int id_servicios;
    int id_especialidades;
    int id_tecnicos;
    String tiempo_estimado_resolucion;
    @Temporal(TemporalType.DATE)
    Date fecha_posible_resolucion;
    String estado;
    String consideraciones;
    
}
