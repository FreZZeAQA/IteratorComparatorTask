package TaskPackage;

import java.util.Comparator;

public class CommodityWidthComparator implements Comparator<Commodity> {
    @Override
    public int compare(Commodity o1, Commodity o2) {
        return o2.getWidthOfCommodity().compareTo(o1.getWidthOfCommodity());
    }
}
