package com.driver;

public class Main {
    public static void main(String args[]){
        Product p = new Product();
        int twoparam    = p.product(1,2);
        int threeparam  = p.product(1,2,3);
        double dtwoparam = p.product(1.0,2.0);
        System.out.println(twoparam);
    }
}
class Product{
    public int product(int x, int y){
        return x*y;
    }
    public int product(int x, int y,int z){
        return x*y*z;
    }
    public double product(double x, double y) {
        return x*y;
    }
}