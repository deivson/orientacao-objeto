package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.constantes.StatusAluno;
import cursojava.interfaces.PermitirAcesso;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PrimeiraClasseJava {

    public static void main(String[] args) {

        String login = JOptionPane.showInputDialog("Informe o login ");
        String senha = JOptionPane.showInputDialog("Informe a senha ");

        PermitirAcesso permitirAcesso = new Secretario(login, senha);


        if (permitirAcesso.autenticar()) { /*se TRUE acessa se FALSE não acessa*/


            List<Aluno> alunos = new ArrayList<Aluno>();


            /*É uma lista que dentro dela temos uma chave que identifica uma sequência de valores também*/
            HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();


            for (int qtd = 1; qtd <= 5; qtd++) {

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

            maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
            maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
            maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

            for (Aluno aluno : alunos) {/*Separando por Listas*/

                if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
                    maps.get(StatusAluno.APROVADO).add(aluno);

                } else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
                    maps.get(StatusAluno.RECUPERACAO).add(aluno);
                } else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
                    maps.get(StatusAluno.REPROVADO).add(aluno);
                }

            }

            System.out.println("-------------------Lista dos Aprovados------------------");
            for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
                System.out.println("Nome do aluno = " + aluno.getNome() + " Resultado  = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());

            }

            System.out.println("-------------------Lista dos Reprovados------------------");
            for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
                System.out.println("Nome do aluno = " + aluno.getNome() + " Resultado  = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());

            }

            System.out.println("-------------------Lista dos Recuperação------------------");
            for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
                System.out.println("Nome do aluno = " + aluno.getNome() + " Resultado  = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());

            }
        } else {
            JOptionPane.showMessageDialog(null, "Acesso não permitido");
        }

    }
}
