//Создать список из элементов каталога и его подкаталогов.

package by.epam.collections.optionaltask;
import java.io.*;
import java.util.*;

public class OptionalTask3 {
    public static void main(String[] args)  {
        String dirPath = "d:/temp";
                 File rootDir = new File(dirPath);
                ArrayList<String> list = new ArrayList<>();
                Queue<File> fileTree = new PriorityQueue<>();
                Collections.addAll(fileTree, rootDir.listFiles());
                while (!fileTree.isEmpty())
                {
                    File currentFile = fileTree.remove();
                    if(currentFile.isDirectory()){
                        Collections.addAll(fileTree, currentFile.listFiles());
                    } else {
                        list.add(currentFile.getAbsolutePath());
                    }
                }
                System.out.println("files: " + list.toString());
            }
        }






