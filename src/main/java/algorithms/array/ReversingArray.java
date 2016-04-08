package algorithms.array;

/**
 * User: "john.shim"
 * Date: 2016. 2. 5.
 *
 * refer to: http://java67.blogspot.kr/2016/01/java-program-to-reverse-array-in-place.html
 */
public class ReversingArray {
    public static void reverse(int [] arr) {
        for (int i = 0 ; i < arr.length / 2 ; i++) {
            int tmp = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i];
            arr[i] = tmp;
        }
    }

    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3, 4, 5, 6};
        int [] arr2 = {7, 8, 9, 10, 11};

        reverse(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println("--");
        reverse(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
