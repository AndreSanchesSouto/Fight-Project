package projectfight;

public class Fighter{
    private String name, nationality, category;
    private int age, victories, defeats, ties;
    private float height, weight;
    
    public Fighter(String nam, String nat, int ag, int vic, int def, int tie, float heig, float weig){
        this.name = nam;
        this.nationality = nat;
        this.age = ag;
        this.height = heig;
        setWeight(weig);
        this.victories = vic;
        this.defeats = def;
        this.ties  = tie;
    }
 
    public void winFight(){
        setVictories(getVictories() + 1);
    }
    
    public void loseFight(){
        setDefeats(getDefeats() + 1);
    }
    
    public void tieFight(){
        setTies(getTies() + 1);
    }
    
    public void introduce(){
        System.out.println("Fighter: " + getName());
        System.out.println("Origin: " + getNationality());
        System.out.println(getAge() + " years old ");
        System.out.println(getHeight() + " meters high");
        System.out.println("Weighing: " + getWeight() +"Kg");
        System.out.println("Victories: " + getVictories());
        System.out.println("Defeats: " + getDefeats());
        System.out.println("Ties: " + getTies());
    }
    
    public void status(){
        System.out.println("Staus: " + getName());
        System.out.print("Height: " + getCategory());
        System.out.print(" | Victories: " + getVictories());
        System.out.print(" | Defeats: " + getDefeats());
        System.out.println(" | Ties: " + getTies() + "\n");
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String na){
        this.name = na;
    }
    
    public String getNationality(){
        return this.nationality;
    }
    
    public void setNationality(String nt){
        this.nationality = nt;
    }
    
    public String getCategory(){
        return this.category;
    }
    
    private void setCategory(){
        if(this.getWeight() < 52.2 || this.getWeight() > 120.2){
            this.category = "Invalid";
            
        }else if(this.getWeight() < 70.3){
            this.category = "Weight";
            
        }else if(this.getWeight() < 83.9){
            this.category = "Medium";
            
        }else if(this.getWeight() < 120.2){
            this.category = "Heavy";
            
        }
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int a){
        this.age = a;
    }

    public int getVictories(){
        return this.victories;
    }

    public void setVictories(int v){
        this.victories = v;
    }

    public int getDefeats(){
        return this.defeats;
    }

    public void setDefeats(int d){
        this.defeats = d;
    }

    public int getTies(){
        return this.ties;
    }

    public void setTies(int t){
        this.ties = t;
    }

    public float getHeight(){
        return this.height;
    }

    public void setHeight(float h){
        this.height = h;
    }

    public float getWeight(){
        return this.weight;
    }

    public void setWeight(float w){
        this.weight = w;
        setCategory();
    }
}
