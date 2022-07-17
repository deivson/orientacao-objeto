package cursojava.classes;

/*Está é nossa classe/objeto que representa o Aluno*/
public class Aluno {


    private String nome;
    private int idade;
    private String dataNascimento;
    private String registroGeral;
    private String numeroCpf;
    private String nomeMae;
    private String nomePai;
    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    public Aluno(){

    }

    public Aluno(String nome, int idade, String dataNascimento, String registroGeral, String numeroCpf, String nomeMae, String nomePai, String dataMatricula, String nomeEscola, String serieMatriculado) {
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.registroGeral = registroGeral;
        this.numeroCpf = numeroCpf;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
        this.dataMatricula = dataMatricula;
        this.nomeEscola = nomeEscola;
        this.serieMatriculado = serieMatriculado;
    }

    public Aluno(double nota1, double nota2, double nota3, double nota4) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRegistroGeral() {
        return registroGeral;
    }

    public void setRegistroGeral(String registroGeral) {
        this.registroGeral = registroGeral;
    }

    public String getNumeroCpf() {
        return numeroCpf;
    }

    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    /*Português == Método que retorna a média do aluno*/
    /*English == Method that returns the student's average */
    public double getMediaNota(){
        return (nota1 + nota2 + nota3 +nota4) / 4;
    }

    /*Português == esses dois métodos serve para saber se aluno está aprovado ou reprovado*/
    /*English == these two methods are used to know if the student is approved or disapproved*/

    public boolean getAlunoAprovado() {
        double media = this.getMediaNota();
        if (media >= 70){
            return true;
        }else{
            return false;
        }
    }
    public String getAlunoAprovado2(){
        double media = this.getMediaNota();
        if (media >= 70){
            return "Aluno está aprovado";
        }else{
            return "Aluno está Reprovado";
        }
    }


}
