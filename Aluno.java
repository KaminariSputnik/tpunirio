import java.util.Scanner;
public class Aluno {
    /*
    1º - criar aluno ok
    2º - listar todos os alunos ok
    3º - exibir todos os atributos de um aluno específico
    4º - deletar um aluno específico
    5º - alterar idade de um aluno específico
     */

    private String nome;
    private int matricula;
    private int idade;

    public Aluno(String nome, int matricula, int idade){
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
    }

    public static Aluno aluno[] = new Aluno[100];

    public static int criarAluno(int qtd){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a matrícula");
        int matricula = scanner.nextInt();

        System.out.println("Digite a idade: ");
        int idade = scanner.nextInt();
        aluno[qtd] = new Aluno(nome, matricula, idade);
        return qtd;
    }

    public static void listarAlunos(int qtd){
        if(qtd == 0){
            System.out.println("Não há alunos.");
        }
        for (int i = 0; i < qtd; i++){
            if (aluno[i] != null)
            System.out.println("Aluno " + i++ + " - nome: " + aluno[i].nome);
        }
    }

    public static void exibirAluno(int qtd, int matricula){
        if(qtd == 0){
            System.out.println("Não há alunos.");
        }
        for (int i = 0; i < qtd; i++){
            if (matricula == aluno[i].matricula && aluno[i] != null){
                System.out.println("Nome: " + aluno[i].nome);
                System.out.println("Idade: " + aluno[i].idade);
                System.out.println("Matrícula: " + aluno[i].matricula);
            } else if (i == qtd-1){
                System.out.println("Aluno não existe.");
            }
        }
    }

    public static void deletarAluno(int qtd, int matricula){
        if(qtd == 0){
            System.out.println("Não há alunos.");
        }
        for (int i = 0; i < qtd; i++){
            if (matricula == aluno[i].matricula && aluno[i] != null){
                for (int a = i; a < qtd; a++){
                    aluno[a] = aluno[a+1];
                }
                aluno[qtd-1] = null;
                }
                else if (i == qtd-1){
                System.out.println("O aluno não foi encontrado.");
            }
        }
    }

    public static void alterarIdade(int qtd, int matricula){
        if(qtd == 0){
            System.out.println("Não há alunos.");
        }
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < qtd; i++){
            if (matricula == aluno[i].matricula && aluno[i] != null){
                System.out.println("Digite a nova idade: ");
                int idade_nova = scanner.nextInt();
                aluno[i].idade = idade_nova;
            } else if (i == qtd-1){
                System.out.println("Não foi encontrado o aluno.");
            }
        }
    }


}
