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
@Table(name = "tecnicos_especialidades")
public class Tecnicos_Especialidades {
    @Id
    int id_tecnicos;
    int id_especialidades;
    
}
