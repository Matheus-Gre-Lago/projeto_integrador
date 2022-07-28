package model;

public class ModelEvento {
    
    private int idEvento;
    private String nome;
    private String local;
    private int idEmpresa;
    private int idIngresso;

    public ModelEvento() {
    }

    public ModelEvento(int idEvento, String nome, String local, int idEmpresa, int idIngresso) {
        this.idEvento = idEvento;
        this.nome = nome;
        this.local = local;
        this.idEmpresa = idEmpresa;
        this.idIngresso = idIngresso;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
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

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public int getIdIngresso() {
        return idIngresso;
    }

    public void setIdIngresso(int idIngresso) {
        this.idIngresso = idIngresso;
    }
    

}
