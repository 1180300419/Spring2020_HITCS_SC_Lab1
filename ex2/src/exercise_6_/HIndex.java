package exercise_6_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class HIndex {
	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		System.out.println("请输入");
		String inString = inScanner.nextLine();
		String[] inStrings = inString.split(",");
		List<Integer> intArray = new ArrayList<Integer>();
		for (String str : inStrings) {
			intArray.add(Integer.parseInt(str));
		}
		Collections.sort(intArray, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                if (a > b) return -1;
                else return 1;
            }
		});
		int i;
		for (i = 0; i < intArray.size(); i++) {
			if (intArray.get(i) < i + 1) break;
		}
		System.out.println(i);
		inScanner.close();
	}
}

