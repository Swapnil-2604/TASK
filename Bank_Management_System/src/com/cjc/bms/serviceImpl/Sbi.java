package com.cjc.bms.serviceImpl;

import com.cjc.bms.service.*;

import java.util.Scanner;

import com.cjc.bms.client.Test;
import com.cjc.bms.model.*;

public class Sbi implements Rbi {
	Scanner sc = new Scanner(System.in);
	Account a = new Account();
	Test t = new Test();
	boolean value = true;

	public void password() {
		System.out.println("Enter the username");
		a.setUsername(sc.next());
		System.out.println("Enter the password");
		a.setPassword(sc.next());
	}

	public void createAccount() {
		System.out.println("Enter the username");
		String user = sc.next();
		System.out.println("Enter the password");
		String pass = sc.next();
		value = false;
		if (user.equals(a.getUsername()) && pass.equals(a.getPassword())) {
			System.out.println("To create the account You need to fill the following details");
			System.out.println("Enter your account number");
			int accno = sc.nextInt();
			int count = 1;
			for (int i = 0; i <= accno; i++) {
				accno = accno / 10;
				count++;
			}
			if (count == 8) {
				a.setAccNo(accno);
				System.out.println("Account number set sucessfully");
			} else {
				System.err.println("Account no cannot be less than 8 digit");
				createAccount();
			}
			while (true) {
				System.out.println("Enter your name");
				String name = sc.next();
				int count3 = 0;
				for (int i = 0; i < name.length(); i++) {
					if (!Character.isDigit(name.charAt(i)) && !Character.isLetter(name.charAt(i))) {
						count3++;
					}
				}
				if (count3 == 0) {
					a.setName(name);
					System.out.println("The name set successfully");
					break;
				} else {
					System.err.println("The name should not contain special Character");
					continue;
				}
			}
			while (true) {
				System.out.println("Enter your Mobno");
				long mobno = sc.nextLong();
				int count1 = 1;
				for (int i = 0; i < mobno; i++) {
					mobno = mobno / 10;
					count1++;
				}
				if (count1 == 10) {
					a.setMobno(mobno);
					System.out.println("Mobile number set successfully");
					break;
				} else {
					System.err.println("Mobile Number should be of 10 Digit");
					continue;
				}
			}
			while (true) {
				System.out.println("Enter your Adhar No");
				long adhar = sc.nextLong();
				int no = 1;
				for (int i = 0; i < adhar; i++) {
					adhar = adhar / 10;
					no++;
				}
				if (no == 12) {
					a.setAdharNo(adhar);
					System.out.println("Adhar number set Sucessfully");
					break;
				} else {
					System.err.println("Adhar number should be of 12 digits");
					continue;
				}
			}
			while (true) {
				System.out.println("Enter your gender \n1): Male \n2): Female \n3) Other");
				String gender = sc.next();
				if (gender.equals("Male") || gender.equals("M") || gender.equals("male") || gender.equals("1")) {
					a.setGender("Male");
					System.out.println("Gender set Sucessfully");
					break;
				} else if (gender.equals("Female") || gender.equals("female") || gender.equals("F")
						|| gender.equals("2")) {
					a.setGender("Female");
					System.out.println("Gender set Successfully");
					break;
				} else if (gender.equals("Other") || gender.equals("other") || gender.equals("o")
						|| gender.equals("3")) {
					a.setGender("other");
					System.out.println("Gender set Sucessfully");
					break;
				} else {
					System.err.println("Enter the correct Gender");
					continue;
				}
			}
			while (true) {
				System.out.println("Enter your age");
				byte age = sc.nextByte();
				if (age >= 18) {
					a.setAge(age);
					System.out.println("Age set Sucessfully");
					break;
				} else {
					System.err.println("Minimum age for creating account is 18 years");
					continue;
				}
			}
			while (true) {
				System.out.println("Enter your Balance");
				double balance = sc.nextDouble();
				if (balance >= 1000) {
					a.setBalance(balance);
					System.out.println("Balance set sucessfully");
					break;
				} else {
					System.err.println("The minimum balance should be 1000 Rs");
					t.data();
				}
			}
		} else {
			System.err.println("Incorrect username or password");
			while (true) {
				System.out.println("Do you want to \n1)Continue \n2)Forget Username or password \n3)Main menu");
				int choice = sc.nextInt();
				if (choice == 1) {
					createAccount();
					break;
				} else if (choice == 2) {
					forget();
					createAccount();
					break;
				} else if (choice == 3) {
					t.data();
					break;
				} else {
					System.err.println("You entered wrong input");
					continue;
				}

			}
		}
	}

