import Classes.Actor;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PromoutionClient;
import Classes.SpecialClient;
import Classes.TaxInspector;
import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {
        Market magnit = new Market();
        PromoutionClient.SetCountPromoClients(3);

        iActorBehaviour client1 = new OrdinaryClient("boris");
        iActorBehaviour client2 = new SpecialClient("prezident", 1);
        iActorBehaviour client3 = new TaxInspector();
        iActorBehaviour client4 = new PromoutionClient("PromoClient1", 1);
        iActorBehaviour client5 = new PromoutionClient("PromoClient2", 2);
        iActorBehaviour client6 = new PromoutionClient("PromoClient3", 3);
        iActorBehaviour client7 = new PromoutionClient("PromoClient4", 4);

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);
        magnit.acceptToMarket(client5);
        magnit.acceptToMarket(client6);
        magnit.acceptToMarket(client7);

        magnit.update();
    }
}
