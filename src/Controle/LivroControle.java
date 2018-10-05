package Controle;
import Modelo.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class LivroControle {
    //Atributos
    List<Livro> livros = new ArrayList<>();
    Map<String, Integer> mapaLivroEstoque = new HashMap<>();
    //Construtor Provisorio
    public void inicializaLivros(){
        this.insereLivro(new Livro(3324, 2, "Vidas Secas", "Graciliano Ramos", 24.5, 8.9, 2.1, false));
        this.insereLivro(new Livro(3589, 1, "Nome do Vento", "Patrick", 14.5, 3.9, 2.1, false));
    }
    
    //métodos
    private boolean buscaRestritaPorTitulo(String titulo){
        return livros.stream().anyMatch((l) -> (l.getTitulo().equalsIgnoreCase(titulo)));
    }
    
    public Livro retornaLivro(Livro livro){
        if(livros.contains(livro)){
            return livro;
        }
        else{
            return null;
        }
    }
    
    public List buscaLivroPorTitulo(String titulo){
        List<Livro> livrosEncontrados = new ArrayList<>();
        for(Livro l : livros){
            if(l.getTitulo().contains(titulo)){
                livrosEncontrados.add(l);
            }
        }
        return livrosEncontrados;
    }
    
    public List buscaLivroPorAutores(String autores){
        List<Livro> livrosEncontrados = new ArrayList<>();
        for(Livro l : livros){
            if(l.getAutores().contains(autores)){
                livrosEncontrados.add(l);
            }
        }
        return livrosEncontrados;
    }
    
    public List buscaLivroPorID(int ID){
        List<Livro> livrosEncontrados = new ArrayList<>();
        for(Livro l : livros){
            if(l.getIdentificador() == ID){
                livrosEncontrados.add(l);
            }
        }
        return livrosEncontrados;
    }
    
    public boolean insereLivro(Livro livro){
        if(!this.livros.contains(livro)){
            this.livros.add(livro);
            //Inserção na hash map
            if(this.buscaRestritaPorTitulo(livro.getTitulo())){
                this.mapaLivroEstoque.replace(livro.getTitulo(), this.mapaLivroEstoque.get(livro.getTitulo() + 1));
            }
            else{
                this.mapaLivroEstoque.put(livro.getTitulo(), 1);
            }
            return true;
        }
        else{
            return false;
        }
    }
    
}
