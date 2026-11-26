package padroesestruturais.composite;

public class Principal {

    public static void main(String[] args) {

        Musica musica1 = new Musica("Frio");
        Musica musica2 = new Musica("M4");
        Musica musica3 = new Musica("Vida");

        Playlist playlist = new Playlist("Minhas favoritas");

        playlist.adicionar(musica1);
        playlist.adicionar(musica2);

        Playlist outraPlaylist = new Playlist("Rap e Trap");
        outraPlaylist.adicionar(musica3);

        playlist.adicionar(outraPlaylist);

        playlist.reproduzir();
    }
}