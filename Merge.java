import java.util.*;
public class Merge{

  public static void mergesort(int[]data){
    if (data.length <= 1){
    return ;
    }
    //assign value to temp data set;
    int mid = (data.length) / 2 ;
    int[] lefthalf = new int[mid];
    for (int i = 0; i < mid; i++){
      lefthalf[i] = data[i];
    }
    int[] righthalf = new int[data.length - mid];
    for (int i = 0; i < data.length - mid; i++){
      righthalf[i] = data[mid + i];
    }
    System.out.println(Arrays.toString(lefthalf));
    System.out.println(Arrays.toString(righthalf));

    // for (int i = 0; i < data.length; i++){
    //   if (lefthalf[i] < data[i]){
    //     dholder = data[i];
    //     hol
    //   }
    //   else if (righthalf[i] <
    // }

    return ;
}

  public static void main(String[] args){
    int[] test= {9,8,7,6,5,4,3,2,1,0,0,0,0,0,0,0};
    mergesort(test);
  }

}
