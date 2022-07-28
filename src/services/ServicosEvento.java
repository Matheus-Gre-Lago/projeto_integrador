package services;

import dao.DaoEvento;
import dao.DaoFactory;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ModelEvento;

public class ServicosEvento {
    
    ArrayList<ModelEvento> evento = new ArrayList<>();
    private final DaoEvento eventoDao = DaoFactory.getEventoDao();
    
    public void cadEmpresa(ModelEvento eVO) throws SQLException{
        eventoDao.cadastraEvento(eVO);
    }
    
    public  ArrayList<ModelEvento> getEvento() throws SQLException{
        return eventoDao.listarEventos();
    }
    
    public void atualizarEventoBD(ModelEvento eVO) throws SQLException{
        eventoDao.atualizarCliente(eVO);
    } 
    
    public void deletarEventoBD(int id) throws SQLException {
        DaoEvento eDAO = DaoFactory.getEventoDao();
        eDAO.deletarEvento(id);
    }
    
    public ModelEvento getEventoPorNome(String nome) throws SQLException{
        DaoEvento eDao = DaoFactory.getEventoDao();
        return eDao.retornaIdPorNome(nome);
    }
}
