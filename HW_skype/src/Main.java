public class Main {


    public static void main(String[] args) {



        int arr []= {65, 25, 12, 22,11};

        int arr1 [] = new int[5];
        System.out.println(sort(arr, 5));

    }


    public static int[] sort (int[] arr , int length){
        int i;
        int j;
        for (i=0; i<length-1; i++){
            for(j=0; j<length-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;

    }
}
