import java.util.*;
public class Merge{

  public static void merge(int[]data, int lo, int mid, int hi){
   //System.out.println(Arrays.toString(data));
    int lsize = mid - lo + 1;
    int rsize = hi - mid;
    //assign value to temp data set;
    int[] left = new int[lsize];
    for (int i = 0; i < lsize; i++){
      left[i] = data[i];
    }
    int[] right = new int[rsize];
    for (int i = 0; i < rsize; i++){
      right[i] = data[rsize + i];
    }
    // System.out.println(Arrays.toString(left));
    // System.out.println(Arrays.toString(right));

    int i = 0; //index of original data as you copy down
    int r = 0; //right array index
    int l = 0; //left array index

    while (r < rsize && l < lsize){
      if(right[r] <= left[l]){
        data[i] = right[r];
        r++;
      }
      else{
        data[i] = left[l];
        l++;
      }
      i++;
    }
    // if either of two arrays is filled out first then you copy the remaining elements of the other
    while (r < rsize){
      data[i] = right[r];
      r++;
      i++;
    }
    while(l < lsize){
      data[i] = left[l];
      l++;
      i++;
    }
    // System.out.println(Arrays.toString(data));
    return ;
}

  public static void mergesort(int[] data, int lo, int hi){
    if (lo >= hi){
      return ;
    }
      int mid = (hi + lo) / 2;
      mergesort(data, lo ,mid);
      mergesort(data, mid + 1 , hi);
      merge(data, lo, mid, hi);
  }

  public static void mergesort(int[] data){
    mergesort(data, 0, data.length - 1);
  }

  public static void insertionSort(int[] data, int lo, int hi){
    for(int i = lo + 1; i <= hi; i++){
      int current = data[i];
      int j = i - 1;
      while(j > lo && data[j] > current){
        data[j + 1] = data[j];
        j--;
      }
      data[j + 1] = current;
    }
  }

  public static void main(String[] args){
    int[] test= {5,3,2,4,1};
    mergesort(test,0, test.length-1);

  }

}
