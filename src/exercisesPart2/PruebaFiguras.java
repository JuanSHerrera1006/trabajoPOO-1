/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercisesPart2;

import java.util.Scanner;

/**
 *
 * @author cedbo
 */
public class PruebaFiguras {

    public static void createShapes(Scanner sc) {
        double radio, lado, alturaT, alturaR, baseT, baseR;

        System.out.println("CIRCULO");
        System.out.print("Digite el valor del radio del circulo: ");
        radio = sc.nextDouble();
        Circulo circulo = new Circulo(radio);

        System.out.println("RECTANGULO");
        System.out.print("Digite el valor de la altura del rectangulo: ");
        alturaR = sc.nextDouble();
        System.out.print("Digite el valor de la base del rectangulo: ");
        baseR = sc.nextDouble();
        Rectangulo rectangulo = new Rectangulo(alturaR, baseR);

        System.out.println("CUADRADO");
        System.out.print("Digite el valor del lado del cuadrado: ");
        lado = sc.nextDouble();
        Cuadrado cuadrado = new Cuadrado(lado);

        System.out.println("TRIANGULO");
        System.out.print("Digite el valor de la altura del triangulo: ");
        alturaT = sc.nextDouble();
        System.out.print("Digite el valor de la base del triangulo: ");
        baseT = sc.nextDouble();
        Triangulo triangulo = new Triangulo(alturaT, baseT);

        System.out.println("+-----------------+");
        System.out.println("| RESUMEN FIGURAS |");
        System.out.println("+-----------------+");

        System.out.println("El area del circulo es: " + circulo.calcularArea());
        System.out.println("El perimetro del circulo es: " + circulo.calcularPerimetro());
        System.out.println("");
        System.out.println("El area del rectangulo es: " + rectangulo.calcularArea());
        System.out.println("El perimetro del rectangulo es: " + rectangulo.calcularPerimetro());
        System.out.println("");
        System.out.println("El area del cuadrado es: " + cuadrado.calcularArea());
        System.out.println("El perimetro del cuadrado es: " + cuadrado.calcularPerimetro());
        System.out.println("");
        System.out.println("El area del triangulo es: " + triangulo.calcularArea());
        System.out.println("El perimetro del circulo es: " + triangulo.calcularPerimetro());
        triangulo.determinarTipoTriangulo();
        System.out.println("");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        createShapes(sc);

    }
}
