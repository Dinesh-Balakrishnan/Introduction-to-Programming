/*
DEFINTIONS:

	- Object: An entity that contains data and behavior.
		-- The data is the variables stored, while the behavior consists of the methods called upon the object.
		-- Examples of object types are Strings and Arrays

 */

//To import a package, use the following syntax: import packageName.className;
import java.awt.Graphics;
import java.awt.Color;

public class Lesson7 {

	public static void main(String[] args) {
		//To create an object, use the following syntax: Type objectName = new Type(opt. parameters);
		DrawingPanel panel = new DrawingPanel(200, 100);

    		//To call upon a static variable, use the following syntax: className.variableName;
    		Color red = Color.RED;

		//To call upon a method in the created object, use the following syntax: objectName.methodName(opt. parameters);
		Graphics graphics = panel.getGraphics(); //Automatically creates new object.

		/*Because the graphics variable is an object type, it can be passed as a parameter and will be directly
		 changed by the respective method*/
		createCar(graphics);
	}

	public static void createCar(Graphics graphics) {
		//The graphics object has a private variable that stores the current color being used.
		graphics.setColor(Color.BLACK);
		//Various methods such as fillRect() and fillOval() help create the shapes shown on the drawingPanelw window.
		graphics.fillRect(10, 30, 100, 50);

		//Color.RED is a direct reference to a static variable within the Color class.
		graphics.setColor(Color.RED);
		graphics.fillOval(20, 70, 20, 20);
		graphics.fillOval(80, 70, 20, 20);

		//Colors can be set by creating a new Color object with RGB values as its three parameters.
		graphics.setColor(new Color(191, 87, 0));
		graphics.fillRect(80, 40, 30, 20);
	}

}
