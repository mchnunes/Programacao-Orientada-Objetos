import java.util.ArrayList;

public class Mapa {
   String nome;
   int altura;
   int largura;
   static ArrayList<Inimigo> inimigos = new ArrayList<>();
   static ArrayList<Heroi> herois = new ArrayList<>();
   public static Inimigo getMaiorDanoInimigo() {
        int maiorAtaque = 0;
        int index = 0;
       for (int i = 0; i < inimigos.size(); i++) {
            if (inimigos.get(i).ataque > maiorAtaque){
                maiorAtaque = inimigos.get(i).ataque;
                index = i;
            }
       }
       return inimigos.get(index);
   }
   public static Heroi getMaiorDanoHeroi(){
       int maiorAtaque = 0;
       int index = 0;
       for (int i = 0; i < herois.size(); i++) {
           if (herois.get(i).ataque > maiorAtaque){
               maiorAtaque = herois.get(i).ataque;
               index = i;
           }
       }
       return herois.get(index);
   }
    public static Heroi getMaiorScoreHero() {
        int maiorScore = 0;
        int indexScore = 0;
        for (int i = 0; i < herois.size(); i++) {
            if (herois.get(i).pontosHero > maiorScore) {
                maiorScore = herois.get(i).pontosHero;
                indexScore = i;
            }

        }
        return herois.get(indexScore);
    }
    public static Inimigo getMaiorScoreInimigo(){
        int maiorScore = 0;
        int indexScore = 0;
        for (int i = 0; i < inimigos.size(); i++) {
            if (inimigos.get(i).pontosVillain > maiorScore){
                maiorScore = inimigos.get(i).pontosVillain;
                indexScore = i;
            }
        }
        return inimigos.get(indexScore);
    }
}