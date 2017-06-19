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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "tarjeta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tarjeta.findAll", query = "SELECT t FROM Tarjeta t")
    , @NamedQuery(name = "Tarjeta.findByTarjetacodigo", query = "SELECT t FROM Tarjeta t WHERE t.tarjetacodigo = :tarjetacodigo")
    , @NamedQuery(name = "Tarjeta.findByTarjetafechaemision", query = "SELECT t FROM Tarjeta t WHERE t.tarjetafechaemision = :tarjetafechaemision")
    , @NamedQuery(name = "Tarjeta.findByTarjetafechavencimiento", query = "SELECT t FROM Tarjeta t WHERE t.tarjetafechavencimiento = :tarjetafechavencimiento")
    , @NamedQuery(name = "Tarjeta.findByTarjetacupoasignado", query = "SELECT t FROM Tarjeta t WHERE t.tarjetacupoasignado = :tarjetacupoasignado")
    , @NamedQuery(name = "Tarjeta.findByTarjetaactiva", query = "SELECT t FROM Tarjeta t WHERE t.tarjetaactiva = :tarjetaactiva")})
public class Tarjeta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "tarjetacodigo")
    private String tarjetacodigo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tarjetafechaemision")
    @Temporal(TemporalType.DATE)
    private Date tarjetafechaemision;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tarjetafechavencimiento")
    @Temporal(TemporalType.DATE)
    private Date tarjetafechavencimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tarjetacupoasignado")
    private int tarjetacupoasignado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tarjetaactiva")
    private boolean tarjetaactiva;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tarjetacodigo")
    private List<Entrega> entregaList;
    @JoinColumn(name = "clientecedula", referencedColumnName = "clientecedula")
    @ManyToOne(optional = false)
    private Cliente clientecedula;

    public Tarjeta() {
    }

    public Tarjeta(String tarjetacodigo) {
        this.tarjetacodigo = tarjetacodigo;
    }

    public Tarjeta(String tarjetacodigo, Date tarjetafechaemision, Date tarjetafechavencimiento, int tarjetacupoasignado, boolean tarjetaactiva) {
        this.tarjetacodigo = tarjetacodigo;
        this.tarjetafechaemision = tarjetafechaemision;
        this.tarjetafechavencimiento = tarjetafechavencimiento;
        this.tarjetacupoasignado = tarjetacupoasignado;
        this.tarjetaactiva = tarjetaactiva;
    }

    public String getTarjetacodigo() {
        return tarjetacodigo;
    }

    public void setTarjetacodigo(String tarjetacodigo) {
        this.tarjetacodigo = tarjetacodigo;
    }

    public Date getTarjetafechaemision() {
        return tarjetafechaemision;
    }

    public void setTarjetafechaemision(Date tarjetafechaemision) {
        this.tarjetafechaemision = tarjetafechaemision;
    }

    public Date getTarjetafechavencimiento() {
        return tarjetafechavencimiento;
    }

    public void setTarjetafechavencimiento(Date tarjetafechavencimiento) {
        this.tarjetafechavencimiento = tarjetafechavencimiento;
    }

    public int getTarjetacupoasignado() {
        return tarjetacupoasignado;
    }

    public void setTarjetacupoasignado(int tarjetacupoasignado) {
        this.tarjetacupoasignado = tarjetacupoasignado;
    }

    public boolean getTarjetaactiva() {
        return tarjetaactiva;
    }

    public void setTarjetaactiva(boolean tarjetaactiva) {
        this.tarjetaactiva = tarjetaactiva;
    }

    @XmlTransient
    public List<Entrega> getEntregaList() {
        return entregaList;
    }

    public void setEntregaList(List<Entrega> entregaList) {
        this.entregaList = entregaList;
    }

    public Cliente getClientecedula() {
        return clientecedula;
    }

    public void setClientecedula(Cliente clientecedula) {
        this.clientecedula = clientecedula;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tarjetacodigo != null ? tarjetacodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tarjeta)) {
            return false;
        }
        Tarjeta other = (Tarjeta) object;
        if ((this.tarjetacodigo == null && other.tarjetacodigo != null) || (this.tarjetacodigo != null && !this.tarjetacodigo.equals(other.tarjetacodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entregagas.md.Tarjeta[ tarjetacodigo=" + tarjetacodigo + " ]";
    }
    
}
