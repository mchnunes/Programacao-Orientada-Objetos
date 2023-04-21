package jogo.personagens;

public class Heroi {
    private String nomePersonagemHero;
    private int ataque;
    private int defesa;
    private int quantidadeSkills;
    private int pontosHero;
    private String skillName1;
    private String skillName2;
    private String skillName3;
    private String skillNameSignature;

    public Heroi (String nomePersonagemHero, int ataque, int defesa, int pontosHero){
        this.pontosHero = pontosHero;
        this.ataque = ataque;
        this.nomePersonagemHero = nomePersonagemHero;
        this.defesa = defesa;
    }
    public int getAtaque(){
        return this.ataque;
    }
    public int getPontosHero(){
        return this.pontosHero;
    }
    public String getNomePersonagemHero(){
        return this.nomePersonagemHero;
    }

    public void setQuantidadeSkills(int skills) {
        this.quantidadeSkills = quantidadeSkills;
    }
    public void setNamesSkills (String skillName1, String skillName2, String skillName3, String skillNameSignature){
        this.skillName1 = skillName1;
        this.skillName2 = skillName2;
        this.skillName3 = skillName3;
        this.skillNameSignature = skillNameSignature;
    }
}

