package utilities;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class DFS8Puzzle {

		public static LinkedHashSet<String> OPEN = new LinkedHashSet<String>();
		public static HashSet<String> CLOSED = new HashSet<String>();
		public static boolean STATE = false;

		public static void main(String args[]) {

			int statesVisited = 0;
			String start = "081243765";
			String goal = "123804765";
			String X = "";
			String temp = "";

			OPEN.add(start);

			while (OPEN.isEmpty() == false && STATE == false) {
			    statesVisited++;
			    X = OPEN.iterator().next();
			    System.out.println(X);
			    OPEN.remove(X);
			
			    int pos = X.indexOf('0'); // get position of ZERO or EMPTY SPACE
			    System.out.println(pos);
			    if (X.equals(goal)) {
			        System.out.println("SUCCESS");
			        System.out.println(statesVisited);
			        System.out.println(X);
			        STATE = true;
			    } else {
			        // generate children
			        CLOSED.add(X);
			    }
			}
		}
}
