public class Main {
    public static void main(String[] args) {

        int[] arr = {1,5,15,20,35,46,88,95,100};
        int index_of_num = binary_search_recursion(arr,0,arr.length - 1,35);
        System.out.println(arr[index_of_num]);
        System.out.println("---------------------");
        int[] arr_bbs = {59,45,5,5,86,54,89,15,2,1,3,3,4,6,7,8,45,1000,2000};
        bubble_sort(arr_bbs);
        for (int i : arr_bbs) {
            System.out.println(i);
        }




    }

    public static int binary_search(int[] arr,int searched_num) {
        int low = 0;
        int high = arr.length - 1;
        int mid = (low + high)/2;
        while (low != high && searched_num != arr[mid]) {
            if (searched_num > arr[mid]) {
                low = mid + 1;
            }
            else if (searched_num < arr[mid]) {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        return mid;
    }

    public static int binary_search_recursion(int[] arr,int low,int high,int searched_num) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (searched_num == arr[mid])
                return mid;
            else if (searched_num > arr[mid]) {
                low = mid + 1;
                binary_search_recursion(arr,low,high,searched_num);
            } else {
                high = mid - 1;
                binary_search_recursion(arr,low,high,searched_num);
            }
        }
        return -1;
    }

    public static void bubble_sort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

}