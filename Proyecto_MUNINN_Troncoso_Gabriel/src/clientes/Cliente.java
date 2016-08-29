/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

/**
 *
 * @author Gabriel
 */
public class Cliente {

public Cliente()
        {
            //constructor
        }


private int id_cliente;
private int rut_cliente;
private String digito_rut;
private String nombre_cliente;
private String apellido_cliente;
private int telefono_cliente;
private String direccion_cliente;
private String comuna_cliente;
private String ciudad_cliente;
private String email_cliente;

    /**
     * @return the id_cliente
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * @param id_cliente the id_cliente to set
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * @return the rut_cliente
     */
    public int getRut_cliente() {
        return rut_cliente;
    }

    /**
     * @param rut_cliente the rut_cliente to set
     */
    public void setRut_cliente(int rut_cliente) {
        this.rut_cliente = rut_cliente;
    }

    /**
     * @return the digito_rut
     */
    public String getDigito_rut() {
        return digito_rut;
    }

    /**
     * @param digito_rut the digito_rut to set
     */
    public void setDigito_rut(String digito_rut) {
        this.digito_rut = digito_rut;
    }

    /**
     * @return the nombre_cliente
     */
    public String getNombre_cliente() {
        return nombre_cliente;
    }

    /**
     * @param nombre_cliente the nombre_cliente to set
     */
    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    /**
     * @return the apellido_cliente
     */
    public String getApellido_cliente() {
        return apellido_cliente;
    }

    /**
     * @param apellido_cliente the apellido_cliente to set
     */
    public void setApellido_cliente(String apellido_cliente) {
        this.apellido_cliente = apellido_cliente;
    }

    /**
     * @return the telefono_cliente
     */
    public int getTelefono_cliente() {
        return telefono_cliente;
    }

    /**
     * @param telefono_cliente the telefono_cliente to set
     */
    public void setTelefono_cliente(int telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }

    /**
     * @return the direccion_cliente
     */
    public String getDireccion_cliente() {
        return direccion_cliente;
    }

    /**
     * @param direccion_cliente the direccion_cliente to set
     */
    public void setDireccion_cliente(String direccion_cliente) {
        this.direccion_cliente = direccion_cliente;
    }

    /**
     * @return the comuna_cliente
     */
    public String getComuna_cliente() {
        return comuna_cliente;
    }

    /**
     * @param comuna_cliente the comuna_cliente to set
     */
    public void setComuna_cliente(String comuna_cliente) {
        this.comuna_cliente = comuna_cliente;
    }

    /**
     * @return the ciudad_cliente
     */
    public String getCiudad_cliente() {
        return ciudad_cliente;
    }

    /**
     * @param ciudad_cliente the ciudad_cliente to set
     */
    public void setCiudad_cliente(String ciudad_cliente) {
        this.ciudad_cliente = ciudad_cliente;
    }

    /**
     * @return the email_cliente
     */
    public String getEmail_cliente() {
        return email_cliente;
    }

    /**
     * @param email_cliente the email_cliente to set
     */
    public void setEmail_cliente(String email_cliente) {
        this.email_cliente = email_cliente;
    }

}
