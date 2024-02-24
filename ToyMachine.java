package toyShop;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class ToyMachine extends ToyFill{

    
    int[] idArray;
    Float[] dropFreqArray;
    String[] nameArray;
    
    PriorityQueue<ToyConstructor> pq = new PriorityQueue<>();
    
    public ToyMachine(int amountOfPos){
        this.idArray = new int[amountOfPos];
        this.dropFreqArray = new Float[amountOfPos];
        this.nameArray = new String[amountOfPos];
    }
    
    @Override
    public int get(){
        int randomNum = 0 + (int)(Math.random() * ToyMachine.this.idArray.length);
        return randomNum;
    }
    
    
    @Override
    public void put(String toy1, String toy2, String toy3) {
        String [] all = new String [] {toy1, toy2, toy3};

        for (String toy : all) {
            String idValue = toy.split(" ")[0];
            String chanceValue = toy.split(" ")[1];
            String nameValue = toy.split(" ")[2];

            idArray[Integer.parseInt(idValue)] = Integer.parseInt(idValue);
            dropFreqArray[Integer.parseInt(idValue)] = Float.parseFloat(chanceValue);
            nameArray[Integer.parseInt(idValue)] = nameValue;

        }
        System.out.println(Arrays.toString(idArray));
        System.out.println(Arrays.toString(dropFreqArray));
        System.out.println(Arrays.toString(nameArray));
    }
    
    public void pollInQueue(ArrayList<ToyConstructor> toys){
      
        for (ToyConstructor toy : toys) {
            int curDrop = get();
            if (curDrop == toy.getId()){
                pq.add(toy);
                String pollMsg = "Игрушка <" + toy + "> помещена в МагазинИгрушек";
                FileWorking fw = new FileWorking();
                fw.save(pollMsg);
                System.out.println("Игрушка <" + toy + "> помещена в МагазинИгрушек");
            }    
        }
    }

    public void takeFromQueue(){
        while(!pq.isEmpty()){
            ToyConstructor curDrop=pq.remove();
            System.out.println("Вы достали игрушку: " + curDrop);
        }
    }
    
    public int[] getIdArray() {
        return idArray;
    }
    
    public String[] getNameArray() {
        return nameArray;
    }

    public Float[] getDropFreqArray() {
        return dropFreqArray;
    }


}
