package br.com.atividade2.model;

public class Dono {
    
    private String nome;
    private int idade;
    
    public Dono (String nome, int idade) {
        this.setDono(nome);
        this.setIdade(idade);
        System.out.println("Registrando dono(a) " + this.nome + " com " + this.idade + "ano(s).");
        
    }

    // Getters

    public String getDono() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    //Setters

    private void setDono (String novoNome) {
        if (novoNome != null && !novoNome.trim().isEmpty()) {
            this.nome = novoNome;
            System.out.println("O nome foi atualizado para " + this.nome);
        } else {
            System.out.println("Erro: nome inválido!");
        }
    }

    private void setIdade (int novaIdade) {
        if (novaIdade != 0) {
            this.idade = novaIdade;
            System.out.println("A idade foi atualizada para " + this.idade);
        } else {
            System.out.println("Erro: idade inválida!");
        }
    }

    // Regra de negócio
    public void atualizarNome(String novoNome) {
        System.out.println("Atualizando nome...");
        this.setDono(novoNome);
    }

    public void atualizarIdade(int novaIdade) {
        System.out.println("Atualizando idade...");
        this.setIdade(novaIdade);
    }

    






}
