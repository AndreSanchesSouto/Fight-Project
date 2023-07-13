package projectfight;

public class ProjectFight{

    public static void main(String[] args){
        int fighters = 7;
        int fights = 4;
                
        Fighter f[] = new Fighter[fighters];
        //cadastro dos lutadores
        f[0] = new Fighter("Pretty Boy", "France", 31, 11, 3, 1, 1.75f, 68.9f);
        
        f[1] = new Fighter("Putscript", "Brazil", 29, 14, 2, 3, 1.68f, 57.8f);
       
        f[2] = new Fighter("Snapshadow", "USA", 35, 12, 2, 1, 1.65f, 80.9f);
        
        f[3] = new Fighter("Dead Code", "Australia", 28, 13, 0, 2, 1.93f, 81.6f);
        
        f[4] = new Fighter("Ufocobol", "Brazil", 37, 5, 4, 3, 1.70f, 119.3f);
        
        f[5] = new Fighter("Nerdaart", "USA", 30, 12, 2, 4, 1.81f, 105.7f);
        
        f[6] = new Fighter("The Master", "Japan", 50, 40, 0, 0, 2.10f, 98.5f);
        
        
        Fight UCC[] = new Fight[fights];
        //marcar as lutas e os lutadores
        UCC[0] = new Fight();
        UCC[0].markFight(f[0], f[1]);
        UCC[0].setRounds(10);
        UCC[0].fight();
        f[0].status();
        f[1].status();
        
        UCC[1] = new Fight();
        UCC[1].markFight(f[2], f[3]);
        UCC[1].setRounds(5);
        UCC[1].fight();
        f[2].status();
        f[3].status();
        
        UCC[2] = new Fight();
        UCC[2].markFight(f[4], f[5]);
        UCC[2].fight();
        f[4].status();
        f[5].status();
        
        UCC[3] = new Fight();
        UCC[3].markFight(f[5], f[6]);
        UCC[3].setRounds(3);
        UCC[3].fight();
        f[5].status();
        f[6].status();
    }
    
}
