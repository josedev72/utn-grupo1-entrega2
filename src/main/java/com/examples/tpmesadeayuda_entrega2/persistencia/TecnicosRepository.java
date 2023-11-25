package com.examples.tpmesadeayuda_entrega2.persistencia;
import com.examples.tpmesadeayuda_entrega2.daos.TecnicosDAO;
import com.examples.tpmesadeayuda_entrega2.daos.DAOFactory;
import com.examples.tpmesadeayuda_entrega2.logica.Tecnicos;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class TecnicosRepository {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("db_mesadeayuda_entrega2PU");
    private TecnicosDAO tecnicosDAO;

    public TecnicosRepository(){

        this.tecnicosDAO= DAOFactory.getTecnicosDAO();
    }

    public EntityManager obtenerEntityManagerConfigurado(){
        EntityManager em = emf.createEntityManager();
        tecnicosDAO.setEntityManager(em);
        return em;
    }

    public void agregarServicios(Tecnicos tec) throws Exception{
        EntityManager em = obtenerEntityManagerConfigurado();
        em.getTransaction().begin();
        //


        //
        tecnicosDAO.create(tec);
        em.getTransaction().commit();
        em.close();

    }

    public void modificarServicios(Tecnicos tec) throws Exception{
        EntityManager em = obtenerEntityManagerConfigurado();
        em.getTransaction().begin();
        //


        //
        tecnicosDAO.update(tec);
        em.getTransaction().commit();
        em.close();

    }

    public void borrarServicios(Tecnicos tec) throws Exception{
        EntityManager em = obtenerEntityManagerConfigurado();
        em.getTransaction().begin();
        //


        //
        tecnicosDAO.delete(tec);
        em.getTransaction().commit();
        em.close();

    }

    public Tecnicos consultarTecnicos(int id_tecnicos )throws Exception{
        EntityManager em = obtenerEntityManagerConfigurado();
        em.getTransaction().begin();
        //


        //
        Tecnicos tec1 = tecnicosDAO.read(id_tecnicos);

        em.getTransaction().commit();
        em.close();
        return tec1;
    }



}
