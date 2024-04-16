public class Profit {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit;
    }

        public static void main(String[] args) {
            Profit profit = new Profit();

            int[] prices1 = {7, 1, 5, 3, 6, 4};
            System.out.println(profit.maxProfit(prices1));

            int[] prices2 = {7, 6, 4, 3, 1};
            System.out.println(profit.maxProfit(prices2));
    }
}

