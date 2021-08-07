import java.util.Scanner;
import java.util.Random;

public class Media {
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int num5;
    private int media;


    private Media (int num1, int num2, int num3, int num4, int num5, int media){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.num5 = num5;
        this.media = media;
    }
    public static int calculo_media (int num1, int num2, int num3, int num4, int num5){
        int media = num1 + num2 + num3 + num4 + num5;
        media = media/5;

        return media;
    }
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_1, num_2, num_3, num_4, num_5;

        Random random = new Random();
        num_1 = random.nextInt(100);
        num_2 = random.nextInt(100);
        num_3 = random.nextInt(100);
        num_4 = random.nextInt(100);
        num_5 = random.nextInt(100);

        int media = calculo_media(num_1, num_2, num_3, num_4, num_5);

        boolean flag = false;
        int contador = 1;
        while (flag == false) {

        int tentativa;
        System.out.println("Digite um número: ");
        tentativa = scanner.nextInt();

            if (contador == 15){
                System.out.println("Suas tentativas acabaram.");
                System.exit(0);
            }
            if (tentativa > media) {
                System.out.println("Maior.");
                contador++;
            }
            if (tentativa < media){
                System.out.println("Menor.");
                contador++;
            }
            if (tentativa == media){
                System.out.println("Acertou!");
                flag = true;
            }
        }
    }
}


