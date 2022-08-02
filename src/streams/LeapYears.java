package streams;

import java.util.stream.Stream;

public class LeapYears {

	public static void main(String[] args) {

      long leapCount=Stream.iterate(2300, n->n+1)
         .limit(101)
         .filter(x->x%4==0 || x%400==0)
         .peek(x->System.out.println(x))
         .count();
      
      System.out.println(leapCount);


	}

}
