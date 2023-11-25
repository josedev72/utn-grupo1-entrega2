package com.examples.tpmesadeayuda_entrega2.daos;

import com.examples.tpmesadeayuda_entrega2.logica.Clientes;
import com.examples.tpmesadeayuda_entrega2.logica.Servicios;

import javax.persistence.EntityManager;

public interface ServiciosDAO {
    //creamos los métodos que serán implementados en las clases de implementacion
    public void create (Servicios ser);
    public void update (Servicios ser);
    public void delete (Servicios ser);
    public Servicios read(int id_servicios);

    public void setEntityManager(EntityManager em);
}
