/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diegomatute.practicegit;

/**
 *
 * @author diegomatute
 */
public class Main {
    public static void main(String[] args)
    {
        System.out.printf("Hello world\n");
    
    //Slide 30 classes pt 1
    
    Car c = new Car();
    c.SetYear(2020);
    c.SetSpeed(20);
    c.SetColor("Green");
    System.out.printf("%d %d %s\n", 
            c.GetYear(), c.GetSpeed(), c.GetColor());
    }
}
 
