/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises_part2;

/**
 *
 * @author cedbo
 */
public class Circulo extends Figura {

    private double radio;

    public Circulo(double radio) {
        super();
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public double calcularArea() {
        return Math.pow(radio, 2) * Math.PI;
    }

    @Override
    public double calcularPerimetro() {
        return Math.PI * radio * 2;
    }

}
