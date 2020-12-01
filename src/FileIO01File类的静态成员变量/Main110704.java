package FileIO01File类的静态成员变量;

import java.io.File;
import java.io.IOException;

public class Main110704 {

    public static void main(String[] args) {

        /*System.out.println(File.pathSeparator);
        System.out.println(File.pathSeparatorChar);
        System.out.println(File.separator);
        System.out.println(File.separatorChar);*/

        /*File f1 = new File("111");
        f1.mkdirs();
        f1.delete();*/

        //System.out.println(tryCatchFinally());


        /*File file = new File("c:\\abc\\c\\3.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        File f = new File("c:\\abc");

        getAllFiles(f);

    }

    public static void getAllFiles(File f){

        File[] fs = f.listFiles();

        for (File file: fs) {
            System.out.println(file);
            if(file.isDirectory()){

                getAllFiles(file);
            }


        }
    }



    public static int tryCatchFinally(){

        try {

            int a = 8;System.out.println("try");
            return 1;


        }catch (Exception e) {

            System.out.println("catch");
        }finally{
            return 3;
        }
    }
}
