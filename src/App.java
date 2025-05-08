import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa nombre: ");
        String nombreUsuario = sc.next();
        System.out.println("Ingresa clave: ");
        String claveUsuario = sc.next();

        if (nombreUsuario.equals("admin") && claveUsuario.equals("clave123")) {
            System.out.println("Bienvenido");
        }else{
            System.out.println("Datos incorrectos");
        }
        sc.close();
    }
}
