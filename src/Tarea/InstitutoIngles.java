package Tarea;
import java.util.Scanner;
public class InstitutoIngles {
    public static void inicio() {
        System.out.println("==========================================");
        System.out.println("============WELCOME|BIENVENIDO============");
        System.out.println("==========================================");
    }

    public static void proceso() {
        System.out.println("------------------------------------------");
        System.out.println("----------------PROCESANDO----------------");
        System.out.println("------------------------------------------");
    }

    public static void fin() {
        System.out.println("==========================================");
        System.out.println("==================SUCCESS=================");
        System.out.println("==========================================");
    }
    public static void main(String[] args) {
        int puntosExamenEscrito;
        int puntosExamenOral;

        inicio();
        System.out.print("Ingrese los puntos del examen escrito: ");
        Scanner pe = new Scanner(System.in);
        puntosExamenEscrito = pe.nextInt();

        System.out.print("Ingrese los puntos del examen oral: ");
        Scanner po = new Scanner(System.in);
        puntosExamenOral = po.nextInt();

        proceso();

        String nivelCalculado = nivelExamenIngles(puntosExamenEscrito,puntosExamenOral);
        double precioCalculado = precioNivel(puntosExamenEscrito,puntosExamenOral);

        System.out.println("El alumno se encuentra en nivel: " + nivelCalculado);
        System.out.printf("El costo a pagar por el curso es: S/%.2f \n", precioCalculado);

        fin();
    }

    public static String nivelExamenIngles(int puntosExamenEscrito, int puntosExamenOral) {
        String nivelExamenEscrito = "";

        if(puntosExamenEscrito > 90 && puntosExamenOral > 75) {
            nivelExamenEscrito = "Avanzado";
        }else if (puntosExamenEscrito > 75 && puntosExamenOral >=  50) {
            nivelExamenEscrito = "Intermedio";
        }else if (puntosExamenEscrito <= 50 && puntosExamenOral < 50) {
            nivelExamenEscrito = "Basico";
        }

        return nivelExamenEscrito;
    }

    public static double precioNivel(int pE, int pO) {
        double precioCalculado = 0;

        String nivel = nivelExamenIngles(pE, pO);
        switch (nivel.toUpperCase()) {
            case "BASICO":
                if(pE > 30 && pO > 30) {
                    precioCalculado = 160.00;
                }else {
                    precioCalculado = 180.00;
                }
                break;
            case "INTERMEDIO":
                if(pE > 65 && pO > 65) {
                    precioCalculado = 200.00;
                }else {
                    precioCalculado = 220.00;
                }
                break;
            case "AVANZADO":
                if(pE > 95 && pO > 95) {
                    precioCalculado = 220.00;
                }else {
                    precioCalculado = 250.00;
                }
                break;
            default:
                break;
        }

        return precioCalculado;
    }

}

