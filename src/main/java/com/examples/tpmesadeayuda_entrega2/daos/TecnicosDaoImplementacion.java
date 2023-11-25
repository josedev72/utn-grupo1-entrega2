package com.examples.tpmesadeayuda_entrega2.daos;

import com.examples.tpmesadeayuda_entrega2.logica.Tecnicos;

import javax.persistence.EntityManager;

public class TecnicosDaoImplementacion implements TecnicosDAO{
    private EntityManager em;
    @Override
    public void create(Tecnicos tec) {
        em.persist(tec);
    }

    @Override
    public void update(Tecnicos tec) {
        em.merge(tec);
    }

    @Override
    public void delete(Tecnicos tec) {
        Tecnicos tec1 = em.merge(tec);
        em.remove(tec1);
    }

    @Override
    public Tecnicos read(int id_tecnicos) {
        return em.find(Tecnicos.class, id_tecnicos);
    }

    @Override
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
}
