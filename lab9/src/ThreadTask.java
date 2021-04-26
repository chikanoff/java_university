import java.util.ArrayList;
import java.util.Random;

public class ThreadTask {
    private static Random rnd = new Random();
    public static String str = "fsd 32 vfs fs 33";
    public static int OperationsNumber = 0;

    private static ArrayList<String> Results = new ArrayList<String>();

    public static void digitsToSymbol(){
        String result = "Цифры на *:\nПреобразование строки: " + str + "\n Преобразованная: ";
        result += str.replaceAll("[0-9]", "*");
        OperationsNumber++;
        getResults().add(result);
    }

    public static void spacesToSymbol(){
        String result = "Пробелы на _:\nПреобразование строки: " + str + "\n Преобразованная: ";
        result += str.replaceAll(" ", "_");
        OperationsNumber++;
        getResults().add(result);
    }

    public static void printResults(){
        if(getResults().size() > 0){
            System.out.println(getResults().get(getResults().size() - 1));
            getResults().remove(getResults().size() - 1);
            OperationsNumber++;
        }
    }

    private synchronized static ArrayList<String> getResults(){
        return Results;
    }
}
