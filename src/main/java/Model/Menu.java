/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Jose Maria
 */

@Entity
@Table(name="tblMenu")
public class Menu implements Serializable {
    
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMenu;
    
     @JoinColumn(name="idRol",nullable= false)
     @ManyToOne
    private Rol rol;
    
     @Column(name="nombre")
    private String nombre;
    
     @Column(name="tipo")
    private String tipo;
    
     @JoinColumn(name="codigo_submenu",nullable= false)
     @ManyToOne
    private Menu menu;
    
     @Column(name="estado")
    private boolean estado;

    public int getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.idMenu;
        hash = 41 * hash + Objects.hashCode(this.rol);
        hash = 41 * hash + Objects.hashCode(this.nombre);
        hash = 41 * hash + Objects.hashCode(this.tipo);
        hash = 41 * hash + Objects.hashCode(this.menu);
        hash = 41 * hash + (this.estado ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Menu other = (Menu) obj;
        if (this.idMenu != other.idMenu) {
            return false;
        }
        if (this.estado != other.estado) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.rol, other.rol)) {
            return false;
        }
        if (!Objects.equals(this.menu, other.menu)) {
            return false;
        }
        return true;
    }
     
}
