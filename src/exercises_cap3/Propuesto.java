/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises_cap3;

import java.util.Scanner;

/**
 *
 * @author cedbo
 */
public class Propuesto {

    public static boolean isTriangle(double a, double b, double c) {
        return a + b > c && b + c > a && a + c > b;
    }

    public static void createEmployee(Scanner sc) {
        String id, name;
        int hoursPerMonth;
        double hourValue, percentageRetention;

        System.out.println("+------------------------+");
        System.out.println("|  CREACION DE EMPLEADO  |");
        System.out.println("+------------------------+");

        System.out.print("Ingresa el id del empleado: ");
        id = sc.nextLine().toUpperCase();
        System.out.print("Ingresa el nombre del empleado: ");
        name = sc.nextLine().toUpperCase();
        System.out.print("Ingresa el numero de horas trabajadas por el empleado: ");
        hoursPerMonth = sc.nextInt();
        System.out.print("Ingresa el valor de hora trabajada: ");
        hourValue = sc.nextDouble();
        System.out.print("Ingresa porcentaje de retencion de fuente: ");
        percentageRetention = sc.nextDouble();
        System.out.println("");

        Employee newEmployee = new Employee(id, name, hoursPerMonth, hourValue, percentageRetention);
        newEmployee.infoEmployee();

    }

    public static void equilateralTriangle(Scanner sc) {
        System.out.print("Digite la medida del lado del triangulo: ");
        double side = sc.nextDouble();

        double perimeter = 3 * side;
        double height = side * (Math.sqrt(3) / 2);
        double area = (height * side) / 2;

        System.out.println("+-----------------------------+");
        System.out.println("|  Informacion del triangulo  |");
        System.out.println("+-----------------------------+");

        System.out.println(
                "Perimetro: " + perimeter
                + "\nAltura: " + height
                + "\nArea: " + area
        );
    }

    public static void overallTriangle(Scanner sc) {
        System.out.print("Digite el valor del lado #1: ");
        double a = sc.nextDouble();
        System.out.print("Digite el valor del lado #2: ");
        double b = sc.nextDouble();
        System.out.print("Digite el valor del lado #3: ");
        double c = sc.nextDouble();

        if (isTriangle(a, b, c)) {
            double perimeter = a + b + c;
            double semiperimeter = (a + b + c) / 2;
            double area = Math.sqrt(semiperimeter * (semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c));

            System.out.println("+-----------------------------+");
            System.out.println("|  Informacion del triangulo  |");
            System.out.println("+-----------------------------+");

            System.out.println(
                    "Perimetro: " + perimeter
                    + "\nSemiperimetro: " + semiperimeter
                    + "\nArea: " + area
            );
        } else {
            System.out.println("ERROR: ");
            System.out.println("No es posible trazar un triangulo con las medidas dadas");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // EJERCICIO 18
        //createEmployee(sc);

        // EJERCICIO 19
        //equilateralTriangle(sc);
        
        // EJERCICIO 21
        //overallTriangle(sc);
    }

}
