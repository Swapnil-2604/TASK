package com.cjc.bms.client;

import java.util.Scanner;

import com.cjc.bms.service.*;
import com.cjc.bms.serviceImpl.*;

public class Test {
	public void data() {
		
		Rbi bank = new Sbi();
		bank.password();
		while (true) {
			System.out.println("1): Create Account \n2): Display account Details \n3): Deposite Money \n4): Withdraw Money \n5): Balance Check");
			System.out.println("Enter your choice");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			if (choice == 1) {
				bank.createAccount();
			} else if (choice == 2) {
				bank.displayAllDetails();
			} else if (choice == 3) {
				bank.depositeMoney();
			} else if (choice == 4) {
				bank.withdrawl();
			} else if (choice == 5) {
				bank.balanaceCheck();
			} else {
				System.out.println("Entered the wrong Choice");
			}

		}

	}

	public static void main(String[] args) {

		Test t = new Test();
		t.data();
	}
}
