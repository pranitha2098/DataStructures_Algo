package Arrays;

import java.util.Arrays;

public class Array {
//    in java arrays are of fixedLength
//    it is indexed and indexing stats from 0


    public static void main(String[] args) {
//        initialize an array
int[] k ={1,23,6,5,7,7,8};
int[] l = new int[5];

//lookUp in array , time complexity = O(1)
//        System.out.println(k[4]);
//       adding a value to an index in arrray , TC = O(1)
        l[0] =3;
        System.out.println(l[0]);
        //       update a value to an index in arrray , TC = O(1)
        l[0] = 7;
        System.out.println(l[0]);

//        Arrays Class
int[] a= {};
int[] b={};
//a[0]=5;
//a[1]=8;

        System.out.println(  Arrays.binarySearch(k,56));
        System.out.println(Arrays.toString(k));
        int[] j = Arrays.copyOfRange(k,4,4);
        System.out.println( Arrays.toString(j)  );
        OurArraysImpl ob=new OurArraysImpl();
//            System.out.println(ob.toString(a));
//        System.out.println(ob.same(a,b));
        System.out.println(Arrays.toString(ob.copyOfRange(k,4,4)));












    }


}
