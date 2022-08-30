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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // EJERCICIO 10
        // tuitionPayment(sc);
        // EJERCICIO 12
        // storeDiscount(sc);
        // EJERCICIO 13
        // workedHours(sc);
    }
}
