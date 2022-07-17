package cursojava.executavel;

import cursojava.classes.Aluno;

import javax.swing.*;

public class PrimeiraClasseJava {

    public static void main(String[] args) {

        /* new Aluno() é uma instancia (Criação de objeto)*/
        /*aluno1 é uma referencia para o objeto aluno*/

        String nome = JOptionPane.showInputDialog("Qual o nome do aluno");
        String idade = JOptionPane.showInputDialog("Qual a idade do Aluno");
        String dataNascimento = JOptionPane.showInputDialog("Data de nascimento");
        String rg = JOptionPane.showInputDialog("Registro Geral");
        String cpf = JOptionPane.showInputDialog("Qual é o CPF");
        String mae = JOptionPane.showInputDialog("Nome da mãe");
        String pai = JOptionPane.showInputDialog("Nome do pai");
        String matricula = JOptionPane.showInputDialog("Data da matricula");
        String serie = JOptionPane.showInputDialog("Qual a série");
        String escola = JOptionPane.showInputDialog("Nome da escola");
        String nota1 = JOptionPane.showInputDialog("Nota 1");
        String nota2 = JOptionPane.showInputDialog("Nota 2");
        String nota3 = JOptionPane.showInputDialog("Nota 3");
        String nota4 = JOptionPane.showInputDialog("Nota 4");

        Aluno aluno1 = new Aluno(); /*Aqui será o João*/

        aluno1.setNome(nome);
        aluno1.setIdade(Integer.parseInt(idade));
        aluno1.setDataNascimento(dataNascimento);
        aluno1.setRegistroGeral(rg);
        aluno1.setNumeroCpf(cpf);
        aluno1.setNomeMae(mae);
        aluno1.setNomePai(pai);
        aluno1.setDataMatricula(matricula);
        aluno1.setNomeEscola(escola);
        aluno1.setSerieMatriculado(serie);
        aluno1.setNota1(Double.parseDouble(nota1));
        aluno1.setNota2(Double.parseDouble(nota2));
        aluno1.setNota3(Double.parseDouble(nota3));
        aluno1.setNota4(Double.parseDouble(nota4));

        System.out.println("Nome do(a) aluno(a) 1 eh " + aluno1.getNome());
        System.out.println("Idade eh " + aluno1.getIdade());
        System.out.println("Nascimento = " + aluno1.getDataNascimento());
        System.out.println("Resgistro eh = " + aluno1.getRegistroGeral());
        System.out.println("Media da nota eh = " + aluno1.getMediaNota());
        System.out.println("O(a) aluno(a) esta " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
        System.out.println("O(a) aluno(a) esta " + aluno1.getAlunoAprovado2());




    }
}
