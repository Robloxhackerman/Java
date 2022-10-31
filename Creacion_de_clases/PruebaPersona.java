package Creacion_de_clases;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();

        persona1.nombre = "Pepe";
        persona1.apellido = "Pepin";
        persona1.desplegarInformacion();

        //Persona 2
        Persona persona2 = new Persona();

        persona2.nombre = "Juan";
        persona2.apellido = "Juanin";
        persona2.desplegarInformacion();
    }
}
