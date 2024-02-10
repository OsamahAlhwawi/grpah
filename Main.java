
public class Main {

	public static void main(String[] args) {
graph<Character> gr = new graph<>(5);
gr.addNode('A');
gr.addNode('B');
gr.addNode('C');
gr.addNode('D');
gr.addNode('E');

gr.addEdge(0, 1);
gr.addEdge(1, 2);
gr.addEdge(1, 4);
gr.addEdge(2, 3);
gr.addEdge(2, 4);
gr.addEdge(4, 0);
gr.addEdge(4, 2);


gr.print();
System.out.println("________________________________");
gr.printadj();
System.out.println("________________________________");

gr.depathfirstsearch(0);
System.out.println("________________________________");
gr.BFS(0);
System.out.println("________________________________");
gr.depathfirstsearchv2(0);
}

}
