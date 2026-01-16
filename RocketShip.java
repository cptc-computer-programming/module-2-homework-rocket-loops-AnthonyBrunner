// Your header comment goes here.

public class RocketShip {
    public static final int ROCKET_SIZE = 3;
    
    public static void main( String[] args ) {
        printNoseCone();
        printBody();
        printNozzle();
    }

    /**
     Print the nozzle at the bottom of the rocket.
     This reuses the pattern of the nose cone.
     */
    public static void printNozzle() {
        printNoseCone();
    }
    
    /**
     Print the nose cone. There is a pattern of **
     down the middle of the cone with a widening pattern
     of //...\\ on either side.
     */
    public static void printNoseCone() {

        // Loop through rows
        for (int row = 0; row <= ROCKET_SIZE + 1; row ++) {
            
            // Begin row blank space
            for ( int blank = 1; blank <= ROCKET_SIZE + 2 - row; blank ++ ) {
                System.out.print( " " ); 
            }

            // Print leading /
            for (int line = 0; line <= row; line ++) {
                System.out.print("/");
            }

            // Print **
            System.out.print("**");
            // Print trailing \
            for (int line = 0; line <= row; line ++) {
                System.out.print("\\");
            }

            // Close row blank space
            for( int blank = 1; blank <= ROCKET_SIZE + 2 - row; blank ++ ) {
                System.out.print( " " ); 
            }

            System.out.println(" ");
        }
    }
    
    /**
      Print body of rocket. This is a two-stage pattern
      with a diamond pattern in the top half and an
      hour glass on the bottom.
     */
    public static void printBody() {
        printEdge();
        printDiamondTop();
        printDiamondBottom();        
        printEdge();
        printDiamondBottom();        
        printDiamondTop();       
        printEdge();        
    }
    
    /**
     Print the top half of two diamonds between vertical lines.
     */
    public static void printDiamondTop() {
        // Loop through total rows
        for (int row = 0; row < ROCKET_SIZE; row ++) {

            // Begin row
            System.out.print("|");

            // print leading dots
            int dots = (ROCKET_SIZE * 2 - 4) - row;
            for (int j = 0; j < dots; j ++) {
                System.out.print(".");
            }

            int triangles = row + 1;
            // print triangles
            for(int i = 0; i < triangles; i ++) {
                System.out.print("/\\");
            }

            // print middle dots
            int middle = (dots * 2);
            for (int j = 0; j < middle; j ++) {
                System.out.print(".");
            }

            // print second triangles
            for(int i = 0; i < triangles; i ++) {
                System.out.print("/\\");
            }

            // print trailing dots 
            for (int j = 0; j < dots; j ++) {
                System.out.print(".");
            }

            // close row
            System.out.println("|");
        }
    }
    
    /**
     Print the bottom half of two diamonds between vertical lines.
     */
    public static void printDiamondBottom() {
        // Loop through total rows
        for (int row = 0; row < ROCKET_SIZE; row ++) {

            // Begin row
            System.out.print("|");

            // print leading dots
            for (int i = 0; i < row; i ++) {
                System.out.print(".");
            }

            // print triangles
            for (int i = 3; i > row; i --) {
                System.out.print("\\/");
            }

            // print middle dots
            int middle = row * 2;
            for (int i = 0; i < middle; i ++) {
                System.out.print(".");
            }

            // print second triangles
            for(int i = 3; i > row; i --) {
                System.out.print("\\/");
            }

            // print trailing dots 
            for (int i = 0; i < row; i ++) {
                System.out.print(".");
            }

            // close row
            System.out.println("|");
        }
    }
    /**
      Print +=*=*=*...=+ to fit the width of the rocket.
     */
    public static void printEdge() {
        System.out.print("+");

        for (int i = 0; i < ROCKET_SIZE * 2; i ++) {
            System.out.print("=*");
        }
        System.out.println("+");
    }
    
}