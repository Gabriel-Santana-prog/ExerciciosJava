import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer,Pessoa> map = new HashMap<>();
        boolean menu=true;
        int key=0;
        while (menu){
            System.out.println("----------------");
            System.out.println("1.Inserir pessoa");
            System.out.println("2.Remover conta bancária");
            System.out.println("3.Exibir dados");
            System.out.println("4.Sair");
            int esolha=scanner.nextInt();
            switch (esolha){
                case 1:
                    scanner.nextLine();
                    System.out.println("Adicione uma pessoa");
                    System.out.println("--------------------");
                    String nome,cep,endereco,telefone;
                    int idade,qtdContas;
                    ArrayList<String>contas = new ArrayList<>();
                    System.out.println("Informe o nome da pessoa:");
                    nome=scanner.nextLine();
                    System.out.println("Informe a idade da pesssoa:");
                    idade=scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Informe o cep da pessoa:");
                    cep=scanner.nextLine();
                    System.out.println("Informe o endereço da pessoa:");
                    endereco=scanner.nextLine();
                    System.out.println("Informe o telefone da pessoa:");
                    telefone=scanner.nextLine();
                    System.out.println("Informe quantas contas esta pessoa possui:");
                    qtdContas=scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i <qtdContas ; i++) {
                        System.out.println("Informe a " + (i+1)+"° conta:");
                        String addConta= scanner.nextLine();
                        if(contas.contains(addConta)){
                            System.out.println("Não é possível adicionar a mesma conta duas vezes!");
                        }else{
                            contas.add(addConta);
                        }

                    }
                    Pessoa pessoa = new Pessoa(nome,cep,endereco,telefone,idade,contas);
                    map.put(key,pessoa);
                    key++;
                    System.out.println("Pessoa adicionada com sucesso!");
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Remover conta");
                    System.out.println("Informe o nome da pessoa:");
                    String nomePessoa= scanner.nextLine();
                    boolean exibir= false;
                    for (Integer chave: map.keySet()) {
                        if(map.get(chave).getNome().equals(nomePessoa)){
                            System.out.println(map.get(chave).getContasBancarias());
                            System.out.println("Qual conta deseja excluir?");
                            String nomeConta = scanner.nextLine();
                            for (int i = 0; i <map.get(chave).getContasBancarias().size() ; i++) {
                                if(map.get(chave).getContasBancarias().get(i).equals(nomeConta)){
                                    map.get(chave).getContasBancarias().remove(i);
                                    exibir=true;
                                }
                            }
                        }
                    }
                    System.out.println(exibir?"Conta removida com sucesso!":"A pessoa não possui esta conta ou não há dados da pessoa!");
                    break;
                case 3:
                    System.out.println("Exibir dados ");
                    scanner.nextLine();
                            System.out.println("Informe o nome da pessoa a ser exibido:");
                            String nomeBusca= scanner.nextLine();
                            boolean mensagemErro = false;
                            for (Integer indice: map.keySet()) {
                                if(map.get(indice).getNome().equals(nomeBusca)){
                                    System.out.println("Pessoa Encontrada");
                                    System.out.println("Nome: "+ map.get(indice).getNome());
                                    System.out.println("Idade: "+ map.get(indice).getIdade());
                                    System.out.println("Telefone: "+ map.get(indice).getTelefone());
                                    System.out.println("Endereço: "+ map.get(indice).getEndereco());
                                    System.out.println("Cep: "+ map.get(indice).getCep());
                                    System.out.println("Contas: "+ map.get(indice).getContasBancarias());
                                    mensagemErro=true;
                                }
                            }
                            if(!mensagemErro){
                                System.out.println("Não há dados dessa pessoa!");
                            }
                    break;
                case 4:
                    System.out.println("Saindo ...");
                    menu=false;
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}
