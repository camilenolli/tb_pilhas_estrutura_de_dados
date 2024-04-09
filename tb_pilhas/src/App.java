import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pilhas PE_1 = new Pilhas(20);
        Pilhas PE_2 = new Pilhas(20);

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite o nome do aluno:");
            String nome = scanner.nextLine();

            System.out.println("Digite a matrícula do aluno:");
            int matricula = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Digite o sexo do aluno (M ou F):");
            char sexo = scanner.nextLine().charAt(0);

            Aluno aluno = new Aluno(nome, matricula, sexo);

            if (aluno.sexo == 'F') {
                PE_1.push(aluno);
            } else if (aluno.sexo == 'M') {
                PE_2.push(aluno);
            }
        }
        System.out.println();

        System.out.println("Alunos do sexo feminino PE_1:");
        mostrarAlunos(PE_1);

        System.out.println();

        System.out.println("Alunos do sexo masculino PE_2:");
        mostrarAlunos(PE_2);

        System.out.println();

        scanner.close();
    }

    public static void mostrarAlunos(Pilhas pilha) {
        while (!pilha.isEmpty()) {
            Aluno aluno = pilha.pop();
            System.out.println("- Nome: " + aluno.nome + " / Matrícula: " + aluno.matricula);
        }
    }
}