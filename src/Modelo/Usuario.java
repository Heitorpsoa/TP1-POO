package Modelo;

import java.util.List;
import java.util.ArrayList;
public class Usuario {
    //atributos
    private String nome = new String();
    private String senha = new String ();
    private String endereco = new String();
    private boolean emprestando;
    private boolean autenticado;
    private int ID;
    //construtor
    public Usuario(String nome,
                   String endereco,
                   String senha){
        this.nome = nome;
        this.endereco = endereco;
        this.senha = senha;
        this.autenticado = false;
    }
    
    public Usuario(){
        
    }
    //gets and sets
    public String getNome(){return this.nome;}
    public String getEndereco(){return this.endereco;}
    public boolean getEmprestando(){return this.emprestando;}
    public boolean getAutenticado(){return this.autenticado;}
    public String getSenha(){return this.senha;}
    
    public void setNome(String nome){this.nome = nome;}
    public void setEndereco(String endereco){this.endereco = endereco;}
    public void setEmprestando(boolean emprestando){this.emprestando = emprestando;}
    public void setAutenticado(boolean autenticado){this.autenticado = autenticado;}
    public void setSenha(String senha){this.senha = senha;}
    
}
