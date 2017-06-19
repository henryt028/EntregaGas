package com.entregagas.md;

import com.entregagas.md.Entrega;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-18T15:34:01")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> usuarionombre;
    public static volatile ListAttribute<Usuario, Entrega> entregaList;
    public static volatile SingularAttribute<Usuario, String> usuarioclave;
    public static volatile SingularAttribute<Usuario, Date> usuariofecharegistro;
    public static volatile SingularAttribute<Usuario, Integer> usuariorol;
    public static volatile SingularAttribute<Usuario, String> usuarioid;

}