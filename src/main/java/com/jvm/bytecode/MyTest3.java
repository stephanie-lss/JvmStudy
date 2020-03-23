package com.jvm.bytecode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.ServerSocket;

/**
 * @author LiSheng
 * @date 2020/3/19 20:39
 */
public class MyTest3 {
    public void test() {
        try {
            FileInputStream fis = new FileInputStream("test.txt");

            ServerSocket serverSocket = new ServerSocket(9999);
            serverSocket.accept();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {

        } finally {
            System.out.println("finally");
        }
    }
}
