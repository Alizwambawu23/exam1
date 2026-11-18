import java.util.Arrays;

public class Product implements IProduct {

    private String[][] products;
    private int[][] sales;

    public Product(String[] product, int[][] sales) {
        this.products = products;
        this.sales = sales;
    }

    public int GetTotalProductsSold() {
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
        }
        return total;
    }

    @Override
    public int GetTotalProductSold() {
        return 0;
    }

    public double GetAverageProductSold() {
        int total = GetTotalProductsSold();
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            count += sales[i].length;
        }
        return (double) total / count;
    }

    @Override
    public String GetMostPopularProduct() {
        int highestTotal = -1;
        String mostPopular = "";

        for (int i = 0; i < products.length; i++) {
            int productTotal = 0;
            for (int j = 0; j < sales[i].length; j++) {
                productTotal += sales[i][i];
            }
            if (productTotal > highestTotal) {
                highestTotal = productTotal;
                mostPopular = Arrays.toString(products[i]);

            }
        }
        return mostPopular;
    }
    }

