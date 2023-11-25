package com.examples.tpmesadeayuda_entrega2.daos;

import com.examples.tpmesadeayuda_entrega2.logica.Incidentes;

import javax.persistence.EntityManager;

public class IncidentesDaoImplementacion implements IncidentesDAO{
    private EntityManager em;
    @Override
    public void create(Incidentes inc) {
        em.persist((inc));
    }

    @Override
    public void update(Incidentes inc) {
        em.merge(inc);
    }

    @Override
    public void delete(Incidentes inc) {
        Incidentes inc1 = em.merge(inc);
        em.remove(inc1);
    }

    @Override
    public Incidentes read(int id_incidentes) {
        return em.find(Incidentes.class, id_incidentes);
    }

    @Override
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
}
