package org.example;

import java.util.Random;
import java.util.Scanner;

public class Examen {
    public void Ejercicio1(){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numRamdon = 0; // Creo las variables
        int numUsuario= 0;
        numRamdon = random.nextInt(100)+1; // le meto un numero random entre el 1 y el 100
        System.out.println("Acabo de pensar un número [0-100]… ¿puedes adivinarlo? ¡Tienes 10 intentos!");
        for(int i = 1; i <= 10; i++) // El for se va a ejecutar 10 como maximo pero si adivina el numero saldra del bucle por el break
        {
            System.out.println("Intento "+ i +". Introduce un número: "); // Pido numero por teclado
            numUsuario = sc.nextInt(); // Leo numero por teclado

            if (numUsuario == numRamdon) // Si el numero es igual al numero Random
            {
                System.out.println("¡HAS ACERTADO! El número era "+ numRamdon + ".");
                break; // Termino el bucle
            } else if (numUsuario > numRamdon){ // Si es mayor
                System.out.println("Tu número es mayor al que he pensado.");
            }else{ // Si es menor
                System.out.println("Tu número es menor al que he pensado.");
            }
        }
    }
    public void Ejercicio2(){
        Scanner sc = new Scanner(System.in);
        int anoActual = 2024; // Creo las variables
        int anoElegido= 0;

        while (anoElegido < 1900 || anoElegido > anoActual){ // Para comprobar que el año sea entre 1900 y el año actual
            System.out.println("Escriba un año entre el 1900 y el año actual: ");
            anoElegido = sc.nextInt();
            if (anoElegido < 1900 || anoElegido > anoActual) // Si no esta dentro del rango muestro el mensaje de error
            {
                System.out.println("Ese numero no esta entre el 1900 y eñ año actual");
            }
        }
        int numAnosBisiestos = 0; // Contador de años bisiestos

        for (int i = anoElegido; i <= anoActual; i ++) // El bucle se va a ejecutar para pasar por cada año desde el año elegido asta el año actual
        {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 100 == 0 && i % 400 == 0)) // Condicion si es divisible entre 4 pero no entre 100 o si es divisible entre 400 y tambien entre 100
            {
                numAnosBisiestos++; // Sumo si se cumple la condicion y por tanto el año es bisiesto
            }
        }
        System.out.println("Ha habido "+numAnosBisiestos+" años bisiestos."); // Muestro el numero de años bisiestos

    }
}
