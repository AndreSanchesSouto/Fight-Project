package projectfight;

public class ProjectFight{

    public static void main(String[] args){
        Fighter f[] = new Fighter[6];
        
        f[0] = new Fighter("Pretty Boy", "France", 31, 11, 3, 1, 1.75f, 68.9f);
     
        f[1] = new Fighter("Putscript", "Brazil", 29, 14, 2, 3, 1.68f, 57.8f);
       
        f[2] = new Fighter("Snapshadow", "USA", 35, 12, 2, 1, 1.65f, 80.9f);
        
        f[3] = new Fighter("Dead Code", "Australia", 28, 13, 0, 2, 1.93f, 81.6f);
        
        f[4] = new Fighter("Ufocobol", "Brazil", 37, 5, 4, 3, 1.70f, 119.3f);
        
        f[5] = new Fighter("Nerdaart", "USA", 30, 12, 2, 4, 1.81f, 105.7f);
        
    }
    
}
