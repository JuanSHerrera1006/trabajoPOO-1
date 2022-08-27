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
        
        System.out.println("Ingrese su número de registro: ");
        int regNumber = sc.nextInt();
        System.out.println("Ingrese su nombre: ");
        String name = sc.nextLine().toUpperCase();
        System.out.println("Ingrese el Patrimonio: ");
        double heritage = sc.nextDouble();
        System.out.println("Ingrese su Estrato social: ");
        int socialStrata = sc.nextInt();
        
        double payment = 50000;
        if(socialStrata > 3 && heritage > 2000000){
            payment = payment + heritage*0.03;
        } System.out.println("Estudiante: "+name+", con la inscripcion | "+regNumber+" | ...");
        System.out.println("Tiene su pago de matricula con valor: "+payment+"$...");
}   
    
    public static void workedHours(Scanner sc){
        
        System.out.println("+---------------------------+");
        System.out.println("|  HORAS EXTRAS TRABAJADAS  |");
        System.out.println("+---------------------------+");
        
        System.out.println("Ingrese el nombre del trabajador: ");
        String name = sc.nextLine();
        System.out.println("Ingrese ehoras trabajadas: ");
        double wHours = sc.nextDouble();
        System.out.println("Ingrese el valor de hora: ");
        double mPerHour = sc.nextDouble();
        double extraHours, netGains;
        if(wHours > 40){
            extraHours = (wHours - 40);
            if(extraHours > 8){
                netGains = 40*mPerHour+(16*mPerHour)+(3*mPerHour*(extraHours-8));
            }
            netGains = 40*mPerHour+(2*mPerHour*extraHours);
            
        }else netGains = wHours*mPerHour;
        System.out.println("El trabajor tiene una ganancia neta por semana de: "+netGains+"$ pesos...");
        }
    
    
    public static void storeDiscount(Scanner sc){
        
        System.out.println("+---------------------+");
        System.out.println("|  PROMOCIÓN ALMACEN  |");
        System.out.println("+---------------------+");
        
        System.out.println("Ingrese el valor total de su compra: ");
        double total = sc.nextDouble();
        System.out.println("Ingrese el color de la bola obtenida: ");
        String color = sc.next().toUpperCase();
        double discount = 0;
        
        if(color.equals("VERDE")){
            discount = 0.01;
        }else if(color.equals("AMARILLA")){
            discount = 0.025;
        }else if(color.equals("AZUL")){
            discount = 0.05;
        }else if(color.equals("ROJA")){
            total = 0;
        }total = total - total*discount;
        System.out.println("Por el descuento aplicado su compra tiene un valor de :");
        System.out.println(total+"$ pesos...");
    }
}

    