import jogo.mapa.Mapa;
import jogo.personagens.Heroi;
import jogo.personagens.Inimigo;

public class Main {
    public static void main(String[] args) {

        /* INIMIGOS LIST */

        Inimigo inimigo1 = new Inimigo("Mephisto", 200, 100, 1700);
        inimigo1.setQuantidadeSkills(4);
        inimigo1.setNamesSkills("Alteração temporal", "Regeneração", "Ilusão Temporal", "Inferno Na Terra");
        Inimigo inimigo2 = new Inimigo("Devron", 300, 400, 1250);
        inimigo2.setQuantidadeSkills(4);
        inimigo2.setNamesSkills("Sombra Ardente", "Toque da Desordem", "Olhar Penetrante", "Esmagador do Vazio");
        Inimigo inimigo3 = new Inimigo("Artrox", 500, 350, 1400);
        inimigo3.setQuantidadeSkills(4);
        inimigo3.setNamesSkills("Lâmina Venenosa", "Mente Corrupta", "Garras da Destruição", "Furacão Sombrio");

        /*------------------------------------------------------------------------------------------------------------*/
        /* HEROIS LIST */

        Heroi heroi1 = new Heroi("Apolo", 200, 450, 1000);
        heroi1.setQuantidadeSkills(4);
        heroi1.setNamesSkills("Flechada da morte", "Sopro Encantado", "Oráculo dos deuses", "Sol Denso");
        Heroi heroi2 = new Heroi("Ártemis", 450, 300, 1600);
        heroi2.setQuantidadeSkills(4);
        heroi2.setNamesSkills("Praga Devastadora", "Encanto do Arco", "Arqueada das Deusas", "Deusa da caça");
        Heroi heroi3 = new Heroi("Ragnar Lodbrok", 600, 400, 1200);
        heroi3.setQuantidadeSkills(4);
        heroi3.setNamesSkills("O Corvo", "Poder do Rei", "Lorde do Norte", "Poder de Odin");

       /*------------------------------------------------------------------------------------------------------------*/
        Mapa mapa = new Mapa(200, 400);
        mapa.setNome("Vale do Silicio");

        /* Adicionar inimigos ao mapa */
        mapa.inimigos.add(inimigo1);
        mapa.inimigos.add(inimigo2);
        mapa.inimigos.add(inimigo3);

        /* Adicionar herois ao mapa */
        mapa.herois.add(heroi1);
        mapa.herois.add(heroi2);
        mapa.herois.add(heroi3);

        System.out.println("\nResultado da Batalha\n" + mapa.getNome() + "\n");

        Inimigo inimigoMaiorDano = Mapa.getMaiorDanoInimigo();
        Heroi heroiMaiorDano = Mapa.getMaiorDanoHeroi();
        Heroi heroiMaiorScore = Mapa.getMaiorScoreHero();
        Inimigo InimigoMaiorScore = Mapa.getMaiorScoreInimigo();

        System.out.println("Top players das equipes \nMaior dano da equipe Villain: " + inimigoMaiorDano.getNomePersonagemVillain());
        System.out.println("Maior dano da equipe Gods: " + heroiMaiorDano.getNomePersonagemHero() + "\n");
        System.out.println("O Maior pontuador da equipe Gods Foi: " + heroiMaiorScore.getNomePersonagemHero());
        System.out.println("O maior pontuador da equipe Villain foi: " + InimigoMaiorScore.getNomePersonagemVillain() + "\n");
    }
}