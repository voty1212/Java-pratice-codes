public class Player {
    public String name;
    public int health;
    public String weapom;

    public void loseHealth(int damage)
    {
        health-=damage;
        if(health<0)
            System.out.println("Player Ded");
    }


    public int healthremaining(){
        return health;
    }
    public void restorehealth(int amount){
        health+=amount;
        if(health>100){
            System.out.println("Player health restored");
            health=100;
        }
    }
}
