package Service;

import Entity.Pais;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
import jdk.nashorn.internal.ir.WhileNode;

public class PaisService {

    Scanner sc;
    TreeSet<String> listaPaises;

    public PaisService() {

        sc = new Scanner(System.in).useDelimiter("\n");
        listaPaises = new TreeSet();

    }

    String paisIngresado = "";
    String opcion;

    public void crear() {

        do {

            System.out.println("Ingrese un país, por favor");
            paisIngresado = sc.next();

            listaPaises.add(paisIngresado);

            System.out.println("Desea agregar otro país? (S/N)");
            opcion = sc.next();

            if (opcion.equalsIgnoreCase("n")) {
                mostrar();
            }

        } while (opcion.equalsIgnoreCase("s"));

    }

    public void mostrar() {

        for (String pais : listaPaises) {
            System.out.println(pais);
        }

        // Para mostrarlo ordenado alfabeticamente, le hice los métodos en la clase!!
        // Ver v7, ejemplos del video... con implements, hashSet, etc..
    }

    public boolean buscar() {

        System.out.println("Ingrese país a buscar, por favor");
        String paisBuscado = sc.next();

        return listaPaises.contains(paisBuscado);

    }  // ne teoria esto funciona... me da true si el pais existe!! Y false si no existe.

    public void eliminar() {

        System.out.println("Ingrese el PAIS que desea eliminar de la lista");
        String paisElegido = sc.next();
        boolean flag = false;
        paisElegido = paisElegido.toLowerCase();
        Iterator<String> it = listaPaises.iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(paisElegido)) {
                it.remove();
                flag = true;
            }
        }

        if (!flag) {
            System.out.println("No se puede eliminar, el pais no se encuentra en la lista");
        }

        mostrar();
        
    }

}

//Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos 
//usaremos un conjunto. 
//El programa pedirá un país en un bucle, se guardará el país en el conjunto y después se 
//le preguntará al usuario 
//si quiere guardar otro país o si quiere salir, si decide salir, se mostrará todos los países 
//guardados en el conjunto. 
//(Recordemos hacer los servicios en la clase correspondiente)
//Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar 
//cómo se ordena un conjunto.
//Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, 
//se buscará el país en el conjunto 
//y si está en el conjunto se eliminará el país que ingresó el usuario y se mostrará el conjunto. 
//Si el país no se encuentra en el conjunto se le informará al usuario.
