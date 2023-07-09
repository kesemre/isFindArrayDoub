import java.util.Arrays;

public class Main {



    static boolean isFind(int[] arr,int num){
        for(int i:arr){
            if(i==num){
                return false;
            }
        }
         return true;

    }
    public static void main(String[] args) {
        int[] arr = {1,4,8,4,2,8,3,7,2,1,6,3,5,8,6};
        int[ ] arrTemp= new int[arr.length];
        int startİndex = 0;
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if ((i!=j)&&(arr[i]==arr[j])&&(arr[i]%2==0)&&(isFind(arrTemp,arr[i]))){

                    arrTemp[startİndex++]=arr[i];
                    }
                }
        }
        System.out.println(Arrays.toString(arrTemp));

    }
}