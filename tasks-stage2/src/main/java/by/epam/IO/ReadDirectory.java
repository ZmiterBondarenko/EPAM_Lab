package by.epam.IO;
import java.io.*;
import java.util.*;
import by.epam.IO.CustomExceptions.*;

class ReadDirectory {
    private static final String directoryTab = "|-----";
    private static final String fileTab = "|     ";
    private static boolean isTxt = false;
    private static final String PATH_FOR_OUTPUT = "src\\main\\java\\by\\epam\\IO\\output.txt";
    private static int directoryCounter = 1;
    private static int fileCounter = 0;
    private static int totalFilesNameLength = 0;

    private static List<String> fileTree = new ArrayList<>();

    static void getTree(String path) throws IncorectPathException
    {
        File mainPath = new File(path);
        if (mainPath.exists() && mainPath.isDirectory()) {
            fileTree.add(path.substring(path.lastIndexOf('\\') + 1));
            File[] files = mainPath.listFiles();
            readFilesTree(sortTreeFile(files), 0);
            if (files!=null) {
                for (String s : fileTree) {
                    System.out.println(s);
                }
            }
        } else if (mainPath.exists() && mainPath.getName().endsWith("txt")) {
            isTxt = true;
            fileTree = fileReader(path);
            for (String s : fileTree) {
                if (s.contains(directoryTab)) {
                    directoryCounter += 1;
                }
                if (s.contains(fileTab)) {
                    fileCounter += 1;
                    totalFilesNameLength += (s.length() - fileTab.length());
                }
                System.out.println(s);
            }
            System.out.println();

            if (fileCounter != 0)
                System.out.println("Average length of file names in this folder and subfolders: " + totalFilesNameLength / fileCounter);
            System.out.println("Total folders found: " + directoryCounter);
            System.out.println("Total files found: " + fileCounter);
            if (directoryCounter != 0)
                System.out.println("Average number of files: " + fileCounter / directoryCounter);
        }
        else {
            throw new IncorectPathException("Please, enter correct path to folder or to .txt file");
        }
        fileWriter(PATH_FOR_OUTPUT);
    }

    private static List<String> fileReader(String path){
        String line;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            while ((line = bufferedReader.readLine()) != null) {
                fileTree.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileTree;
    }

    private static void fileWriter(String outputFile) {
        File treeFile = new File(outputFile);
        if (treeFile.exists()) {
            treeFile.delete();
        }
        for (String s : fileTree) {
            try (FileWriter writer = new FileWriter(treeFile, true)) {
                writer.write(s + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static File[] sortTreeFile(File[] files) {
        Comparator<File> comparator = (file1,file2) ->{
            if (file1.isDirectory() && file2.isFile())
                return 1;
            else if(file2.isDirectory() && file1.isFile())
                return -1;
            else
                return file1.compareTo(file2);
        };
        TreeSet<File> treeSet = new TreeSet<>(comparator);
        treeSet.addAll(Arrays.asList(files));
        File[] file = (File[]) treeSet.toArray(new File[treeSet.size()]);
        return file;
    }


    private static void readFilesTree(File[] files, int level) {
        final String TAB = new String(new char[level]).replace("\0", "\t");
        for (File file : files) {
            if (file.isFile()) {
                if (level != 0) {
                    fileTree.add(TAB + fileTab + file.getName());
                } else fileTree.add(fileTab + file.getName());
            } else if (file.isDirectory()) {
                if (level != 0) {
                    fileTree.add(TAB + "|");
                    fileTree.add(TAB + directoryTab + file.getName());
                } else {
                    fileTree.add("|");
                    fileTree.add(directoryTab + file.getName());
                }
                readFilesTree(Objects.requireNonNull(sortTreeFile(file.listFiles())), level + 1);
            }
        }
    }
}
