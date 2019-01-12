public class BinarySearch {

    private static Object Integer;
    private static java.lang.Integer value;

    public static int main(String[] args) {
       //Integer val = binarySearch(arr, 7);
       //sout(val);
        Integer [] arr = {1, 2, 3, 4, 5};

        public static Integer binarySearch(Integer [] arr, Integer value ){
            int left = 0;
            int right = arr.length;

            while (true){
                int mid = left + (right - left)/2;
                if (arr[mid].equals(value)){
                    return mid;
                }
                if (arr[mid]>value){
                    right=mid;
                }
                else {
                    left = mid;
                }
            }

    }
}
