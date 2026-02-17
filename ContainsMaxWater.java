package ArrayList;

import java.util.ArrayList;

public class ContainsMaxWater {
    //Two ptr approach O(n) because rtptr = n
    public static int storeWater(ArrayList<Integer> height){
        int leftPtr = 0;
        int rightPtr = height.size()-1;
        int maxWater = 0;

        while (leftPtr < rightPtr){
            int ht = Math.min(height.get(leftPtr), height.get(rightPtr));
            int width = rightPtr - leftPtr;
            int water = ht*width;
            maxWater = Math.max(water,maxWater);

            if(height.get(leftPtr) < height.get(rightPtr)){
                leftPtr++;
            }
            else {
                rightPtr--;
            }
        }
        return maxWater;
    }
    //Brute Force-On^2
    public static int getWater(ArrayList<Integer> l){
        int maxWater = 0;

        for (int i=0; i<l.size(); i++){
           for (int j=i+1; j<l.size(); j++){
               int height = Math.min(l.get(i),l.get(j));
               int width = j-1;
               int water = height*width;
               maxWater = Math.max(water,maxWater);
           }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> h = new ArrayList<>();
        h.add(1);
        h.add(8);
        h.add(6);
        h.add(2);
        h.add(5);
        h.add(4);
        h.add(8);
        h.add(3);
        h.add(7);

        System.out.println(getWater(h));
        System.out.println(storeWater(h));
    }

}
