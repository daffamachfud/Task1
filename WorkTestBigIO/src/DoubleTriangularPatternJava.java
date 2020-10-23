public class DoubleTriangularPatternJava {
    int i,j,k,l;
    int rows = 5;

    public void triangle(){
        //segitiga bagian atas
        for ( i = 1; i <= rows; i++)
        {
            for ( j = 1; j <= i; j++)
            {
                System.out.print(j);
            }

            for ( k= i*2 ; k < rows*2-1; k++)
            {
                System.out.print(" ");
            }
            for ( l = i; l >= 1; l--)
            {
                if(l!=rows)
                    System.out.print(l);
            }
            System.out.println();
        }

        //segitiga bagian bawah
        for ( i = rows-1; i >= 1; i--)
        {
            for ( j = 1; j <= i; j++)
            {
                System.out.print(j);
            }

            for ( k= i*2 ; k < rows*2-1; k++)
            {
                System.out.print(" ");
            }
            for ( l = i; l >= 1; l--)
            {
                if(l!=rows)
                    System.out.print(l);
            }
            System.out.println();
        }
    }

}