	public void displayAllDetails() {
		boolean cond = true;
		while (cond == true) {
			if (value == false) {
				System.out.println("Enter usename");
				String user = sc.next();
				System.out.println("Enter password");
				String pass = sc.next();

				if (user.equals(a.getUsername()) && pass.equals(a.getPassword())) {
					System.out.println("Account No :- " + a.getAccNo());
					System.out.println("Name :- " + a.getName());
					System.out.println("Mobile No :- " + a.getMobno());
					System.out.println("Adhar No :- " + a.getAdharNo());
					System.out.println("Gender :- " + a.getGender());
					System.out.println("Age :- " + a.getAge());
					System.out.println("Balance :- " + a.getBalance());
					cond = false;
				} else {
					System.err.println("Incorrect username or password");
					System.out.println("do you want to \n1)Retry \n2) Forget Password");
					int out = sc.nextInt();
					if (out == 1) {
						displayAllDetails();
					} else if (out == 2) {
						forget();
						displayAllDetails();
					} else {
						System.err.println("you entered the wrong input");
					}

				}
			} else {
				System.out.println("You have not created the account");
				while (true) {
					System.out.println("what you want to do \n1) Create Account \n2) exit");
					int out = sc.nextInt();
					if (out == 1) {
						createAccount();
					} else if (out == 2) {
						t.data();
					} else {
						System.err.println("You entered the wrong input");
					}
				}
			}
		}

	}

	public void depositeMoney() {
		if (value == false) {
			System.out.println("Enter Username");
			String user = sc.next();
			System.out.println("Enter password");
			String pass = sc.next();
			if (user.equals(a.getUsername()) && pass.equals(a.getPassword())) {
				while (true) {
					System.out.println("Enter the amount to deposit");
					double deposit = sc.nextDouble();
					if (deposit > 100) {
						a.setBalance(a.getBalance() + deposit);
						System.out.println("Money Deposited Successfully");
						break;
					} else {
						System.err.println("Minimum amount to deposit is 100 Rs");
						continue;
					}
				}
			} else {
				System.err.println("Incorrect username or password");
				while (true) {
					System.out.println("Do you want to \n1)Continue \n2)Forget Username or password \n3)Main menu");
					int choice = sc.nextInt();
					if (choice == 1) {
						depositeMoney();
					} else if (choice == 2) {
						forget();
						depositeMoney();
					} else if (choice == 3) {
						t.data();
					} else {
						System.err.println("You entered wrong input");
					}
				}
			}
		} else {
			System.out.println("You have not created the account");
			while (true) {
				System.out.println("what you want to do \n1) Create Account \n2) exit");
				int out = sc.nextInt();
				if (out == 1) {
					createAccount();
					break;
				} else if (out == 2) {
					t.data();
					break;
				} else {
					System.err.println("You entered the wrong input");
				}
			}

		}
	}

	public void withdrawl() {
		if (value == false) {
			System.out.println("Enter username");
			String name = sc.next();
			System.out.println("Enter password");
			String pass = sc.next();
			if (name.equals(a.getUsername()) && pass.equals(a.getPassword())) {
				while (true) {
					System.out.println("Enter the Amount to withdraw");
					double withdraw = sc.nextDouble();
					if (withdraw % 10 == 0) {
						if (withdraw <= a.getBalance()) {
							a.setBalance(a.getBalance() - withdraw);
							System.out.println("Money Withdrwal Successfully");
							break;
						} else {
							System.out.println("Not sufficient balance in your account");
							continue;
						}
					}

					else {
						System.err.println("The amount to withdraw should in form of 100");
						withdrawl();
					}
				}
			} else {
				System.err.println("Incorrect Username or password");
				while (true) {
					System.out.println("Do you want to \n1)Continue \n2)Forget Username or password \n3)Main menu");
					int choice = sc.nextInt();
					if (choice == 1) {
						withdrawl();
					} else if (choice == 2) {
						forget();
						withdrawl();
					} else if (choice == 3) {
						t.data();
					} else {
						System.err.println("You entered wrong input");
					}
				}
			}
		} else {
			System.err.println("You have not created the account");
			while (true) {
				System.out.println("what you want to do \n1) Create Account \n2) exit");
				int out = sc.nextInt();
				if (out == 1) {
					createAccount();
				} else if (out == 2) {
					t.data();
				} else {
					System.out.println("You entered the wrong input");
				}
			}
		}
	}

