package Greedy;

import java.util.ArrayList;
import java.util.Arrays;

public class GreedyAlgorithm {
    // coinList : 동전 종류 500원 100원 50원 10원,1원
    public void coinFunc(Integer price, ArrayList<Integer> coinList) {
        Integer totalCoinCount = 0;
        // 동전 갯수
        Integer coinNum = 0;
        ArrayList<Integer> details = new ArrayList<Integer>();
        
        for (int index = 0; index < coinList.size(); index++) {
            // 500원 동전의 갯수 = 4750원 나누기 500원
            coinNum = price / coinList.get(index);
            totalCoinCount += coinNum;
            // 남은 가격 = 가격 - 8개*500원
            price -= coinNum * coinList.get(index);
            details.add(coinNum);
            System.out.println(coinList.get(index) + "원:" + coinNum + "개");
        }

        System.out.println("총 동전 갯수:" + totalCoinCount);
    }

    public static void main(String[] args) {
        GreedyAlgorithm gObject = new GreedyAlgorithm();
        ArrayList<Integer> coinList = new ArrayList<Integer>(Arrays.asList(500,100,50,1));
        gObject.coinFunc(4720, coinList);
    }
}
