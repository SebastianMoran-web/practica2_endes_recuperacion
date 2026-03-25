package entities;

/**
 * Clase que representa los datos personales de un alumno
 * Se usaran para métodos estaticos para sacar el IRC del alumno y si es mayor de edad
 */






public class Alumno {

    private String nombre;
    private String apellido;
    private int edad;
    private String grado;
    private String nacionalidad;
    private String email;
    private double peso;
    private double altura;

    // Constructor por defecto

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

    //Constructor con los atributos

    public Alumno (String nombre, String apellido, int edad, String grado, String nacionalidad, String email, double peso, double altura) {


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


    /**
     * Metodo boolean que indica si al alumno se le puede considerar mayor o menor de edad
     * Se decide mediante un if, si es mayor o igual a 18 el sistema dira que es mayor de edad
     * si no dira que es menor de edad
     * @param edad
     * @return
     */
    public static boolean mayorDeEdad(int edad){
        if (edad >= 18) {
            System.out.println("El alumno es mayor de edad");
            return true;
        }else{
            System.out.println("El alumno es menor de edad");
           return false;
        }
    }

    /**
     * Es un método para calcular el IRC  de un alumno
     * se contiene un if para evitar que no se divida entre 0 y se rompa el codigo
     * despues el método devuelve el resultado
     * @param peso
     * @param altura
     * @return
     */
    public static double imc (double peso, double altura){

        if ( altura <= 0) return 0;
        return peso / (altura * altura);
    }


}
