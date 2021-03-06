import java.util.*;
public class Merge{

  public static void merge(int[]data, int[] left, int[] right){

    int i = 0; //index of original data as you copy down
    int r = 0; //right array index
    int l = 0; //left array index
    int rsize = right.length;
    int lsize = left.length;
    while (r < rsize && l < lsize){
      if(right[r] > left[l]){
        data[i] = left[l];
        l++;
      }
      else{
        data[i] = right[r];
        r++;
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
      return;
    }
    if (hi -lo < 25){
      insertionSort(data, lo, hi);
      return ;
    }
      int mid = data.length/2;
     //System.out.println(Arrays.toString(data));
      int lsize = mid;
      int rsize = data.length - mid;
      //assign value to temp data set;
      int[] left = new int[lsize];
      for (int i = 0; i < left.length; i++){
        left[i] = data[i];
      }
      int[] right = new int[rsize];
      for (int i = 0; i < right.length; i++){
        right[i] = data[mid + i];
      }
      mergesort(left, 0, left.length-1);
      mergesort(right,0, right.length - 1);
      merge(data,left,right);
    }

  public static void mergesort(int[] data){
    mergesort(data, 0, data.length - 1);
  }

  public static void insertionSort(int[] data, int lo, int hi){
    for(int i = lo + 1; i <= hi; i++){
      int current = data[i];
      int j = i - 1;
      while(j >= lo && data[j] > current){
        data[j + 1] = data[j];
        j--;
      }
      data[j + 1] = current;
    }
  }

  public static void main(String[] args){
    int[] test= {5,3,2,4,1};
    int[] test2= {5,3,2,4,1};
    // mergesort(test);
    Arrays.sort(test);
    System.out.println(Arrays.toString(test));
    insertionSort(test2,0,test2.length - 1);
    System.out.println(Arrays.toString(test2));

  }

}
