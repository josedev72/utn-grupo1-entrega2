package com.examples.tpmesadeayuda_entrega2.daos;

import com.examples.tpmesadeayuda_entrega2.logica.Clientes;

import javax.persistence.EntityManager;

public class ClientesDaoImplementacion implements ClientesDAO {
    // implemento los métodos que serán llamados desde los repositorios
    private EntityManager em;
    @Override
    public void create(Clientes cli) {
        em.persist(cli);
    }

    @Override
    public void update(Clientes cli) {
        em.merge(cli);
    }

    @Override
    public void delete(Clientes cli) {
        Clientes cli1 = em.merge(cli);
        em.remove(cli1);

    }

    @Override
    public Clientes read(int id_clientes) {
        return em.find(Clientes.class, id_clientes);
    }

    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
}
