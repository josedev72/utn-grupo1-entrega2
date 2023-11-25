package com.examples.tpmesadeayuda_entrega2.persistencia;

import com.examples.tpmesadeayuda_entrega2.daos.DAOFactory;
import com.examples.tpmesadeayuda_entrega2.daos.IncidentesDAO;
import com.examples.tpmesadeayuda_entrega2.logica.Incidentes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class IncidentesRepository {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("db_mesadeayuda_entrega2PU");
    private IncidentesDAO incidentesDAO;

    public IncidentesRepository() {
        this.incidentesDAO = DAOFactory.getIncidentesDAO();
        // si hubiera más objetos como atributos hay que inicializarlos igual

    }

    // creo el método para obtener una entityManager y configurar los objetosDAO
    public EntityManager obtenerEntityManagerConfigurado() {
        //creo el entityManager a partir de la fábrica emf
        EntityManager em = emf.createEntityManager();
        incidentesDAO.setEntityManager(em);
        return em;
    }

    // creo los métodos para agregar, modificar, borrar y consultar datos
    //agregar
    public void agregarIncidentes(Incidentes inc) throws Exception {

        //obtengo el entityManager del metodo creado obtenerEntityManagerConsolidado
        EntityManager em = obtenerEntityManagerConfigurado();

        em.getTransaction().begin();
        // acá podría
        // ir alguna consulta

        incidentesDAO.create(inc);
        em.getTransaction().commit();
        em.close();
    }

    //modificar
    public void modificarIncidentess(Incidentes inc) throws Exception {

        //obtengo el entityManager del metodo creado obtenerEntityManagerConsolidado
        EntityManager em = obtenerEntityManagerConfigurado();

        // acá podría
        // ir alguna consulta

        incidentesDAO.update(inc);
        em.getTransaction().commit();
        em.close();
    }

    //borrar
    public void borrarIncidentes(Incidentes inc) throws Exception {
        EntityManager em = obtenerEntityManagerConfigurado();
        em.getTransaction().begin();

        // acá podría
        // ir alguna consulta

        incidentesDAO.delete(inc);
        em.getTransaction().commit();
        em.close();
    }

    //consultar
    public Incidentes consultarIncidentes(int id_incidentes) throws Exception {
        EntityManager em = obtenerEntityManagerConfigurado();
        em.getTransaction().begin();

        // acá podría
        // ir alguna consulta
        Incidentes inc1 = incidentesDAO.read(id_incidentes);
        em.getTransaction().commit();
        em.close();

        return inc1;
    }
}
