package devandroid.bruno.formteste.model;

public class Classe {

    private String primeiroNome;
    private String sobreNome;
    private String clienteEndereco;
    private String clienteEmail;
    private String clienteSenha;
    private String clienteCandidatura;

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getClienteEndereco() {
        return clienteEndereco;
    }

    public void setClienteEndereco(String clienteEndereco) {
        this.clienteEndereco = clienteEndereco;
    }

    public String getClienteEmail() {
        return clienteEmail;
    }

    public void setClienteEmail(String clienteEmail) {
        this.clienteEmail = clienteEmail;
    }

    public String getClienteSenha() {
        return clienteSenha;
    }

    public void setClienteSenha(String clienteSenha) {
        this.clienteSenha = clienteSenha;
    }

    public String getClienteCandidatura() {
        return clienteCandidatura;
    }

    public void setClienteCandidatura(String clienteCandidatura) {
        this.clienteCandidatura = clienteCandidatura;
    }

    @Override
    public String toString() {
        return "Classe{" +
                "primeiroNome='" + primeiroNome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", clienteEndereco='" + clienteEndereco + '\'' +
                ", clienteEmail='" + clienteEmail + '\'' +
                ", clienteSenha='" + clienteSenha + '\'' +
                ", clienteCandidatura='" + clienteCandidatura + '\'' +
                '}';
    }
}
