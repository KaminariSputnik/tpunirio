import java.util.Scanner;
public class Main {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno[] aluno = new Aluno[100];

        int qtd = 0;
        int escolha;

        do {
            System.out.println("1 - criar aluno \n 2 - listar alunos \n 3 - exibir dados de um aluno \n " +
                    "4 - deletar um aluno \n " + "5 - alterar idade de um aluno \n 0 - sair");

            escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Criar um aluno: ");
                    qtd = Aluno.criarAluno(qtd);
                    qtd++;
                    break;
                case 2:
                    System.out.println("Listar alunos: ");
                    System.out.println("Alunos matriculados: " + qtd);
                    Aluno.listarAlunos(qtd);
                    break;
                case 3:
                    System.out.println("Exibir dados de um aluno: ");
                    System.out.println("Digite a matrícula: ");
                    int matricula = scanner.nextInt();
                    Aluno.exibirAluno(qtd, matricula);
                    break;
                case 4:
                    System.out.println("Deletar um aluno: ");
                    System.out.println("Digite a matrícula: ");
                    matricula = scanner.nextInt();
                    Aluno.deletarAluno(qtd, matricula);
                    qtd--;
                    break;
                case 5:
                    System.out.println("Alterar idade: ");
                    System.out.println("Digite a matrícula: ");
                    matricula = scanner.nextInt();
                    Aluno.alterarIdade(qtd, matricula);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Comando não reconhecido.");
                    break;
            }
        } while (escolha != 0);
        System.out.println("Sistema encerrado.");
    }
}
