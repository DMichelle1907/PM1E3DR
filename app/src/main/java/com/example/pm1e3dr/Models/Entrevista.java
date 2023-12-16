package com.example.pm1e3dr.Models;


public class Entrevista {
    private String Orden;
    private String Desrip;
    private String Periodista;
    private String Fecha;

    // Constructor vacío requerido por Firestore
    public Entrevista() {
    }

    // Constructor con parámetros
    public Entrevista(String Orden, String Desrip, String Periodista, String Fecha) {
        this.Orden = Orden;
        this.Desrip = Desrip;
        this.Periodista = Periodista;
        this.Fecha = Fecha;
    }

    // Métodos getters y setters
    public String getOrden() {
        return Orden;
    }

    public void setOrden(String Orden) {
        this.Orden = Orden;
    }

    public String getDesrip() {
        return Desrip;
    }

    public void setDesrip(String Desrip) {
        this.Desrip = Desrip;
    }

    public String getPeriodista() {
        return Periodista;
    }

    public void setPeriodista(String Periodista) {
        this.Periodista = Periodista;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
}
