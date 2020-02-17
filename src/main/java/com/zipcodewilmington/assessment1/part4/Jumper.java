package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int flagHeight, int jumpHeight) {

        for (int i = jumpHeight; i < flagHeight; i++) {
            jumpHeight++;
        }
        return jumpHeight;
        //only got one test to pass lol...
    }
}
