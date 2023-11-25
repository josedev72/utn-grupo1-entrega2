package com.examples.tpmesadeayuda_entrega2.estados;

import com.examples.tpmesadeayuda_entrega2.logica.Incidentes;

public class Pendiente implements Estado {

    @Override
    public String pendiente(Incidentes inc) {
        if (inc.getConsideraciones().equals("sin asignar")){
            System.out.println("EN ESTADO PENDIENTE");
            return "PENDIENTE";
        }else{
            if (inc.getConsideraciones().equals("asignado")){
                System.out.println("Paso a estado: EN PROCESO");
                inc.setEstadoAux(new EnProceso());
                return null;
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
    public String enProceso(Incidentes inc) {
        return null;

    }

    @Override
    public String resuelto(Incidentes inc) {
        return null;

    }
}

