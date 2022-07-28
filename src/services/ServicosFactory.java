package services;


public class ServicosFactory {
    
    private static ServicosEmpresa empresaServicos = new ServicosEmpresa();
    private static ServicosEvento eventoServicos = new ServicosEvento();
    private static ServicosIngresso ingressoServicos = new ServicosIngresso();
    private static ServicosUsuario usuarioServicos = new ServicosUsuario();
    
    
    public static ServicosEmpresa getEmpresaServicos(){
        return empresaServicos;
    }

    public static ServicosEvento getEventoServicos(){
        return eventoServicos;
    }
    
    public static ServicosIngresso getIngressoServicos(){
        return ingressoServicos;
    }
    
    public static ServicosUsuario getUsuarioServicos(){
        return usuarioServicos;
    }
}
