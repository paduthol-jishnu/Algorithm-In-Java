package stack;
import java.util.*;
public class cc {
	    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	    List<List<Integer>> criticalConnections(int numOfServers, int numOfConnections, 
	                                      List<List<Integer>> connections)
	    {
	        if (numOfServers == 0) {
		            return new ArrayList<List<Integer>>();
		        }

		        if (numOfConnections == 0) {
		            return new ArrayList<List<Integer>>();
		        }

		        int[][] connectionEdges = new int[numOfConnections][2];

		        int i = 0;
		        for (List<Integer> p: connections) {
		            connectionEdges[i][0] = p.indexOf(0);
		            connectionEdges[i][1] = p.indexOf(1);
		            i ++;
		        }

		        int nodes = numOfServers;
		        int[] lowestOccurence = new int[nodes + 1];
		        int[] discoveryList = new int[nodes + 1];
		        Map<Integer, List<Integer>> map = new HashMap<>();
		        for(int[] c : connectionEdges) {
		            if(!map.containsKey(c[0])) {
		                map.put(c[0], new ArrayList<>());
		            }
		            map.get(c[0]).add(c[1]);
		            if(!map.containsKey(c[1])) {
		                map.put(c[1], new ArrayList<>());
		            }
		            map.get(c[1]).add(c[0]);
		        }
		        Set<List<Integer>> result = new HashSet<>();
		        depthFirstSearch(1, -1, map, result, lowestOccurence, discoveryList, 0);

		        List<List<Integer>> criticalRoads = new ArrayList<>();

		        for (List<Integer> k: result) {
		        	List<Integer> x = new List<Integer>(k.get(0), k.get(1));
		            criticalRoads.add(x);
		        }
		        return criticalRoads;
		    }

		    void depthFirstSearch(int vertice, int current, Map<Integer, List<Integer>> map, Set<List<Integer>> result, int[] low, int[] visited, int count) {
		        visited[vertice] = low[vertice] = count + 1;
		        if(!map.containsKey(vertice)) return;
		        for(int i : map.get(vertice)) {
		            if(i == current) continue;
		            if(visited[i] == 0) {
		                depthFirstSearch(i, vertice, map, result, low, visited, count + 1);
		                low[vertice] = Math.min(low[vertice], low[i]);
		                if(low[i] > visited[vertice]) {
		                    result.add(Arrays.asList(Math.min(vertice, i), Math.max(vertice, i)));
		                }
		            }else {
		                low[vertice] = Math.min(low[vertice], visited[i]);
		            }
		        }
	    }
	}

