/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entregagas.md;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author dell
 */
@Entity
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")
    , @NamedQuery(name = "Usuario.findByUsuarioid", query = "SELECT u FROM Usuario u WHERE u.usuarioid = :usuarioid")
    , @NamedQuery(name = "Usuario.findByUsuarioclave", query = "SELECT u FROM Usuario u WHERE u.usuarioclave = :usuarioclave")
    , @NamedQuery(name = "Usuario.findByUsuarionombre", query = "SELECT u FROM Usuario u WHERE u.usuarionombre = :usuarionombre")
    , @NamedQuery(name = "Usuario.findByUsuariorol", query = "SELECT u FROM Usuario u WHERE u.usuariorol = :usuariorol")
    , @NamedQuery(name = "Usuario.findByUsuariofecharegistro", query = "SELECT u FROM Usuario u WHERE u.usuariofecharegistro = :usuariofecharegistro")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "usuarioid")
    private String usuarioid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "usuarioclave")
    private String usuarioclave;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "usuarionombre")
    private String usuarionombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "usuariorol")
    private int usuariorol;
    @Basic(optional = false)
    @NotNull
    @Column(name = "usuariofecharegistro")
    @Temporal(TemporalType.DATE)
    private Date usuariofecharegistro;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioid")
    private List<Entrega> entregaList;

    public Usuario() {
    }

    public Usuario(String usuarioid) {
        this.usuarioid = usuarioid;
    }

    public Usuario(String usuarioid, String usuarioclave, String usuarionombre, int usuariorol, Date usuariofecharegistro) {
        this.usuarioid = usuarioid;
        this.usuarioclave = usuarioclave;
        this.usuarionombre = usuarionombre;
        this.usuariorol = usuariorol;
        this.usuariofecharegistro = usuariofecharegistro;
    }

    public String getUsuarioid() {
        return usuarioid;
    }

    public void setUsuarioid(String usuarioid) {
        this.usuarioid = usuarioid;
    }

    public String getUsuarioclave() {
        return usuarioclave;
    }

    public void setUsuarioclave(String usuarioclave) {
        this.usuarioclave = usuarioclave;
    }

    public String getUsuarionombre() {
        return usuarionombre;
    }

    public void setUsuarionombre(String usuarionombre) {
        this.usuarionombre = usuarionombre;
    }

    public int getUsuariorol() {
        return usuariorol;
    }

    public void setUsuariorol(int usuariorol) {
        this.usuariorol = usuariorol;
    }

    public Date getUsuariofecharegistro() {
        return usuariofecharegistro;
    }

    public void setUsuariofecharegistro(Date usuariofecharegistro) {
        this.usuariofecharegistro = usuariofecharegistro;
    }
    
    public String convertirTipoUsuario(){
        if(usuariorol == 0){
            return "Administrador";
        } else {
            return "Responsable Entregas";
        }
    }

    @XmlTransient
    public List<Entrega> getEntregaList() {
        return entregaList;
    }

    public void setEntregaList(List<Entrega> entregaList) {
        this.entregaList = entregaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usuarioid != null ? usuarioid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.usuarioid == null && other.usuarioid != null) || (this.usuarioid != null && !this.usuarioid.equals(other.usuarioid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entregagas.md.Usuario[ usuarioid=" + usuarioid + " ]";
    }
    
}
