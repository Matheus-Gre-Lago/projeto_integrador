package services;

import dao.DaoEmpresa;
import dao.DaoFactory;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ModelEmpresa;


public class ServicosEmpresa {
    
    ArrayList<ModelEmpresa> empresa = new ArrayList<>();
    private final DaoEmpresa empresaDao = DaoFactory.getEmpresaDao();
    
    public void cadEmpresa(ModelEmpresa eVO) throws SQLException{
        empresaDao.cadastraEmpresa(eVO);
    }
    
    public  ArrayList<ModelEmpresa> getEmpresa() throws SQLException{
        return empresaDao.listarEmpresas();
    }
    
    public void atualizarEmpresaBD(ModelEmpresa eVO)throws SQLException{
        empresaDao.atualizarCliente(eVO);
    } 
    
    public void deletarEmpresaBD(int id) throws SQLException{
        DaoEmpresa eDAO = DaoFactory.getEmpresaDao();
        eDAO.deletarEmpresa(id);
    }
    
}
