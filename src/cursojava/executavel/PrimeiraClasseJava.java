package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

import javax.swing.*;

public class PrimeiraClasseJava {

    public static void main(String[] args) {

        /* new Aluno() é uma instância (Criação de objeto)*/
        /*aluno1 é uma referência para o objeto aluno*/

        String nome = JOptionPane.showInputDialog("Qual o nome do aluno");
        String idade = JOptionPane.showInputDialog("Qual a idade do Aluno");
        String dataNascimento = JOptionPane.showInputDialog("Data de nascimento");
        String rg = JOptionPane.showInputDialog("Registro Geral");
        String cpf = JOptionPane.showInputDialog("Qual é CPF");
        String mae = JOptionPane.showInputDialog("Nome da mãe");
        String pai = JOptionPane.showInputDialog("Nome do pai");
        String matricula = JOptionPane.showInputDialog("Data da matricula");
        String serie = JOptionPane.showInputDialog("Qual a série");
        String escola = JOptionPane.showInputDialog("Nome da escola");


        Aluno aluno1 = new Aluno();

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

        for (int pos = 1; pos <= 4; pos++) {
            String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ? ");
            String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + "  ?");

            Disciplina disciplina = new Disciplina();
            disciplina.setDisciplina(nomeDisciplina);
            disciplina.setNota(Double.valueOf(notaDisciplina));

            aluno1.getDisciplinas().add(disciplina);

        }

        int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina");

        if (escolha == 0) {
            String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1 , 2 , 3 , ou 4 ?");
            aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - 1);
        }


        System.out.println(aluno1.toString());
        System.out.println("Média do aluno = " + aluno1.getMediaNota());
        System.out.println("Resultado = " + aluno1.getAlunoAprovado2());


    }
}
