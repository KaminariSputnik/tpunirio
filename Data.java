import java.util.Scanner;

public class Data {
    private int anos;
    private int dias;


    public Data (int anos, int dias){
        this.anos = anos;
        this.dias = dias;
    }

    /*public int getAnos(){
        return this.anos;
    }

    public void setAnos(int novo_ano){
        this.anos = novo_ano;
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
        if (dist < 0){
            dist = dist * (-1);
        }
        return dist;
    }

    public static String diaextenso(int dia){
        int dia_atual = dia%30;
        String dia_extenso = String.valueOf(dia_atual);
        return dia_extenso;
    }

    public static String mesextenso(int dia){
        int mes = dia/30;

        if (dia%30 != 0){
            mes = mes + 1;
        }

        String mes_extenso = String.valueOf(mes);
        return mes_extenso;
    }


    public static String anoextenso(int ano){
        String ano_extenso = String.valueOf(ano);
        return ano_extenso;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        int ano, dia;
        System.out.println("Digite o ano: ");
        ano = scanner.nextInt();
        System.out.println("Digite o dia: ");
        dia = scanner.nextInt();

        Data data1 = new Data(ano,dia);

        String paridade = paridade(data1.anos);
        System.out.println(paridade);
        
        boolean resposta = bissexto(data1.anos);
        System.out.println(resposta);

        int dist = distancia(data1.anos);
        System.out.println(dist);

        String data_1 = diaextenso(data1.dias);
        String data_2 = mesextenso(data1.dias);
        String data_3 = anoextenso(data1.anos);

        System.out.print(data_1 + "." + data_2 + "." + data_3);
    }

}