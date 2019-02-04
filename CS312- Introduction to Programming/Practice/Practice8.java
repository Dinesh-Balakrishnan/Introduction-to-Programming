public class Practice8 {

  public static void main(String[] args) {
    codeTracing();
    mathClass();
  }

  public static void codeTracing() {
    /*
    What output is produced by the following program?

        public class MysteryTouch {
            public static void main(String[] args) {
        	String head = "shoulders";
        	String knees = "toes";
        	String elbow = "head";
        	String eye = "eyes and ears";
        	String ear = "eye";

        	touch(ear, elbow);
        	touch(elbow, ear);
        	touch(head, "elbow");
        	touch(eye, eye);
        	touch(knees, "Toes");
        	touch(head, "knees " + knees);
            }

            public static void touch(String elbow, String ear) {
        	System.out.println("touch your " + elbow + " to your " + ear);
            }
        }

    Answer:
        touch your eye to your head
        touch your head to your eye
        touch your shoulders to your elbow
        touch your eyes and ears to your eyes and ears
        touch your toes to your Toes
        touch your shoulders to your knees toes
    */
  }

  public static void mathClass() {
    /*
    Evaluate the following expressions, returning the correct data type:

    Math.abs(-1.6)         | Answer: 1.6

    Math.abs(2 + -4)       | Answer: 2

    Math.pow(6, 2)         | Answer: 36.0

    Math.pow(5 / 2, 6)     | Answer: 64.0

    Math.ceil(9.1)         | Answer: 10.0

    Math.ceil(115.8)       | Answer: 116.0

    Math.max(7, 4)         | Answer: 7

    Math.min(8, 3 + 2)     | Answer: 5

    Math.min(-2, -5)       | Answer: -5

    Math.sqrt(64)          | Answer: 8.0

    Math.sqrt(76 + 45)     | Answer: 11.0

    100 + Math.log10(100)  | Answer: 102.0

    13 + Math.abs(-7) - Math.pow(2, 3) + 5                    | Answer: 17.0

    Math.sqrt(16) * Math.max(Math.abs(-5), Math.abs(-3))      | Answer: 20.0

    7 - 2 + Math.log10(1000) + Math.log(Math.pow(Math.E, 5))  | Answer: 13.0

    Math.max(18 - 5 + Math.random(), Math.ceil(4.6 * 3))      | Answer: 14.0
    */
  }
}
