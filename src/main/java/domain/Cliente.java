/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.Date;

/**
 *
 * @author educu
 */
public class Cliente extends Persona{
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;
    
    
    //se inicializan los atributos propios y los de la clase padre
    public Cliente(Date fechaRegistro, boolean vip,String nombre,char genero, int edad, String direccion ){
        super(nombre, genero, edad, direccion);
        this.idCliente = ++ Cliente.contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
}

    public int getIdCliente() {
        return idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
}
