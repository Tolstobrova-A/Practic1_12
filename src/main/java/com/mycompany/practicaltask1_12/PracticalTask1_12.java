package com.mycompany.practicaltask1_12;


import com.mycompany.practicaltask1_12.LoaderRunnable;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class PracticalTask1_12 {
    public static void main(String[] args) {
        System.out.println("Practical task №1_12. Variant 5. Student Tolsbrova A.V. Group RIBO-01-22");
        System.out.println("Введите путь файла: ");
        
        Scanner scan= new Scanner(System.in);
        String path1=scan.nextLine();
        LoaderRunnable lr = new LoaderRunnable(path1);
        Thread th=new Thread(lr);
        th.start();
        
    }
}
