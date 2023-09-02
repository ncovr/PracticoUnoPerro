public class Perro {
    private String nombre;
    private String raza;
    private int anioNacimiento;

    public Perro(String nombre, String raza, int anioNacimiento){
        this.nombre = nombre;
        this.raza = raza;
        this.anioNacimiento = anioNacimiento;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getRaza(){
        return this.raza;
    }

    public int getAnioNacimiento(){
        return this.anioNacimiento;
    }

    public void setAnioNacimiento(int anio){
        this.anioNacimiento = anio;
    }

    public String toString(){
        return (this.nombre+", "+this.raza+", "+this.anioNacimiento);
    }

    public int getEdad(int anio){
        return (anio-this.anioNacimiento);
    }

    public String ladrarFuerte(){
        return "GUAU";
    }

    public String ladrarDespacio(){
        return "guau";
    }

}
