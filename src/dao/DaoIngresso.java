package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.ModelIngresso;
import java.sql.ResultSet;

public class DaoIngresso {
    
        public void cadastraEmpresa(ModelIngresso iVo) throws SQLException {
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();
        
        try{
            String sql;
            sql = "insert into ingresso values "
                + "(null , '"
                + iVo.getLoteUmQuantidade()     + "', '"
                + iVo.getLoteDoisQuantidade()   + "', '"
                + iVo.getLoteTresQuantidade() + "', '"
                + iVo.getLoteUmValor()     + "', '"
                + iVo.getLoteDoisValor()     + "', '"
                + iVo.getLoteTresValor()    + "');";
                
        stat.execute(sql);
        } catch (SQLException e){
            throw new SQLException("Erro ao inserir Cliente! \n"
                + e.getMessage());
        } finally{
            con.close();
            stat.close();
        }
    }
        
    public ArrayList<ModelIngresso> listarIngresso() throws SQLException{
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql;
            sql = "select * from ingresso";
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<ModelIngresso> ingresso = new ArrayList<>();
            while(rs.next()){
                ModelIngresso modelIngresso = new ModelIngresso();
                
                modelIngresso.setIdIngresso(rs.getInt("idIngresso"));
                modelIngresso.setLoteUmQuantidade(rs.getInt("loteUmQuantidade"));
                modelIngresso.setLoteDoisQuantidade(rs.getInt("loteDoisQuantidade"));
                modelIngresso.setLoteTresQuantidade(rs.getInt("loteTresQuantidade"));
                modelIngresso.setLoteUmValor(rs.getInt("loteUmValor"));
                modelIngresso.setLoteDoisValor(rs.getInt("loteUmValor"));
                modelIngresso.setLoteTresValor(rs.getInt("loteUmValor"));
                ingresso.add(modelIngresso);
            }
            return ingresso;
            
        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar clientes!\n" +
                    e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
    
    public void deletarIngresso(int id) throws SQLException{
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;
            sql = "delete from ingresso where idIngresso = " + id;
            stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao deletar Ingressos. \n"
                + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
    
    
    public void atualizarCliente (ModelIngresso eVo) throws SQLException{
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql;
            sql = "update ingresso set "
                    + "loteUmQuantidade ='" + eVo.getLoteUmQuantidade()+ "', '"
                    + "loteDoisQuantidade ='" + eVo.getLoteDoisQuantidade() + "', '"
                    + "loteTresQuantidade ='" + eVo.getLoteTresQuantidade()       + "', '"
                    + "loteUmValor ='" + eVo.getLoteUmValor()+ "', '"
                    + "loteDoisValor ='" + eVo.getLoteDoisValor()       + "', '"
                    + "loteTresUmValor ='" + eVo.getLoteTresValor()       + "', '"
                    + "where idIngresso =" + eVo.getIdIngresso();
            stat.executeUpdate(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao atualizar Cliente. \n"
                +e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
}
