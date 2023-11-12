package Interfaces;

import Classes.Actor;

public interface iQueueBehaviour {
    void takeInQueue(iActorBehaviour actor);  // Встать в очередь
    void releaseFromQueue(); // Покинуть очередь
    void takeOrder(); // Сделать заказ
    void giveOrder(); // Получить заказ
} 
