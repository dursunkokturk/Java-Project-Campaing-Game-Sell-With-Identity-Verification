package Concretes;

import Abstracts.IGameService;
import Entities.Customer;
import Entities.Game;

public class GameManager implements IGameService {

    @Override
    public void gameSave(Game game) {
        System.out.println("Saved Game");
        System.out.println("Game Name : "+game.getGameName()+" "+" Game Type : "+game.getGameType());
    }

    @Override
    public void gameSell(Customer customer, Game game) {
        System.out.println("The Person Who Bought The Game : " + customer.getFirstName()+" "+
                customer.getLastName()+" "+
                "Bought The Game : "+game.getGameType()+" "+
                game.getGameName());
    }
}