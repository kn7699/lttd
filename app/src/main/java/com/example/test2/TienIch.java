package com.example.test2;
import java.util.Random;
public class TienIch {
    public static int []M;


    public static boolean InClass(int N){
        Random r = new Random();
        M = new int [101];
        for(int i=0;i<101;i++){
            M[i] = r.nextInt(100);
        }
        for(int i =0;i<101;i++){
            if(M[i] == N){
                return true;
            }
        }
        return false;
    }
}
