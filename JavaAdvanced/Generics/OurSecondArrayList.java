package JavaAdvanced.Generics;

import java.util.Arrays;

public class OurSecondArrayList<E> {

    private Object[] array =   new Object[3];

    int presentPosition;

   public void p(E e){
       System.out.println(e);
   }

    public void add(E num) { //O(1) O(n)
        if (array.length == presentPosition)
            increaseLength();
        array[presentPosition] = num;
        presentPosition++;

    }
    private void increaseLength() {//O(1)  O(n)

        Object[] arr = new Object[array.length * 2];
        for (int i = 0; i < array.length; i++)
            arr[i] = array[i];
        array = arr;
    }

    @Override
    public String toString() { //O(n)
        Object[] array_final = Arrays.copyOfRange(array, 0, presentPosition);
        return
                Arrays.toString(array_final)
                ;
    }







}
