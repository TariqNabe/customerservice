public class DeleteDuplicate
{
    public static void main(String[] args)
    {
        int i = 0, j, k;
        int[] Dup_Count_arr = {10, 15, 25, 10, 8, 12, 10, 15, 55, 10, 60};
        int Size = Dup_Count_arr.length - 1;//-
        while(i < Size)
        {
            j = i + 1;
            while(j < Size)
            {
                if(Dup_Count_arr[i] == Dup_Count_arr[j])
                {
                    k = j;
                    while(k < Size)
                    {
                        Dup_Count_arr[k] = Dup_Count_arr[k + 1];
                        k++;
                    }
                    Size--;
                    j--;
                }
                j++;
            }
            i++;
        }
        System.out.print("\nThe Final Array after Deleting Duplicates  = " );
        for(i = 0; i < Size; i++)
        {
            System.out.format("%d ", Dup_Count_arr[i]);
        }
    }
}
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the length of array:");
//        int length = in.nextInt();
//        int[] array1 = new int[length];
//        System.out.println("Enter the elements of array:");
//        for(int i=0;i<array1.length;i++)
//        {
//            array1[i]=in.nextInt();
//        }
//        for(int i=0;i<array1.length;i++)
//        {
//            for(int j=i+1;j<=array1.length;j++)
//            {
//                if(j==i)
//                {
//                    System.out.println(array1[i]);
//                }
//            }
//        }
