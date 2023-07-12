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
            System.out.println("\n--The challenger--");
            challenger.introduce();
            System.out.println("\n--The challenged--");
            challenged.introduce();
            
            System.out.println("\nWE HAS A CHAMP --" + winner(challenger, challenged) + "--\n");
            
        }else{
            System.out.println("The fight cannot happen...");
        }
    }

    private String winner(Fighter f1, Fighter f2){
        Random ran = new Random();
        
        int champTimeF1=0, champTimeF2=0;
        int t1=0,t2=0;
        
        for(int n=0; n<getRounds(); n++){
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
            System.out.println("\nProb:"+prob);
            luck = ran.nextInt(101);
            System.out.println("luck:"+luck);
            if(luck<=prob){
                t1++;
                System.out.print("F1 ");
                champTimeF1++;
                
            }else{
                t2++;
                System.out.print("F2 ");
                champTimeF2++;
            }
        }
        System.out.println("\n1:"+champTimeF1+"\n2:"+champTimeF2+"\n");
        if(champTimeF1>champTimeF2){
             champ = f1;
             f1.setVictories(f1.getVictories()+1);
             f2.setDefeats(f2.getDefeats()+1);
        }else{
            champ = f2;
            f2.setVictories(f2.getVictories()+1);
            f1.setDefeats(f1.getDefeats()+1);
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

    public void setRounds(int rnds){
        this.rounds = rnds;
    }

    public boolean getApproved(){
        return this.approved;
    }

    public void setApproved(boolean app){
        this.approved = app;
    } 
}
