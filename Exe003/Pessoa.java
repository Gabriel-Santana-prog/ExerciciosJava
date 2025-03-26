import java.util.ArrayList;

public class Pessoa {
    private String nome,cep,endereco,telefone;
    private int idade;
    ArrayList<String> contasBancarias = new ArrayList<>();

    public Pessoa(String nome, String cep, String endereco, String telefone, int idade, ArrayList<String> contasBancarias) {
        this.nome = nome;
        this.cep = cep;
        this.endereco = endereco;
        this.telefone = telefone;
        this.idade = idade;
        this.contasBancarias = contasBancarias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public ArrayList<String> getContasBancarias() {
        return contasBancarias;
    }

    public void setContasBancarias(ArrayList<String> contasBancarias) {
        this.contasBancarias = contasBancarias;
    }
}
