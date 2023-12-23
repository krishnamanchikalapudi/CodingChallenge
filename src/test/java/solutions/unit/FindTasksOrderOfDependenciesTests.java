package solutions.unit;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import solutions.FindTasksOrderOfDependencies;

class FindTasksOrderOfDependenciesTests {
	private final FindTasksOrderOfDependencies test = new FindTasksOrderOfDependencies();

	@Test
	void test1() {
		List<String> tasks = Arrays.asList("a", "b", "c", "d");
		List<List<String>> dependencies = Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("c", "b"),
				Arrays.asList("b", "d"));
		List<String> expectedOutput = Arrays.asList("a", "c", "b", "d");

		List<String> actualOut = test.solution(tasks, dependencies);
		System.out.println("Output: " + actualOut);
		assertIterableEquals(expectedOutput, actualOut);
	}

	@Test
	void test2() {
		List<String> tasks = Arrays.asList("a", "b", "c", "d");
		List<List<String>> dependencies = Arrays.asList(Arrays.asList("a", "d"), Arrays.asList("d", "c"),
				Arrays.asList("b", "d"));
		List<String> expectedOutput = Arrays.asList("a", "b", "d", "c");

		List<String> actualOut = test.solution(tasks, dependencies);
		System.out.println("Output: " + actualOut);
		assertIterableEquals(expectedOutput, actualOut);
	}

	@Test
	void test3() {
		List<String> tasks = Arrays.asList("a", "b", "c", "d");
		List<List<String>> dependencies = Arrays.asList(Arrays.asList("a", "d"), Arrays.asList("d", "c"),
				Arrays.asList("c", "b"));
		List<String> expectedOutput = Arrays.asList("a", "d", "c", "b");

		List<String> actualOut = test.solution(tasks, dependencies);
		System.out.println("Output: " + actualOut);
		assertIterableEquals(expectedOutput, actualOut);
	}
}
