/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises_part2;

/**
 *
 * @author cedbo
 */
public class Triangulo extends Figura {

    private double altura;
    private double base;

    public Triangulo(double altura, double base) {
        super();
        this.altura = altura;
        this.base = base;
    }

    public double calcularHipotenusa() {
        return Math.pow(base * base + altura * altura, 0.5);
    }

    public void determinarTipoTriangulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura
                == calcularHipotenusa())) {
            System.out.println("Es un triángulo equilátero");
        } else if ((base != altura) && (base != calcularHipotenusa())
                && (altura != calcularHipotenusa())) {
            System.out.println("Es un triángulo escaleno");
        } else {
            System.out.println("Es un triángulo isósceles");
        }
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    @Override
    public double calcularArea() {
        return (base * altura / 2);
    }

    @Override
    public double calcularPerimetro() {
        return (base + altura + calcularHipotenusa());
    }

}
