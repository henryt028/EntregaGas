package com.entregagas.md;

import com.entregagas.md.Tarjeta;
import com.entregagas.md.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-18T15:34:01")
@StaticMetamodel(Entrega.class)
public class Entrega_ { 

    public static volatile SingularAttribute<Entrega, Date> entregafecha;
    public static volatile SingularAttribute<Entrega, Tarjeta> tarjetacodigo;
    public static volatile SingularAttribute<Entrega, String> entregacodigo;
    public static volatile SingularAttribute<Entrega, Integer> entregacantidad;
    public static volatile SingularAttribute<Entrega, Usuario> usuarioid;

}