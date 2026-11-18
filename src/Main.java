import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] products = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        int[][] sales = new int[3][3];
        for(int i=0;i<products.length;i++){
            for(int j=0;j<3;j++){
                System.out.println(" Enter number of sales for month " + (j+1)+ " for " + products[i]+ " mattress: " );
                sales[i][j]=scanner.nextInt();
            }
            System.out.println();

        }
        Product productLogic=new Product(products,sales);
        PrintProduct print= new PrintProduct();
        print.printReport(productLogic);

        scanner.close();
    }
}