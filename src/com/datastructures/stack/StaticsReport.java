package com.datastructures.stack;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StaticsReport{

    public static void main(String[] args) {

    }
}

interface StaticsAggregator{
    void putNewPrice(String symbol, double price);

    double getAvgPrice(String symbol);

    int getTickCount(String symbol);
}

class Report implements StaticsAggregator{
    private Map<String, List<Double>> stringDoubleMap = new HashMap<>();

    @Override
    public void putNewPrice(String symbol, double price) {
        List<Double> priceDoubles = stringDoubleMap.get(symbol);
        priceDoubles.add(price);
        stringDoubleMap.put(symbol, priceDoubles);
    }

    @Override
    public double getAvgPrice(String symbol) {
        return stringDoubleMap.get(symbol).stream().mapToDouble(d->d).average().getAsDouble();
    }

    @Override
    public int getTickCount(String symbol) {
        return (int)stringDoubleMap.get(symbol).stream().count();
    }
}
