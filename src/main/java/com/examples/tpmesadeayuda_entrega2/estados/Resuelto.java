package com.examples.tpmesadeayuda_entrega2.estados;

import com.examples.tpmesadeayuda_entrega2.logica.Incidentes;

public class Resuelto implements Estado {
    @Override
    public String pendiente(Incidentes inc) {
        return null;
    }

    @Override
    public String enProceso(Incidentes inc) {
        return null;
    }

    @Override
    public String resuelto(Incidentes inc) {
        if (inc.getConsideraciones().equals("sin asignar")){
            System.out.println("Pasa a estado: PENDIENTE");
            inc.setEstadoAux(new Pendiente());
            return null;
        }else{
            if (inc.getConsideraciones().equals("asignado")){
                System.out.println("Pasa a estado: EN PROCESO");
                inc.setEstadoAux(new EnProceso());
                return null;
            }else{
                if (inc.getConsideraciones().equals("finalizado")){
                    System.out.println("EN ESTADO RESUELTO");
                    return "resuelto";
                }else{
                    return null;
                }
            }

        }

    }
}
