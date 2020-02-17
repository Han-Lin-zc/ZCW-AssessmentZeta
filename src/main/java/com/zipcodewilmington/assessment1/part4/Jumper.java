package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int flagHeight, int jumpHeight) {
        int num = 0;
        for (int i = 0; i < flagHeight; i+=jumpHeight) {
            num++;
        }
        return num;
        //only got one test to pass lol...
    }
}
