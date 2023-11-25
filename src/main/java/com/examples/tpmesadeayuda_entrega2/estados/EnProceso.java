package com.examples.tpmesadeayuda_entrega2.estados;

import com.examples.tpmesadeayuda_entrega2.logica.Incidentes;

public class EnProceso implements Estado {
    @Override
    public String pendiente(Incidentes inc) {
        return null;
    }

    @Override
    public String enProceso(Incidentes inc) {
        if (inc.getConsideraciones().equals("sin asignar")){
            System.out.println("Pasa a estado: PENDIENTE");
            inc.setEstadoAux(new Pendiente());
            return null;
        }else{
            if (inc.getConsideraciones().equals("asignado")){
                System.out.println("EN ESTADO EN PROCESO");
                return "En Proceso";
            }else{
                if (inc.getConsideraciones().equals("finalizado")){
                    System.out.println("Pasa a estado: RESUELTO");
                    inc.setEstadoAux(new Resuelto());
                    return null;
                }else{
                    return null;
                }
            }

        }

    }

    @Override
    public String resuelto(Incidentes inc) {
        return null;
    }
}
