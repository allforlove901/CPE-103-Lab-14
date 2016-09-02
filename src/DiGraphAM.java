
public class DiGraphAM {

	int[][] adjTable;
	
	public DiGraphAM(int n){
		adjTable = new int[n][n];
	}
	
	public void addEdge(int x, int y){
		adjTable[x][y] = 1;
	}
	
	public void deleteEdge(int x, int y){
		adjTable[x][y] = 0;
	}
	
	public void print(){
		for(int i = 0; i<adjTable.length; i++){
			System.out.print(i + " is connected to:");
			for(int j = 0; j<adjTable[i].length; j++)
				if(adjTable[i][j] == 1)
					System.out.print(" " + j);
			System.out.print("\r");
		}
	}
	
	public int edgeCount(){
		int count = 0;
		for(int i=0; i<adjTable.length; i++)
			for(int j=0; j<adjTable[i].length;j++)
				if(adjTable[i][j] == 1)
					count++;
		return count;
	}
	
	public int vertexCount(){
		return adjTable.length;
	}
	
	private int[] indegrees(){
		int[] output = new int[adjTable.length];
		for(int i = 0; i<adjTable.length; i++){
			output[i] = adjTable[i][i];
		}
		return output;
	}
}
