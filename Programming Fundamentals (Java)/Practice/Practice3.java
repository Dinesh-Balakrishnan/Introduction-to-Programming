public class Practice3 {

	public static void main(String[] args) {
		orderOfOperations();
		stringConcatenation();
		factoring(4);
		codeTracing();
	}

	public static void orderOfOperations() {
		/*
		Find the resulting value of the following expressions:

			2 + 3 * 4 - 6                | Answer: 8

			14 / 7 * 2 + 30 / 5 + 1      | Answer: 11

			(12 + 3) / 4 * 2             | Answer: 6

			(238 % 10 + 3) % 7           | Answer: 4

			(18 - 7) * (43 % 10)         | Answer: 33

			2 + 19 % 5 - (11 * (5 / 2))  | Answer: -16

			813 % 100 / 3 + 2.4          | Answer: 6.4

			26 % 10 % 4 * 3              | Answer: 6

			22 + 4 * 2                   | Answer: 30

			23 % 8 % 3                   | Answer: 1

			12 - 2 - 3                   | Answer: 7

			6/2 + 7/3                    | Answer: 5

			6 * 7 % 4                    | Answer: 2

			3 * 4 + 2 * 3                | Answer: 18

			177 % 100 % 10 / 2           | Answer: 3

			89 % (5 + 5) % 5             | Answer: 4

			392 / 10 % 10 / 2            | Answer: 4

			8 * 2 - 7 / 4                | Answer: 15

			37 % 20 % 3 * 4              | Answer: 8

			17 % 10 / 4                  | Answer: 1

			4.0 / 2 * 9 / 2              | Answer: 9.0

			2.5 * 2 + 8 / 5.0 + 10 / 3   | Answer: 9.6

			12 / 7 * 4.4 * 2 / 4         | Answer: 2.2

			4 * 3 / 8 + 2.5 * 2          | Answer: 6.0

			(5 * 7.0 / 2 - 2.5) / 5 * 2  | Answer: 6.0

			41 % 7 * 3 / 5 + 5 / 2 * 2.5 | Answer: 8.0

			10.0 / 2/4                   | Answer: 1.25

			8 / 5 + 13 / 2 / 3.0         | Answer: 3.0

			(2.5 + 3.5) / 2              | Answer: 3.0

			9 / 4 * 2.0 - 5/4            | Answer: 3.0

			9 / 2.0 + 7 / 3 - 3.0 / 2    | Answer: 5.0

			813 % 100 / 3 + 2.4          | Answer: 6.4

			27 / 2 / 2.0 * (4.3 + 1.7) - 8 / 3           | Answer: 37.0

			53 / 5 / (0.6 + 1.4) / 2 + 13 / 2            | Answer: 8.5

			2 * 3 / 4 * 2 / 4.0 + 4.5 - 1                | Answer: 4.0

			89 % 10 / 4 * 2.0 / 5 + (1.5 + 1.0 / 2) * 2  | Answer: 4.8
		*/
	}

	public static void stringConcatenation() {
		/*
		Find the resulting value of the following expressions:

			2 + 2 + 3 + 4                             | Answer: 11

			"2 + 2 " + 3 + 4                          | Answer: "2 + 2 34"

			2 + " 2 + 3 " + 4                         | Answer: "2 2 + 3 4"

			3 + 4 + " 2 + 2"                          | Answer: "7 2 + 2"

			"2 + 2 " + (3 + 4)                        | Answer: "2 + 2 7"

			"(2 + 2) " + (3 + 4)                      | Answer: "(2 + 2) 7"

			"hello 34 " + 2 * 4                       | Answer: "hello 34 8"

			2 + "(int) 2.0" + 2 * 2 + 2               | Answer: "2(int) 2.042"

			4 + 1 + 9 + "." + (-3 + 10) + 11 / 3      | Answer: "14.73"

			8 + 6 * -2 + 4 + "0" + (2 + 5)            | Answer: "007"

			1 + 1 + "8 - 2" + (8 - 2) + 1 + 1         | Answer: "28 - 2611"

			5 + 2 + "(1 + 1)" + 4 + 2 * 3             | Answer: "7(1 + 1)46"

			"1" + 2 + 3 + "4" + 5 * 6 + "7" + (8 + 9) | Answer: "123430717"
		 */
	}

	/*
	Modify the below expression to use the * operator exactly 4 times:

	y = 12.3x^4 - 9.1x^3 + 19.3x^2 - 4.6x + 34.2

	 */

	public static void factoring(int x) {
		double y = 34.2+x*(-4.6+x*(19.3+x*(-9.1+12.3*x)));
	}

	public static void codeTracing() {
		/*
		What is the value of i, j, and k after the following code statements?

				int i = 2;
				int j = 3;
				int k = 4;
				int x = i + j + k;
				i = x - i - j;
				j = x - j - k;
				k = x - i - k;

		Answer:
				i: 4
				j: 2
				k: 1

		----------------------------------------------------------------------

		What is the output from the following code?

				int max;
				int min = 10;
				max = 17 - 4 / 10;
				max = max + 6;
				min = max - min;
				System.out.println(max * 2);
				System.out.println(max + min);
				System.out.println(max);
				System.out.println(min);

		Answer:
				46
				36
				23
				13
		*/
	}
}
