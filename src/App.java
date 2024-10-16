import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); 
        Persona persona = new Persona();

        int cantidadPersonas = persona.leerEnteroValido(scanner, "Ingrese la cantidad de personas: ", false);
        Persona[] personas = new Persona[cantidadPersonas]; //Persona[] hace que los objetos ingresados sean del tipo Persona
        scanner.nextLine();

        personas[0] = new Persona("Juan", 20);
        
        //PEDIR DATOS DE LA PERSONA
        for(int i = 0; i < personas.length; i++){
            System.out.println("Ingrese persona:");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            int edad = persona.leerEnteroValido(scanner, "Edad:", false);
            scanner.nextLine();
            personas[i] = new Persona(nombre, edad);
        }

        for(int j = 0; j < personas.length; j++){
            System.out.print(persona.getEdad() + "|");
        }




       
       scanner.close();
    }
}
