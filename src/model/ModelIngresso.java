package model;

public class ModelIngresso {
    
    private int idIngresso;
    private int loteUmQuantidade;
    private int loteDoisQuantidade;
    private int loteTresQuantidade;
    private double loteUmValor;
    private double loteDoisValor;
    private double loteTresValor;
    
    public ModelIngresso(){
        
    }

    public ModelIngresso(int idIngresso, int loteUmQuantidade, int loteDoisQuantidade, int loteTresQuantidade, double loteUmValor, double loteDoisValor, double loteTresValor) {
        this.idIngresso = idIngresso;
        this.loteUmQuantidade = loteUmQuantidade;
        this.loteDoisQuantidade = loteDoisQuantidade;
        this.loteTresQuantidade = loteTresQuantidade;
        this.loteUmValor = loteUmValor;
        this.loteDoisValor = loteDoisValor;
        this.loteTresValor = loteTresValor;
    }

    public int getIdIngresso() {
        return idIngresso;
    }

    public void setIdIngresso(int idIngresso) {
        this.idIngresso = idIngresso;
    }

    public int getLoteUmQuantidade() {
        return loteUmQuantidade;
    }

    public void setLoteUmQuantidade(int loteUmQuantidade) {
        this.loteUmQuantidade = loteUmQuantidade;
    }

    public int getLoteDoisQuantidade() {
        return loteDoisQuantidade;
    }

    public void setLoteDoisQuantidade(int loteDoisQuantidade) {
        this.loteDoisQuantidade = loteDoisQuantidade;
    }

    public int getLoteTresQuantidade() {
        return loteTresQuantidade;
    }

    public void setLoteTresQuantidade(int loteTresQuantidade) {
        this.loteTresQuantidade = loteTresQuantidade;
    }

    public double getLoteUmValor() {
        return loteUmValor;
    }

    public void setLoteUmValor(double loteUmValor) {
        this.loteUmValor = loteUmValor;
    }

    public double getLoteDoisValor() {
        return loteDoisValor;
    }

    public void setLoteDoisValor(double loteDoisValor) {
        this.loteDoisValor = loteDoisValor;
    }

    public double getLoteTresValor() {
        return loteTresValor;
    }

    public void setLoteTresValor(double loteTresValor) {
        this.loteTresValor = loteTresValor;
    }  

    @Override
    public String toString() {
        return "ModelIngresso{" + "idIngresso=" + idIngresso + ", loteUmQuantidade=" + loteUmQuantidade + ", loteDoisQuantidade=" + loteDoisQuantidade + ", loteTresQuantidade=" + loteTresQuantidade + ", loteUmValor=" + loteUmValor + ", loteDoisValor=" + loteDoisValor + ", loteTresValor=" + loteTresValor + '}';
    }
}
