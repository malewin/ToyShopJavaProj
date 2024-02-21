

package toyShop;


public class ToyConstructor {

    protected int id;
    protected float dropFreq;
    protected String name;
    
    
    public ToyConstructor(int id, float dropFreq, String name){
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
    
    public float getDropFreq() {
        return dropFreq;
    }
    
    public void setDropFreq(float dropFreq) {
        this.dropFreq = dropFreq;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}