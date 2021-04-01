package hust.soict.hedspi.garbage;

import java.util.Random;

public class NoGarbage {
    public static void main(String[] args) {
        Random r= new Random(1000);
        long start = System.currentTimeMillis();
        StringBuilder s = new StringBuilder();
        for(int i= 0; i<100000; i++)
            s.append(r.nextInt(2));
        System.out.println(System.currentTimeMillis()-start);
    }
}
