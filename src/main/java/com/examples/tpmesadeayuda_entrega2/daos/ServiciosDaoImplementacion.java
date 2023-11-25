package com.examples.tpmesadeayuda_entrega2.daos;

import com.examples.tpmesadeayuda_entrega2.logica.Servicios;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Persistence.*;

public class ServiciosDaoImplementacion implements ServiciosDAO{

    private EntityManager em;


    public void create(Servicios ser) {
        em.persist(ser);
    }


    public void update(Servicios ser) {
        em.merge(ser);
    }


    public void delete(Servicios ser) {
        Servicios ser1 = em.merge(ser);
        em.remove(ser1);
    }


    public Servicios read(int id_servicios) {
        return em.find(Servicios.class, id_servicios);
    }


    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
}
