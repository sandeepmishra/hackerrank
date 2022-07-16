package com.practice.thread;

public class ChopVeg {
    public static void main(String[] args) throws InterruptedException {
        VegetableChopper chopperOlivia = new VegetableChopper("Olivia");
        VegetableChopper chopperBarren = new VegetableChopper("Barren");
        
        chopperBarren.start();
        chopperOlivia.start();
        Thread.sleep(100);
        VegetableChopper.isActive = false;
        chopperBarren.join();
        chopperOlivia.join();
        chopperOlivia.getState();
        System.out.println("Barren : "+chopperBarren.vegcount);
        System.out.println("Olivia : "+chopperOlivia.vegcount);
    }
}


class VegetableChopper extends Thread{

    public static boolean isActive = true;
    public int vegcount=0;

    VegetableChopper(String name){
        this.setName(name);
    }

    @Override
    public void run() {
        while(isActive){
            vegcount++;
        }
    }
}