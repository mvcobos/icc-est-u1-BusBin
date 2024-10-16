import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); 
        Persona persona = new Persona();
        Metodo metodo = new Metodo();


        int cantidadPersonas = persona.leerEnteroValido(scanner, "Ingrese la cantidad de personas: ", false);
        Persona[] personasArreglo = new Persona[cantidadPersonas]; //Persona[] hace que los objetos ingresados sean del tipo Persona
        scanner.nextLine();
        
        int[] edades = new int [cantidadPersonas];

        //PEDIR DATOS DE LA PERSONA
        for(int i = 0; i < personasArreglo.length; i++){
            System.out.println("Ingrese persona:");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            int edad = persona.leerEnteroValido(scanner, "Edad:", false);
            edades[i] = edad;
            scanner.nextLine();
            personasArreglo[i] = new Persona(nombre, edad);
        }

        for(int j = 0; j < cantidadPersonas; j++){
            System.out.print(edades[j] + "|");
        }
        System.out.println();

        int edadBuscar = persona.leerEnteroValido(scanner, "ingrese la edad a buscar: ", false);
        int[] arregloOrdenadoPersona = metodo.sortByEdad(edades);
        metodo.findByEdad(arregloOrdenadoPersona, edadBuscar);

        
    }
}
