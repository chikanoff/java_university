package gstu.chikanoff;

import gstu.chikanoff.entities.Order;
import gstu.chikanoff.entities.ReaderLib;
import gstu.chikanoff.utils.Operations;

import java.io.*;

public class Runner {
    public static void main(String[] args) {
        ReaderLib reader1 = new ReaderLib("ANTON");
        ReaderLib reader2 = new ReaderLib("GRISHA");
        ReaderLib reader3 = new ReaderLib("GOSHA");
        Order[] orders = new Order[] {
            new Order(reader1, "PETUSHKIN", "GORE OT UMA"),
            new Order(reader2, "PETUSHKIN", "MERTVIE DUSHI"),
            new Order(reader3, "PETUSHKIN", "KAPITANSKAYA DOCHKA"),
        };

        Operations.writeOrders(orders);
        System.out.println(Operations.readOrders());

        Operations.addToBlackList(reader1);
        Operations.addToBlackList(reader2);

        System.out.println(Operations.getBlackList());

    }
}
