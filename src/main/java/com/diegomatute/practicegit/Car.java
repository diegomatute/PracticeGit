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
public class Car {
    // Attributes
private int year;
private int speed;
private String color;
// Behaviors
public int GetYear() { return year; }
public int GetSpeed() { return speed; }
public String GetColor() { return color; }
public void SetYear(int newYear) { year = newYear; }
public void SetSpeed(int newSpeed) { speed = newSpeed; }
public void SetColor(String newColor) { color = newColor; }
// Accelerate and Decelerate not shown
    
}
