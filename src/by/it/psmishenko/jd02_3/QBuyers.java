package by.it.psmishenko.jd02_3;


import java.util.concurrent.ConcurrentLinkedDeque;


/**
 * Created by user on 31.03.2017.
 */
public class QBuyers {
    private final static ConcurrentLinkedDeque<Buyer> queue = new ConcurrentLinkedDeque<>();// priority q dlya pens

   static void add(Buyer buyer){
       queue.addLast(buyer);

    }
    static Buyer extract(){
       return queue.pollFirst();
    }

  static   int getCount(){
       return queue.size();
    }



}
