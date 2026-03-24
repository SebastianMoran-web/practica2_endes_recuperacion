package edu.moranQuispeSebastian;
import entities.alumno;

public class Main {
    public static void main(String[] args) {

        alumno a = new alumno();
        a.setNombre("Sebas");
        a.setApellido("Moran");
        a.setEdad(18);
        a.setGrado("Drado Superior de DAW");
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

    // Metodo para saber si el alumno es menor o mayor e edad

        boolean mayorDeEdad = alumno.mayorDeEdad(a.getEdad());

        double imc = alumno.imc(a.getPeso(), a.getAltura());
        System.out.println("IMC:" + imc);

    }



}