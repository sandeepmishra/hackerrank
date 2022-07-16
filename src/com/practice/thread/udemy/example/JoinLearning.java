package com.practice.thread.udemy.example;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JoinLearning {

    public static void main(String[] args) throws InterruptedException {
        List<Long> inputs = Arrays.asList(3459435l,4l, 12l, 43l, 23l, 49l);
        List<FactorialThread> threads = new ArrayList<>();
        for(var val: inputs){
            threads.add(new FactorialThread(val));
        }

        for(FactorialThread thread:threads){
            thread.setDaemon(true);
            thread.start();
        }

        for(FactorialThread thread:threads){
            thread.join(2000);
        }

        for (FactorialThread thread:threads){
            if(thread.isFinished()){
                System.out.println(thread.getResult());
            }else{
                System.out.println("Calculation ran out of time.");
            }
        }
    }


}

class FactorialThread extends Thread
{
    private Long factNum;
    private BigInteger result = BigInteger.ZERO;
    private boolean isFinished = false;
    public FactorialThread(Long factNum) {
        this.factNum =factNum;
    }

    @Override
    public void run() {
        this.result = factorial(this.factNum);
        this.isFinished = true;
    }

    public BigInteger factorial(Long factNum){
        BigInteger factResult = BigInteger.ONE;
        while(factNum>1){
            factResult = factResult.multiply(new BigInteger(String.valueOf(factNum)));
            factNum--;
        }
        return factResult;
    }

    public BigInteger getResult() {
        return result;
    }

    public boolean isFinished() {
        return isFinished;
    }
}
