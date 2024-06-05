import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int opcion = 0;
        String menu = """
                ***********************************************************
                \nSea bienvenido/a al Conversor de Moneda
                
                1 - Dólar =>> Peso argentino
                2 - Peso argentino =>> Dólar
                3 - Dólar =>> Real brasileño
                4 - Real brasileño =>> Dólar
                5 - Dólar =>> Peso colombiano
                6 - Peso colombiano =>> Dólar
                7 - Salir
                \n*** Elija una opción válida ***
                \n***********************************************************                
                """;

        Scanner teclado = new Scanner(System.in);
        while (opcion != 7){
            System.out.println(menu);
            opcion = teclado.nextInt();
        }
    }
}
