package TaskPackage;

import java.util.Comparator;

public class CommodityLengthComparator implements Comparator<Commodity> {
    @Override
    public int compare(Commodity o1, Commodity o2) {
        return o2.getLengthOfCommodity().compareTo(o1.getLengthOfCommodity());
    }
}
