package negocio;


public class Veiculo {

    // atributos    
    String nome;
    String marca;

    
    
    // construtor
    public Veiculo(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;
    }
        
    
    
    // construtor vazio
    public Veiculo() {
        
    }

    
    
    // métodos acessores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }        
    
}
