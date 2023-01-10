import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {

        try {
            System.out.println("Digite um número inteiro...");

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String input = reader.readLine();

            int number = Integer.parseInt(input);

            System.out.println("Piramide feita com o número " + number + ":");

            for (int i = 1; i <= number; i++) {
                String aux = "";

                for (int j = 0; j < i; j++) {
                    aux += i;
                }

                System.out.println(aux);
            }

        } catch (NumberFormatException e) {
            System.out.println("Número inválido!");
        }

    }
}
