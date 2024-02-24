package toyShop;

import java.util.Comparator;

import javax.management.RuntimeErrorException;

public class ToyComparator  implements Comparator<ToyConstructor>{


    @Override
    public int compare(ToyConstructor o1, ToyConstructor o2){
        int result = o1.getName().compareTo(o2.getName());
        if (result == 0) {
            result = o1.getDropFreq().compareTo(o2.getDropFreq());
        } else {
            return result;
        }
        throw new RuntimeErrorException(null);
    }
}
