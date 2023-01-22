public class encapsulacion {
    public static void main(String[] args) {
     persona persona1 = new persona();
     persona1.setNombre("Roberto");
     persona1.setEdad(33);
     persona1.setTelefono("+591-70399764");

     persona persona2 = new persona();
     persona2.setNombre("Leo");
     persona2.setEdad(26);
     persona2.setTelefono("+591-70688975");

      System.out.println("El nombre de la primera persona es: " + persona1.getNombre() + ". Su edad es: " + persona1.getEdad() + ". Su numero de telefono: " + persona1.getTelefono());
      System.out.println("El nombre de la segunda persona es: " + persona2.getNombre() + ". Su edad es: " + persona2.getEdad() + ". Su numero de telefono: " + persona2.getTelefono());
    }
}
class persona{
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }
}