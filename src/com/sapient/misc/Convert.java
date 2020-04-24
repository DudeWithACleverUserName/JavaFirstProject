package com.sapient.misc;

public class Convert {

	public static String figToWords(long number) {

		String[] baseNames = { "", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine ",
				"Ten ", "Eleven ", "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ",
				"Eighteen ", "Nineteen " };

		String[] tensPLaceNames = { "", "", "Twenty ", "Thirty ", "Forty", "Fifty ", "Sixty ", "Seventy ", "Eighty ",
				"Ninety " };

		String[] miscNames = { "", "Thousand ", "Million ", "Billion ", "Trillion ", "Zillion " };

		int pos = 0;
		String figures = "";

		if (number == 0)
			return "Zero";

		while (number != 0) {

			if (pos % 3 == 0) {

				figures = miscNames[pos / 3] + figures;

				int temp = (int) (number % 100);

				if (temp < baseNames.length) {

					pos += 2;
					figures = baseNames[temp] + figures;

					number /= 100;
				}

				else {
					temp %= 10;
					pos++;
					figures = baseNames[temp] + figures;
					number /= 10;

				}

			} else {
				int temp = (int) (number % 10);
				if (pos % 3 == 1) {
					figures = tensPLaceNames[temp] + figures;
				} else {
					if (temp != 0) {
						figures = baseNames[temp] + "Hundred " + figures;
					}
				}
				pos++;

				number /= 10;

			}
		}

		return figures;
	}

}
