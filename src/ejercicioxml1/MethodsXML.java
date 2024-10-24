
package ejercicioxml1;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Clase con el metodo para escribir en un fichero xml desde java
 * @author cristian
 * @version 1.0
 */
public class MethodsXML {

    /**
     * Método que escribe en un fichero xml
     * @param autor el array de autores
     * @param path el path del xml
     */
    public void writeXMLFile(Autor [] autor, String path){

        //instanciamos un objeto de tipo XMLOutputFactory para escribir
        XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();

        try{
            /**
             * Dentro del try-catch, para manejar las excepciones, hacemos lo siguiente
             * 1. instanciamos un objeto de tipo XMLStreamWriter y llamamos al metodo que crea el xml createXMLStreamWriter, por parámetro pasamos el path
             * 2. iniciamos el documento con writeStartDocument();
             * 3. este metodo writeStartElement(nombre) sirve para poner el elemento raiz de nuestro xml
             */
            XMLStreamWriter xmlStreamWriter = xmlOutputFactory.createXMLStreamWriter(new FileWriter(path));
            xmlStreamWriter.writeStartDocument();
            xmlStreamWriter.writeCharacters("\n");
            xmlStreamWriter.writeStartElement("autores");

            /**
             * bucle for de 2 vueltas ya que nos piden escribirlo 2 veces
             */
            for(int i = 0; i < autor.length; i++){

                xmlStreamWriter.writeCharacters("\n");
                xmlStreamWriter.writeStartElement("autor");
                xmlStreamWriter.writeAttribute("codigo", autor[i].getCodigo());
                xmlStreamWriter.writeCharacters("\n");
                xmlStreamWriter.writeStartElement("nome");
                xmlStreamWriter.writeCharacters(autor[i].getNome());
                xmlStreamWriter.writeEndElement();
                xmlStreamWriter.writeCharacters("\n");
                xmlStreamWriter.writeStartElement("titulo");
                xmlStreamWriter.writeCharacters(autor[i].getTitulo()[0]);
                xmlStreamWriter.writeEndElement();
                xmlStreamWriter.writeCharacters("\n");
                xmlStreamWriter.writeStartElement("titulo");
                xmlStreamWriter.writeCharacters(autor[i].getTitulo()[1]);
                xmlStreamWriter.writeEndElement();
                xmlStreamWriter.writeCharacters("\n");
                xmlStreamWriter.writeEndElement();
                xmlStreamWriter.writeCharacters("\n");


            }
            xmlStreamWriter.writeEndElement();
            xmlStreamWriter.close();
            System.out.println("Fichero escritor correctamente");

        }catch(IOException IOex){
            System.out.println("ups, no se ha encontrado el fichero");
        }catch(XMLStreamException xmlEx){
            System.out.println("Ups, ha ocurrido un error al operar con el fichero xml");
        }


    }
    
}
