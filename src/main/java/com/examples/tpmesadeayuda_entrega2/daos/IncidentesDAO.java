package com.examples.tpmesadeayuda_entrega2.daos;

import com.examples.tpmesadeayuda_entrega2.logica.Clientes;
import com.examples.tpmesadeayuda_entrega2.logica.Especialidades;
import com.examples.tpmesadeayuda_entrega2.logica.Incidentes;

import javax.persistence.EntityManager;

public interface IncidentesDAO {
    //creamos los métodos que serán implementados en las clases de implementacion
    public void create (Incidentes inc);
    public void update (Incidentes inc);
    public void delete (Incidentes inc);
    public Incidentes read(int id_incidentes);

    public void setEntityManager(EntityManager em);
}
