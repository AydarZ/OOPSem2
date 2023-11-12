package Interfaces;

import java.util.List;

import Classes.Actor;

public interface iMarketBehaviour {

    void acceptToMarket(iActorBehaviour actor); // Войти в магазин

    void releaseFromMarket(List<Actor> actors); //Покинуть магазин

    void update(); // С
}
