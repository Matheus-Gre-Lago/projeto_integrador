package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.ModelUsuario;
import java.sql.ResultSet;

public class DaoUsuario {
    
    
    public void cadastraUsuario(ModelUsuario uVo) throws SQLException {
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();
        
        try{
            String sql;
            sql = "insert into usuario values "
                + "(null , '"
                + uVo.getNome()     + "', '"
                + uVo.getUser()    + "', '"
                + uVo.getEmail() + "', '"
                + uVo.getSenha()     + "', '"
                + uVo.getTelefone()    + "');";
                
        stat.execute(sql);
        } catch (SQLException e){
            throw new SQLException("Erro ao inserir Cliente! \n"
                + e.getMessage());
        } finally{
            con.close();
            stat.close();
        }
    }
    
    
    public ArrayList<ModelUsuario> listarUsuario() throws SQLException{
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql;
            sql = "select * from usuario";
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<ModelUsuario> usuario = new ArrayList<>();
            while(rs.next()){
                ModelUsuario modelUsuario = new ModelUsuario();
                
                modelUsuario.setIdUsuario(rs.getInt("idUsuario"));
                modelUsuario.setNome(rs.getString("nome"));
                modelUsuario.setUser(rs.getString("user"));
                modelUsuario.setEmail(rs.getString("user"));
                modelUsuario.setSenha(rs.getString("local"));
                modelUsuario.setTelefone(rs.getString("telefone"));
                usuario.add(modelUsuario);
            }
            return usuario;
            
        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar usario!\n" +
                    e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
    
    public void deletarUusario(int id) throws SQLException{
         Connection con = Conexao.getConexao();
         Statement stat = con.createStatement();

         try {
             String sql;
             sql = "delete from empresa where idUsuario = " + id;
             stat.execute(sql);
         } catch (SQLException e) {
             throw new SQLException("Erro ao deletar Usuario. \n"
                 + e.getMessage());
         } finally {
             con.close();
             stat.close();
         }
    }
    
    public void atualizarUsuario (ModelUsuario uVo) throws SQLException{
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql;
            sql = "update usuario set "
                    + "nome='" + uVo.getNome()      + "', "
                    + "user='" + uVo.getUser()     + "', "
                    + "email='" + uVo.getEmail() + "', "
                    + "senha='" + uVo.getSenha()    + "', "
                    + "telefone='" + uVo.getTelefone() + "' "
                    + "where idUsuario= " + uVo.getIdUsuario();
            System.out.println(sql);
            stat.executeUpdate(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao atualizar Cliente. \n"
                +e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    } 
    
    public ModelUsuario getByUsuario(String user) throws SQLException{
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();
        
        ModelUsuario u = new ModelUsuario();
        
        String sql;
        sql = "select * from usuario where user='" + user + "'";
        ResultSet rs = stat.executeQuery(sql);
  
        try {
            while (rs.next()) {
                u.setIdUsuario(rs.getInt("idUsuario"));
                u.setNome(rs.getString("nome"));
                u.setUser(rs.getString("user"));
                u.setEmail(rs.getString("email"));
                u.setSenha(rs.getString("senha"));
                u.setTelefone(rs.getString("telefone"));
            }
        } catch (SQLException e) {
            throw new SQLException("Usuario não encontrado.\n" + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
        return u;
    }
}
