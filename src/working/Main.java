package working;

import java.util.BitSet;

/**
 *
 * @author Ville Niemi
 */
public class Main {

    public static void main(String[] args) {
        WorkCheck w = new WorkCheck();
//        WorkCheck w = new WorkCheck(10, 22);
//        WorkCheck w = new WorkCheck(22, 34, 46, 58);
//        BitSet bitsWorkers = new BitSet(64);
//        BitSet bitsWork = new BitSet(64);
        int turn = 0;
               
        while(w.GetToDoWork() != 0){
            w.Check();
            turn += 1;
            if(turn > 50 || w.GetWorkers() == 0){
                System.out.println(w.GetToDoWork() + " Työtehtävää ei voi tehdä.");
                break;
            }
        }
        
        System.out.println(w.PrintWorker(25));
    }
       
}
