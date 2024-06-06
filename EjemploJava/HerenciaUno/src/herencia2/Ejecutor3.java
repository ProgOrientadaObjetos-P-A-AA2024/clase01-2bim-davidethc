/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

import java.util.Locale;
import java.util.Scanner;
import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;

/**
 *
 * @author reroes
 */
public class Ejecutor3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Ingrese la opción que desee:");
        System.out.println("1. Si desea un objeto tipo Estudiante Distancia");
        System.out.println("2. Si desea un objeto tipo Estudiante Presencial");

        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Creando objeto tipo Estudiante Distancia...");
                entrada.nextLine(); // Limpiar el buffer del Scanner

                System.out.println("Ingrese nombres:");
                String nombres = entrada.nextLine();
                System.out.println("Ingrese apellidos:");
                String apellidos = entrada.nextLine();
                System.out.println("Ingrese identificación:");
                String identificacion = entrada.nextLine();
                System.out.println("Ingrese edad:");
                int edad = entrada.nextInt();
                System.out.println("Ingrese número de asignaturas:");
                int asignaturas = entrada.nextInt();
                System.out.println("Ingrese costo asignatura:");
                double costoAsignatura = entrada.nextDouble();

                EstudianteDistancia estudianteDistancia = new EstudianteDistancia();
                estudianteDistancia.establecerNombresEstudiante(nombres);
                estudianteDistancia.establecerApellidoEstudiante(apellidos);
                estudianteDistancia.establecerEdadEstudiante(edad);
                estudianteDistancia.establecerIdentificacionEstudiante(identificacion);
                estudianteDistancia.establecerNumeroAsginaturas(asignaturas);
                estudianteDistancia.establecerCostoAsignatura(costoAsignatura);
                estudianteDistancia.calcularMatriculaDistancia();

                System.out.println(estudianteDistancia);
                break;

            case 2:
                System.out.println("Creando objeto tipo Estudiante Presencial...");
                entrada.nextLine(); // Limpiar el buffer del Scanner

                System.out.println("Ingrese nombres:");
                nombres = entrada.nextLine();
                System.out.println("Ingrese apellidos:");
                apellidos = entrada.nextLine();
                System.out.println("Ingrese identificación:");
                identificacion = entrada.nextLine();
                System.out.println("Ingrese edad:");
                edad = entrada.nextInt();
                System.out.println("Ingrese número de creditos:");
                asignaturas = entrada.nextInt();
                System.out.println("Ingrese costo asignatura:");
                double costoCredito = entrada.nextDouble();

                EstudiantePresencial estudiantePresencial = new EstudiantePresencial();
                estudiantePresencial.establecerNombresEstudiante(nombres);
                estudiantePresencial.establecerApellidoEstudiante(apellidos);
                estudiantePresencial.establecerEdadEstudiante(edad);
                estudiantePresencial.establecerIdentificacionEstudiante(identificacion);
                estudiantePresencial.establecerNumeroCreditos(asignaturas);
                estudiantePresencial.establecerCostoCredito(costoCredito);
                estudiantePresencial.calcularMatriculaPresencial();

                System.out.println(estudiantePresencial);
                break;

            default:
                System.out.println("Opción no válida");
        }
    }
}
