package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso {

    private String resgistro;
    private String nivelCargo;
    private String experiencia;
    private String login;
    private String senha;

    public Secretario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public Secretario() {

    }

    public String getResgistro() {
        return resgistro;
    }

    public void setResgistro(String resgistro) {

        this.resgistro = resgistro;
    }

    public String getNivelCargo() {
        return nivelCargo;
    }

    public void setNivelCargo(String nivelCargo) {

        this.nivelCargo = nivelCargo;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Secretario{" +
                "resgistro='" + resgistro + '\'' +
                ", nivelCargo='" + nivelCargo + '\'' +
                ", experiencia='" + experiencia + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", registroGeral='" + registroGeral + '\'' +
                ", numeroCpf='" + numeroCpf + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", nomePai='" + nomePai + '\'' +
                '}';
    }

    @Override
    public double salario() {
        return 1800.80 * 0.9;
    }

    @Override
    public boolean autenticar(String login, String senha) {
        this.login = login;
        this.senha = senha;
        return autenticar();
    }

    @Override
    public boolean autenticar() {
        return login.equals("admin") && senha.equals("admin");
    }


}
