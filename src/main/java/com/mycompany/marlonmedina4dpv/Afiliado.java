
package com.mycompany.marlonmedina4dpv;

import javax.swing.JOptionPane;


public class Afiliado {

    String nombre;
    String apellido;
    String rut;
    String correo;
    double monto;
    
    
    public Afiliado(String rut, double monto,String nombre,String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.monto = monto;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    public void crearCorreo(){
        
        int varError = 0; // Lo arregle porque SOY ESTUPIDO AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA tiempo gastado = 100h
        char[] cambio = this.nombre.toCharArray();
        String cambio2 = "";
        
        for (int i = 0; i < 3; i++) {
            cambio2 += cambio[i] ;
        }
        this.correo = cambio2 + ".";
        cambio = this.apellido.toCharArray();
            
        if (this.apellido.length() - 3 > - 1) {
            varError = this.apellido.length() - 3;
        }else{
            varError = 0;

        }
        
        
        cambio2 = "";    
        for (int i = varError; i < this.apellido.length(); i++) {
            
            cambio2 += cambio[i] ;
        }
        this.correo += cambio2 + ".";
        cambio = this.rut.toCharArray();
        
        if (this.rut.length() - 3 > - 1) {
            varError = this.rut.length() - 3;
        }else{
            varError = 0;

        }
        
        cambio2 = "";    
        for (int i = varError; i < this.rut.length(); i++) {
            cambio2 += cambio[i] ;
        }
        this.correo += cambio2 + "@AFP.CL";
        
        
    }
    
    public void mostrar(){
        JOptionPane.showMessageDialog(null, "Nombre: " + this.nombre + "\nApellido: "+ this.apellido + "\nRUT: " + this.rut + "\nMONTO: " +this.monto);
    }
    

 }
     
    
    

