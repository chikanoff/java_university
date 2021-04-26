package gstu.chikanoff.utils;

import gstu.chikanoff.entities.Order;
import gstu.chikanoff.entities.ReaderLib;

import java.io.*;


public class Operations {
    public static int countBlackList = 0;
    public static void writeOrders(Order[] orders){
        ObjectOutputStream oos = null;
        try{
            oos = new ObjectOutputStream(new FileOutputStream(Constants.ORDERS_PATH));
            oos.writeObject(orders);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static String readOrders(){
        StringBuilder sb = new StringBuilder();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/orders.dat"))){
            Order[] orders = (Order[])ois.readObject();
            for (Order order : orders) {
                sb.append(order).append("\n");
            }
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return sb.toString();
    }

    public static void addToBlackList(ReaderLib reader){
        ObjectOutputStream ois = null;
        try{
            ois = new ObjectOutputStream(new FileOutputStream("src/blackList.dat"));
            ois.writeObject(reader);
            countBlackList++;
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public static String getBlackList(){
        StringBuilder sb = new StringBuilder("BLACK LIST\n");
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/blackList.dat"))){
            sb.append(ois.readObject()).append("\n");
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return sb.toString();
    }
}
