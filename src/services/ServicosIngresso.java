package services;

import dao.DaoFactory;
import dao.DaoIngresso;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ModelIngresso;


public class ServicosIngresso {
    
    ArrayList<ModelIngresso> empresa = new ArrayList<>();
    private final DaoIngresso empresaDao = DaoFactory.getIngressoDao();
    
    public void cadIngresso(ModelIngresso iVO) throws SQLException {
        empresaDao.cadastraEmpresa(iVO);
    }
    
    public  ArrayList<ModelIngresso> getIngresso() throws SQLException{
        return empresaDao.listarIngresso();
    }
    
    public void atualizarIngressoBD(ModelIngresso iVO)throws SQLException{
        empresaDao.atualizarCliente(iVO);
    } 
    
    public void deletarIngressoBD(int id) throws SQLException{
        DaoIngresso iDAO = DaoFactory.getIngressoDao();
        iDAO.deletarIngresso(id);
    }
    
}
