//para agrupar en el paquete y poder usar las clases de otros directorios
//package java2_operacionesGeometricas;

import java.util.Scanner;
import java.util.Arrays;
//para importar y poder usar las clases de operacionesCuadrado
import com.zubiri.geometria.Circulo;
import com.zubiri.geometria.Cuadrado;

/*
OperacionesCirculo eta OperacionesCuadrado direktorio ezberdin batean daudenez claspatharen bidez erakutxi behar zaio nun dauden
CLASSPATH=:/home/zubiri/Proyectosjava/; export CLASSPATH


*/

// para importar y poder usar las clases de operacionesCirculo
//import java2_operacionesGeometricas.com.zubiri.geometria.java2_operacionesCirculoget.src.*;



public class OperacionesGeometricas {

	public static void main(String[] args) 
	{
		
		String tipo1 = " ";

		Scanner sc = new Scanner(System.in);
		System.out.print("\nIngresa el nombre de la figura (cuadrado (R) / circulo (C) / Salir (S) ");
		System.out.print("\n ");
		
		tipo1 = sc.next();

		
		char tipo = tipo1.charAt(0);


		
		while (tipo !='s'){

	
		
		
		System.out.print("ha elegido "+ tipo);
		System.out.print("\n ");
          


		
	//comprara la variable tipo para saber que numero se ha introducido (ya puede ser usado operacionesCuadrado y operacionesCirculo
	//por que ya sido importados)
		
		if (tipo == 'R')		
		{
			double ancho;
          		double alto;
			double result;
	 		double perimetro;	  
	  		double area;
			
			Scanner scn = new Scanner(System.in);
        		System.out.print("\ningresa la altura: ");
         		alto = scn.nextDouble();
	  		System.out.print("\ningresa la anchura: ");
	  		ancho = scn.nextDouble();


			Cuadrado cuadrado = new Cuadrado(ancho, alto);
			

			perimetro =  cuadrado.perimetro(ancho, alto);
	 		System.out.println("La perimetro es: " + perimetro); 
			
	  		area =  cuadrado.area(ancho, alto);
	  		System.out.println("El area es: " + area); 
		}

		else if (tipo == 'C')
			{	
			double radio;
			double resultadoDiametro;
			double resultadoArea;
	
			System.out.print("\ningresa la radio de la circunferencia en cm: ");
			radio = sc.nextInt();

			Circulo circulo = new Circulo(radio);
			
			resultadoDiametro = circulo.circun();
			resultadoArea = circulo.area();

			System.out.println("\nEl del diametro de la circunferencia es: " + resultadoDiametro +"cm");
			System.out.println("\nEl área de la circunferencia es: " + resultadoArea + "cm²");

		}
		else 
		{ 
			System.out.print("no esta disponible esta figura geometrica ");
			System.out.print("\n ");
		}
		
		System.out.print("\nLa operación ha terminado, ¿que quieres hacer? (cuadrado (R) / circulo (C) / Salir (S) ");
		System.out.print("\n ");

		tipo1 = sc.next();

		tipo = tipo1.charAt(0);

		}

		
	}
}



		

