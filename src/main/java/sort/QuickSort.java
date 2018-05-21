package sort;

/**
 * @Description: 快速排序
 * @Author idota
 * @Date 2018/5/21
 */
public class QuickSort {


    /**
     * @param arr  传入的数组
     * @param low  数组起始位置
     * @param high 数组结尾位置
     */
    public static void sort(int[] arr, int low, int high) {
        int l = low;
        int h = high;
        int povit = arr[low];

        while (l < h) {
            while (l < h && arr[h] >= povit)
                h--;
            if (l < h) {
                int temp = arr[h];
                arr[h] = arr[l];
                arr[l] = temp;
                l++;
            }

            while (l < h && arr[l] <= povit)
                l++;

            if (l < h) {
                int temp = arr[h];
                arr[h] = arr[l];
                arr[l] = temp;
                h--;
            }
        }
        if (l > low) sort(arr, low, l - 1);
        if (h < high) sort(arr, l + 1, high);
    }

    public static void main(String[] args) {
        int[] arr = {14, 12, 23, 4, 5, 6};
        sort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }

}
