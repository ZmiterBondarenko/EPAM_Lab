package by.epam.IO;
import static  by.epam.IO.ReadDirectory.getTree;

public class MainTask {

    public static void main(String[] args)
    {
        //String path = args[0];
//        for test
        //String path = "src\\main\\java\\by\\epam\\IO\\TestFolder";
        String path = "src\\main\\java\\by\\epam\\IO\\output.txt";
        //String path = "src\\main\\java\\by\\epam\\IO\\Music";
        //String path = "src\\main\\java\\by\\epam\\IO\\TestFolder\\Test1.txt";
        //String path = "src\\main\\java\\by\\epam\\IO\\EmptyFolder";
        try {
            getTree(path);
        } catch (CustomExceptions.IncorectPathException e) {

        }
    }








}
