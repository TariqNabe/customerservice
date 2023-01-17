import java.util.Scanner;
public class TaskThree {
    public static void main(String[] args)
    {
        char[] ch = {'!','@','#','$','%','^','&','*','-'};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length");
        int num = in.nextInt();
        System.out.println("Enter width");
        int num2 = in.nextInt();
        System.out.println("Enter symbol 1(!)-2(@)-3(#)-4($)-5(%)-6(^)-7(&)-8(*)-9(-)");
        int symbol = in.nextInt();
        
   try {
               System.out.println(getRectangleString(num, num2, ch[symbol-1]));
            }
            
            catch (IllegalArgumentException e)
             {
                  System.out.println("Error: " + e.getMessage());
                               }

    }
    
    
    
    public static String getRectangleString(int rows, int cols, char symbol)
                                                      throws IllegalArgumentException 
                                                      {
        String rect = "";                                              
                                                                                      
        for(int i=1; i<=rows; i=i+1)
        {
            for(int j=1; j<=cols; j=j+1)
            {
              rect = rect + symbol;  
            }
            rect = rect + "\n";
        }
        
        return  rect;
                                                      
 }   
    
    
    
    
}
