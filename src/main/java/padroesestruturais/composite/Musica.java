package padroesestruturais.composite;

public class Musica implements ComponenteMusical {

    private String nome;

    public Musica(String nome) {
        this.nome = nome;
    }

    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo música: " + nome);
    }
}