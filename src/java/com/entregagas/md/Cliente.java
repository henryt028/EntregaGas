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
@Table(name = "cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c")
    , @NamedQuery(name = "Cliente.findByClientecedula", query = "SELECT c FROM Cliente c WHERE c.clientecedula = :clientecedula")
    , @NamedQuery(name = "Cliente.findByClientenombre", query = "SELECT c FROM Cliente c WHERE c.clientenombre = :clientenombre")
    , @NamedQuery(name = "Cliente.findByClientedireccion", query = "SELECT c FROM Cliente c WHERE c.clientedireccion = :clientedireccion")
    , @NamedQuery(name = "Cliente.findByClientetelefono", query = "SELECT c FROM Cliente c WHERE c.clientetelefono = :clientetelefono")
    , @NamedQuery(name = "Cliente.findByClienteidacceso", query = "SELECT c FROM Cliente c WHERE c.clienteidacceso = :clienteidacceso")
    , @NamedQuery(name = "Cliente.findByClienteclave", query = "SELECT c FROM Cliente c WHERE c.clienteclave = :clienteclave")
    , @NamedQuery(name = "Cliente.findByClientenumerofamiliares", query = "SELECT c FROM Cliente c WHERE c.clientenumerofamiliares = :clientenumerofamiliares")
    , @NamedQuery(name = "Cliente.findByClientefecharegistro", query = "SELECT c FROM Cliente c WHERE c.clientefecharegistro = :clientefecharegistro")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "clientecedula")
    private String clientecedula;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "clientenombre")
    private String clientenombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "clientedireccion")
    private String clientedireccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "clientetelefono")
    private String clientetelefono;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "clienteidacceso")
    private String clienteidacceso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "clienteclave")
    private String clienteclave;
    @Basic(optional = false)
    @NotNull
    @Column(name = "clientenumerofamiliares")
    private int clientenumerofamiliares;
    @Basic(optional = false)
    @NotNull
    @Column(name = "clientefecharegistro")
    @Temporal(TemporalType.DATE)
    private Date clientefecharegistro;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clientecedula")
    private List<Tarjeta> tarjetaList;

    public Cliente() {
    }

    public Cliente(String clientecedula) {
        this.clientecedula = clientecedula;
    }

    public Cliente(String clientecedula, String clientenombre, String clientedireccion, String clientetelefono, String clienteidacceso, String clienteclave, int clientenumerofamiliares, Date clientefecharegistro) {
        this.clientecedula = clientecedula;
        this.clientenombre = clientenombre;
        this.clientedireccion = clientedireccion;
        this.clientetelefono = clientetelefono;
        this.clienteidacceso = clienteidacceso;
        this.clienteclave = clienteclave;
        this.clientenumerofamiliares = clientenumerofamiliares;
        this.clientefecharegistro = clientefecharegistro;
    }

    public String getClientecedula() {
        return clientecedula;
    }

    public void setClientecedula(String clientecedula) {
        this.clientecedula = clientecedula;
    }

    public String getClientenombre() {
        return clientenombre;
    }

    public void setClientenombre(String clientenombre) {
        this.clientenombre = clientenombre;
    }

    public String getClientedireccion() {
        return clientedireccion;
    }

    public void setClientedireccion(String clientedireccion) {
        this.clientedireccion = clientedireccion;
    }

    public String getClientetelefono() {
        return clientetelefono;
    }

    public void setClientetelefono(String clientetelefono) {
        this.clientetelefono = clientetelefono;
    }

    public String getClienteidacceso() {
        return clienteidacceso;
    }

    public void setClienteidacceso(String clienteidacceso) {
        this.clienteidacceso = clienteidacceso;
    }

    public String getClienteclave() {
        return clienteclave;
    }

    public void setClienteclave(String clienteclave) {
        this.clienteclave = clienteclave;
    }

    public int getClientenumerofamiliares() {
        return clientenumerofamiliares;
    }

    public void setClientenumerofamiliares(int clientenumerofamiliares) {
        this.clientenumerofamiliares = clientenumerofamiliares;
    }

    public Date getClientefecharegistro() {
        return clientefecharegistro;
    }

    public void setClientefecharegistro(Date clientefecharegistro) {
        this.clientefecharegistro = clientefecharegistro;
    }

    @XmlTransient
    public List<Tarjeta> getTarjetaList() {
        return tarjetaList;
    }

    public void setTarjetaList(List<Tarjeta> tarjetaList) {
        this.tarjetaList = tarjetaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clientecedula != null ? clientecedula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.clientecedula == null && other.clientecedula != null) || (this.clientecedula != null && !this.clientecedula.equals(other.clientecedula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entregagas.md.Cliente[ clientecedula=" + clientecedula + " ]";
    }
    
}
