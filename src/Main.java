import java.util.Scanner;

public class Main {
    private static String texto;
    private static int cont;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escoge la frase y la 'letra'");
        texto = sc.nextLine(); // Guardamos en texto el texto introducido con su t¡letra entre comillas

        StringBuilder sb = new StringBuilder(texto);
        sb.reverse();
        char vocal = sb.charAt(1); // Recogemos la letra escogida
        System.out.println("Letra escogida: '" + vocal + "'");

        limpiarTexto(); // Limpiamos texto para que no aparezan las comillas con la letra

        contarVocales(vocal); // Llamamos a función para contar la vocal

        System.out.println("Numero de '" + vocal + "'-s en el texto: " + cont);

        sc.close();
    }

    public static void limpiarTexto() {
        StringBuilder sb = new StringBuilder(texto);
        sb.reverse();
        for (int i = 0; i < 3; i++){
            sb.deleteCharAt(0);
        }
        String textoLimpio = sb.reverse().toString();
        texto = textoLimpio;
    }
}
