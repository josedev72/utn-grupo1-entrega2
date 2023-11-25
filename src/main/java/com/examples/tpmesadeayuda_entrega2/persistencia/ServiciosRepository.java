package com.examples.tpmesadeayuda_entrega2.persistencia;
import com.examples.tpmesadeayuda_entrega2.daos.ServiciosDAO;
import com.examples.tpmesadeayuda_entrega2.daos.DAOFactory;
import com.examples.tpmesadeayuda_entrega2.logica.Servicios;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class ServiciosRepository {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("db_mesadeayuda_entrega2PU");
    private ServiciosDAO serviciosDAO;

    public ServiciosRepository(){

        this.serviciosDAO = DAOFactory.getServiciosDAO();
    }

    public EntityManager obtenerEntityManagerConfigurado(){
        EntityManager em = emf.createEntityManager();
        serviciosDAO.setEntityManager(em);
        return em;
    }

    public void agregarServicios(Servicios ser) throws Exception{
        EntityManager em = obtenerEntityManagerConfigurado();
        em.getTransaction().begin();
        //


        //
        serviciosDAO.create(ser);
        em.getTransaction().commit();
        em.close();

    }

    public void modificarServicios(Servicios ser) throws Exception{
        EntityManager em = obtenerEntityManagerConfigurado();
        em.getTransaction().begin();
        //


        //
        serviciosDAO.update(ser);
        em.getTransaction().commit();
        em.close();

    }

    public void borrarServicios(Servicios ser) throws Exception{
        EntityManager em = obtenerEntityManagerConfigurado();
        em.getTransaction().begin();
        //


        //
        serviciosDAO.delete(ser);
        em.getTransaction().commit();
        em.close();

    }

    public Servicios consultarServicios(int id_servicios )throws Exception{
        EntityManager em = obtenerEntityManagerConfigurado();
        em.getTransaction().begin();
        //


        //
        Servicios ser1 = serviciosDAO.read(id_servicios);

        em.getTransaction().commit();
        em.close();
        return ser1;
    }

}
