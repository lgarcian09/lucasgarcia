package Ej2;

import java.util.Scanner;

public class Principal {
	public static Scanner entrada = new Scanner(System.in);
	public static int numP = 0;
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			PC [] PC = new PC [5]; //Creacion del array
			
			String nombre; //Definicion de variable para escribir el nombre del pc
			
			int n; //Definion de una variable de tipo entero para el switch.
			
			do {
				//Realizamos un menú para los casos que quiera realizar el usuario.
				
				System.out.println("Op -1.Introducir PC.");
				
				System.out.println("\nOp -2.Mostrar todos los PCs.");
				
				System.out.println("\nOp -3.Buscar PC .");
				
				System.out.println("\nOp -4.Modificar modelo del PC.");
				
				System.out.println("\nOp -5.Salir.");
				
				System.out.println("\n¿Qué deseas hacer?");
				n = entrada.nextInt();//Le pedimos al usuario que nos introduzca un numero comprendido entre los casos 
				
				switch(n) {
				
				case 1: 
						insertarPC(PC);
					break;
				
				case 2:
						mostrarPC(PC);
					break;
				
				case 3:
					if(numP > 0) {
						buscarPC(PC);
					}
					break;
				
				case 4:
					modificarPC(PC);
					break;
					
				case 5: 
					salirPC(PC);
					break;
				
				}
			}while(n > 0);
			
	}
		/**
		 * He creado el metodo insertarPC, para guardar en nuestro array el modelo y el identificador
		 * de dichos PCs
		 * Tambien he creado un if, cuando este, esté lleno que no le metas mas PCs
		 * @param PC
		 */
		public static void insertarPC(PC [] PC) {
			
			
				if(numP < PC.length) {
					
					System.out.println("Introduce el identificador del ordenador");
					String identificador = entrada.next();
					
					System.out.println("Introduce el modelo del ordenador");
					String modelo = entrada.next();
					
					PC[numP] = new PC(identificador, modelo);
					
					numP++;
				}else {
					System.out.println("Se ha llenado el cupo");
				}
				
		}
		
		public static void mostrarPC(PC [] PC) {
			
			for(int i = 0;i < numP;i++) {
				
				System.out.println(PC[i]);
			}
		}
		/**
		 * He creado el metodo buscarPC, para encontrar el ordenador que el usuario quiera buscar
		 * He realizado un while para decirle a traves de un booleano, si el ordenador que está buscando está o no
		 * @param PC
		 */
		public static void buscarPC(PC [] PC) {
			int n = 0;
			boolean encontrado = false;
			
			System.out.println("¿Que ordenador quieres buscar?");
			String buscar = entrada.next();
			
			while(n < PC.length && !encontrado) {
				if(PC[n].getIdentificador().equals(buscar)) {
					
					encontrado = true;
					
				}
				n++;
			}
			
			if(encontrado = false) {
				System.out.println("No hemos encontrado el ordenador");
				
			}else if(encontrado = true) {
				System.out.println("Enhorabuena hemos encontrado el ordenador");
			}
		}
		/**
		 * he creado el metodo modificarPC, para cambiarle el nombre del pc que hemos introducido anteriormente
		 * @param PC
		 */
		public static void modificarPC(PC [] PC) {
			
			System.out.println("Introduce el identificador del PC");
			String identificador = entrada.next();
			
			for(int i = 0; i < numP; i++) {
				if(PC[i].getIdentificador().equals(identificador)) {
					
					System.out.println("¿Que nombre quieres ponerle?");
					String nombre = entrada.next();
					
					PC[i].setModelo(nombre);
					
					System.out.println("El nuevo modelo es " + PC[i].getModelo());
				}
			}
		}
		/**
		 * He creado el metodo salirPC, para que una vez pulsado el caso 5, salga del programa
		 * Tambien he utilizado el system.exit(), para establecerle la funcion salir
		 * @param PC
		 */
		public static void salirPC(PC [] PC) {
			
			System.out.println("El programa ha finalizado");
			System.exit(0);
		}
}
		

