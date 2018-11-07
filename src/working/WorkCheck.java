package working;

import java.util.BitSet;

public class WorkCheck {
    private BitSet bitsWorkers;
    private BitSet bitsWork;
    
    public WorkCheck(){
        bitsWorkers = new BitSet(64);
        bitsWork = new BitSet(64);
        
        for(int i = 0; i < bitsWorkers.size(); i++){
            bitsWorkers.set(i, true);
        }
    }
    
    public WorkCheck(int min, int max){
        bitsWorkers = new BitSet(64);
        bitsWork = new BitSet(64);
        
        bitsWorkers.set(min, max);
    }
    
    public WorkCheck(int min1, int max1, int min2, int max2){
        bitsWorkers = new BitSet(64);
        bitsWork = new BitSet(64);
        
        bitsWorkers.set(min1, max1);
        bitsWork.set(min2, max2);
    }
    
    public void Check(){
        if(bitsWorkers.cardinality() == 64){
            bitsWork.set(0, 64);
            System.out.println("Kaikki työtehtävät voidaan toteuttaa.");
        }else if(bitsWork.cardinality() == 64){
            System.out.println("Ei ole tehtäviä töitä.");
        }else{
            for(int i = 0; i < bitsWorkers.size(); i++){           
                if(bitsWorkers.get(i) == true){
                    if(bitsWork.get(i) == false){
                        bitsWork.set(i, true);
                    }
                }
            }
        }
    }
    
    public int GetWorkers(){
        return bitsWorkers.cardinality();
    }
    
    public int GetToDoWork(){
        return 64 - bitsWork.cardinality();
    }
    
    public String PrintWorker(int i){
        return "Työntekijä: " + i + ", töissä on " + bitsWorkers.get(i) + " ja työtehtävä on " + bitsWork.get(i);
    }
}
