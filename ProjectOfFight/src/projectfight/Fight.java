package projectfight;

import java.util.Random;

public class Fight{
    private Fighter challenger ;
    private Fighter challenged;
    private int rounds;
    private boolean approved;
    
    public void markFight(Fighter f1, Fighter f2){
        if(f1.getCategory().equals(f2.getCategory()) && f1 != f2){
            setApproved(true);
            setChallenger(f1);
            setChallenged(f2);
            
        }else{
            setApproved(false);
            setChallenger(null);
            setChallenged(null);
        } 
    }
    
    public void fight(){
        if(getApproved()){
            System.out.println("--The challenger--");
            challenger.introduce();
            System.out.println("\n--The challenged--");
            challenged.introduce();
            
            Random ran = new Random();
            int champ = ran.nextInt(3);
            
            switch(champ){
                case 0 -> {
                    System.out.println("\nIT'S A TIE!\n");
                    getChallenger().tieFight();
                    getChallenged().tieFight();
                }
                case 1 -> {//challenged won
                    System.out.println("\nWE HAS A CHAMP -- " + getChallenged().getName() + "!\n");
                    getChallenged().winFight();
                    getChallenger().loseFight();
                }
                case 2 -> {//challenger won 
                    System.out.println("\nWE HAS A CHAMP -- " + getChallenger().getName() + "!\n");
                    getChallenger().winFight();
                    getChallenged().loseFight();
                }
            }
            
        }else{
            System.out.println("The fight cannot happen...");
        }
    }

    public Fighter getChallenger(){
        return this.challenger;
    }

    public void setChallenger(Fighter cha){
        this.challenger = cha;
    }

    public Fighter getChallenged() {
        return this.challenged;
    }

    public void setChallenged(Fighter cha){
        this.challenged = cha;
    }

    public int getRounds(){
        return this.rounds;
    }

    public void setRounds(int rnd){
        this.rounds = rnd;
    }

    public boolean getApproved(){
        return this.approved;
    }

    public void setApproved(boolean app){
        this.approved = app;
    } 
}
