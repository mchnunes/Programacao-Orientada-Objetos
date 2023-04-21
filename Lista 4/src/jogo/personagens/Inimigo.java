package jogo.personagens;

import java.util.ArrayList;

public class Inimigo {
   private String nomePersonagemVillain;
   private int ataque;
   private int defesa;
   private int pontosVillain;
   private int quantidadeSkills;
   private String skillName1;
   private String skillName2;
   private String skillName3;
   private String skillNameSignature;
   public ArrayList<Inimigo> inimigos = new ArrayList<>();


   public Inimigo (String nomePersonagemVillain, int ataque, int defesa, int pontosVillain){
      this.pontosVillain = pontosVillain;
      this.defesa = defesa;
      this.ataque = ataque;
      this.nomePersonagemVillain = nomePersonagemVillain;
   }
   public int getAtaqueVillain(){
      return this.ataque;
   }
   public int getPontosVillain(){
      return this.pontosVillain;
   }
   public String getNomePersonagemVillain(){
      return this.nomePersonagemVillain;
   }
   public void setQuantidadeSkills(int skills){
      this.quantidadeSkills= quantidadeSkills;
   }
   public void setNamesSkills (String skillName1, String skillName2, String skillName3, String skillNameSignature){
      this.skillName1 = skillName1;
      this.skillName2 = skillName2;
      this.skillName3 = skillName3;
      this.skillNameSignature = skillNameSignature;
   }
}


