/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaClinico;

import java.util.Date;

/**
 *
 * @author wesley
 */
public class Persona {
    protected String usuario;
    protected String clave;
    protected String nombre;
    protected String apellido;
    protected String cedula;
    protected String direccion;
    protected Date fechaNac;
    protected Administrador admin;
    
    public boolean logIn(){
        return true;
    }
    
    public boolean logOut(){
        return true;
    }
}
