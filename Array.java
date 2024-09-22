import java.util.Arrays;

public class Array {

    public static int[] add(int value,int index,int[] arr)
    {
        int[] arr2 = new int[arr.length+1];

        for (int i = 0; i < index; i++) {
            arr2[i] = arr[i];
        }

        arr2[index] = value;
        
        for (int i = index; i < arr.length; i++) {
            arr2[i + 1] = arr[i];
        }
        return arr2;
    }

    public static int[] addEnd(int value,int[] arr)
    {
        int[] arr2 = Arrays.copyOf(arr, arr.length+1);
        arr2[arr.length+1] = value;
        return arr2;
    }

    public static int[] remove(int index,int[] arr)
    {
        int[] arr2 = new int[arr.length-1];

        for (int i = 0; i < index; i++) {
            arr2[i] = arr[i];
        }

        for (int i = index; i < arr2.length; i++) {
            arr2[i] = arr[i+1];
        }
        return arr2;
    }

    public static int[] removeEnd(int[] arr)
    {
        return Arrays.copyOf(arr, arr.length-1);
    }

    public  static int[] unificationArray(int[] arr1,int[] arr2){
        int[] arr3 = Arrays.copyOf(arr1, arr1.length + arr2.length);
        int k = 0;
        for (int i = arr1.length;i < arr3.length;i++){
            arr3[i] = arr2[k];
            k++;
        }
        return arr3;
    }

    public static int[] sumArray(int[] arr1,int[] arr2)
    {
        int maxLength = Math.max(arr1.length, arr2.length);
        int[] result = new int[maxLength];

        for (int i = 0; i < maxLength; i++) {
            if (i < arr1.length) {
                result[i] += arr1[i];
            }

            if (i < arr2.length) {
                result[i] += arr2[i];
            }
        }
        return result;
    }

    public static int[] minusArray(int[] arr1,int[] arr2)
    {
        int maxLength = Math.max(arr1.length, arr2.length);
        int[] result = new int[maxLength];

        for (int i = 0; i < maxLength; i++) {
            if (i < arr1.length) {
                result[i] += arr1[i];
            }

            if (i < arr2.length) {
                result[i] -= arr2[i];
            }
        }
        return result;
    }

    public static int[] multiplyArray(int[] arr1,int[] arr2)
    {
        int maxLength = Math.max(arr1.length, arr2.length);
        int[] result = new int[maxLength];

        for (int i = 0; i < maxLength; i++) {
            if (i < arr1.length) {
                result[i] += arr1[i];
            }

            if (i < arr2.length) {
                result[i] *= arr2[i];
            }
        }
        return result;
    }

    public static int[] shareArray(int[] arr1,int[] arr2)
    {
        int maxLength = Math.max(arr1.length, arr2.length);
        int[] result = new int[maxLength];

        for (int i = 0; i < maxLength; i++) {
            if (i < arr1.length) {
                result[i] += arr1[i];
            }

            if (i < arr2.length) {
                result[i] /= arr2[i];
            }
        }
        return result;
    }
}
