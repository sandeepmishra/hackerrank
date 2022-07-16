package com.datastructures.list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingLinkedList {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputNum = Integer.parseInt(br.readLine());
        int col = Integer.parseInt(br.readLine());
        List<FitnessFactor> result = new ArrayList<>();

        List<Striker> strikers = new ArrayList<>();
        List<Defender> defenders = new ArrayList<>();
        for(int i=0; i<inputNum;i++){
            String input = br.readLine();
            String name = input.split(" ")[0];
            double height = Double.parseDouble(input.split(" ")[1]);
            double bmi  = Double.parseDouble(input.split(" ")[2]);
            int score = Integer.parseInt(input.split(" ")[3]);
            int defend = Integer.parseInt(input.split(" ")[4]);

            if(bmi<=23 && height>=5.8 && score>=50){
                Striker striker = new Striker(name,height,bmi,score, "SELECT STRIKER");
                strikers.add(striker);
            }else if(bmi <=23 && height>=5.8 && defend>=30){
                Defender defender= new Defender(name,height,bmi,defend,"SELECT DEFENDER");
                defenders.add(defender);
            }else{
                FitnessFactor fitnessFactor = new FitnessFactor(name, height, bmi, "REJECT NA");
                result.add(fitnessFactor);
            }
        }

        Comparator<Striker> strikerComparator = Comparator.comparing(Striker::getGoalScored).reversed();
        Comparator<Defender> defenderComparator = Comparator.comparing(Defender::getGoalDefended).reversed();
        Collections.sort(strikers, strikerComparator);
        Collections.sort(defenders, defenderComparator);
        for(int j=0;j<strikers.size();j++){
            if(j>0){
                strikers.get(j).setMessage("REJECT NA");
            }
            result.add(strikers.get(j));
        }
        for(int j=0;j<defenders.size();j++){
            if(j>0){
                defenders.get(j).setMessage("REJECT NA");
            }
            result.add(defenders.get(j));
        }

        Comparator<FitnessFactor> fitnessFactorComparator = Comparator.comparing(FitnessFactor::getName);
        Collections.sort(result, fitnessFactorComparator);
        for(FitnessFactor fitnessFactor:result){
            System.out.println(fitnessFactor.toString());
        }
    }
}

class FitnessFactor{
    //public static final double hieght = 5.8;
    //public static final int maxBmi = 23;

    private String name;
    private double height;
    private double bmi;
    private String message;

    public FitnessFactor(String name, double height, double bmi, String message) {
        this.name=name;
        this.height = height;
        this.bmi = bmi;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return name +" "+ message;
    }
}

class Defender extends FitnessFactor{
    //public static final int minGoalDefended = 50;

    public Defender(String name, double height, double bmi, int goalDefended, String message) {
        super(name, height, bmi, message);
        this.goalDefended = goalDefended;
    }

    private int goalDefended;


    public int getGoalDefended() {
        return goalDefended;
    }

    public void setGoalDefended(int goalDefended) {
        this.goalDefended = goalDefended;
    }
}

class Striker extends FitnessFactor{
   // public static final int minGoalScored  = 50;

    public Striker(String name, double height, double bmi, int goalScored, String message) {
        super(name, height, bmi, message);
        this.goalScored = goalScored;
    }

    private int goalScored;

    public int getGoalScored() {
        return goalScored;
    }

    public void setGoalScored(int goalScored) {
        this.goalScored = goalScored;
    }
}

