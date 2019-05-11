package com.ordenamientos;

import java.util.Scanner;

public class OrdenamientoBurbuja {

	
	public static void main(String[] args) {
        // TODO code application logic here
            // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int arreglo[],nElementos, aux;
        System.out.println("Ingresa el numero de elementos a ordenar: ");
        nElementos = entrada.nextInt();
        //Asignamos el numero de elementos al tamaño del arreglo
        arreglo = new int[nElementos];
        for(int i=0;i<nElementos;i++)
        {
            System.out.print((i+1)+". Ingresa el numero: ");
            arreglo[i]=entrada.nextInt();
        }
        //imprimimos el arreglo original
        System.out.println("\nEl arreglo original es: ");
        for(int i=0;i<nElementos;i++)
        {
            System.out.print(arreglo[i]+" ");
        }
        System.out.println("\nAplicando metodo burbuja:");
        System.out.println("nElementos-1: "+(nElementos-1));
        //Metodo Burbuja
        
        //iteracion para cuantas vueltas debe dar
        for(int i=0;i<nElementos-1;i++)
        {
        //Iteracion para ordenar los valores
        //nElementos no puede llegar a ser 4, por que la comparacion requeriria un arreglo de
        //6 elementos y marcaria "ArrayIndexOutOfBoundsException", por lo que el ultimo
        //valor permitido es j=3 y por ende j+1=4
            for(int j=0;j<nElementos-1;j++)//iteracion para ordenar los valores
            {
                if(arreglo[j]>arreglo[j+1])//Si numero actual es mayor a numero siguiente
                {
                    aux=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=aux;
                    for(int x:arreglo)
                    {
                        System.out.print(x+" ");
                    }
                    System.out.println("");
                }
            }
        }

        //Mostrando el arreglo ordenado
        System.out.println("Arreglo ordenado crecientemente: ");
        for(int i=0;i<nElementos;i++)
        {
            System.out.print(arreglo[i]+" ");
        }
        System.out.println("");
        
        System.out.println("Arreglo ordenado decrecientemente: ");
        for(int i=(nElementos-1);i>=0;i--)
        {
            System.out.print(arreglo[i]+" ");
        }
        System.out.println("");
    }
}
