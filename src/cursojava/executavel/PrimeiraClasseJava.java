package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;
import cursojava.excecao.ExcecaoProcessarNota;
import cursojava.interfaces.PermitirAcesso;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class PrimeiraClasseJava {

    public static void main(String[] args) {


        try {
            lerArquivo();

            String login = JOptionPane.showInputDialog("Informe o login ");
            String senha = JOptionPane.showInputDialog("Informe a senha ");


            if (new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) { /*Vou travar o contrato para autorizar somente quem realmente tem o contrato 100% legitimo */

                List<Aluno> alunos = new ArrayList<>();

                /*É uma lista que dentro dela temos uma chave que identifica uma sequência de valores também*/
                HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();


                for (int qtd = 1; qtd <= 1; qtd++) {

                    /* new Aluno() é uma instância (Criação de objeto)*/
                    /*aluno1 é uma referência para o objeto aluno*/

                    String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ?");
                    String idade = JOptionPane.showInputDialog("Qual a idade do Aluno");
        /*
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
                    aluno1.setIdade(Integer.valueOf(idade));
                    /*
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
                        disciplina.setNota(Double.parseDouble(notaDisciplina));

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


        } catch (Exception e) {

            StringBuffer saida = new StringBuffer();

            e.printStackTrace();/*Imprime erro no console Java*/

            /*Mensagem do erro ou causa*/
            System.out.println(" Mensagem: " + e.getMessage());

            for (int pos = 0; pos < e.getStackTrace().length; pos++) {

                saida.append("\n Classe de erro : " + e.getStackTrace()[pos].getClassName());
                saida.append("\n Método de erro : " + e.getStackTrace()[pos].getMethodName());
                saida.append("\n Linha de erro : " + e.getStackTrace()[pos].getLineNumber());
                saida.append("\n Class  : " + e.getClass().getName());
            }

            JOptionPane.showMessageDialog(null, "Erro convenção de número " + saida.toString());

            JOptionPane.showMessageDialog(null, "Erro da execeção customizada : " + e.getClass().getName());
        } finally { /*Sempre é executado ocorrendo erros ou não*/
            /*Finally sempre quando se precisa executar um processo acontecendo erro ou não no sistema*/
            JOptionPane.showMessageDialog(null, "Obrigado por aprender Java comigo");
        }

    }

    public static void lerArquivo() throws FileNotFoundException {
        File fil = new File("c://lines.txt");
        Scanner scanner = new Scanner(fil);

    }

}

