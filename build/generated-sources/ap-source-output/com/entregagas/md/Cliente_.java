package com.entregagas.md;

import com.entregagas.md.Tarjeta;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-18T15:34:01")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, Date> clientefecharegistro;
    public static volatile SingularAttribute<Cliente, String> clientecedula;
    public static volatile SingularAttribute<Cliente, Integer> clientenumerofamiliares;
    public static volatile ListAttribute<Cliente, Tarjeta> tarjetaList;
    public static volatile SingularAttribute<Cliente, String> clienteidacceso;
    public static volatile SingularAttribute<Cliente, String> clientedireccion;
    public static volatile SingularAttribute<Cliente, String> clientetelefono;
    public static volatile SingularAttribute<Cliente, String> clienteclave;
    public static volatile SingularAttribute<Cliente, String> clientenombre;

}