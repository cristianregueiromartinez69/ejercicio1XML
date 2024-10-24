
package ejercicioxml1;


public class Main {

   
    public static void main(String[] args) {
        String [] auxTitulo1 = {"El conde de montecristo", "Los miserables"};
        String [] auxTitulo2 = {"El idiota", " Noches blancas"};
        Autor [] autores = {new Autor("a1", "Alexandre Dumas", auxTitulo1),
        new Autor("a2", "Fiodor Dostoyevski", auxTitulo2)};

        MethodsXML methodsXML = new MethodsXML();
        methodsXML.writeXMLFile(autores, "autores.xml");
    }
    
}
