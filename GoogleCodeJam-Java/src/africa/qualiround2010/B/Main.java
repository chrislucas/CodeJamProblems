package africa.qualiround2010.B;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Stack;
import java.util.StringTokenizer;

/*
 * https://code.google.com/codejam/contest/351101/dashboard#s=p1
 * 
 * */

public class Main {
	static BufferedReader reader;
	static PrintWriter writer;
	
	public static void run() throws FileNotFoundException {
		reader = new BufferedReader(new FileReader("B-large-practice.in"));
		writer = new PrintWriter("output.txt");
		Main.solve();
		writer.flush();
		writer.close();
	}
	
	public static void solve() {
		try {
			int cases = Integer.parseInt(reader.readLine());
			for(int i=0; i<cases; i++) {
				StringTokenizer tk = new StringTokenizer(reader.readLine(), " ");
				Stack<String> stack = new Stack<>();
				while(tk.hasMoreTokens()) {
					stack.push(tk.nextToken());
				}
				writer.printf("Case #%d:", i+1);
				writer.printf(" %s", stack.pop());
				while(!stack.isEmpty()) {
					writer.printf(" %s", stack.pop());
				}
				writer.printf("\n");
			}
		} catch(IOException ioex) {}
	}

	public static void main(String[] args) throws FileNotFoundException {
		run();
	}
}
