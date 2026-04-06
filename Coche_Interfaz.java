import java.util.Scanner;
public class Coche_Interfaz{
    public void Coche(){
        int opcionCo;
        Scanner sc = new Scanner(System.in);
            System.out.println("---GESTION DE COCHE---");
            System.out.println("1. Ver lista de coche");
            opcionCo = sc.nextInt();
            System.out.println("2. Agrega un coche");
            opcionCo = sc.nextInt();
            System.out.println("2. Buscar cliente por matricula");
            opcionCo = sc.nextInt();
            System.out.println("3. Eliminar cliente");
            opcionCo = sc.nextInt();
    }
}