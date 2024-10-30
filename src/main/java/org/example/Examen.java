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

    }
}
