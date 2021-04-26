package webServices;

import calculators.IntegerCalculator;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws MalformedURLException {
        Scanner sc = new Scanner(System.in);

        URL url = new URL("http://localhost:8080/calculators?wsdl");
        QName qName = new QName("http://webServices/", "WebCalculatorsService");
        Service service = Service.create(url, qName);

        service.getPort(CustomWebService.class);

        System.out.println("Введите а: ");
        int a = sc.nextInt();
        System.out.println("Введите b: ");
        int b = sc.nextInt();

        System.out.println("Сумма: " + IntegerCalculator.sum(a, b) +
                "\nВычитание: " + IntegerCalculator.div(a, b) +
                "\nУмножение: " + IntegerCalculator.mul(a, b));
    }
}
