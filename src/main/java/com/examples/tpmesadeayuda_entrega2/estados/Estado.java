package com.examples.tpmesadeayuda_entrega2.estados;

import com.examples.tpmesadeayuda_entrega2.logica.Incidentes;

public interface Estado {
public String pendiente(Incidentes inc);
public String enProceso(Incidentes inc);
public  String resuelto(Incidentes inc);

}
