package com.example.pm1e3dr.Models;


public class Entrevista {
    private String Orden;
    private String Desrip;
    private String Periodista;
    private String Fecha;
    private String fotoURL;
    Double vaccine_price;
    // Constructor vacío requerido por Firestore
    public Entrevista() {
    }

    // Constructor con parámetros
    public Entrevista(String Orden, String fotoURL, String Desrip,Double vaccine_price, String Periodista, String Fecha) {
        this.Orden = Orden;
        this.Desrip = Desrip;
        this.Periodista = Periodista;
        this.Fecha = Fecha;
        this.vaccine_price = vaccine_price;
        this.fotoURL = fotoURL;
    }

    public Double getVaccine_price() {
        return vaccine_price;
    }

    public void setVaccine_price(Double vaccine_price) {
        this.vaccine_price = vaccine_price;
    }

    public String getFotoURL() {
        return fotoURL;
    }

    public void setFotoURL(String fotoURL) {
        this.fotoURL = fotoURL;
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
