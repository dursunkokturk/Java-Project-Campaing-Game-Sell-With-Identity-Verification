package Entities;

public class Game {
    private int id;
    private String gameName;
    private String gameType;

    public Game(){

    }
    public Game(int id,String gameName,String gameType){
        this.id = id;
        this.gameName = gameName;
        this.gameType = gameType;
    }

    public int getId() {
        return id;
    }
    public void setId(){
        this.id = id;
    }
    public String getGameName() {
        return gameName;
    }
    public void setGameName(String gameName){
        this.gameName = gameName;
    }
    public String getGameType() {
        return gameType;
    }
    public void setGameType(String gameType){
        this.gameType = gameType;
    }
}