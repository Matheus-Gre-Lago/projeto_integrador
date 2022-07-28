package dao;

public class DaoFactory {
    
    private static final DaoEmpresa empresaDao = new DaoEmpresa();
    private static final DaoEvento  eventoDao = new DaoEvento();
    private static final DaoIngresso ingressoDao = new DaoIngresso();
    private static final DaoUsuario usuarioDao = new DaoUsuario();
    
    public static DaoEmpresa getEmpresaDao(){
        return empresaDao;
    }
    
     public static DaoEvento getEventoDao(){
        return eventoDao;
    }
     
    public static DaoIngresso getIngressoDao(){
        return ingressoDao;
    }
    
    public static DaoUsuario getUsuarioDao(){
        return usuarioDao;
    }
}
