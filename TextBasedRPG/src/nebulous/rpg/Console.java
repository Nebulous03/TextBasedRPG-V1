package nebulous.rpg;

import java.io.IOException;
import java.util.Scanner;

import org.fusesource.jansi.Ansi;

import static org.fusesource.jansi.Ansi.*;

public class Console {
	
	private static Scanner scanner = new Scanner(System.in);
	private static int speed = 5;
	
	public static void print(Color color, boolean bold, String text) {
		
		char[] chars = text.toCharArray();
		
		for(char c : chars) {
			try {
				Ansi out = ansi().fgBright(color).a(c);
				if(bold) out.bold();
				System.out.print(out);
				Thread.sleep(speed);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		ansi().reset();
	}
	
	public static void println(Color color, String text) {
		println(color, false, text);
	}
	
	public static void println(Color color, boolean bold, String text) {
		
		char[] chars = text.toCharArray();
		
		if(bold) ansi().bold();
		
		for(char c : chars) {
			try {
				System.out.print(ansi().fgBright(color).bold().a(c));
				Thread.sleep(speed);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.print("\n");
		ansi().boldOff();
		ansi().reset();
	}
	
	static int builder;
	
	public static void command(String cmd) {
		try {
			builder = new ProcessBuilder("cmd", "/c", cmd).inheritIO().start().waitFor();
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static String readLine() {
		return scanner.nextLine();
	}
	
	public static String readLine(Color color, String prompt) {
		return readLine(color, false, prompt);
	}
	
	public static String readLine(Color color, boolean bold, String prompt) {
		Console.print(color, bold, prompt);
		return scanner.nextLine();
	}

}
