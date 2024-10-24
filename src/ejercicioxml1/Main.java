
package ejercicioxml1;

/**
 * Clase main donde ejecutamos el programa
 * @author cristian
 * @version 1.0
 */
public class Main {

   
    public static void main(String[] args) {
        //hacemos un array de titulos de los libros de autores, 2 en este caso
        String [] auxTitulo1 = {"El conde de montecristo", "Los miserables"};
        String [] auxTitulo2 = {"El idiota", " Noches blancas"};

        //hacemos un array de objetos de los autores
        Autor [] autores = {new Autor("a1", "Alexandre Dumas", auxTitulo1),
        new Autor("a2", "Fiodor Dostoyevski", auxTitulo2)};

        //instanciamos un objeto de la clase de los metodos xml
        MethodsXML methodsXML = new MethodsXML();
        //llamamos al metodo escribir archivo
        methodsXML.writeXMLFile(autores, "autores.xml");
    }
    
}
