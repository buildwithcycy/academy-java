package com.bptn.course._03_scanner_user_input;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		int choice;
		System.out.println("Enter your choice : ");
		choice = scanner.nextInt();
		
		System.out.println("You entered : " + choice);
		scanner.close();
		
	}
}

