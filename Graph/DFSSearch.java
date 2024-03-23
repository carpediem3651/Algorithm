import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class DFSSearch {

    public ArrayList<String> dfsFuc(HashMap<String, ArrayList<String>> graph, String startNode) {
        ArrayList<String> visited = new ArrayList<String>();
        ArrayList<String> needVisit = new ArrayList<String>();

        needVisit.add(startNode);

        while (needVisit.size() > 0) {
            // Stack기법(Last In First Out)을 활용하여, 가장 늦게 들어온 값을 pop하여 'node'에 집어넣는다. 
            String node = needVisit.remove(needVisit.size()-1);
            if (!visited.contains(node)) {
                // visited에 node가 없다면, visited에 node를 추가하고, node에 연결된 node들을 needVisite에 넣는다.
                visited.add(node);
                needVisit.addAll(graph.get(node));
            }
        }

        // 방문한 노드들을 모두 반환한다.
        return visited;
    }

    public static void main(String[] args) {

        // Graph 연결하기
        HashMap<String, ArrayList<String>> graph = new HashMap<String, ArrayList<String>>();
        graph.put("A", new ArrayList<String>(Arrays.asList("B", "C")));
        graph.put("B", new ArrayList<String>(Arrays.asList("A", "D")));
        graph.put("C", new ArrayList<String>(Arrays.asList("A", "G", "H", "I")));
        graph.put("D", new ArrayList<String>(Arrays.asList("B", "E", "F")));
        graph.put("E", new ArrayList<String>(Arrays.asList("D")));
        graph.put("F", new ArrayList<String>(Arrays.asList("D")));
        graph.put("G", new ArrayList<String>(Arrays.asList("C")));
        graph.put("H", new ArrayList<String>(Arrays.asList("C")));
        graph.put("I", new ArrayList<String>(Arrays.asList("C", "J")));
        graph.put("J", new ArrayList<String>(Arrays.asList("I")));

        // node 'A'로부터 시작되는 DFS를 실행한다.
        DFSSearch dObject = new DFSSearch();
        System.out.println(dObject.dfsFuc(graph, "A"));
    }
}
