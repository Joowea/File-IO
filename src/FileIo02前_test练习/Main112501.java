package FileIo02前_test练习;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main112501 {
    public static void main(String[] args) throws IOException {

        /*Zi zi = new Zi();

        System.out.println("--------------");

        Zi zi1 = new Zi();

        *//*
        fu类静态代码块执行
        zi类静态代码块执行
        fu类非静态代码块执行
        fu类构造执行
        zi类非静态代码块执行
        zi类构造执行
        --------------
        fu类非静态代码块执行
        fu类构造执行
        zi类非静态代码块执行
        zi类构造执行
        *//*

        long a = 1l;
        int b = 2;

        long c = a + b;*/

        /*FileOutputStream fos = new FileOutputStream("a.txt");


        fos.write(1232);*/


        FileInputStream fis = new FileInputStream("1.jpg");

        FileOutputStream fos = new FileOutputStream("2.jpg");

        /*int a = 0;
        while ((a = fis.read()) != -1) {

            fos.write(a);
        }*/

        byte[] bytes = new byte[1024];

        int len = 0;

        while ((len = fis.read(bytes))!=-1){

            fos.write(bytes,0,len);
        }


        fis.close();


    }
}
