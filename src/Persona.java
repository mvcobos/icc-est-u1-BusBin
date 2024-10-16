import java.util.Scanner;

public class Persona {
    public String nombre;
    public int edad;

    public Persona(){
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona(String nombre, int edad){

    }

    public 

    public int leerEnteroValido(Scanner scanner, String mensaje, boolean permitirNegativo){
        int numero;
        do{
            System.out.print(mensaje);
            while(!scanner.hasNextInt()){   //hasNextIn devuelve true si y solo si el valor ingresado es un entero positivo
                System.out.println("Ingrese un entero valido");
                System.out.println(mensaje);
                scanner.next();
            }
            numero = scanner.nextInt();
            if(!permitirNegativo && numero <= 0 ){
                System.out.println("Debe ser entero mayor a 0");
            }
        }while(!permitirNegativo && numero <= 0);
        return numero;
    }

    public String toString(String nombre, int edad){
        return "Nombre:" + nombre + " Edad:" + edad;
    }

    public void printArreglo(String[] arreglo){
        System.out.println("El arreglo de personas es: ");
        for(String elemento : arreglo){           //for each 
            System.out.print(elemento + "  ");     // Imprimir arreglo ingresado
        }
        System.out.println();
    }
    
}
