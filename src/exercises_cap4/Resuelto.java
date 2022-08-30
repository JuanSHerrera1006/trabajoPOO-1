/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises_cap4;

import java.util.Scanner;

/**
 *
 * @author Canned
 */
public class Resuelto {

    public static void salesRecord(Scanner sc) {

        System.out.println("+-----------------------------------+");
        System.out.println("|  CALCULO DE SALARIO DE EMPLEADOS  |");
        System.out.println("+-----------------------------------+");

        System.out.print("Ingrese el valor de las ventas del departamento 1: ");
        double salesDep1 = sc.nextDouble();
        System.out.print("Ingrese el valor de las ventas del departamento 2: ");
        double salesDep2 = sc.nextDouble();
        System.out.print("Ingrese el valor de las ventas del departamento 3: ");
        double salesDep3 = sc.nextDouble();
        System.out.print("Ingrese el salario general de los empleados: ");
        double salary = sc.nextDouble();

        double salaryDep1 = salary;
        double salaryDep2 = salary;
        double salaryDep3 = salary;

        double totalSales = salesDep1 + salesDep2 + salesDep3;
        double salesPer = totalSales * 0.33;

        if (salesDep1 > salesPer) {
            salaryDep1 += salary * 0.2;
        }

        if (salesDep2 > salesPer) {
            salaryDep2 += salary * 0.2;
        }

        if (salesDep3 > salesPer) {
            salaryDep3 += salary * 0.2;
        }

        System.out.println("");
        System.out.println("RESUMEN DE SALARIOS: ");
        System.out.println(
                "Salario de empleados de departamento 1: " + salaryDep1
                + "\nSalario de empleados de departamento 2: " + salaryDep2
                + "\nSalario de empleados de departamento 3: " + salaryDep3
        );
    }

    public static void spheresDiff(Scanner sc) {

        System.out.println("+--------------------+");
        System.out.println("|  ESFERA DIFERENTE  |");
        System.out.println("+--------------------+");

        System.out.print("Digite el peso de la esfera a: ");
        double a = sc.nextDouble();
        System.out.print("Digite el peso de la esfera b: ");
        double b = sc.nextDouble();
        System.out.print("Digite el peso de la esfera c: ");
        double c = sc.nextDouble();
        System.out.print("Digite el peso de la esfera d: ");
        double d = sc.nextDouble();

        String ans = "";

        if (a == b && a == c) {
            ans += d > a ? "D es de mayor peso" : "D es de menor peso";

        } else if (a == b && a == d) {
            ans += c > a ? "C es de mayor peso" : "C es de menor peso";

        } else if (a == c && a == d) {
            ans += b > a ? "B es de mayor peso" : "B es de menor peso";

        } else {
            ans += d > a ? "A es de mayor peso" : "A es de menor peso";
        }
        System.out.println(ans);
    }

    public static void maxNumb(Scanner sc) {

        System.out.println("+----------------+");
        System.out.println("|  NUMERO MAYOR  |");
        System.out.println("+----------------+");

        System.out.print("Eliga el valor del numero a: ");
        double a = sc.nextDouble();
        System.out.print("Eliga el valor del numero b: ");
        double b = sc.nextDouble();
        System.out.print("Eliga el valor del numero c: ");
        double c = sc.nextDouble();

        double max = 0;
        if (a > b && a > c) {
            max = a;
        } else if (b > c) {
            max = b;
        } else {
            max = c;
        }

        System.out.printf("El mayor numero entre %.2f - %.2f - %.2f es: %.2f\n", a, b, c, max);

    }

