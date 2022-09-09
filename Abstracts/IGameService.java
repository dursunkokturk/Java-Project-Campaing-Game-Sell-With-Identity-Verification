package Abstracts;

import Entities.Customer;
import Entities.Game;

public interface IGameService {
    public void gameSave(Game game);
    public void gameSell(Customer customer, Game game);
}