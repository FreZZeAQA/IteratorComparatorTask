package TaskPackage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Basket basket = new Basket();
        String choice;
        do {
            //Looped menu where u choose a manipulation by number or end program by pressing<ENTER>;
            System.out.println("1.Add commodity to basket");
            System.out.println("2.Remove commodity from basket");
            System.out.println("3.Replace commodity");
            System.out.println("4.Filter commodities by name");
            System.out.println("5.Filter commodities by length");
            System.out.println("6.Filter commodities by width");
            System.out.println("7.Filter commodities by weight");
            System.out.println("8.Output commodity by sequence number");
            System.out.println("Write choice and press <ENTER>:");
            choice = scanner.nextLine();
            switch (choice) {
                case "1" -> basket.addCommodityToList();
                case "2" -> basket.removeCommodityFromList();
                case "3" -> basket.replaceCommodity();
                case "4" -> {
                    NameComparator nameComparator = new NameComparator();
                    basket.getCommodities().sort(nameComparator);
                    System.out.println(basket.getCommodities());
                }
                case "5" -> {
                    CommodityLengthComparator commodityLengthComparator = new CommodityLengthComparator();
                    basket.getCommodities().sort(commodityLengthComparator);
                    System.out.println(basket.getCommodities());
                }
                case "6" -> {
                    CommodityWidthComparator commodityWidthComparator = new CommodityWidthComparator();
                    basket.getCommodities().sort(commodityWidthComparator);
                    System.out.println(basket.getCommodities());
                }
                case "7" -> {
                    CommodityWeightComparator commodityWeightComparator = new CommodityWeightComparator();
                    basket.getCommodities().sort(commodityWeightComparator);
                    System.out.println(basket.getCommodities());
                }
                case "8" -> basket.outputCommodityFromList();
            }
        } while (choice.isEmpty());
    }
}


