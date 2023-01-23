import java.io.*;
import java.util.*;
import java.io.File;
public class p15_file{
    public static void main(String args[]){
        //creating new file
        try{
            File myfile = new File("xyzfile.txt");
            myfile.createNewFile();
        }
        catch(IOException e){
            System.out.println("Unable To Create File..!");
            e.printStackTrace();
        }
        //code to write file
        try{
            FileWriter myfilewriter = new FileWriter("xyzfile.txt");
            myfilewriter.write("This File Created By p_15_file.java File\nThank You...!");
            myfilewriter.close();
        }
        catch(IOException e){
            System.out.println("Unable To Create File..!");
            e.printStackTrace();
        }
        //reading file
        try{
            File myfile = new File("xyzfile.txt");
            Scanner s = new Scanner(myfile);
            while(s.hasNextLine()){
                String line = s.nextLine();
                System.out.println(line);
            }
            s.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Unable To Create File..!1");
            e.printStackTrace();
        }
        //reading file 2 
        try{
            File myfile = new File("xyzfile.txt");
            String[] list = myfile.list();
            for(int i=0;i<list.length;i++){
                System.out.println(list[i]);
            }
        }
        catch(Exception e){
            System.out.println("Unable To Create File..!2");
            e.printStackTrace();
        }
        // other opration
        try{
            File myfile = new File("xyzfile.txt");
            System.out.println(myfile.getName());
            System.out.println(myfile.canRead());
            System.out.println(myfile.canWrite());
            System.out.println(myfile.getAbsolutePath());
            System.out.println(myfile.length());
            System.out.println(myfile.getParent());
            System.out.println(myfile.isFile());
            System.out.println(myfile.isDirectory());
            System.out.println(myfile.getPath());
            System.out.println(myfile.exists());
        }
        catch(Exception c){
            System.out.println("Error....!");
        }
    }
}