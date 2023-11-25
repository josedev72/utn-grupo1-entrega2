package com.examples.tpmesadeayuda_entrega2.daos;

import com.examples.tpmesadeayuda_entrega2.logica.Especialidades;

import javax.persistence.EntityManager;

public class EspecialidadesDaoImplementacion implements EspecialidadesDAO{
    private EntityManager em;
    @Override
    public void create(Especialidades esp) {
        em.persist(esp);
    }

    @Override
    public void update(Especialidades esp) {
        em.merge(esp);
    }

    @Override
    public void delete(Especialidades esp) {
        Especialidades esp1 = em.merge(esp);
        em.remove(esp1);
    }

    @Override
    public Especialidades read(int id_especialidades) {
        return em.find(Especialidades.class, id_especialidades);
    }

    @Override
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
}
