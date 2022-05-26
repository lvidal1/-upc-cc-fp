package Clase1;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tEntrada, hrs, min, seg;

        System.out.println("Ingrese la cantidad de segundos:");
        tEntrada = sc.nextInt();

        hrs = tEntrada / 3600;
        min = (tEntrada - hrs*3600) / 60;
        seg = tEntrada - (hrs*3600 + min*60);

        System.out.printf("El número de horas son: %d \n", hrs);
        System.out.printf("El número de minutos son: %d \n", min);
        System.out.printf("El número de segundos son: %d \n", seg);

    }
}
