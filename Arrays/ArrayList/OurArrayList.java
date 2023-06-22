package Arrays.ArrayList;


import java.util.Arrays;

public class OurArrayList {

    private int[] array = new int[3];
    int presentPosition;


    public void add(int num) { //O(1) O(n)
        if (array.length == presentPosition)
            increaseLength();
        array[presentPosition] = num;
        presentPosition++;

    }

    private void increaseLength() {//O(1)  O(n)

        int[] arr = new int[array.length * 2];
        for (int i = 0; i < array.length; i++)
            arr[i] = array[i];
        array = arr;
    }

    public void removeLast() {//O(1)
        if (presentPosition == 0)
            return;
        array[--presentPosition] = 0;
    }

    public int size() {
        return presentPosition;


    }

    public boolean contains(int num) { //O(1)  O(n)
        for (int i = 0; i < presentPosition; i++)
            if (array[i] == num)
                return true;
        return false;
    }

    public void removeFirstAppearance(int num) { //  O(n)
        int ind = indexOf(num);
        if (ind == -1)
            return;
        for (int i = ind; i < presentPosition; i++)
            array[i] = array[i + 1];
        --presentPosition;

    }

    private int indexOf(int num) {//O(1)  O(n)
        for (int i = 0; i < presentPosition; i++)
            if (num == array[i])
                return i;
        return -1;
    }


    public void addALl(OurArrayList arr){ //O(n)

        int [] arry=arr.toArray();
        for(int i=0;i<arry.length;i++)
            add(arry[i]);
    }

    public int[] toArray(){
        return Arrays.copyOfRange(array,0,presentPosition);

    }
    public int[] commonElements(OurArrayList arr) {//O(1)  O(n*n)+O(n)
        int[] other = arr.toArray();
        int size = (array.length > other.length) ? other.length : array.length;
        int[] narr = new int[size];
        int c=0;
        for (int i = 0; i<array.length;i++){
            for(int j=0;j<other.length;j++)
                if(array[i]==other[j] && !hasElement(narr,array[i])) {
                    narr[c++] = array[i];
                    break;
                }

        }
return Arrays.copyOfRange(narr,0,c);

    }

    private boolean hasElement(int[] arry, int num){ //O(1)  O(n)
        for(int i=0;i<arry.length;i++)
            if(arry[i]==num)
                return true;
        return false;
    }


    @Override
    public String toString() { //O(n)
        int[] array_final = Arrays.copyOfRange(array, 0, presentPosition);
        return
                Arrays.toString(array_final)
                ;
    }
}


