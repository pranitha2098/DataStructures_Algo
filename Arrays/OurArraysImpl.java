package Arrays;

public class OurArraysImpl implements OurArrays {

    @Override
    public int[] copyOfRange(int[] arr, int i, int j) {
        if(i>j)
            throw new IllegalArgumentException();
            int[] ar = new int[j - i];
            if(i>arr.length-1 && j>arr.length-1)
                return ar;
            if(j>arr.length-1)
                j=arr.length;
            for (int k = i, h = 0; k < j; k++, h++)
                ar[h] = arr[k];


            return ar;

    }

    @Override
    public boolean same(int[] arr1, int[] arr2) {
        if(arr1.length!=arr2.length)
            return false;
        else
        {
            for(int i=0;i<arr1.length;i++) {
                if (arr1[i]!= arr2[i])
                    return false;
            }
            return true;
        }


    }

    @Override
    public String toString(int[] array) {
//        if(array.length==0)
//            return "[]";
        String s="";
        for(int i=0;i<array.length;i++)
            s=s+" "+array[i]+",";
        if(s.length()>0)
        s=s.substring(0,s.length()-1);
        s=s.trim();
        s="["+s+"]";


        return s;
    }
}
