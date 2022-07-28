package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class PrimeiraClasseJava {

    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<Aluno>();

        for (int qtd = 1; qtd <= 2; qtd++) {



            /* new Aluno() é uma instância (Criação de objeto)*/
            /*aluno1 é uma referência para o objeto aluno*/

            String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ?");
        /*String idade = JOptionPane.showInputDialog("Qual a idade do Aluno");
        String dataNascimento = JOptionPane.showInputDialog("Data de nascimento");
        String rg = JOptionPane.showInputDialog("Registro Geral");
        String cpf = JOptionPane.showInputDialog("Qual é CPF");
        String mae = JOptionPane.showInputDialog("Nome da mãe");
        String pai = JOptionPane.showInputDialog("Nome do pai");
        String matricula = JOptionPane.showInputDialog("Data da matricula");
        String serie = JOptionPane.showInputDialog("Qual a série");
        String escola = JOptionPane.showInputDialog("Nome da escola");*/


            Aluno aluno1 = new Aluno();

            aluno1.setNome(nome);
        /*aluno1.setIdade(Integer.parseInt(idade));
        aluno1.setDataNascimento(dataNascimento);
        aluno1.setRegistroGeral(rg);
        aluno1.setNumeroCpf(cpf);
        aluno1.setNomeMae(mae);
        aluno1.setNomePai(pai);
        aluno1.setDataMatricula(matricula);
        aluno1.setNomeEscola(escola);
        aluno1.setSerieMatriculado(serie);*/

            for (int pos = 1; pos <= 1; pos++) {
                String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ? ");
                String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + "  ?");

                Disciplina disciplina = new Disciplina();
                disciplina.setDisciplina(nomeDisciplina);
                disciplina.setNota(Double.valueOf(notaDisciplina));

                aluno1.getDisciplinas().add(disciplina);

            }

            int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina");

            if (escolha == 0) {

                int continuarRemover = 0;
                int posicao = 1;

                while (continuarRemover == 0) {
                    String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1 , 2 , 3 , ou 4 ?");
                    aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
                    posicao++;
                    continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover");

                }

            }

            alunos.add(aluno1);

        }

        for (int pos = 0; pos < alunos.size(); pos++) {

            Aluno aluno = alunos.get(pos);

            if (aluno.getNome().equalsIgnoreCase("deivson")) {
                Aluno trocar = new Aluno();
                trocar.setNome("Aluno foi trocado");

                Disciplina disciplina = new Disciplina();
                disciplina.setDisciplina("Matemática");
                disciplina.setNota(96);

                trocar.getDisciplinas().add(disciplina);

                alunos.set(pos, trocar);
                aluno = alunos.get(pos);

            }

            System.out.println("Aluno = " + aluno.getNome());
            System.out.println("Média do aluno = " + aluno.getMediaNota());
            System.out.println("Resultado = " + aluno.getAlunoAprovado2());
            System.out.println("---------------------------------------------------------------------");

            for (int posd = 0; posd < aluno.getDisciplinas().size(); posd++) {

                Disciplina disc = aluno.getDisciplinas().get(posd);
                System.out.println("Matéria = " + disc.getDisciplina() + " Nota = " + disc.getNota());
            }

        }

    }
}
