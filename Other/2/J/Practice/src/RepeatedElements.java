public class RepeatedElements
{
    public static void main(String[] args)
    {
        int arr[]={50,20,10,40,20,10,10,60,30,70};
        int temp[]=new int[arr.length];
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            int element = arr[i];
            boolean flag = false;
            for (int j = 0; j < count; j++)
            {
                if (temp[j] == element)
                {
                    flag = true;
                    break;
                }
            }

            if (flag)
            {
                continue;
            }
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[j] == element)
                {
                    temp[count++] = element;
                    break;
                }
            }
        }
          System.out.println("Total Values repeated: "+count);
          System.out.println("Repeated elements are");
            for(int i=0;i<count;i++)
            {
                System.out.print(temp[i]+" ");
            }
    }
}
