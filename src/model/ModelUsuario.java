package model;

public class ModelUsuario {
    
    private int idUsuario;
    private String nome;
    private String user;
    private String email;
    private String senha;
    private String telefone;

    public ModelUsuario() {
    }

    public ModelUsuario(int idUsuario, String nome, String user, String email, String senha, String telefone) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.user = user;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
