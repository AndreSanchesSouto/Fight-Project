package projectfight;

import java.util.Random;

public class Fight{
    private Fighter challenger, challenged, champ;
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
            
            System.out.println("WE HAS A CHAMP --" + winner(challenger, challenged) + "--");
            
        }else{
            System.out.println("The fight cannot happen...");
        }
    }

    private String winner(Fighter f1, Fighter f2){
        Random ran = new Random();
        int prob = 50, luck;

        if(f1.getAge() > f2.getAge()){
            prob+=10;
            
        }else if(f1.getAge() < f2.getAge()){
            prob-=10;
        }
        
        if(f1.getHeight() > f2.getHeight()){
            prob+=10;
           
        }else if(f1.getHeight() < f2.getHeight()){
            prob-=10;
        }
        
        if(f1.getWeight() > f2.getWeight()){
            prob+=10;

        }else if(f1.getHeight() < f2.getHeight()){
            prob-=10;
        }
        
        luck = ran.nextInt(101);
        
        if(luck<=prob){
            champ = f1;
        }else{
            champ = f2;
        }

        return champ.getName();
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
