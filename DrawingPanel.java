/*                              PROBLEM:
Create a class called MickeyBox that creates an image with the following specifications:
- The window is 220 pixels wide and 150 pixels tall.
- The background is yellow.
- There are two blue ovals of size 40 x 40 pixels.
- The left oval's top-left corner is located at position (50, 25)
- The two ovals' top-left corners are 80 pixels apart horizontally.
- There is a red square whose top two corners exactly intersect the centers of the two ovals.
- There is a black horizontal line through the center of the square.
*/

/*Simple command practice to remember the required methods of the DrawingPanel
and Graphics classes. */
public class MickeyBox {
    public static void main (String[] args){
        DrawingPanel image = new DrawingPanel(220, 150);
        Graphics details = image.getGraphics();
        image.setBackground(Color.YELLOW);
        //fillOval creates the ears of the MickeyBox
        details.setColor(Color.BLUE);
        details.fillOval(50, 25, 40, 40);
        details.fillOval(130, 25, 40, 40);
        //fillRect creates the box face of the mickeyBox
        details.setColor(Color.RED);
        details.fillRect(70, 45, 80, 80);
        details.setColor(Color.BLACK);
        //drawLine draws the line across the middle of the box face.
        details.drawLine(70, 85, 150, 85);
        
    }
}

/*                              PROBLEM:
Create a class called ShowDesign that creates an image with the following specifications:
- The window is 200 pixels wide and 200 pixels tall.
- The background is white and the foreground is black.
- 4 rectangles are drawn, with each one being drawn within each other.
- There are 20 pixels between each of the four rectangles
- The rectangles are concentric (their centers are at the same point).
*/

public class ShowDesign{
    public static void main(String[] args){
        DrawingPanel image = new DrawingPanel(200, 200);
        Graphics squares = image.getGraphics();
        squares.setColor(Color.BLACK);
        //for loop repeats for each square.
        for (int printSquare = 20; printSquare <= 80; printSquare += 20){
            /*Each loop, the square starts at a cordinate that is (+20, +20)
            than the previous loop. printSquare takes care of this.*/
            squares.drawRect(printSquare, printSquare, 200 - printSquare * 2, 200 - printSquare * 2);
            /* In addition, the square decreases by a size of 40 in width
            and height. This is because the square is shrinking by 20 left,
            right, top, and bottom. The width and height are
            taken care of through the equation: 200 - (printSquare * 2).*/
        }
    }
}

/*                              PROBLEM:
Create a class called Squares that creates an image with the following specifications:
- The drawing panel is 300 pixels wide by 200 pixels high.
- The background is cyan.
- 5 rectangles are drawn, with each one drawn within each other.
- All rectangles have a start point at the upper-left corner.
- A line is drawn from the upper left to lower-right corner of the largest rectangle.
- The upper-left corner of the diagonal line is at (50,50).
- The horizontal and vertical lines are drawn in red
- The diagonal line is drawn in black.
- Successive horizontal and vertical lines are spaced 20 pixels apart.
- The diagonal line is drawn on top of the horizontal and vertical lines.
*/

public class Squares {
    public static void main(String[] args) {
        DrawingPanel image = new DrawingPanel(300, 200);
        Graphics details = image.getGraphics();
        image.setBackground(Color.CYAN);
        details.setColor(Color.RED);
        /* Height and width increase by 20 for each consequtive box. This is
        taken care of by the for loop. */
        for (int boxSize = 20; boxSize <= 100; boxSize += 20){
            details.drawRect(50, 50, boxSize, boxSize);
        }
        details.setColor(Color.BLACK);
        /*Horizontal line that streches from the upper left to lower right
        corner of the big box. */
        details.drawLine(50, 50, 150, 150);
    }
}

/*                              PROBLEM:
Create a class called Triangle that creates an image with the following specifications:
- The drawing panel is 600 pixels wide by 200 pixels high.
- The background is yellow.
- The line color is blue.
- A triangle shape is present, having points at the top right, top left, and bottom
  center of the drawing panel.
- There are lines that travel horizontally across the triangle that cover
  its entirety.
- The vertical spaces between each line is 10 px.
*/

public class Triangle {
    public static void main(String[] args) {
        DrawingPanel image = new DrawingPanel(600, 200);
        Graphics details = image.getGraphics();
        image.setBackground(Color.YELLOW);
        /*lines 111 and 12 create the triangle shape on the draw panel. These
        lines are used because there is no top line on the final image. The
        rim of the drawing panel serves as that line for the triangle. */
        details.setColor(Color.BLUE);
        details.drawLine(0, 0, 300, 200);
        details.drawLine(300, 200, 600, 0);
        // There are a total of 20 lines on the triangle. (200 / 10 = 20)
        for(int lineCount = 1; lineCount <= 20; lineCount++){
            /*Because the lines have to be within the confines of the triangle,
            their size decreases as you travel down the triangle. The lines are
            cut by 15 pixels on each side per line. */
            int horizontalSpacing = 15 * lineCount;
            /* In addition, the spacing before printing a line increases by 10
            for each consequtive line. */
            int verticalSpacing = 10 * lineCount;
            details.drawLine(horizontalSpacing, verticalSpacing, 600 - horizontalSpacing, verticalSpacing);
        }
    }
}
