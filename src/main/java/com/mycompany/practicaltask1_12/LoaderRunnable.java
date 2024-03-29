package com.mycompany.practicaltask1_12;


import com.mirea.kt.example.Product;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class LoaderRunnable implements Runnable{
    
    private String path;

    public LoaderRunnable(String path) {
        this.path = path;
    }
    
    @Override
    
    public void run(){
        FileInputStream fis;
        if(this.path !=null && new File(this.path).exists()){
            try {
                fis=new FileInputStream(path);
                ObjectInputStream ois=new ObjectInputStream(fis);
                Product product=(Product) ois.readObject();
                ois.close();
                System.out.println(product.toString());
            }catch(ClassNotFoundException | IOException ex){
                System.out.println("Error loading object path: "+this.path);
                System.out.println(ex.getMessage());
            }
        }
    }
    
}
