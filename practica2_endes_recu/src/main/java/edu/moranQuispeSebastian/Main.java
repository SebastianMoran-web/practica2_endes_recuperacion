package edu.moranQuispeSebastian;
import entities.Alumno;


/**
 *Clase principal donde se pueden ver el uso de los getters y los setters
 * y como usa la información dada en los métodos estaticos
 */

public class Main {

    /**
     * Es el punto de inicio de ejecución del código
     * el resultado será una recopilación de la información dada y con los resultados
     * de los métodos estaticos
     * @param args
     */
    public static void main(String[] args) {

        Alumno a = new Alumno();
        a.setNombre("Sebas");
        a.setApellido("Moran");
        a.setEdad(18);
        a.setGrado("Grado Superior de DAW");
        a.setNacionalidad("Española");
        a.setEmail("moransebas72@gmail.com");
        a.setPeso(102.00);
        a.setAltura(1.83);

    System.out.println("Nombre:" + a.getNombre());
    System.out.println("Apellido:" + a.getApellido());
    System.out.println("Edad:" + a.getEdad() + " Años");
    System.out.println("Grado:" + a.getGrado());
    System.out.println("Nacionalidad:" + a.getNacionalidad());
    System.out.println("Email:" + a.getEmail());
    System.out.println("Peso:" + a.getPeso() + " Kilogramos");
    System.out.println("Altura:" + a.getAltura() + " Metros");

    // Método para saber si el alumno es menor o mayor e edad

        boolean mayorDeEdad = Alumno.mayorDeEdad(a.getEdad());


     // Método para calcular el IMC
        double imc = Alumno.imc(a.getPeso(), a.getAltura());
        System.out.println("IMC:" + imc);

    }



}