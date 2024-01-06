package solutions.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * Problem: You're provided with a list of tasks and their dependencies. Each task is represented by a unique string
 * identifier. The task dependencies are given as pairs of strings, where the first string represents the prerequisite
 * task and the second string represents the dependent task. The goal is to schedule these tasks in an order that
 * respects their dependencies.
 * 
 * Example 1:
 * Input: tasks = [a, b, c, d], dependencies = [[a, b],[c, b],[b, d]];
 * Output: [a, c, b, d]
 * 
 * Example 2:
 * Input: tasks = [a, b, c, d], dependencies = [[a, d],[d, c],[b, d]];
 * Output: [a, b, d, c]
 * 
 * Example 3:
 * Input: tasks = [a, b, c, d], dependencies = [["a", "d"].["d", "c"), ["c", "b"]];
 * Output: ["a", "d", "c", "b"]
 * 
 * reference:
 */
public class FindTasksOrderOfDependencies {
	/**
	 * PSEUDOCODE:
	 * 1. Initialize a graph to represent task dependencies using a HashMap.
	 * 2. Create an inDegree map to track the number of incoming edges for each task.
	 * 3. Iterate through the given tasks and dependencies to populate the graph and inDegree maps.
	 * 4. Use a Queue to perform topological sorting starting with tasks having zero incoming edges.
	 * 5. Perform topological sorting to determine the order of execution for the tasks considering their dependencies.
	 * 6. Return the ordered list of tasks after scheduling them based on their dependencies.
	 * 
	 * @param List<String>       tasks
	 * @param List<List<String>> dependencies
	 * @return List<String>
	 */
	public List<String> solution(List<String> tasks, List<List<String>> dependencies) {
		Map<String, Integer> inDegree = new HashMap<>();
		Map<String, List<String>> graph = new HashMap<>();

		// Initialize the inDegree map and the graph
		for (String task : tasks) {
			inDegree.put(task, 0);
			graph.put(task, new ArrayList<>());
		} // for

		// Populate the inDegree map and the graph based on the dependencies
		for (List<String> dependency : dependencies) {
			String prerequisite = dependency.get(0);
			String task = dependency.get(1);
			graph.get(prerequisite).add(task);
			inDegree.put(task, inDegree.get(task) + 1);
		} // for

		// Perform topological sorting
		Queue<String> queue = new LinkedList<>();
		for (String task : tasks) {
			if (inDegree.get(task) == 0) {
				queue.offer(task);
			} // if
		} // for

		List<String> sortedTasks = new ArrayList<>();
		while (!queue.isEmpty()) {
			String current = queue.poll();
			sortedTasks.add(current);

			for (String dependent : graph.get(current)) {
				inDegree.put(dependent, inDegree.get(dependent) - 1);
				if (inDegree.get(dependent) == 0) {
					queue.offer(dependent);
				} // if
			} // for
		} // while

		return sortedTasks;
	}

}
