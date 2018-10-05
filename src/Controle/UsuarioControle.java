package Controle;

import java.util.ArrayList;
import java.util.List;
import Modelo.*;

public class UsuarioControle {
    //constantes
    public final int MAX_EMPRESTIMO = 3;
    public final int DIAS_DEVOLUCAO = 10;
    //metodos
    List<Usuario> usuarios = new ArrayList<>();
    public Usuario pesquisaUsuario(String nome){
        for(Usuario u : usuarios){
            if(u.getNome().equals(nome)){
                return u;
            }
        }
        return null;
    }
    //contrutor provisorio
    public void inicializaUsuarios(){
        this.insereUsuario(new Usuario("Heitor", "Rua ramalhete 191", "Senha123"));
    }
    //métodos
    public boolean insereUsuario(Usuario usuario){
        if(this.pesquisaUsuario(usuario.getNome()) == null){
            usuarios.add(usuario);
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean podeEmprestar(Usuario usuario){
        return( (usuario.getAutenticado()) &&
                (!usuario.getEmprestando()) &&
                (usuario.getLista().size() >= MAX_EMPRESTIMO) );
    }
    protected void pegaEmprestado(Usuario usuario, Livro livro){
        usuario.livrosEmPosse.add(livro);
        usuario.setEmprestando(true);
    }

}
