package com.examples.tpmesadeayuda_entrega2.logica;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-11-25T04:07:13", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Incidentes.class)
public class Incidentes_ { 

    public static volatile SingularAttribute<Incidentes, Integer> id_tecnicos;
    public static volatile SingularAttribute<Incidentes, String> estado;
    public static volatile SingularAttribute<Incidentes, String> consideraciones;
    public static volatile SingularAttribute<Incidentes, Integer> id_cliente;
    public static volatile SingularAttribute<Incidentes, Integer> id_incidentes;
    public static volatile SingularAttribute<Incidentes, Integer> id_servicios;
    public static volatile SingularAttribute<Incidentes, Date> fecha_posible_resolucion;
    public static volatile SingularAttribute<Incidentes, Integer> id_especialidades;
    public static volatile SingularAttribute<Incidentes, String> tiempo_estimado_resolucion;

}