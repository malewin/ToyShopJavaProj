package toyShop;

import java.net.Socket;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ToyConstructor toy1 = new ToyConstructor(0, (float) 1.5, "constructor");
        ToyConstructor toy2 = new ToyConstructor(1, (float) 2.5, "robot");
        ToyConstructor toy3 = new ToyConstructor(2, (float) 6.0, "car");

        ArrayList<ToyConstructor> assortiment = new ArrayList<>();
        assortiment.add(toy1);
        assortiment.add(toy2);
        assortiment.add(toy3);

        ToyMachine shop = new ToyMachine(3);
        shop.put(toy1.toString(), toy2.toString(), toy3.toString());

        // for (int i = 0; i < 10; i++) {
        //     System.out.println(shop.get());
        // }
        FileWorking fw = new FileWorking();
        String assortInfo = "Возможные варианты выйгрыша: " + assortiment;
        fw.save(assortInfo);
        fw.save("\n");
        System.out.println(assortInfo);

        for (int i = 0; i < 10; i++) {
            shop.pollInQueue(assortiment);
        }

        String shopBuffer = "В МагазинеИгрушек в данный момент находятся следующие игрушки: " + shop.pq;
        fw.save("\n");
        fw.save(shopBuffer);
        fw.save("\n");
        System.out.println(shopBuffer);

        for (int i = 0; i < 10; i++) {
            shop.takeFromQueue();
        }
    }
}
