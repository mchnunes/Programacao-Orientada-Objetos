public class Main {
    public static void main(String[] args) {


        Inimigo inimigo1 = new Inimigo();
        inimigo1.nomePersonagemVillain = "Mephisto";
        inimigo1.ataque = 200;
        inimigo1.defesa = 100;
        inimigo1.pontosVillain = 1700;

        Inimigo inimigo2 = new Inimigo();
        inimigo2.nomePersonagemVillain = "Devron";
        inimigo2.ataque = 300;
        inimigo2.defesa = 60;
        inimigo2.pontosVillain = 1250;

        Inimigo inimigo3 = new Inimigo();
        inimigo3.nomePersonagemVillain = "Artrox";
        inimigo3.ataque = 500;
        inimigo3.defesa = 30;
        inimigo3.pontosVillain = 1400;

        Heroi heroi1 = new Heroi();
        heroi1.nomePersonagemHero = "Apolo";
        heroi1.ataque = 150;
        heroi1.defesa = 400;
        heroi1.pontosHero = 1000;

        Heroi heroi2 = new Heroi();
        heroi2.nomePersonagemHero = "Ártemis";
        heroi2.ataque = 450;
        heroi2.defesa = 100;
        heroi2.pontosHero = 1600;

        Heroi heroi3 = new Heroi();
        heroi3.nomePersonagemHero = "Ragnar";
        heroi3.ataque = 600;
        heroi3.defesa = 20;
        heroi3.pontosHero = 1200;


        Mapa mapa = new Mapa();
        mapa.nome = "Arena dos Destroços";

        mapa.inimigos.add(inimigo1);
        mapa.inimigos.add(inimigo2);
        mapa.inimigos.add(inimigo3);

        mapa.herois.add(heroi1);
        mapa.herois.add(heroi2);
        mapa.herois.add(heroi3);

        System.out.println("\nResultado da Batalha\n" + mapa.nome + "\n");

        Inimigo inimigoMaiorDano = Mapa.getMaiorDanoInimigo();
        Heroi heroiMaiorDano = Mapa.getMaiorDanoHeroi();
        Heroi heroiMaiorScore = Mapa.getMaiorScoreHero();
        Inimigo InimigoMaiorScore = Mapa.getMaiorScoreInimigo();

        System.out.println("Top players das equipes \nMaior dano da equipe Villain: " + inimigoMaiorDano.nomePersonagemVillain);
        System.out.println("Maior dano da equipe Gods: " + heroiMaiorDano.nomePersonagemHero + "\n");
        System.out.println("O Maior pontuador da equipe Gods Foi: " + heroiMaiorScore.nomePersonagemHero);
        System.out.println("O maior pontuador da equipe Villain foi: " + InimigoMaiorScore.nomePersonagemVillain + "\n");
    }
}