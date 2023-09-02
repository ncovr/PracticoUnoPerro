import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            // Creación de un objeto Perro
        Perro p1 = new Perro("Murdock", "Pastor Alemán", 2012);
            // Desplegar los datos de p1
        System.out.println(p1.toString());
            // Desplegar la edad que tendrá el proximo año
        System.out.print("Ingrese año actual: ");
        int anio = in.nextInt();
        System.out.println("El perro tendrá: "+(p1.getEdad(anio)+1)+" años el próximo año");

            // Cambiar el nombre de p1 a fiel y edad a +1
        p1.setNombre("Fiel");
        p1.setAnioNacimiento(2013);

            // Hacer ladrar a p1 despacio 5 veces
        for(int i=0; i<5; i++){
            System.out.println(p1.ladrarDespacio());
        }
            // Hacer ladrar a p1 fuerte 3 veces
        for(int i=0; i<3; i++){
            System.out.println(p1.ladrarFuerte());
        }

            // Mostrar los datos de p1
        System.out.println(p1.toString());

    }
}