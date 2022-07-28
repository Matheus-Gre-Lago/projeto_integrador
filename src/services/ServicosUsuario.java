package services;


import dao.DaoEmpresa;
import dao.DaoFactory;
import dao.DaoUsuario;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ModelUsuario;

public class ServicosUsuario {
    
    ArrayList<ModelUsuario> usuario = new ArrayList<>();
    private final DaoUsuario usuarioDao = DaoFactory.getUsuarioDao();
    
    
    public void cadUsuario(ModelUsuario eVO) throws SQLException{
        usuarioDao.cadastraUsuario(eVO);
    }
    
    public  ArrayList<ModelUsuario> getUsuario() throws SQLException{
        return usuarioDao.listarUsuario();
    }
    
    public void atualizarUsuarioBD(ModelUsuario eVO)throws SQLException{
        usuarioDao.atualizarUsuario(eVO);
    } 
    
    public void deletarUsuarioBD(int id) throws SQLException{
        DaoUsuario eDAO = DaoFactory.getUsuarioDao();
        eDAO.deletarUusario(id);
    }
    
    public ModelUsuario getByUusario(String user) throws SQLException{
        return  usuarioDao.getByUsuario(user);
    }
}
