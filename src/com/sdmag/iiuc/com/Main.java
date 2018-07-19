package com.sdmag.iiuc.com;


public class Main {

    public static void main(String[] args) {

//        sample variables for testing
        int aNum = 23;
        int bNum = 34;
        int cNum = 45;
        int dNum = 56;

        float aFloat = 123.456f;
        float bFloat = 321.456f;
        float cFloat = 132.456f;
        float dFloat = 312.456f;

        double aDouble = 123.4567898765;
        double bDouble = 321.4567898765;
        double cDouble = 132.4567898765;
        double dDouble = 312.4567898765;


    OverloadingMethods om = new OverloadingMethods();

//    change the parameters length(max 4) and type for testing
    om.addition(aNum , bNum);

    }


}
