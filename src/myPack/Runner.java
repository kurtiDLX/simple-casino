package myPack;

public class Runner {
    public static void main(String[]args){
       Components components = new Components();
       while (!components.getGameStatus()){
           components.gameLogic();
       }
    }
}
