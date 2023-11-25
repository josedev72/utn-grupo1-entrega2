package com.examples.tpmesadeayuda_entrega2.daos;
import com.examples.tpmesadeayuda_entrega2.daos.*;
public class DAOFactory {
    public static ClientesDAO getClientesDAO(){
        return new ClientesDaoImplementacion();
    }
    public static EspecialidadesDAO getEspecialidadesDAO(){
        return new EspecialidadesDaoImplementacion();
    }
    public static IncidentesDAO getIncidentesDAO(){
        return new IncidentesDaoImplementacion();
    }
    public static ServiciosDAO getServiciosDAO(){
        return new ServiciosDaoImplementacion();
    }
    public static TecnicosDAO getTecnicosDAO(){
        return new TecnicosDaoImplementacion();
    }

}