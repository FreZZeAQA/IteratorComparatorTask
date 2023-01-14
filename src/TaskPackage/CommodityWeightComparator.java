package TaskPackage;

import java.util.Comparator;

public class CommodityWeightComparator implements Comparator<Commodity> {
    @Override
    public int compare(Commodity o1, Commodity o2) {
        return o2.getWeight().compareTo(o1.getWeight());
    }
}
