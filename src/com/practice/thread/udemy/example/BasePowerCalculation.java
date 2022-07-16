package com.practice.thread.udemy.example;

import java.math.BigInteger;


public class BasePowerCalculation {
    public static void main(String[] args) throws InterruptedException {
        BigInteger result = new BasePowerCalculation().calculatePowerResult(new BigInteger("2"), new BigInteger("3"), new BigInteger("3"), new BigInteger("4"));
        System.out.println(result);
    }
    public  BigInteger calculatePowerResult(BigInteger base1, BigInteger pow1,BigInteger base2, BigInteger pow2) throws InterruptedException {
        BigInteger result = BigInteger.ZERO;
        PowerCalculatingThread t1 = new PowerCalculatingThread(base1, pow1);
        PowerCalculatingThread t2 = new PowerCalculatingThread(base2, pow2);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        result = t1.getResult().add(t2.getResult());

        return result;
    }
}

class PowerCalculatingThread extends Thread{
    private BigInteger base;
    private BigInteger power;
    private BigInteger result = BigInteger.ONE;

    PowerCalculatingThread(BigInteger base, BigInteger power){
        this.base = base;
        this.power = power;
    }

    @Override
    public void run() {
        BigInteger temp = BigInteger.ONE;
        while(power.compareTo(BigInteger.ZERO) !=0 ){
            temp = result;
            result = temp.multiply(base);
            power = power.subtract(BigInteger.ONE);
        }
    }

    public BigInteger getResult() {
        return result;
    }
}
