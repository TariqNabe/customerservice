import java.util.Arrays;
public class CopyArray
{
    public static void main(String[] args)
    {
        int src1[] = { 10, 20, 30, 40, 50 };
        int src2[] = { 9, 18, 27, 36, 45 };
        int newArray[] = mergeSort(src1, src2);
        System.out.println("Array1 = " + Arrays.toString(src1));
        System.out.println("Array2 = " + Arrays.toString(src2));
        System.out.println("Merged Array = " + Arrays.toString(newArray));
    }
    private static int[] mergeSort(int[] src1, int[] src2)
    {
        int merge[] = new int[src1.length + src2.length];
        int i = 0, j = 0, k = 0;
        while (i < src1.length && j < src2.length)
        {
            if (src1[i] < src2[j])
                merge[k++] = src1[i++];
            else
                merge[k++] = src2[j++];
        }
        while (i < src1.length)
        {
            merge[k++] = src1[i++];
        }
        while (j < src2.length)
        {
            merge[k++] = src2[j++];
        }
        return merge;
    }
}