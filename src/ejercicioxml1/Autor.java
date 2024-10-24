package ejercicioxml1;

import javax.xml.namespace.NamespaceContext;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

/**
 *
 *
 */
public class Autor implements XMLStreamWriter {

    private String codigo;
    private String nome;
    private String  [] titulo;

    public Autor(String codigo, String nome, String [] titulo) {
        this.codigo = codigo;
        this.nome = nome;
        this.titulo = titulo;
    }
    public Autor(){

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String [] getTitulo() {
        return titulo;
    }

    public void setTitulo(String [] titulo) {
        this.titulo = titulo;
    }


    /**
     * Escribe una etiqueta de inicio en la salida. Todos los métodos writeStartElement
     * abren un nuevo ámbito en el contexto interno de nombres. Escribir el
     * correspondiente EndElement causa que el ámbito se cierre.
     *
     * @param localName nombre local de la etiqueta, no puede ser nulo
     * @throws XMLStreamException si ocurre un error
     */
    @Override
    public void writeStartElement(String localName) throws XMLStreamException {

    }

    /**
     * Escribe una etiqueta de inicio en la salida.
     *
     * @param namespaceURI el namespaceURI del prefijo a usar, no puede ser nulo
     * @param localName    nombre local de la etiqueta, no puede ser nulo
     * @throws XMLStreamException si el URI del namespace no ha sido vinculado a un prefijo y
     *                            javax.xml.stream.isRepairingNamespaces no se ha configurado en verdadero
     */
    @Override
    public void writeStartElement(String namespaceURI, String localName) throws XMLStreamException {

    }

    /**
     * Escribe una etiqueta de inicio en la salida.
     *
     * @param prefix       el prefijo de la etiqueta, no puede ser nulo
     * @param localName    nombre local de la etiqueta, no puede ser nulo
     * @param namespaceURI el URI para vincular el prefijo, no puede ser nulo
     * @throws XMLStreamException si ocurre un error
     */
    @Override
    public void writeStartElement(String prefix, String localName, String namespaceURI) throws XMLStreamException {

    }

    /**
     * Escribe una etiqueta de elemento vacío en la salida.
     *
     * @param namespaceURI el URI para vincular la etiqueta, no puede ser nulo
     * @param localName    nombre local de la etiqueta, no puede ser nulo
     * @throws XMLStreamException si el URI del namespace no ha sido vinculado a un prefijo y
     *                            javax.xml.stream.isRepairingNamespaces no se ha configurado en verdadero
     */
    @Override
    public void writeEmptyElement(String namespaceURI, String localName) throws XMLStreamException {

    }

    /**
     * Escribe una etiqueta de elemento vacío en la salida.
     *
     * @param prefix       el prefijo de la etiqueta, no puede ser nulo
     * @param localName    nombre local de la etiqueta, no puede ser nulo
     * @param namespaceURI el URI para vincular la etiqueta, no puede ser nulo
     * @throws XMLStreamException si ocurre un error
     */
    @Override
    public void writeEmptyElement(String prefix, String localName, String namespaceURI) throws XMLStreamException {

    }

    /**
     * Escribe una etiqueta de elemento vacío en la salida.
     *
     * @param localName nombre local de la etiqueta, no puede ser nulo
     * @throws XMLStreamException si ocurre un error
     */
    @Override
    public void writeEmptyElement(String localName) throws XMLStreamException {

    }

    /**
     * Escribe una etiqueta de fin en la salida confiando en el estado interno
     * del escritor para determinar el prefijo y el nombre local
     * del evento.
     *
     * @throws XMLStreamException si ocurre un error
     */
    @Override
    public void writeEndElement() throws XMLStreamException {

    }

    /**
     * Cierra cualquier etiqueta de inicio y escribe las etiquetas de fin correspondientes.
     *
     * @throws XMLStreamException si ocurre un error
     */
    @Override
    public void writeEndDocument() throws XMLStreamException {

    }

    /**
     * Cierra este escritor y libera cualquier recurso asociado con el
     * escritor. Esto no debe cerrar el flujo de salida subyacente.
     *
     * @throws XMLStreamException si ocurre un error
     */
    @Override
    public void close() throws XMLStreamException {

    }

    /**
     * Escribe cualquier dato almacenado en el mecanismo de salida subyacente.
     *
     * @throws XMLStreamException si ocurre un error
     */
    @Override
    public void flush() throws XMLStreamException {

    }

    /**
     * Escribe un atributo en el flujo de salida sin
     * un prefijo.
     *
     * @param localName el nombre local del atributo
     * @param value     el valor del atributo
     * @throws IllegalStateException si el estado actual no permite la escritura de atributos
     * @throws XMLStreamException    si ocurre un error
     */
    @Override
    public void writeAttribute(String localName, String value) throws XMLStreamException {

    }

    /**
     * Escribe un atributo en el flujo de salida.
     *
     * @param prefix       el prefijo para este atributo
     * @param namespaceURI el URI del prefijo para este atributo
     * @param localName    nombre local del atributo
     * @param value        el valor del atributo
     * @throws IllegalStateException si el estado actual no permite la escritura de atributos
     * @throws XMLStreamException    si el URI del namespace no ha sido vinculado a un prefijo y
     *                               javax.xml.stream.isRepairingNamespaces no se ha configurado en verdadero
     */
    @Override
    public void writeAttribute(String prefix, String namespaceURI, String localName, String value) throws XMLStreamException {

    }

    /**
     * Escribe un atributo en el flujo de salida.
     *
     * @param namespaceURI el URI del prefijo para este atributo
     * @param localName    nombre local del atributo
     * @param value        el valor del atributo
     * @throws IllegalStateException si el estado actual no permite la escritura de atributos
     * @throws XMLStreamException    si el URI del namespace no ha sido vinculado a un prefijo y
     *                               javax.xml.stream.isRepairingNamespaces no se ha configurado en verdadero
     */
    @Override
    public void writeAttribute(String namespaceURI, String localName, String value) throws XMLStreamException {

    }

    /**
     * Escribe un namespace en el flujo de salida.
     * Si el argumento de prefijo para este método es una cadena vacía,
     * "xmlns" o nulo, este método delegará en writeDefaultNamespace.
     *
     * @param prefix       el prefijo para vincular este namespace
     * @param namespaceURI el URI para vincular el prefijo
     * @throws IllegalStateException si el estado actual no permite la escritura de namespaces
     * @throws XMLStreamException    si ocurre un error
     */
    @Override
    public void writeNamespace(String prefix, String namespaceURI) throws XMLStreamException {

    }

    /**
     * Escribe el namespace por defecto en el flujo.
     *
     * @param namespaceURI el URI para vincular el namespace por defecto
     * @throws IllegalStateException si el estado actual no permite la escritura de namespaces
     * @throws XMLStreamException    si ocurre un error
     */
    @Override
    public void writeDefaultNamespace(String namespaceURI) throws XMLStreamException {

    }

    /**
     * Escribe un comentario XML con los datos incluidos.
     *
     * @param data los datos contenidos en el comentario, pueden ser nulos
     * @throws XMLStreamException si ocurre un error
     */
    @Override
    public void writeComment(String data) throws XMLStreamException {

    }

    /**
     * Escribe una instrucción de procesamiento.
     *
     * @param target el objetivo de la instrucción de procesamiento, no puede ser nulo
     * @throws XMLStreamException si ocurre un error
     */
    @Override
    public void writeProcessingInstruction(String target) throws XMLStreamException {

    }

    /**
     * Escribe una instrucción de procesamiento.
     *
     * @param target el objetivo de la instrucción de procesamiento, no puede ser nulo
     * @param data   los datos contenidos en la instrucción de procesamiento, no pueden ser nulos
     * @throws XMLStreamException si ocurre un error
     */
    @Override
    public void writeProcessingInstruction(String target, String data) throws XMLStreamException {

    }

    /**
     * Escribe una sección CData.
     *
     * @param data los datos contenidos en la sección CData, no pueden ser nulos
     * @throws XMLStreamException si ocurre un error
     */
    @Override
    public void writeCData(String data) throws XMLStreamException {

    }

    /**
     * Escribe una sección DTD. Esta cadena representa toda la producción doctypedecl
     * de la especificación XML 1.0.
     *
     * @param dtd el DTD a ser escrito
     * @throws XMLStreamException si ocurre un error
     */
    @Override
    public void writeDTD(String dtd) throws XMLStreamException {

    }

    /**
     * Escribe una referencia de entidad.
     *
     * @param name el nombre de la entidad
     * @throws XMLStreamException si ocurre un error
     */
    @Override
    public void writeEntityRef(String name) throws XMLStreamException {

    }

    /**
     * Escribe la declaración XML. Establece la versión XML en 1.0 y la codificación en utf-8
     *
     * @throws XMLStreamException si ocurre un error
     */
    @Override
    public void writeStartDocument() throws XMLStreamException {

    }

    /**
     * Escribe la declaración XML. Establece la versión XML en 1.0 por defecto.
     *
     * @param version versión del documento xml
     * @throws XMLStreamException si ocurre un error
     */
    @Override
    public void writeStartDocument(String version) throws XMLStreamException {

    }

    /**
     * Escribe la declaración XML. Tenga en cuenta que el parámetro de codificación no
     * establece la codificación real del flujo de salida subyacente. Eso debe
     * ser configurado cuando se crea la instancia del XMLStreamWriter utilizando el
     * XMLOutputFactory.
     *
     * @param encoding codificación de la declaración xml
     * @param version  versión del documento xml
     * @throws XMLStreamException si la codificación dada no coincide con la codificación
     *                            del flujo subyacente
     */
    @Override
    public void writeStartDocument(String encoding, String version) throws XMLStreamException {

    }

    /**
     * Escribe texto en la salida.
     *
     * @param text el valor a escribir
     * @throws XMLStreamException si ocurre un error
     */
    @Override
    public void writeCharacters(String text) throws XMLStreamException {

    }

    /**
     * Escribe texto en la salida.
     *
     * @param text  el valor a escribir
     * @param start  el índice del primer carácter
     * @param length la cantidad de caracteres
     * @throws XMLStreamException si ocurre un error
     */
    @Override
    public void writeCharacters(char[] text, int start, int length) throws XMLStreamException {

    }

    /**
     * Gets the prefix the uri is bound to.
     *
     * @param uri the uri the prefix is bound to
     * @return the prefix or null
     * @throws XMLStreamException if an error occurs
     */
    @Override
    public String getPrefix(String uri) throws XMLStreamException {
        return null;
    }

    /**
     * Establece el prefijo al que se vincula la URI. Este prefijo se vincula
     * en el ámbito del par actual de START_ELEMENT / END_ELEMENT.
     * Si este método se llama antes de que se haya escrito un START_ELEMENT,
     * el prefijo se vincula en el ámbito raíz.
     *
     * @param prefix el prefijo a vincular a la URI, no puede ser nulo
     * @param uri    la URI a vincular al prefijo, puede ser nulo
     * @throws XMLStreamException si ocurre un error
     */
    @Override
    public void setPrefix(String prefix, String uri) throws XMLStreamException {

    }

    /**
     * Vincula una URI al namespace por defecto.
     * Esta URI se vincula
     * en el ámbito del par actual de START_ELEMENT / END_ELEMENT.
     * Si este método se llama antes de que se haya escrito un START_ELEMENT,
     * la URI se vincula en el ámbito raíz.
     *
     * @param uri la URI a vincular al namespace por defecto, puede ser nula
     * @throws XMLStreamException si ocurre un error
     */
    @Override
    public void setDefaultNamespace(String uri) throws XMLStreamException {

    }

    /**
     * Establece el contexto de namespaces actual para las vinculaciones de prefijo y URI.
     * Este contexto se convierte en el contexto de namespace raíz para la escritura y
     * reemplazará el contexto de namespace raíz actual. Las llamadas posteriores
     * a setPrefix y setDefaultNamespace vincularán los namespaces utilizando
     * el contexto pasado al método como el contexto raíz para resolver
     * namespaces. Este método solo puede ser llamado una vez al inicio
     * del documento. No provoca que los namespaces sean declarados.
     * Si se encuentra un mapeo de URI a prefijo en el contexto de namespace,
     * se trata como declarado y el prefijo puede ser utilizado
     * por el StreamWriter.
     *
     * @param context el contexto de namespace a usar para este escritor, no puede ser nulo
     * @throws XMLStreamException si ocurre un error
     */
    @Override
    public void setNamespaceContext(NamespaceContext context) throws XMLStreamException {

    }

    /**
     * Devuelve el contexto de namespace actual.
     *
     * @return el NamespaceContext actual
     */
    @Override
    public NamespaceContext getNamespaceContext() {
        return null;
    }

    /**
     * Obtiene el valor de una característica/propriedad de la implementación subyacente.
     *
     * @param name El nombre de la propiedad, no puede ser nulo
     * @return El valor de la propiedad
     * @throws IllegalArgumentException si la propiedad no es soportada
     * @throws NullPointerException     si el nombre es nulo
     */
    @Override
    public Object getProperty(String name) throws IllegalArgumentException {
        return null;
    }


}
