import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Потрібно ввести два параметри виклику: ім'я файла та рядок для пошуку");
            return;
        }

        String thisLine;
        ArrayList<String> list = new ArrayList<>();
        BufferedReader fin = null;

        try {
            fin = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));
            while ((thisLine = fin.readLine()) != null) {
                System.out.println("==Введений рядок:" + thisLine);
                list.add(thisLine);
            }

            Collections.sort(list);
            System.out.println("Відсортований список рядків:");
            Iterator<String> iter = list.iterator();
            while (iter.hasNext()) {
                String str = iter.next();
                System.out.println(str);
            }

            String searchStr = args[1];
            if (list.contains(searchStr)) {
                System.out.println("Рядок " + searchStr + " знайдено в списку");
            } else {
                System.out.println("Рядок " + searchStr + " не знайдено в списку");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не знайдено: " + args[0]);
            System.out.println("Error: " + e);
        } catch (IOException e) {
            System.out.println("Помилка вводу-виводу. Файл " + args[0]);
            System.out.println("Error: " + e);
        } finally {
            if (fin != null)
                try {
                    fin.close();
                } catch (IOException ex) {
                    System.out.println("Помилка закриття файлу " + args[0]);
                    System.out.println("Error: " + ex);
                }
            fin = null;
        }
    }
}