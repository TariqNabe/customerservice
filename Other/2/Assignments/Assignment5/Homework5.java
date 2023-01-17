/*
Tariq Nabe
Ashraf Nazim
10/24/2022
Project 5
*/

import java.util.Scanner;
import java.io.*;


public class Homework5 {

        public static void main(String[] args) throws IOException{
        
        Scanner keyboard = new Scanner(System.in);
       
               String filename = "";// variable for input filename
               String  outputFileName = "";//variable for outputFileName 
               int one = 0;//rows in array
               int two = 0;//cols in array
               String i = "";//i for first while loop
               Scanner inputFile = null;//for input scanning
               int input55 = 0;//for if choices
              
              System.out.print("Portable Pixmap (PPM) Image Editor\n\n");//main menu

               
   do {//do for question input and output with try catch
        try {//try case
        System.out.print("Enter name of image file: ");
        filename = keyboard.nextLine();
        File file = new File(filename);//file object
         inputFile = new Scanner(file);//Scanner object
              break;//break if file found
        }
        catch(IOException exception)//catch if file not found
        {
        System.out.println("File not found."); 
        }
          } while(i != filename);//break loop if file found
          
           System.out.print("\nEnter name of output file: ");//file output name
           outputFileName = keyboard.nextLine();//variable to hold outputname file
           File file = new File(outputFileName);//create outputfile name object
           PrintWriter outputFile = new PrintWriter(file);//print output file object
         
             String a = inputFile.next();//read the file string one
             one = inputFile.nextInt();//read the file int one
             two = inputFile.nextInt();//read the file int two
             String three = inputFile.next();//read the file lines
             outputFile.println(a + " ");//print the file string one
             outputFile.print(one + " ");//print the file int one
             outputFile.print(two + " ");//print the file int two
             outputFile.print(three + " ");//print the file              
            int[][][] output = new int[one][two][3];//array to hold variables of file into three based on required
            for(int k=0; k<one; k++)//loop to search in file and helds into array.
            {
               for(int j=0; j<two; j++)
               {
                     int first = inputFile.nextInt();
                     int second = inputFile.nextInt();
                     int third = inputFile.nextInt();
                     output[k][j][0]=first;
                     output[k][j][1]=second;
                     output[k][j][2]=third;
                   
               }
            }
       
          
          do{//do while loop for menu and ask again
             System.out.println("\nHere are your choices:");
             System.out.println("[0] exit");
             System.out.println("[1] convert to grayscale");
             System.out.println("[2] flip horizontally");
             System.out.println("[3] negative of red");
             System.out.println("[4] negative of green");
             System.out.println("[5] negative of blue");
             System.out.println("[6] just the reds");
             System.out.println("[7] just the greens");
             System.out.println("[8] just the blues");
             input55 = keyboard.nextInt();
            
              if(input55 == 0)//if user enters 0 break and exit
              {
                  System.out.print("Exit");
                  break;
              }
              else if(input55 == 1)//grayScale method implement and print 
              {
                output = grayScale(output, one, two);
                for(int k=0; k<one; k++)
                  {
                     for(int j=0; j<two; j++)
                        {
                           int first = output[k][j][0];
                           int second = output[k][j][1];
                           int third = output[k][j][2];
                           outputFile.print(first+ " ");
                           outputFile.print(second+ " ");
                           outputFile.print(third+ " ");
                        }
                  }
                   System.out.println(outputFileName + " created with effect \"convert to greyscale.\" "); 

              }
               else if(input55 == 2)//flipHorizontal method implement and print 
              {
                output = flipHorizontal(output, one, two);
                 for(int k=0; k<one; k++)
                  {
                     for(int j=0; j<two; j++)
                        {
                           int first = output[k][j][0];
                           int second = output[k][j][1];
                           int third = output[k][j][2];
                           outputFile.print(first+ " ");
                           outputFile.print(second+ " ");
                           outputFile.print(third+ " ");
                        }
                  }
 System.out.println(outputFileName + " created with effect \"flip horizontally.\" "); 

              }
                else if(input55 == 3)//negateRed method implement and print 
              {
                output = negateRed(output, one, two);
                 for(int k=0; k<one; k++)
                  {
                     for(int j=0; j<two; j++)
                        {
                           int first = output[k][j][0];
                           int second = output[k][j][1];
                           int third = output[k][j][2];
                           outputFile.print(first+ " ");
                           outputFile.print(second+ " ");
                           outputFile.print(third+ " ");
                        }
                  }
 System.out.println(outputFileName + " created with effect \"negative of red.\" "); 

              }
                else if(input55 == 4)//negatGreen method implement and print 
              {
                output = negateGreen(output, one, two);
                 for(int k=0; k<one; k++)
                  {
                     for(int j=0; j<two; j++)
                        {
                           int first = output[k][j][0];
                           int second = output[k][j][1];
                           int third = output[k][j][2];
                           outputFile.print(first+ " ");
                           outputFile.print(second+ " ");
                           outputFile.print(third+ " ");
                        }
                  }
 System.out.println(outputFileName + " created with effect \"negative of green.\" "); 

              }
                else if(input55 == 5)//negateBlue method implement and print 
              {
                output = negateBlue(output, one, two);
                 for(int k=0; k<one; k++)
                  {
                     for(int j=0; j<two; j++)
                        {
                           int first = output[k][j][0];
                           int second = output[k][j][1];
                           int third = output[k][j][2];
                           outputFile.print(first+ " ");
                           outputFile.print(second+ " ");
                           outputFile.print(third+ " ");
                        }
                  }
 System.out.println(outputFileName + " created with effect \"negative of blue.\" "); 
              }
                 else if(input55 == 6)//justTheReds method implement and print 
              {
                output = justTheReds(output);
                 for(int k=0; k<one; k++)
                  {
                     for(int j=0; j<two; j++)
                        {
                           int first = output[k][j][0];
                           int second = output[k][j][1];
                           int third = output[k][j][2];
                           outputFile.print(first+ " ");
                           outputFile.print(second+ " ");
                           outputFile.print(third+ " ");
                        }
                  }
 System.out.println(outputFileName + " created with effect \"just the reds.\" "); 
              }
                 else if(input55 == 7)//justTheGreens method implement and print 
              {
                output = justTheGreens(output);
                 for(int k=0; k<one; k++)
                  {
                     for(int j=0; j<two; j++)
                        {
                           int first = output[k][j][0];
                           int second = output[k][j][1];
                           int third = output[k][j][2];
                           outputFile.print(first+ " ");
                           outputFile.print(second+ " ");
                           outputFile.print(third+ " ");
                        }
                  }
                System.out.println(outputFileName + " created with effect \"just the greens.\" "); 

              }
                 else if(input55 == 8)//justTheBlues method implement and print 
              {
                output = justTheBlues(output);
                 for(int k=0; k<one; k++)
                  {
                     for(int j=0; j<two; j++)
                        {
                           int first = output[k][j][0];
                           int second = output[k][j][1];
                           int third = output[k][j][2];
                           outputFile.print(first+ " ");
                           outputFile.print(second+ " ");
                           outputFile.print(third+ " ");
                        }
                  }
         System.out.println(outputFileName + " created with effect \"just the blues.\" "); 
              }
              
              
             }while( input55 != 0 || input55 != 1 || input55 != 2 || input55 != 3 || input55 != 4 || input55 != 5 || input55 != 6 || input55 != 7 || input55 != 8);
         
          inputFile.close();//close input
          outputFile.close();//close file
          keyboard.close();//close scanner
          
          
        }
              
