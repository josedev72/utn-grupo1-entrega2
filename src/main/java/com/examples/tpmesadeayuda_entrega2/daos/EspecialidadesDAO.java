package com.examples.tpmesadeayuda_entrega2.daos;

import com.examples.tpmesadeayuda_entrega2.logica.Clientes;
import com.examples.tpmesadeayuda_entrega2.logica.Especialidades;

import javax.persistence.EntityManager;

public interface EspecialidadesDAO {
    //creamos los métodos que serán implementados en las clases de implementacion
    public void create (Especialidades esp);
    public void update (Especialidades esp);
    public void delete (Especialidades esp);
    public Especialidades read(int id_especialidades);

    public void setEntityManager(EntityManager em);
}
