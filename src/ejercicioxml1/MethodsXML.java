
package ejercicioxml1;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author accesodatos
 */
public class MethodsXML {

    public void writeXMLFile(Autor [] autor, String path){

        XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();

        try{
            XMLStreamWriter xmlStreamWriter = xmlOutputFactory.createXMLStreamWriter(new FileWriter(path));
            xmlStreamWriter.writeStartDocument();
            xmlStreamWriter.writeStartElement("autores");
            for(int i = 0; i < 2; i++){
                xmlStreamWriter.writeStartElement("autor");
                xmlStreamWriter.writeAttribute("codigo", autor[i].getCodigo());
                xmlStreamWriter.writeStartElement("nome");
                xmlStreamWriter.writeCharacters(autor[i].getNome());
                xmlStreamWriter.writeEndElement();


                xmlStreamWriter.writeStartElement("titulo");
                xmlStreamWriter.writeCharacters(autor[i].getTitulo()[0]);
                xmlStreamWriter.writeEndElement();
                xmlStreamWriter.writeStartElement("titulo");
                xmlStreamWriter.writeCharacters(autor[i].getTitulo()[1]);
                xmlStreamWriter.writeEndElement();
                xmlStreamWriter.writeEndElement();

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
