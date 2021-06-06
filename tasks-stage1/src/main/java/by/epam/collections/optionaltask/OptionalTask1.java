// Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке.
package by.epam.collections.optionaltask;
import java.io.*;
import java.util.ArrayList;
public class OptionalTask1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        try {
            File file = new File("input.TXT");
            FileReader fileread = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileread);
            String line = reader.readLine();
            System.out.println(line);
            list.add(line);
            while (line != null) {
                line = reader.readLine();
                System.out.println(line);
                list.add(line);
            }
            reader.close();
            fileread.close();
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        try(FileWriter writer = new FileWriter("output.TXT", true))
        {
            int retval = list.size();
            String string = "";
            for(int i = retval - 2; i >= 0; i--) {
                string = list.get(i);
                writer.append(string + "\n");
            }
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}


