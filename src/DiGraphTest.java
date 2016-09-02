import java.util.*;

public class DiGraphTest{
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Please enter number of vertices");
    	DiGraphAM d = new DiGraphAM(Integer.parseInt(sc.nextLine()));
    	
    	boolean quit = false;
    	
    	System.out.println("Menu");
    	System.out.println("  -add edge (press a)");
    	System.out.println("  -delete edge (press d)");
    	System.out.println("  -get edge count (press e)");
    	System.out.println("  -print (press p)");
    	System.out.println("  -quit (press q)");
    	
    	while(!quit){
    		System.out.println("Choose an option");
    		String input = sc.nextLine();
    		switch(input){
    		case"a":
    			System.out.println("please enter the two numbers for the edge to add");
    			String[] store = sc.nextLine().split(" ");
    			int x = Integer.parseInt(store[0]);
    			int y = Integer.parseInt(store[1]);
    			d.addEdge(x, y);
    			System.out.println("(" + x + ", " + y + ")" + " has been added");
    			break;
    			
    		case"d":
    			System.out.println("please enter the two numbers for the edge to delete");
    			String[] store2 = sc.nextLine().split(" ");
    			int x2 = Integer.parseInt(store2[0]);
    			int y2 = Integer.parseInt(store2[1]);
    			d.deleteEdge(x2, y2);
    			System.out.println("(" + x2 + ", " + y2 + ")" + " has been deleted");
    			break;
    		case"e":
    			System.out.println(d.edgeCount() + " total edges");
    			break;
    		case"v":
    			System.out.println(d.vertexCount() + " total vertices");
    			break;
    		case"p":
    			d.print();
    			break;
    		case"q":
    			quit = true;
    			System.out.println("quitting");
    			break;
    		default:
    			System.out.println("invalid choice");
    			break;
    		}
    	}
    }
}