      public static int[][][] grayScale(int[][][] max, int row, int col)//grayscale logic and method with parameters and loops to store and print
      {
          for(int i = 0; i < row; i++)
          {
              for(int j = 0; j < col; j++)
              {
                  int one, two, three;
                  one = max[i][j][0];
                  two = max[i][j][1];
                  three = max[i][j][2];
                  int grayScale = (one+two+three)/3;
                  max[i][j][0] = grayScale;
                  max[i][j][1] = grayScale;
                  max[i][j][2] = grayScale;
                  
                  
              }
          }
          return max;
      }

   public static int[][][] flipHorizontal(int[][][] PPM, int rows, int cols)//flipHorizontal logic and method with parameters and loops to store and print
    {
        int[][][] out = new int[rows][cols][3];

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
               out[i][j][0] = PPM[i][(cols-1) - j][0];
               out[i][j][1] = PPM[i][(cols-1) - j][1];
               out[i][j][2] = PPM[i][(cols-1) - j][2];
            }
        }
        return out;
    }
   
             public static int[][][] negateRed(int[][][] PPM, int row, int col)//negateRed logic and method with parameters and loops to store and print
            {
                for(int i = 0; i < PPM.length; i++)
                {
                    for(int j = 0; j < PPM[i].length; j++)
                    {
                        PPM[i][j][0] = 255 - PPM[i][j][0];
                    }
                }
                    return PPM;
            }
  
          
     
            

            public static int[][][] negateGreen(int[][][] PPM, int row, int col)//negateGreen logic and method with parameters and loops to store and print
            {
             for(int i = 0; i < PPM.length; i++)
                {
                    for(int j = 0; j < PPM[i].length; j++)
                    {
                        PPM[i][j][1] = 255 - PPM[i][j][1];
                    }
                }
                    return PPM;
            }

    public static int[][][] negateBlue(int[][][] PPM, int row, int col)//negateGreen logic and method with parameters and loops to store and print
    {
       for(int i = 0; i < PPM.length; i++)
                {
                    for(int j = 0; j < PPM[i].length; j++)
                    {
                        PPM[i][j][2] = 255 - PPM[i][j][2];
                    }
                }
                    return PPM;
    } 
    
    
    
       public static int[][][] justTheReds(int[][][] PPM)//justTheRed logic and method with parameters and loops to store and print
    {
  
        for(int i = 0; i < PPM.length; i++)
        {
            for(int j = 0; j < PPM[i].length; j++)
            {
                PPM[i][j][0] = 0;
            }
        }
        return PPM;
    }
    
     public static int[][][] justTheGreens(int[][][] PPM)//justTheGreens logic and method with parameters and loops to store and print

   {
  
        for(int i = 0; i < PPM.length; i++)
        {
            for(int j = 0; j < PPM[i].length; j++)
            {
                PPM[i][j][1] = 0;
            }
        }
        return PPM;
    }
    
    
      public static int[][][] justTheBlues(int[][][] PPM)//justTheBlues logic and method with parameters and loops to store and print
    {
  
        for(int i = 0; i < PPM.length; i++)
        {
            for(int j = 0; j < PPM[i].length; j++)
            {
                PPM[i][j][2] = 0;
            }
        }
        return PPM;
    }
    
        
        }//end of program
      