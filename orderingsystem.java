import java.util.Scanner;
public class orderingsystem
{
	public static Scanner input = new Scanner(System.in);
	public static String again;
	public static int choose,quantity=1;
	public static double total=0,pay;
	public static void menu(){
		System.out.println("\t\t\t\t+================================================+");
		System.out.println("\t\t\t\t        Wlcome TO Java's Cafe     ");
		System.out.println("\t\t\t\t         ****** Menu ******       ");
		System.out.println("\t\t\t\t          ------|Drinks|-----       ");
		System.out.println("\t\t\t\t       1.Coffee.............Rs.20/- ");
		System.out.println("\t\t\t\t       2.Cold Coffee........Rs.20/- ");
		System.out.println("\t\t\t\t       3.Cappuccino.........Rs.60/- ");
		System.out.println("\t\t\t\t       4.Hot Milk...........Rs.25/- ");
		System.out.println("\t\t\t\t           ------|Snaks|-----       ");
		System.out.println("\t\t\t\t       5.Samosa.............Rs.20/- ");
		System.out.println("\t\t\t\t       6.Egg Roll...........Rs.20/- ");
		System.out.println("\t\t\t\t       7.Sandwich...........Rs.40/- ");
		System.out.println("\t\t\t\t       8.Fried Rice.........Rs.90/- ");
		System.out.println("\t\t\t\t       9.Manchurian.........Rs.90/- ");
		System.out.println("\t\t\t\t       10.Maggie............Rs.40/- ");
		System.out.println("\t\t\t\t          ------|Special Items|-----       ");
		System.out.println("\t\t\t\t       11.Classic Pizza.....Rs.100/- ");
		System.out.println("\t\t\t\t       12.Margarita Pizza...Rs.120/- ");
		System.out.println("\t\t\t\t       13.Cheese Pizza......Rs.140/- ");
		System.out.println("\t\t\t\t       14.Mashroom Pizza....Rs.180");
		System.out.println("\t\t\t\t       15.Spl.Veg Wrap......Rs.150/- ");
		System.out.println("\t\t\t\t      !!!!!!Press 16 For Exit!!!!!!");
		System.out.println("\t\t\t\t+================================================+");
	}

