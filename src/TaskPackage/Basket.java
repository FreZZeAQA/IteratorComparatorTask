package TaskPackage;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Basket {

    List<Commodity> commodities = new LinkedList<>();

    public List<Commodity> getCommodities() {
        return commodities;
    }

    public Commodity addCommodityToList() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nWrite name of Commodity:");
        String name = scanner.nextLine();
        System.out.print("Write length of Commodity:");
        double lengthOfCommodity = scanner.nextDouble();
        System.out.print("Write width of Commodity:");
        double widthOfCommodity = scanner.nextDouble();
        System.out.print("Write weight of Commodity:");
        double weight = scanner.nextDouble();
        Commodity commodity = new Commodity(name, lengthOfCommodity, widthOfCommodity, weight);
        commodities.add(commodity);
        return commodity;
    }

    public void removeCommodityFromList() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write commodity number to delete it:");
        int commodityNumber = scanner.nextInt();
        commodities.remove(commodityNumber - 1);
    }

    public void replaceCommodity() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write commodity number to replace it:");
        int commodityNumber = scanner.nextInt() - 1;
        Commodity commodity = commodities.get(commodityNumber);
        commodities.remove(commodity);
        commodities.set(commodityNumber,addCommodityToList());
    }

    public void outputCommodityFromList() {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Write sequence number to output commodity:");
        int sequenceNumber=scanner.nextInt()+1;
        Commodity commodity = getCommodities().get(sequenceNumber);
        System.out.println(commodity);
    }
}
