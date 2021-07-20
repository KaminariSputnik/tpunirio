import java.util.Scanner;

public class Ano {
    private int numero;


    public Ano(int numero){
        this.numero = numero;
    }

   /* public int getNumero(){
        return this.numero;
    }

    public void setNumero(int novo_numero){
        this.numero = novo_numero;
    } */

    public static boolean bissexto(int ano){
        boolean resp;
        
        if (ano % 4 == 0){
            resp = true;
        }
        else {
            resp = false;
        }
        return resp;
    }

    public static String paridade (int ano){
        String pari;

        if (ano % 2 == 0){
            pari = "par";
        } else {
            pari = "impar";
        }
        return pari;
    }

    public static int distancia(int ano){
        int dist = 2021 - ano;
        return dist;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.println("Digite o ano: ");
        a = scanner.nextInt();
        Ano ano1 = new Ano(a);

        String paridade = paridade(ano1.numero);
        System.out.println(paridade);
        
        boolean resposta = bissexto(ano1.numero);
        System.out.println(resposta);

        int dist = distancia(ano1.numero);
        System.out.println(dist);


    }

}