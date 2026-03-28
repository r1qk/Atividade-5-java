package br.com.atividade2.main;

//Importamos a classe Cachorro para que o sistema a reconheça
import br.com.atividade2.model.Cachorro;
import br.com.atividade2.model.Dono;

public class sistemaPrincipal {

    public static void main(String[] args) {
        // INSTANCIAÇÃO
        // Criando primeiro dono
        Dono ana = new Dono("Ana Silva", 21);
        // Criando o primeiro cachorro (Objeto 1)
        Cachorro cachorro1 = new Cachorro("Mike", 10, 15, ana);
        System.out.println("Animal 1");
        cachorro1.envelhecer(7);
        cachorro1.trocarNome("Zeus");
        System.out.println();

        
        // Criando segundo dono
        Dono lucas = new Dono("Lucas Coffers", 22);
        // Criando o segundo cachorro (Objeto 2)
        Cachorro cachorro2 = new Cachorro("Bob", 3, 5, lucas);
        System.out.println("Animal 2");
        cachorro2.envelhecer(5);
        cachorro2.trocarNome("Thor");
        System.out.println();

        // Exibindo os dados no Console
        System.out.println("--- Exibindo cachorros ---");

        System.out.println("Dono 1: " + cachorro1.getTutor().getDono() + " | Idade: " + cachorro1.getTutor().getIdade()); 
        System.out.println("Cachorro: " + cachorro1.getNome() + " | Idade: " + cachorro1.getIdade() + " | Peso: " + cachorro1.getPeso() + "\n");

        System.out.println("Dono 2: " + cachorro2.getTutor().getDono() + " | Idade: " + cachorro2.getTutor().getIdade()); 
        System.out.println("Cachorro: " + cachorro2.getNome() + " | Idade: " + cachorro2.getIdade() + " | Peso: " + cachorro2.getPeso());
        
    }

}