	@Override
	public void balanaceCheck() {
		boolean cond = true;
		while (cond == true) {
			if (value == false) {
				System.out.println("Enter Username");
				String user = sc.next();
				System.out.println("Enter password");
				String pass = sc.next();
				if (user == a.getUsername() && pass == a.getPassword()) {
					System.out.println("Current Balance is :- " + a.getBalance());
				} else {
					System.err.println("Incorrect username or password");
					balanaceCheck();
				}
				cond = false;
			} else {
				System.err.println("You have not created the account");
				System.out.println("do you want to \n1)Create Account \n2)break");
				int ans = sc.nextInt();
				if (ans == 1) {
					createAccount();
				} else if (ans == 2) {

					t.data();
				} else {
					System.err.println("enter the correct input");
				}
			}
		}
	}

	@Override
	public void forget() {
		System.out.println("Enter the username");
		String user = sc.next();
		if (user.equals(a.getUsername())) {
			System.out.println("User name Verified");
			System.out.println("enter password");
			String pass = sc.next();
			if (pass.equals(a.getPassword())) {
				System.out.println("Password verified");
				System.out.println("user name and password are correct");
				while (true) {
					System.out.println(
							"Enter what do you want to do \1) Go to main menu 2)Change username 3)Change password");
					int choice = sc.nextInt();
					if (choice == 1) {
						t.data();
					} else if (choice == 2) {
						System.out.println("Enter the new username");
						String user1 = sc.next();
						while (user1 == a.getUsername()) {
							System.err.println("It matches to your current username");
							System.out.println("Enter the another username");
							user1 = sc.next();

						}
						a.setUsername(user1);
						System.out.println("username changed Sucessfully");
						break;
					} else if (choice == 3) {
						System.out.println("Enter the new Password");
						String pass1 = sc.next();
						while (pass1 == a.getPassword()) {
							System.err.println("It matches to your current password");
							System.out.println("Enter the another password");
							pass1 = sc.next();
						}
						a.setPassword(pass1);
						System.out.println("Password changed Sucessfully");
						break;
					} else {
						System.err.println("you entered the wrong input");
					}
				}
			} else {
				System.err.println("The password is wrong");
				while (true) {
					System.out.println("Do you want to change the password \n1) Yes \n2) No");
					int choice = sc.nextInt();
					if (choice == 1) {
						System.out.println("Enter the new Password");
						String pass3 = sc.next();
						a.setPassword(pass3);
						System.err.println("Password set sucessfully");
						break;
					} else if (choice == 2) {
						t.data();
					} else {
						System.err.println("You entered the wrong input");
					}
				}
			}

		} else {
			System.err.println("The username is wrong");
			while (true) {
				System.out.println("Do you want to change the username \n1)Yes \n2)No");
				int choice = sc.nextInt();
				if (choice == 1) {
					System.out.println("Enter the new Username");
					String user3 = sc.next();
					a.setUsername(user3);
					System.out.println("Username set sucessfully");
					while (true) {
						System.out.println("Do you want to change the password\n1) Yes 2) No");
						int in = sc.nextInt();
						if (in == 1) {
							System.out.println("enter the new password");
							String passw = sc.next();
							a.setPassword(passw);
							System.out.println("Password set Sucessfully");
							break;
						} else if (in == 2) {
							t.data();
						} else {
							System.err.println("you entered the wrong input");
						}
					}
					break;

				} else if (choice == 2) {
					t.data();
				} else {
					System.err.println("you entered the wrong input");
				}

			}
		}

	}

}
