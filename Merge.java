public class Merge{

  public static void mergesort(int[]data){
    if (data.length <= 1){
    return ;
    }
    int mid = (data.length - 1) / 2;
    int[] lefthalf = new int[mid];
    for (int i = 0; i < mid; i++){
      lefthalf[i] = data[i];
    }
    int[] righthalf = new int[mid + 1];
    for (int i = mid; i < data.length - 1; i++){
      righthalf[i] = data[i];
    }
    return ;
}


  public static void main(String[] args){

  }

}