    public static void tuitionPayment(Scanner sc) {

        System.out.println("+----------------------------------+");
        System.out.println("|  VALOR LIQUIDACION DE MATRICULA  |");
        System.out.println("+----------------------------------+");

        System.out.print("Ingrese su número de registro: ");
        String regNumber = sc.nextLine();
        System.out.print("Ingrese su nombre: ");
        String name = sc.nextLine().toUpperCase();
        System.out.print("Ingrese el patrimonio: ");
        double heritage = sc.nextDouble();
        System.out.print("Ingrese su estrato social: ");
        int socialStrata = sc.nextInt();

        double payment = socialStrata > 3 && heritage > 2000000 ? 50000 + heritage * 0.03 : 50000;
        System.out.println("");
        System.out.println("RESUMEN DE INFORMACION DEL ESTUDIANTE");
        System.out.println(
                "Numero de inscripcion: " + regNumber
                + "\nNombre: " + name
                + "\nValor a pagar por matricula: " + payment + " COP"
        );
    }

    public static void workedHours(Scanner sc) {

        System.out.println("+---------------------------+");
        System.out.println("|  HORAS EXTRAS TRABAJADAS  |");
        System.out.println("+---------------------------+");

        System.out.print("Ingrese el nombre del trabajador: ");
        String name = sc.nextLine().toUpperCase();
        System.out.print("Ingrese el numero de horas trabajadas: ");
        double wHours = sc.nextDouble();
        System.out.print("Ingrese el valor de la hora: ");
        double mPerHour = sc.nextDouble();
        double extraHours, netGains;
        if (wHours > 40) {
            extraHours = (wHours - 40);
            if (extraHours > 8) {
                netGains = 40 * mPerHour + (16 * mPerHour) + (3 * mPerHour * (extraHours - 8));
            }
            netGains = 40 * mPerHour + (2 * mPerHour * extraHours);

        } else {
            netGains = wHours * mPerHour;
        }
        System.out.println("");
        System.out.println("RESUMEN DE INFORMACION DEL TRABAJADOR");
        System.out.println(
                "Nombre: " + name
                + "\nGanancia neta por semana: " + netGains + " COP"
        );
    }

    public static void storeDiscount(Scanner sc) {

        final String VERDE = "VERDE";
        final String AMARILLA = "AMARILLA";
        final String AZUL = "AZUL";
        final String ROJA = "ROJA";

        System.out.println("+---------------------+");
        System.out.println("|  PROMOCIÓN ALMACEN  |");
        System.out.println("+---------------------+");

        System.out.print("Ingrese el valor total de su compra: ");
        double total = Double.parseDouble(sc.nextLine());
        System.out.print("Ingrese el color de la bola obtenida: ");
        String color = sc.nextLine().toUpperCase();
        double discount = 0;

        switch (color) {
            case (VERDE):
                discount = 0.1;
                break;
            case (AMARILLA):
                discount = 0.25;
                break;
            case (AZUL):
                discount = 0.5;
                break;
            case (ROJA):
                discount = 1;
                break;
            default:
                discount = 0;
        }

        total = total - total * discount;
        System.out.println("Se ha aplicado un descuento de: " + (discount * 100) + "%");
        System.out.println("El valor de su compra es: " + total + " COP");
    }

    public static void diff2Numbs(Scanner sc) {

        System.out.println("+-----------------------------+");
        System.out.println("|  NUMERO MAYOR (DOS NUMEROS) |");
        System.out.println("+-----------------------------+");

        System.out.print("Digite el valor del numero a: ");
        double a = sc.nextDouble();
        System.out.print("Digite el valor del numero b: ");
        double b = sc.nextDouble();

        if (a > b) {
            System.out.println("A es mayor que B");
        } else if (a == b) {
            System.out.println("A es igual que B");
        } else {
            System.out.println("A es menor que B");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // EJERCICIO 7
        // diff2Numbs(sc);
        // EJERCICIO 10
        // tuitionPayment(sc);
        // EJERCICIO 11
        // maxNumb(sc);
        // EJERCICIO 12
        // storeDiscount(sc);
        // EJERCICIO 13
        // workedHours(sc);
        // EJERCICIO 14
        // salesRecord(sc);
        // EJERCICIO 15
        // spheresDiff(sc);
    }
}
