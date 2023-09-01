/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_danielelvir;

/**
 *
 * @author HP
 */
public class Cliente {
    private String Nombre;
    private int Edad;
    private String Profesion;
    private int Carros_Comprados;
    private double Sueldo_Disponible;

    public Cliente() {
    }

    public Cliente(String Nombre, int Edad, String Profesion, int Carros_Comprados, double Sueldo_Disponible) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Profesion = Profesion;
            this.Carros_Comprados = Carros_Comprados;
        this.Sueldo_Disponible = Sueldo_Disponible;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getProfesion() {
        return Profesion;
    }

    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }

    public int getCarros_Comprados() {
        return Carros_Comprados;
    }

    public void setCarros_Comprados(int Carros_Comprados) {
        this.Carros_Comprados = Carros_Comprados;
    }

    public double getSueldo_Disponible() {
        return Sueldo_Disponible;
    }

    public void setSueldo_Disponible(double Sueldo_Disponible) {
        this.Sueldo_Disponible = Sueldo_Disponible;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
    
}
