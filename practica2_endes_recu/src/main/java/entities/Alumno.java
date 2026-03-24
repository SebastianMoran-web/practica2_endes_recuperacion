package entities;

public class Alumno {

    private String nombre;
    private String apellido;
    private int edad;
    private String grado;
    private String nacionalidad;
    private String email;
    private double peso;
    private double altura;

    // constructor sin atributos

    public Alumno() {

        this.nombre = "Sin nombre";
        this.apellido = "Sin apellido";
        this.edad = 0;
        this.grado = "No especificado";
        this.nacionalidad = "No especificada";
        this.email = "Sin mail";
        this.peso = 0.0;
        this.altura = 0.0;
    }

    //constructor con los atributos

    public Alumno(String nombre, String apellido, int edad, String grado, String nacionalidad, String email, double peso, double altura) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.grado = grado;
        this.nacionalidad = nacionalidad;
        this.email = email;
        this.peso = peso;
        this.altura = altura;
    }

    //getters y setters

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGrado() {
        return grado;
    }
    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }


    //metodos static que son saber si es mayor de edad y el IMC del alumno

    public static boolean mayorDeEdad(int edad){
        if (edad >= 18) {
            System.out.println("El alumno es mayor de edad");
            return true;
        }else{
            System.out.println("El alumno es menor de edad");
            return false;
        }
    }

    public static double imc(double peso, double altura){

        if ( altura <= 0) return 0;
        return peso / (altura * altura);
    }


}
