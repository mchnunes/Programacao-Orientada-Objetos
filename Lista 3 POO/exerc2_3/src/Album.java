import java.lang.reflect.Array;
import java.util.ArrayList;

public class Album {
    String nome;
    String nomeArtista;
    ArrayList<Musica> musicas = new ArrayList<>();

    public Musica getMusicaMaiorPopularidade(){
        int maiorPupularidade = 0;
        int index = 0;
        for (int i = 0; i < musicas.size(); i++) {
            if (musicas.get(i).popularidade > maiorPupularidade){
                maiorPupularidade = musicas.get(i).popularidade;
                index = i;
            }
        }
        return musicas.get(index);
    }
    public Musica getMusicaMenorDuracaoSegundos(){
        int musicMenorDuracao = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < musicas.size(); i++) {
            if (musicas.get(i).duracaoEmSegundos < musicMenorDuracao){
                musicMenorDuracao = musicas.get(i).duracaoEmSegundos;
                index = i;
            }
        }
        return musicas.get(index);
    }
}