	public static void order(){
		System.out.println("Choice FOOD You Want to BUY:");
		choose=input.nextInt();
		
					if(choose==1)
					{
						System.out.println("You choose Coffee");
						System.out.println("How many Coffee you Want to BUY ?:");
						quantity =input.nextInt();
						
						total =total + (quantity*20);
						System.out.println("You want to BUY again");
						System.out.println("Press Y  for YES & n for NO :");
						again =input.next();
						
								if(again.equals("Y"))
										{
												order();
										}
										else{
											System.out.println("===========YOUR Total Bill Is:"+ total+"====================");
										}

					}
					else if(choose==2)
					{
						System.out.println("You choose Cold Coffee");
						System.out.println("How many Cold Coffee you Want to BUY ?:");
						quantity =input.nextInt();
						
						total =total + (quantity*20);
						System.out.println("You want to BUY again");
						System.out.println("Press Y for YES & n for NO :");
						again =input.next();
						
								if(again.equals("Y"))
										{
												order();
										}else{
											System.out.println("===========YOUR Total Bill Is:"+ total+"====================");
										}

					}
					else if(choose==3)
					{
						System.out.println("You choose Cappuccino");
						System.out.println("How many Cappuccino you Want to BUY ?:");
						quantity =input.nextInt();
						
						total =total + (quantity*60);
						System.out.println("You want to BUY again");
						System.out.println("Press Y for YES & n for NO :");
						again =input.next();
						
								if(again.equals("Y"))
										{
												order();
										}else{
											System.out.println("===========YOUR Total Bill Is:"+ total+"====================");
										}

					}
					else if(choose==4)
					{
						System.out.println("You choose Hot Milk");
						System.out.println("How many Hot Milk you Want to BUY ?:");
						quantity =input.nextInt();
						
						total =total + (quantity*25);
						System.out.println("You want to BUY again");
						System.out.println("Press Y for YES & n for NO :");
						again =input.next();
						
								if(again.equals("Y"))
										{
												order();
										}else{
											System.out.println("===========YOUR Total Bill Is:"+ total+"====================");
										}

					}
					else if(choose==5)
					{
						System.out.println("You choose Samosa");
						System.out.println("How many Samosa you Want to BUY ?:");
						quantity =input.nextInt();
						
						total =total + (quantity*20);
						System.out.println("You want to BUY again");
						System.out.println("Press Y for YES & n for NO :");
						again =input.next();
						
								if(again.equals("Y"))
										{
												order();
										}else{
											System.out.println("===========YOUR Total Bill Is:"+ total+"====================");
										}

					}
					else if(choose==6)
					{
						System.out.println("You choose Egg Roll");
						System.out.println("How many Egg Roll you Want to BUY ?:");
						quantity =input.nextInt();
						
						total =total + (quantity*20);
						System.out.println("You want to BUY again");
						System.out.println("Press Y for YES & n for NO :");
						again =input.next();
												if(again.equals("Y"))
										{
												order();
										}else{
											System.out.println("===========YOUR Total Bill Is:"+ total+"====================");
										}

					}
					else if(choose==7)
					{
						System.out.println("You choose Sandwich");
						System.out.println("How many Sandwich you Want to BUY ?:");
						quantity =input.nextInt();
						
						total =total + (quantity*40);
						System.out.println("You want to BUY again");
						System.out.println("Press Y for YES & n for NO :");
						again =input.next();
						
								if(again.equals("Y"))
										{
												order();
										}else{
											System.out.println("===========YOUR Total Bill Is:"+ total+"====================");
										}

					}
					else if(choose==8)
					{
						System.out.println("You choose Fried Rice");
						System.out.println("How many Plet Fried Rice you Want to BUY ?:");
						quantity =input.nextInt();
						
						total =total + (quantity*90);
						System.out.println("You want to BUY again");
						System.out.println("Press Y for YES & n for NO :");
						again =input.next();
						
								if(again.equals("Y"))
										{
												order();
										}else{
											System.out.println("===========YOUR Total Bill Is:"+ total+"====================");
										}

					}
					else if(choose==9)
					{
						System.out.println("You choose Manchurian");
						System.out.println("How many Plet Manchurian you Want to BUY?:");
						quantity =input.nextInt();
						
						total =total + (quantity*90);
						System.out.println("You want to BUY again");
						System.out.println("Press Y for YES & n for NO :");
						again =input.next();
						
								if(again.equals("Y"))
										{
												order();
										}else{
											System.out.println("===========YOUR Total Bill Is:"+ total+"====================");
										}

					}
					else if(choose==10)
					{
						System.out.println("You choose Maggie");
						System.out.println("How many Plet Maggie you Want to BUY?:");
						quantity =input.nextInt();
						
						total =total + (quantity*40);
						System.out.println("You want to BUY again");
						System.out.println("Press Y for YES & n for NO :");
						again =input.next();
						
								if(again.equals("Y"))
										{
												order();
										}else{
											System.out.println("===========YOUR Total Bill Is:"+ total+"====================");
										}

					}
					else if(choose==10)
					{
						System.out.println("You choose Maggie");
						System.out.println("How many Plet Maggie you Want to BUY?:");
						quantity =input.nextInt();
						
						total =total + (quantity*40);
						System.out.println("You want to BUY again");
						System.out.println("Press Y for YES & n for NO :");
						again =input.next();
						
								if(again.equals("Y"))
										{
												order();
										}else{
											System.out.println("===========YOUR Total Bill Is:"+ total+"====================");
										}

					}
					else if(choose==11)
					{
						System.out.println("You choose Classic Pizza");
						System.out.println("How many Classic Pizza you Want to BUY?:");
						quantity =input.nextInt();
						
						total =total + (quantity*100);
						System.out.println("You want to BUY again");
						System.out.println("Press Y for YES & n for NO :");
						again =input.next();
														if(again.equals("Y"))
										{
												order();
										}else{
											System.out.println("===========YOUR Total Bill Is:"+ total+"====================");
										}

					}
					else if(choose==12)
					{
						System.out.println("You choose Margarita Pizza");
						System.out.println("How many Margarita Pizza you Want to BUY?:");
						quantity =input.nextInt();
						
						total =total + (quantity*120);
						System.out.println("You want to BUY again");
						System.out.println("Press Y for YES & n for NO :");
						again =input.next();
						
								if(again.equals("Y"))
										{
												order();
										}else{
											System.out.println("===========YOUR Total Bill Is:"+ total+"====================");
										}

					}
					else if(choose==13)
					{
						System.out.println("You choose Cheese Pizza");
						System.out.println("How many Cheese Pizza you Want to BUY?:");
						quantity =input.nextInt();
						
						total =total + (quantity*140);
						System.out.println("You want to BUY again");
						System.out.println("Press Y for YES & n for NO :");
						again =input.next();
						
								if(again.equals("Y"))
										{
												order();
										}else{
											System.out.println("===========YOUR Total Bill Is:"+ total+"====================");
										}

					}
					else if(choose==14)
					{
						System.out.println("You choose Mashroom Pizza");
						System.out.println("How many Mashroom Pizza you Want to BUY?:");
						quantity =input.nextInt();
						
						total =total + (quantity*180);
						System.out.println("You want to BUY again");
						System.out.println("Press Y for YES & n for NO :");
						again =input.next();
						
								if(again.equals("Y"))
										{
												order();
										}else{
											System.out.println("===========YOUR Total Bill Is:"+ total+"====================");
										}

					}
					else if(choose==15)
					{
						System.out.println("You choose Spl.Veg Wrap");
						System.out.println("How many Spl.Veg Wrap you Want to BUY?:");
						quantity =input.nextInt();
						
						total =total + (quantity*150);
						System.out.println("You want to BUY again");
						System.out.println("Press Y for YES & n for NO :");
						again =input.next();
					
								if(again.equals("Y"))
										{
												order();
										}else{
											System.out.println("===========YOUR Total Bill Is:"+ total+"====================");
										}

					}
					else if(choose==16)
					{
						System.exit(0);

					}
					else{
						System.out.println("!!!!Please Select Correct Choice from 1~16!!!!");
						order();						
					}





	}
	public static void  main(String[] args) {
		menu();
		order();
		
	}
}
