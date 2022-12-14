package ej3.model;

import jkutkut.InvalidDataException;

public class Coche {
    public static final int MODEL_MAX_LENGTH = 20;

    private String modelo;
    private int aniofabricacion;
    private float precio;

    public Coche(String modelo, int aniofabricacion, float precio) {
//        if (modelo == null || modelo.isEmpty()) // TODO restore
//            throw new InvalidDataException("Modelo no válido: '" + modelo + "'");
        if (modelo.length() > MODEL_MAX_LENGTH)
            throw new InvalidDataException("Modelo demasiado largo: " + modelo);
        this.modelo = modelo;
        this.aniofabricacion = aniofabricacion;
        this.precio = precio;
    }

    // GETTERS

    public String getModelo() {
        return modelo;
    }

    public int getAniofabricacion() {
        return aniofabricacion;
    }

    public float getPrecio() {
        return precio;
    }

    // SETTERS

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAniofabricacion(int aniofabricacion) {
        this.aniofabricacion = aniofabricacion;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    // String

    @Override
    public String toString() {
        return "Coche{" +
                "modelo='" + modelo + '\'' +
                ", aniofabricacion=" + aniofabricacion +
                ", precio=" + precio +
                '}';
    }

    public boolean equals(Coche c) {
        return this.modelo.equals(c.modelo) && this.aniofabricacion == c.aniofabricacion && this.precio == c.precio;
    }
}
