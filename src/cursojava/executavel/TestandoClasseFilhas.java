package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TestandoClasseFilhas {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Deivson Analista de Sistemas");
        aluno.setNomeEscola("Jdev - Treinamento");

        Diretor diretor = new Diretor();
        diretor.setRegistroGeral("123456789");
        diretor.setNome("Lima");

        Secretario secretario = new Secretario();
        secretario.setExperiencia("Administração");
        secretario.setNumeroCpf("1324578965");

        System.out.println(aluno);
        System.out.println(diretor);
        System.out.println(secretario);


    }
}
