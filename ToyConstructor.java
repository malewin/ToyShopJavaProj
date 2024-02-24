

package toyShop;


public class ToyConstructor implements Comparable<ToyConstructor>{

    protected int id;
    protected float dropFreq;
    protected String name;
    
    
    public ToyConstructor(int id, Float dropFreq, String name){
        this.id = id;
        this.dropFreq = dropFreq;
        this.name = name;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public Float getDropFreq() {
        return dropFreq;
    }
    
    public void setDropFreq(Float dropFreq) {
        this.dropFreq = dropFreq;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " " + dropFreq + " " + name;
    }

    @Override

    public int compareTo(ToyConstructor o) {
        if (id > o.getId())
            return 1;
        if (id < o.getId())
            return -1;
        return 0;
    }
    
}