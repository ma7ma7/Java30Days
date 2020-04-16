package maze;

import java.util.LinkedList;

public class maze {
	
	static int[][] maze= {
			{0, 1, 1, 1},
			{0, 1, 0, 1},
			{0, 2, 1, 1}
	};
	// 0 = wall 
	// 1 = path
	// 2 = destination 
	
	static LinkedList<Position> path = new LinkedList<Position>();
	
	public static void main(String[] args) {
		
		Position p = new Position(0,  3);
		path.push(p);
		
		while(true) {
		
			int x = path.peek().x;
			int y = path.peek().y;
			
			maze[y][x] = 0;
			
			// left
			if(maze[y][x-1] == 2 ) {
				System.out.println("Moved Left. You Won !");
				return;
			} else if (maze[y][x-1] == 1) {
				System.out.println("Moved Left");
				path.push(new Position(y, x-1));;
				continue;
			}
			// Down
			if(maze[y+1][x] == 2 ) {
				System.out.println("Moved down. You Won !");
				return;
			} else if (maze[y+1][x] == 1) {
				System.out.println("Moved down");
				path.push(new Position(y+1, x));;
				continue;
			}
			
			
			
			// Right
			if(maze[y][x+1] == 2 ) {
				System.out.println("Moved Right. You Won !");
				return;
			} else if (maze[y][x+1] == 1) {
				System.out.println("Moved Right");
				path.push(new Position(y, x+1));;
				continue;
			}
			
			// up
			if(maze[y+1][x] == 2 ) {
				System.out.println("Moved UP. You Won !");
				return;
			} else if (maze[y+1][x] == 1) {
				System.out.println("Moved UP");
				path.push(new Position(y, x+1));;
				continue;
			}
			
			path.pop();
			if (path.size() < 0) {
				System.out.println("No path");
			}
			
			
		}
		
		
	}
}
