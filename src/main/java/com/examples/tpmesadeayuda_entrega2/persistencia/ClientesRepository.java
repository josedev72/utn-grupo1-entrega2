package com.examples.tpmesadeayuda_entrega2.persistencia;

import com.examples.tpmesadeayuda_entrega2.daos.ClientesDAO;
import com.examples.tpmesadeayuda_entrega2.daos.DAOFactory;
import com.examples.tpmesadeayuda_entrega2.logica.Clientes;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class ClientesRepository {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("db_mesadeayuda_entrega2PU");
    private ClientesDAO clientesDAO;

    public ClientesRepository() {
        this.clientesDAO = DAOFactory.getClientesDAO();
        // si hubiera más objetos como atributos hay que inicializarlos igual

    }

    // creo el método para obtener una entityManager y configurar los objetosDAO
    public EntityManager obtenerEntityManagerConfigurado() {
        //creo el entityManager a partir de la fábrica emf
        EntityManager em = emf.createEntityManager();
        clientesDAO.setEntityManager(em);
        return em;
    }

    public List<Clientes> listarTodosLosClientes() {
        EntityManager em = obtenerEntityManagerConfigurado();
        List<Clientes> clientes;

        try {
            // Consulta JPQL para obtener todos los clientes
            Query query = em.createQuery("SELECT c FROM Clientes c");
            clientes = query.getResultList();
        } finally {
            em.close(); // Cerrar el EntityManager para liberar recursos
        }

        return clientes;
    }

    // creo los métodos para agregar, modificar, borrar y consultar datos
    //agregar
    public void agregarClientes(Clientes cli) throws Exception {

        //obtengo el entityManager del metodo creado obtenerEntityManagerConsolidado
        EntityManager em = obtenerEntityManagerConfigurado();

        em.getTransaction().begin();
        // acá podría
        // ir alguna consulta

        clientesDAO.create(cli);
        em.getTransaction().commit();
        em.close();
    }

    //modificar
    public void modificarClientes(Clientes cli) throws Exception {

        //obtengo el entityManager del metodo creado obtenerEntityManagerConsolidado
        EntityManager em = obtenerEntityManagerConfigurado();

        // acá podría
        // ir alguna consulta

        clientesDAO.update(cli);
        em.getTransaction().commit();
        em.close();
    }

    //borrar
    public void borrarClientes(Clientes cli) throws Exception {
        EntityManager em = obtenerEntityManagerConfigurado();
        em.getTransaction().begin();

        // acá podría
        // ir alguna consulta

        clientesDAO.delete(cli);
        em.getTransaction().commit();
        em.close();
    }

    //consultar
    public Clientes consultarClientes(int id_clientes) throws Exception {
        EntityManager em = obtenerEntityManagerConfigurado();
        em.getTransaction().begin();

        // acá podría
        // ir alguna consulta
        Clientes cli2 = clientesDAO.read(id_clientes);
        em.getTransaction().commit();
        em.close();

        return cli2;
    }
}
