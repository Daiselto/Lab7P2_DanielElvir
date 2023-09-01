/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_danielelvir;

/**
 *
 * @author HP
 */
public class Vendedor {
    private String Nombre;
    private int Carros_Vendidos;
    private double Dinero_Generado;

    public Vendedor() {
    }

    public Vendedor(String Nombre, int Carros_Vendidos, double Dinero_Generado) {
        this.Nombre = Nombre;
        this.Carros_Vendidos = Carros_Vendidos;
        this.Dinero_Generado = Dinero_Generado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCarros_Vendidos() {
        return Carros_Vendidos;
    }

    public void setCarros_Vendidos(int Carros_Vendidos) {
        this.Carros_Vendidos = Carros_Vendidos;
    }

    public double getDinero_Generado() {
        return Dinero_Generado;
    }

    public void setDinero_Generado(double Dinero_Generado) {
        this.Dinero_Generado = Dinero_Generado;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
    
}
