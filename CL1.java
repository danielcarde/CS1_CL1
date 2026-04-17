/* Daniel Adrian Cardenas
[CS1101] Comprehensive Lab 1
This work is to be done individually. It is not permitted to.
share, reproduce, or alter any part of this assignment for any
purpose. Students are not permitted to share code, upload
this assignment online in any form, or view/receive/
modifying code written by anyone else. This assignment is part.
of an academic course at The University of Texas at El Paso and
a grade will be assigned for the work produced individually by
the student.
*/


import java.util.Scanner;
import java.io.File;

public class CL1{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double totalPrice = 0;
		int totalItems = 0;
		double foodPrice = 0;
		double tip =0;
		

		boolean exit = false;
		while(!exit){
			System.out.println();
			System.out.println("Welcome to Miner Eats!");
			System.out.println("----------Menu----------");
			System.out.println("Choose an option (1-5):");
			System.out.println("1. Add Food");
			System.out.println("2. View Cart");
			System.out.println("3. Clear Cart");
			System.out.println("4. Checkout");
			System.out.println("5. Exit Miner Eats");
			System.out.println("------------------------");
			int choice = input.nextInt();
			System.out.println();
			switch(choice){
				case 1:
					input.nextLine();
					File file = new File("food.txt");
					try{
						Scanner fileReader = new Scanner(file);
						System.out.println("----------Food----------");
						while(fileReader.hasNextLine()){
							String line = fileReader.nextLine();
							System.out.println(line);
						}
						System.out.println("------------------------");
						boolean correctFood = false;
						while(!correctFood){
							correctFood =true;
							System.out.println("Please type the type of food you want to order:");
							String foodChoice = input.nextLine();
							switch (foodChoice) {		//could not find how to get it from file
							    case "Burger":
							        foodPrice = 12.00;
							        break;
							    case "Fries":
							        foodPrice = 5.00;
							        break;
							    case "ChickenSandwich":
							        foodPrice = 10.00;
							        break;
							    case "TurkeySandwich":
							        foodPrice = 9.00;
							        break;
							    case "CaesarSalad":
							        foodPrice = 8.00;
							        break;
							    case "Waffles":
							        foodPrice = 10.50;
							        break;
							    case "ChickenStrips":
							        foodPrice = 8.50;
							        break;
							    case "QuinoaBowl":
							        foodPrice = 9.50;
							        break;
							    case "Nachos":
							        foodPrice = 10.00;
							        break;
							    case "TunaSalad":
							        foodPrice = 10.50;
							        break;
							    case "Tacos":
							        foodPrice = 11.00;
							        break;
							    case "Cookie":
							        foodPrice = 4.00;
							        break;
							    case "IceCream":
							        foodPrice = 7.00;
							        break;
							    case "Soda":
							        foodPrice = 2.50;
							        break;
							    case "MacAndCheese":
							        foodPrice = 5.50;
							        break;
							    case "Juice":
							        foodPrice = 3.00;
							        break;
							    case "Coffee":
							        foodPrice = 2.50;
							        break;
							    case "Soup":
							        foodPrice = 7.00;
							        break;
							    default:
							        System.out.println("Invalid food choice. Please try again.");
							        correctFood =false;
							        break;
							}
						}
						System.out.println("How many of this item?");
						int amountOf = input.nextInt();
						for(int i=0;i<amountOf;i++){
							totalPrice = totalPrice+foodPrice;
							totalItems++;
						}
						System.out.println("----------Cart----------");
						System.out.println("Number of Items: " + totalItems);
						System.out.println("Totals: $" + totalPrice);
						System.out.println("------------------------");
					}
					catch (Exception e){
						e.printStackTrace();
					}
					System.out.println();
					break;
				case 2:
					System.out.println("----------Cart----------");
					System.out.println("Number of Items: " + totalItems);
					System.out.println("Totals: $" + totalPrice);
					System.out.println("------------------------");
					break;
				case 3:
					boolean correctInput = false;
					input.nextLine();
					while(!correctInput){
						correctInput = true;
						System.out.println("Are you sure you would like to clear your cart? (yes or no)");
						String userClear = input.nextLine();
						if(userClear.equals("yes")){
							totalItems = 0;
							totalPrice = 0;
							System.out.println("Cart has been cleared. Returning to the menu.");

						}
						else if(userClear.equals("no")){
							System.out.println("Cart not changed. Returning to the menu.");
						}
						else{
							correctInput = false;
							System.out.println("Invalid Input!");
						}
					}
					System.out.println();
					break;
				case 4:
					boolean correctInput4 = false;
					while(!correctInput4){
						correctInput4 =true;
						boolean isDelivery =false;
						String address ="";
						System.out.println("Please choose an option below:");
						System.out.println("1. Pickup	2. Delivery");
						int pdOption = input.nextInt();
						if((pdOption==1)||(pdOption==2)){
							if(pdOption==2){
								isDelivery=true;
								input.nextLine();
							}
							if(isDelivery){
								System.out.println("There is a $5 Delivery fee.");
								totalPrice = totalPrice + 5;
								System.out.println("Please enter a Address");
								address = input.nextLine();
								boolean tipC = false;
								while(!tipC){
									tipC=true;
									System.out.println("Would you like to add a tip?");
									System.out.println("1. Yes	2. No");
									int tipChoice = input.nextInt();
									if(tipChoice==1){
										System.out.println("What percentage of tip? (Input only Integer)");
										tip = input.nextInt();
									}
									else if(tipChoice==2){
										//do nothing
									}
									else{
										tipC=false;
										System.out.println();
										System.out.println("Invalid Input! Please Try Again!");
										System.out.println();
									}
								}
							}
							input.nextLine();
							System.out.println("Order Information");
							System.out.println("Number of items: " + (totalItems));
							System.out.println("Total Price: " + (totalPrice+(totalPrice*(7.25/100))+(totalPrice*(tip/100))));
							if(isDelivery){
								System.out.println("Address: " + address);
							}
							boolean cardLength = false;
							while(!cardLength){
								System.out.println("Please enter your 16 digit card number to complete the order:");
								String cardNum = input.nextLine();
								if(cardNum.length()==16){
									cardLength = true;
									System.out.println();
									System.out.println("Success! Thank you for shopping with Miner Eats!");
									System.out.println("----------Reciept----------");
									System.out.println("Number of items: " + (totalItems));
									System.out.println("Total Price: " + (totalPrice+(totalPrice*(7.25/100))+(totalPrice*(tip/100))));
									System.out.println("---------------------------");
									totalItems = 0;
									totalPrice = 0;
								}
								else{
									System.out.println("Invalid Input or Incorrect Card length! Try Again!");
								}
							}
						}
						else{
							correctInput4 =false;
							System.out.println();
							System.out.println("Incorrect Input! Please Try Again!");
							input.nextLine();
							
						}
									
					}
					break;
				case 5:
					exit = true;
					System.out.println("Cart abandoned. Goodbye!");
					System.out.println("Ending program.");
					break;
				default:
					System.out.println("Error: Invalid Input");
					input.nextLine();
					System.out.println();
			}
		}
	}
}