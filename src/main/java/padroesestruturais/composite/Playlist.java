package padroesestruturais.composite;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements ComponenteMusical {

    private String nome;
    private List<ComponenteMusical> componentes = new ArrayList<>();

    public Playlist(String nome) {
        this.nome = nome;
    }

    public void adicionar(ComponenteMusical componente) {
        componentes.add(componente);
    }

    @Override
    public void reproduzir() {
        System.out.println("Playlist: " + nome);

        for (ComponenteMusical componente : componentes) {
            componente.reproduzir();
        }
    }
}