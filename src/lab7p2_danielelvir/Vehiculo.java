/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_danielelvir;

import java.awt.Color;

/**
 *
 * @author HP
 */
public class Vehiculo {
    private String Marca;
    private Color color;
    private String Modelo;
    private int Año;
    private double Precio_Venta;

    public Vehiculo() {
    }

    public Vehiculo(String Marca, Color color, String Modelo, int Año, double Precio_Venta) {
        this.Marca = Marca;
        this.color = color;
        this.Modelo = Modelo;
        this.Año = Año;
        this.Precio_Venta = Precio_Venta;
    }

    
    

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    public double getPrecio_Venta() {
        return Precio_Venta;
    }

    public void setPrecio_Venta(double Precio_Venta) {
        this.Precio_Venta = Precio_Venta;
    }

    @Override
    public String toString() {
        return Marca+", " + Modelo;
    }
    
    
}
