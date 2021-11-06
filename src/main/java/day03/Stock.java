package day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stock {
    private List<Double> stockHistory = new ArrayList<>();

    public Stock(List<Double> stockHistory) {
        this.stockHistory = stockHistory;
    }

    public void addToHistory(Double stockValue){
        stockHistory.add(stockValue);
    }

    public Double maxProfit(){
        Double res = 0.0;
        OUTER: for (int i = 0 ; i < stockHistory.size()-1; i++){
            Double temp = 0.0;
            INNER: for (int j = i+1; j < stockHistory.size(); j++){
                if (stockHistory.get(j) - stockHistory.get(i) > temp){
                    temp = stockHistory.get(j) - stockHistory.get(i);
                }
            }if (temp > res){
                res = temp;
            }
        }
        return res;
    }
}
