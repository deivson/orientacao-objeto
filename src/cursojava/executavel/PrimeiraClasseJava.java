package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

    public static void main(String[] args) {

        /* new Aluno() é uma instancia (Criação de objeto)*/
        /*aluno1 é uma referencia para o objeto aluno*/
        Aluno aluno1 = new Aluno(); /*Aqui será o João*/

        aluno1.setNome("Deivson Lima");
        aluno1.setIdade(50);
        aluno1.setDataNascimento("17/04/1985");
        aluno1.setRegistroGeral("30115728");
        aluno1.setNumeroCpf("02684460590");
        aluno1.setNomeMae("Anizia");
        aluno1.setNomePai("Gilberto");
        aluno1.setDataMatricula("01/01/2022");
        aluno1.setNomeEscola("Dom Luciano");
        aluno1.setSerieMatriculado("3 ano");
        aluno1.setNota1(90);
        aluno1.setNota2(80.8);
        aluno1.setNota3(70.9);
        aluno1.setNota4(90.7);




        System.out.println("Nome do(a) aluno(a) 1 eh " + aluno1.getNome());
        System.out.println("Idade eh " + aluno1.getIdade());
        System.out.println("Nascimento = " + aluno1.getDataNascimento());
        System.out.println("Resgistro eh = " + aluno1.getRegistroGeral());
        System.out.println("Media da nota eh = " + aluno1.getMediaNota());
        System.out.println("O(a) aluno(a) esta " + aluno1.getAlunoAprovado());
        System.out.println("O(a) aluno(a) esta " + aluno1.getAlunoAprovado2());

        /*============================================================================*/
        System.out.println("------------------------------------------------------------------");

        Aluno aluno2 = new Aluno(); /*Aqui será o Pedro*/

        aluno2.setNome("Pedro");
        aluno2.setIdade(40);
        aluno2.setDataNascimento("10/10/2005");
        aluno2.setNota1(80.99);
        aluno2.setNota2(99.9);
        aluno2.setNota3(80.77);
        aluno2.setNota4(75.7);

        System.out.println("Nome do aluno 2 eh " + aluno2.getNome());
        System.out.println("Idade eh " + aluno2.getIdade());
        System.out.println("Nascimento = " + aluno2.getDataNascimento());
        System.out.println("O(a) aluno(a) esta " + aluno2.getAlunoAprovado());
        System.out.println("O(a) aluno(a) esta " + aluno2.getAlunoAprovado2());

        /*=============================================================================*/
        Aluno aluno3 = new Aluno(); /*Aqui será o Alex*/


    }
}
