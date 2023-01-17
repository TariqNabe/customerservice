public class Runner {
    public static void main(String [] args) {
        ///System.out.println(fact(-3));
        MyFrame frame = new MyFrame();

        frame.setVisible(true);
    }


    public static int fact( int n ) {

        //Base case
        if( n == 1 ) {
            return 1;
        }

        //Recursive case:
        return n * fact(n-1);




    }
}

