public class bai33 {
    public static void main(String[] args) {
        String s = "Hello student in PlusPlus academy";
        String[] word = s.split( " " );
        String rts = " ";

        for ( int i = 0; i < word.length; i++ )
        {
            if ( word[i].length() > rts.length() )
                rts = word[i];

        }
        System.out.println( rts );
    }
}
