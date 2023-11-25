package com.examples.tpmesadeayuda_entrega2.daos;

import com.examples.tpmesadeayuda_entrega2.logica.Clientes;
import com.examples.tpmesadeayuda_entrega2.logica.Tecnicos;

import javax.persistence.EntityManager;

public interface TecnicosDAO {
    //creamos los métodos que serán implementados en las clases de implementacion
    public void create (Tecnicos tec);
    public void update (Tecnicos tec);
    public void delete (Tecnicos tec);
    public Tecnicos read(int id_tecnicos);

    public void setEntityManager(EntityManager em);
}
