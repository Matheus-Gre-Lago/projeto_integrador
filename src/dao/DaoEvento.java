package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.ModelEvento;


public class DaoEvento {
    
    public void cadastraEvento(ModelEvento eventoVo) throws SQLException {
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();
        
        try{
            String sql;
            sql = "insert into evento values "
                    + "(null , '"
                    + eventoVo.getNome()       + "', '"
                    + eventoVo.getLocal()      + "', '"
                    + eventoVo.getIdEmpresa()  + "', '" 
                    + eventoVo.getIdIngresso() + "');";
            stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao inserir Cliente! \n"
                + e.getMessage());  
        }  finally {
            con.close();
            stat.close();
        }
    }
    
    
    public ArrayList<ModelEvento> listarEventos() throws SQLException{
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql;
            sql = "select * from evento";
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<ModelEvento> evento = new ArrayList<>();
            
            while(rs.next()){
                ModelEvento modelEvento = new ModelEvento();

                modelEvento.setIdIngresso(rs.getInt("idEvento"));
                modelEvento.setNome(rs.getString("nome"));
                modelEvento.setLocal(rs.getString("local"));
                modelEvento.setIdEmpresa(rs.getInt("idEmpresa"));
                modelEvento.setIdIngresso(rs.getInt("idIngresso"));
                evento.add(modelEvento);

            }
            return evento;
        } catch (Exception e) {
            throw new SQLException("Erro ao buscar eventos!\n" +
                    e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
      
    }
    
    public void deletarEvento(int id) throws SQLException{
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;
            sql = "delete from evento where idEvento =" + id;
            stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao deletar Evento. \n"
                + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
    
    public void atualizarCliente (ModelEvento eventoVo) throws SQLException{
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql;
            sql = "update cliente set "
                    + "nome ='"          + eventoVo.getNome()       + "', '"
                    + "local ='"         + eventoVo.getLocal()      + "', '"
                    + "idIngresso "      + eventoVo.getIdIngresso() + "', '"
                    + "where idEvento =" + eventoVo.getIdEvento();
            stat.executeUpdate(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao atualizar Cliente. \n"
                +e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
    
    public ModelEvento retornaIdPorNome(String nome) throws SQLException{
    
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();
        ModelEvento e = new ModelEvento();
        
        String sql;
        sql = "select * from evento where nome = '" + nome + "'";
        ResultSet rs = stat.executeQuery(sql);
        
        while (rs.next()) {
            e.setIdEvento(rs.getInt("idEvento"));
        }      
        return e;
    }
}
