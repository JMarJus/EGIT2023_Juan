public class Persona {
  private String nombre;
  private String apellidos;
  private int edad;
  public Persona(String nombre, String apellidos, int edad) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.edad = edad;
  }
  public void cumpleanios() {
    edad += 1;
    System.out.println(edad);
  }
  public void datosPersona() {
    System.out.println(nombre + " " + apellidos + ", " + edad);
  }
}