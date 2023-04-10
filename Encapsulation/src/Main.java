public class Main {
    public static void main(String[] args) {
     /*   Player player=new Player();
        player.name="Srinivasan";
        player.health=20;
        player.weapom="Knife";
        int damage=10;
        player.loseHealth(damage);
        System.out.println("Remaining health = "+player.health);
        player.loseHealth(11);
        System.out.println("Remaining health = "+player.health);
*/
        EnhancedPlayer Srini=new EnhancedPlayer("Srini",200,"Axe");
        System.out.println("Remaining health is "+Srini.healthremaining());
    }
}