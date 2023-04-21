package jogo.mapa;

import jogo.personagens.Heroi;
import jogo.personagens.Inimigo;

import java.util.ArrayList;

public class Mapa {
    private String nome;
   private int altura;
    private int largura;
    public static ArrayList<Inimigo> inimigos = new ArrayList<>();
    public static ArrayList<Heroi> herois = new ArrayList<>();

    public Mapa (int altura, int largura){

        this.altura = altura;
        this.largura = largura;
    }

   public static Inimigo getMaiorDanoInimigo() {
        int maiorAtaque = 0;
        int index = 0;
       for (int i = 0; i < inimigos.size(); i++) {
            if (inimigos.get(i).getAtaqueVillain() > maiorAtaque){
                maiorAtaque = inimigos.get(i).getAtaqueVillain();
                index = i;
            }
       }
       return inimigos.get(index);
   }
   public static Heroi getMaiorDanoHeroi(){
       int maiorAtaque = 0;
       int index = 0;
       for (int i = 0; i < herois.size(); i++) {
           if (herois.get(i).getAtaque() > maiorAtaque){
               maiorAtaque = herois.get(i).getAtaque();
               index = i;
           }
       }
       return herois.get(index);
   }
    public static Heroi getMaiorScoreHero() {
        int maiorScore = 0;
        int indexScore = 0;
        for (int i = 0; i < herois.size(); i++) {
            if (herois.get(i).getPontosHero() > maiorScore) {
                maiorScore = herois.get(i).getPontosHero();
                indexScore = i;
            }

        }
        return herois.get(indexScore);
    }
    public static Inimigo getMaiorScoreInimigo(){
        int maiorScore = 0;
        int indexScore = 0;
        for (int i = 0; i < inimigos.size(); i++) {
            if (inimigos.get(i).getPontosVillain() > maiorScore){
                maiorScore = inimigos.get(i).getPontosVillain();
                indexScore = i;
            }
        }
        return inimigos.get(indexScore);
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome (String name){
        this.nome = name;
    }

}