package sort;

/**
 * @Description: 堆排序
 * @Author idota
 * @Date 2018/5/17
 */

public class HeapSort {


    /**
     * @param arr 无序数组
     */
    public static void sort(int[] arr) {
        //1.建堆
        arr = buildHeap(arr, 0);
        //2.调整然后继续建立堆;
        for (int i = 0; 0 < arr.length - i; ) {
            int temp = arr[0];
            arr[0] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
            i++;
            arr = buildHeap(arr, i);
        }
        for (int i : arr) {
            System.out.printf("%d,", i);
        }
    }


    /**
     * 建立堆结构
     *
     * @param arr
     * @param n
     * @return
     */
    private static int[] buildHeap(int[] arr, int n) {
        int length = arr.length - n;
        for (int i = (length / 2) - 1; i >= 0; i--) {
            int leftIndex = i * 2 + 1;
            int rightIndex = i * 2 + 2;
            //存在右边节点
            if (rightIndex < length) {
                //左右子节点中最大的和父节点交换
                if (arr[leftIndex] > arr[rightIndex]) {
                    if (arr[i] < arr[leftIndex]) {
                        int temp = arr[leftIndex];
                        arr[leftIndex] = arr[i];
                        arr[i] = temp;
                    }
                }
                if (arr[rightIndex] > arr[i]) {
                    if (arr[i] < arr[rightIndex]) {
                        int temp = arr[rightIndex];
                        arr[rightIndex] = arr[i];
                        arr[i] = temp;
                    }

                }
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,55,1,2,3,111,222,11,111,16,12312,12312, 444, 555, 123123, 5555};
        sort(arr);
    }

}
