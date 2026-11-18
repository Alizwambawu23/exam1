import jdk.swing.interop.SwingInterOpUtils;

public class PrintProduct {
    public void printSales(int total){
        System.out.println("Total Product Sales:" + total);
    }
    public  void  printAverageSales(double average){
        System.out.println("Most Popular Product: " + (int)average);
    }
    public void printMostPopularProduct(String productName){
        System.out.println("Most Popular Product: " +productName);
    }
    public void printReport(Product product){
        System.out.println("Product sales report-2026");
        System.out.println("**************************");
        printSales(product.GetTotalProductsSold());
        printAverageSales(product.GetAverageProductSold());
        printMostPopularProduct(product.GetMostPopularProduct());
    }

}
