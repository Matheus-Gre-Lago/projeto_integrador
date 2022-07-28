package model;

public class ModelEmpresa {
  
    private int idEmpresa;
    private String nome;
    private String local;
    private String telefone;
    private String user;
    private String senha;
    private String email;

    public ModelEmpresa() {
    }

    public ModelEmpresa(int idEmpresa, String nome, String local, String telefone, String user, String senha, String email) {
        this.idEmpresa = idEmpresa;
        this.nome = nome;
        this.local = local;
        this.telefone = telefone;
        this.user = user;
        this.senha = senha;
        this.email = email;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    @Override
    public String toString() {
        return "empresa{" + "idEmpresa=" + idEmpresa + ", nome=" + nome + ", local=" + local + ", telefone=" + telefone + ", user=" + user + ", senha=" + senha + ",email=" + email + '}';
    }
}
