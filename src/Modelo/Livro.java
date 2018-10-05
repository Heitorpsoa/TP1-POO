package Modelo;


public class Livro {
    //Atributos da classe livro:
    private int identificador, edicao;
    private String titulo = new String();
    private String autores = new String();
    private double altura, largura, peso;
    private boolean emprestado;
    private Usuario usuarioEmPosse;
    //construtor
    public Livro(int identificador, 
                 int edicao,
                 String titulo, 
                 String autores, 
                 double altura, 
                 double largura,
                 double peso,
                 boolean emprestado){
        this.identificador = identificador;
        this.edicao = edicao;
        this.titulo = titulo;
        this.autores = autores;
        this.altura = altura;
        this.largura = largura;
        this.peso = peso;
        this.emprestado = emprestado;
        this.usuarioEmPosse = new Usuario();
    }
    //Métodos get
    public int getIdentificador(){return this.identificador;
    }
    public int getEdicao(){return this.edicao;
    }
    public boolean isEmprestado(){return this.emprestado;
    }
    public String getTitulo(){return this.titulo;
    }
    public String getAutores(){return this.autores;
    }
    public double getAltura(){return this.altura;
    }
    public double getLargura(){
        return this.largura;
    }
    public double getPeso(){
        return this.peso;
    }            
}