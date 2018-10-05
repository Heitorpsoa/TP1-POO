package Controle;

import Modelo.Livro;
import Modelo.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import Modelo.*;
public class Biblioteca {
    //controladores 
    UsuarioControle controleUsuario = new UsuarioControle();
    LivroControle controleLivro = new LivroControle();
    //métodos
    //Mudar para leitura de arquivos posteriormente
    public void emprestaLivro(Usuario usuario, Livro livro){
        Usuario u = controleUsuario.pesquisaUsuario(usuario.getNome());
        Livro l = controleLivro.retornaLivro(livro);
        if(controleUsuario.podeEmprestar(usuario)){
            
        }
    }
}
