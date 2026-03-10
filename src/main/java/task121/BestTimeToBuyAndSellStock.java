package task121;

import java.util.Arrays;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int sdelka = 0;
        for (int price : prices) {
            if (price < minPrice) minPrice = price;
            int current = price - minPrice;
            if (sdelka < current ) sdelka = current;
        }
        return sdelka;
    }
}
