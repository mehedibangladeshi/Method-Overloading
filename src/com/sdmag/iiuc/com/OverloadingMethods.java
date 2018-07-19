package com.sdmag.iiuc.com;

/**
 * Created by Mehedi on 7/20/2018.
 * mehedipy@gmail.com
 */
public class OverloadingMethods {

    //    overloading methods


    //    method with same name but different (float) type of parameters


    //    method with same name but different (int) type of parameters
    public void addition(int num1, int num2){
        System.out.println("addition:2 int values "+num1+num2);
    }
    //    method with same name but different (int) type of parameters and different numbers of parameters
    public void addition(int num1, int num2, int num3){
        System.out.println("addition:3 int values "+num1+num2+num3);
    }


    //    method with same name but different (float) type of parameters
    public void addition(float num1, float num2){
        System.out.println("addition:2 float values "+num1+num2);
    }
    //    method with same name but different (float) type of parameters and different numbers of parameters
    public void addition(float num1, float num2, float num3){
        System.out.println("addition:3 float values "+num1+num2+num3);
    }

    //    method with same name but different (double) type of parameters
    public void addition(double num1, double num2){
        System.out.println("addition:2 double values "+num1+num2);
    }
    //    method with same name but different (double) type of parameters and different numbers of parameters
    public void addition(double num1, double num2, double num3){
        System.out.println("addition:3 double values "+num1+num2+num3);
    }

}
