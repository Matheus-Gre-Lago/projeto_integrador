package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.ModelEmpresa;
import java.sql.ResultSet;

public class DaoEmpresa {
    
    public void cadastraEmpresa(ModelEmpresa eVo) throws SQLException {
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();
        
        try{
            String sql;
            sql = "insert into empresa values "
                + "(null , '"
                + eVo.getNome()     + "', '"
                + eVo.getLocal()    + "', '"
                + eVo.getTelefone() + "', '"
                + eVo.getUser()     + "', '"
                + eVo.getSenha()    + "', '"
                + eVo.getEmail()    + "');";
                
        stat.execute(sql);
        } catch (SQLException e){
            throw new SQLException("Erro ao inserir Cliente! \n"
                + e.getMessage());
        } finally{
            con.close();
            stat.close();
        }
    }
    
    public ArrayList<ModelEmpresa> listarEmpresas() throws SQLException{
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql;
            sql = "select * from empresa";
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<ModelEmpresa> empresa = new ArrayList<>();
            while(rs.next()){
                ModelEmpresa modelEmpresa = new ModelEmpresa();
                
                modelEmpresa.setIdEmpresa(rs.getInt("idEmpresa"));
                modelEmpresa.setNome(rs.getString("nome"));
                modelEmpresa.setLocal(rs.getString("local"));
                modelEmpresa.setTelefone(rs.getString("telefone"));
                modelEmpresa.setUser(rs.getString("user"));
                modelEmpresa.setSenha(rs.getString("senha"));
                modelEmpresa.setEmail(rs.getString("email"));
                empresa.add(modelEmpresa);
            }
            return empresa;
            
        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar empresa!\n" +
                    e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
    
    public void deletarEmpresa(int id) throws SQLException{
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;
            sql = "delete from empresa where idEmpresa = " + id;
            stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao deletar Empresa. \n"
                + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
    
    public void atualizarCliente (ModelEmpresa eVo) throws SQLException{
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql;
            sql = "update empresa set "
                    + "nome ='" + eVo.getNome()         + "', "
                    + "local ='" + eVo.getLocal()       + "', "
                    + "telefone ='" + eVo.getTelefone() + "', "
                    + "senha ='" + eVo.getSenha()       + "', "
                    + "email ='" + eVo.getEmail()       + "' "
                    + "where idEmpresa =" + eVo.getIdEmpresa();
            stat.executeUpdate(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao atualizar Empresa. \n"
                +e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
}
