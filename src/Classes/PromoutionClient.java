package Classes;

import Interfaces.iActorBehaviour;

public class PromoutionClient implements iActorBehaviour {
    private String promoName;
    private int idPromoClient;
    private static int maxCountPromoClients = 0;
    private static int countPromoClients = 0;
    private boolean isTakeOrder; // Получен ли заказ
    private boolean isMakeOrder; //Сделан ли заказ

    public static void SetCountPromoClients(int num) {
        if (num >= 0){
            maxCountPromoClients = num;
        }
        else {
            System.out.println("Вы ввели неверное значение, количество акционных клиентов равно " + countPromoClients);
        }
    }

    public PromoutionClient(String promoName, int id) {
        if (countPromoClients < maxCountPromoClients) {
            this.promoName = promoName;
            this.idPromoClient = id;
            countPromoClients++;
        } else {
            this.promoName = "null";
            System.out.println("Достигнуто максимальное количество акционных клиентов");
        }
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public void setTakeOrder(boolean take) {
        isTakeOrder = take;
    }

    @Override
    public void setMakeOrder(boolean make) {
        isMakeOrder = make;
    }

    @Override
    public Actor getActor() {
        return new OrdinaryClient(promoName);
    }

    public String getName() {
        return promoName;
    }

}
