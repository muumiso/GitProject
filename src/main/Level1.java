package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Level1 {
	public static void main( String[] args) throws NumberFormatException, IOException
	{
		InputStreamReader is = new InputStreamReader(System.in);       //（１）
        BufferedReader br = new BufferedReader(is);

        int num = Integer.parseInt( br.readLine() );

        Level1 a = new Level1();
		a.fizzBuzz( num );
	}

    void fizzBuzz( int num )
	{

        if( num % 3 == 0) {
        	System.out.print( "Fizz" );
        }
        if( num % 5 == 0) {
        	System.out.print( "Buzz" );
        }

        System.out.println();
	}
}