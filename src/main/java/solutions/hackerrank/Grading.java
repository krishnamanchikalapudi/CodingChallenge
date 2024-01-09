package solutions.hackerrank;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Problem: https://www.hackerrank.com/challenges/grading/
 * 
 * HackerLand University has the following grading policy:
 * 1. Every student receives a grade in the inclusive range from 0 to 100.
 * 2. Any grade less than 40 is a failing grade.
 * 
 * Sam is a professor at the university and likes to round each student's grade according to these rules:
 * 1. If the difference between the grade and the next multiple of 5 is less than 3, round grade up to the next multiple
 * of 5.
 * 2. If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.
 * 
 * Examples
 * grade = 84 round to (85 - 84 is less than 3)
 * grade = 29 do not round (result is less than 40)
 * grade = 57 do not round (60 - 57 is 3 or higher)
 * 
 * Given the initial value of grade for each of Sam's n students, write code to automate the rounding process.
 * 
 * Example 1:
 * Input: 4, 73, 67, 38, 33
 * Output: 75, 67, 40, 33
 * 
 * 
 */
public class Grading {
	public List<Integer> solution(List<Integer> grades) {
		List<Integer> updatedGrades = new ArrayList<>();
		// grades.sort(Comparator.naturalOrder());

		for (Integer grade : grades) {
			int gradeMultipleOf5Reminder = (grade % 5); // if reminder is 0, yes.
			if (grade >= 38 && gradeMultipleOf5Reminder != 0) {
				int diff5 = (5 - gradeMultipleOf5Reminder);
				if (diff5 < 3) {
					grade += diff5;
					updatedGrades.add(grade);
				} else {
					updatedGrades.add(grade);
				} // if (gradeMultipleOf5Reminder > 3)
			} else {
				updatedGrades.add(grade);
			}// if
		} // for: grades

		return updatedGrades;
	}
}
