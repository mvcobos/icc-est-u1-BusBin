public class Metodo {
    public int[] sortByEdad(int[] personas) {
        for (int i = 0; i < personas. length; i++) {
            for (int j = i + 1; j < personas. length; j++) {
                if (personas[i] > personas[j]){
                    int aux = personas[i];
                    personas [i] = personas [j];
                    personas [j] = aux;
                }
            }
        }
        return personas;
    }

    public int findByEdad (int[] personas, int edad){
        System.out.println();
        int inicio = 0;
        
        int fin = personas.length -1;
        
        int cont = 1; 
        while(inicio <= fin){
            System.out.print("bajo=" + inicio + " ");
            System.out.print("alto=" + fin + " ");
            int medio = inicio + (fin - inicio) / 2;
            System.out.print("valorCentro=" + medio + " ");
            for (int i = 0; i < personas.length; i++) {
                System.out.print("bajo=" + inicio + " ");
                System.out.print("alto=" + fin + " ");
                if (personas[i] == edad){
                    //Elemento encontrado
                    System.out.print("--> ENCONTRADO");
                    System.out.println("La edad se encuentra en la posicion: " + ( i + 1));
                    return i;
                }
                if (personas[i]< edad){
                    System.out.println("--> DERECHA");
                    inicio = medio +1;//Buscar en la mitad de la derecha
                   
                } else {
                    System.out.println("--> IZQUIERDA");
                    fin = medio - 1; //Buscar en la mitad de la izquierda
                 
                }
            }
            cont++;
        }
        return -1;
    }


}
