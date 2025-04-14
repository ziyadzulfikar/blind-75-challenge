import java.util.ArrayList;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        boolean[] visited = new boolean[numCourses];
        boolean[] explored = new boolean[numCourses];
        for (int i = 0; i < numCourses; i++) {
            arr.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < prerequisites.length; i++) {
            arr.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        for (int i = 0; i < numCourses; i++) {
            if (!visited[i]) {
                if (isCyclic(i, visited, explored, arr)) {
                    return false;
                }
            }
        }
        return true;
    }
    private boolean isCyclic(int i, boolean[] visited, boolean[] explored, ArrayList<ArrayList<Integer>> arr) {
        visited[i] = true;
        ArrayList<Integer> nums = arr.get(i);
        for (int j : nums) {
            if(!visited[j]) {
                if (isCyclic(j, visited, explored, arr)) {
                    return true;
                }
            } else if (!explored[j]) {
                return true;
            }
        }
        explored[i] = true;
        return false;
    }    
    public static void main(String[] args) {
        CourseSchedule s = new CourseSchedule();
        int[][] arr = {{1,0},{0,1}};
        boolean result = s.canFinish(2, arr);
        System.out.println(result);
    }
}
