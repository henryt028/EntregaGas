package com.entregagas.md;

import com.entregagas.md.Cliente;
import com.entregagas.md.Entrega;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-18T15:34:01")
@StaticMetamodel(Tarjeta.class)
public class Tarjeta_ { 

    public static volatile SingularAttribute<Tarjeta, Date> tarjetafechaemision;
    public static volatile SingularAttribute<Tarjeta, Integer> tarjetacupoasignado;
    public static volatile ListAttribute<Tarjeta, Entrega> entregaList;
    public static volatile SingularAttribute<Tarjeta, Cliente> clientecedula;
    public static volatile SingularAttribute<Tarjeta, String> tarjetacodigo;
    public static volatile SingularAttribute<Tarjeta, Date> tarjetafechavencimiento;
    public static volatile SingularAttribute<Tarjeta, Boolean> tarjetaactiva;

}