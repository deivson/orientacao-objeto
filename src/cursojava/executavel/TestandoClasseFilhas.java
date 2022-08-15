package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClasseFilhas {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Deivson Analista de Sistemas");
        aluno.setNomeEscola("Jdev - Treinamento");
        aluno.setIdade(22);

        Diretor diretor = new Diretor();
        diretor.setRegistroGeral("123456789");
        diretor.setNome("Lima");
        diretor.setIdade(50);

        Secretario secretario = new Secretario();
        secretario.setExperiencia("Administração");
        secretario.setNumeroCpf("1324578965");
        secretario.setIdade(18);
        secretario.setNome("Alex");

        System.out.println(aluno);
        System.out.println(diretor);
        System.out.println(secretario);

        System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
        System.out.println(diretor.pessoaMaiorIdade());
        System.out.println(secretario.pessoaMaiorIdade());


        System.out.println("Salário Aluno é = " + aluno.salario());
        System.out.println("Salário Diretor é = " + diretor.salario());
        System.out.println("Salário Secretário é = " + secretario.salario());

        teste(aluno);
        teste(diretor);
        teste(secretario);

    }

    public static void teste(Pessoa pessoa) {
        System.out.println("Essa pessoa é demais = " +
                pessoa.getNome() + " e o salário é de = " + pessoa.salario());
    }
}
