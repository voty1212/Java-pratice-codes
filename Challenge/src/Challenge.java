public class Challenge {
    public static void main(String[] args) {
      int highscore=calculateScorePosition(1000);
      String s="Srinivasan";
      displayHighScorePosition(s,highscore);
    }
    public static void displayHighScorePosition(String playerName, int highscoreposition){
        System.out.println(playerName+" managed to get into position "+highscoreposition+" on the highscore list");

    }
    public static int calculateScorePosition(int playerScore){
        int pos=0;
        if (playerScore>=1000){
            pos= 1;
        }
        else if(playerScore>=500&&playerScore<1000){
            pos= 2;
        }
        else if(playerScore>=100&&playerScore<500)
        {
            pos= 3;
        }
        else {
            pos= 4;
        }
        return pos;
    }
}
