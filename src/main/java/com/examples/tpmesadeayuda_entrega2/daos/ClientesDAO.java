package com.examples.tpmesadeayuda_entrega2.daos;

import com.examples.tpmesadeayuda_entrega2.logica.Clientes;

import javax.persistence.EntityManager;

public interface ClientesDAO {
    //creamos los métodos que serán implementados en las clases de implementacion
    public void create (Clientes cli);
    public void update (Clientes cli);
    public void delete (Clientes cli);
    public Clientes read(int id_clientes);

    public void setEntityManager(EntityManager em);
}
