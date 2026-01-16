// Brunner, Anthony
// CPW 140
// Assignment #2
//
// This program will draw out a rocket ship image in the terminal and scale the image correctly based on changing the value
//  that ROCKET_SIZE is equal to.

public class RocketShip {
    public static final int ROCKET_SIZE = 4;
    
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

        int space = (ROCKET_SIZE * 2);                                      // This is so the rocket will scale correctly based on ROCKET_SIZE value and not be hard coded to one size
        // Loop through rows
        for (int row = 2; row <= space; row ++) {                           // Needed to set row to 2 and increase line values to int 1 in order to produce desired results
            
            // Begin row blank space
            for ( int blank = 0; blank < space - row + 1; blank ++ ) {      // Needed to add + 1 to my end parameters in order to fix the nozzle centering issue after fixing my previous row number issue
                System.out.print( " " ); 
            }

            // Print leading /
            for (int line = 1; line < row; line ++) {
                System.out.print("/");
            }

            // Print **
            System.out.print("**");

            // Print trailing \
            for (int line = 1; line < row; line ++) {
                System.out.print("\\");
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
            int dots = ROCKET_SIZE - row - 1;                               // By removing hard coded numbers and utilizing ROCKET_SIZE I am able to make the rocket scale correctly base on the chosen size
            for (int j = 0; j < dots; j ++) {
                System.out.print(".");
            }

            int triangles = row + 1;                                        // <-- Since we can deduce that the number of triangles (/\) in each row increases by 1 when moving to the next row, I implemented this
            // print triangles
            for(int i = 0; i < triangles; i ++) {                           //      logic so that I may utilize it for both my leading & trailing triangles without repeating code
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
            System.out.println("|");                                    // I use the println statements at the end of my inner loop to "close" out the current row and thus it will start the next row on a new line
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
            for (int i = ROCKET_SIZE; i > row; i --) {
                System.out.print("\\/");
            }

            // print middle dots
            int middle = row * 2;
            for (int i = 0; i < middle; i ++) {
                System.out.print(".");
            }

            // print second triangles
            for(int i = ROCKET_SIZE; i > row; i --) {
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

        for (int i = 0; i < ROCKET_SIZE * 2; i ++) {                        // I could replace my logic in the end parameter "< ROCKET_SIZE * 2" by calling my previous equation "space" utilized in the NoseCone logic.
            System.out.print("=*");                                      //     But in order to implement that, I would need to move that out of the NoseCone method and place it into out into main() which we can 
        }                                                                  //       not manipulate per this assignments requirements
        System.out.println("+");
    }
    
}