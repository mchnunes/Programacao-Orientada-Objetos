public class Main {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.nome = "Get Yout Shine On";
        musica1.duracaoEmSegundos = 264;
        musica1.popularidade = 7;
        musica1.genero = "Rap, Black Music, R&B";

        Musica musica2 = new Musica();
        musica2.nome = "Neck Of The Woods";
        musica2.duracaoEmSegundos = 249;
        musica2.popularidade = 9;
        musica2.genero = "Rap, Black Music, R&B";

        Musica musica3 = new Musica();
        musica3.nome = "Pressure's On";
        musica3.duracaoEmSegundos = 252;
        musica3.popularidade = 9;
        musica3.genero = "Hip-Hop/Rap";

        Musica musica4 = new Musica();
        musica4.nome = "I Run This";
        musica4.duracaoEmSegundos = 199;
        musica4.popularidade = 9;
        musica4.genero = "Hip-Hop/rap";

        Musica musica5 = new Musica();
        musica5.nome = "Go DJ";
        musica5.duracaoEmSegundos = 264;
        musica5.popularidade = 10;
        musica5.genero = "Hip-Hop/Rap";

        Album album = new Album();
        album.nome = "Fast Money";
        album.nomeArtista = "Birdman, feat Lil Wayne";
        album.musicas.add(musica1);
        album.musicas.add(musica2);
        album.musicas.add(musica3);
        album.musicas.add(musica4);
        album.musicas.add(musica5);

        Musica musicaMaiorPopularidade = album.getMusicaMaiorPopularidade();
        Musica musicaMenorDuracao = album.getMusicaMenorDuracaoSegundos();

        System.out.println("\nFoi reproduzido o álbum " + album.nome + " Do(a) " + album.nomeArtista);
        System.out.println("A música com o melhor feedback foi, " + musicaMaiorPopularidade.nome + ".");
        System.out.println("A música com menor duração do álbum é, " + musicaMenorDuracao.nome + ".");
    }
}
