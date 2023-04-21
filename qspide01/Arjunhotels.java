import java.util.*;

 class Arjunhotels {

	static Scanner sc = new Scanner(System.in);
	static boolean user_login_validation = false;
	static int attempt;
	static int ph;
	static int psw;
    static int phx;

	 void swiggyapplication(String[] args)  {

		System.out.println("\t\tWelcome Swigge");
		

		do {

			
				            System.out.println("Select Your Hotels ");
							System.out.println("1.S.S. Hydrabhate\n2.Bhuhari\n3.Arifa");

							// work for Hotel selection

                            System.out.println("Enter your Selection");

							int Hotel_selection = sc.nextInt();

							switch (Hotel_selection) {

								case 1: {
									System.out.println("\t\t Thanks for select S.S Hydrabhat/n");
									System.out.println("\t***********Your Menu**********");
									System.out.println("1.Mutton Briyani\n2.Chicken Briyani\n3.exit");
									System.out.println("Select your Dish");
									int food_selection = sc.nextInt();
									double mutton_price = 380;

									if (food_selection == 1) {

										System.out.println("Mutton Briyani " + mutton_price);
										System.out.println("Enter your Quantity");
										int qun = sc.nextInt();

										double Total = mutton_price * qun;
										System.out.println("Your Total Amount " + Total);

										System.out.println("\t\tSelect your Payment Method");
										System.out.println("1.Google Pay\n2.paytm\n3.exit");

										int pay = sc.nextInt();

										if (pay == 1) {

											System.out.println("Enter you Contact Number");

											 phx = sc.nextInt();

											System.out.println("Waiting For your Otp");

											

											int otpNo = (int) (Math.random() * 9000) + 1000;
											System.out.println(otpNo);

											System.out.println("Enter your Otp");

											int otpx = sc.nextInt();

											if (otpx == otpNo) {
												System.out.println("Payment Successfully");

											} else {
												System.out.println("Invalid Otp");
											}

										}



                                       

									} else if (food_selection==2) {

                                        double Chicken_price = 250;


                                        System.out.println("Chicken  Briyani " + Chicken_price);
										System.out.println("Enter your Quantity");
										int qun = sc.nextInt();

										double Total = mutton_price * qun;
										System.out.println("Your Total Amount " + Total);

										System.out.println("\t\tSelect your Payment Method");
										System.out.println("1.Google Pay\n2.paytm\n3.exit");

										int pay = sc.nextInt();

										if (pay == 1) {

											System.out.println("Enter you Contact Number");

											 phx = sc.nextInt();

											System.out.println("Waiting For your Otp");

											

											int otpNo = (int) (Math.random() * 9000) + 1000;
											System.out.println(otpNo);

											System.out.println("Enter your Otp");

											int otpx = sc.nextInt();

											if (otpx == otpNo) {
												System.out.println("Payment Successfully");

											} else {
												System.out.println("Invalid Otp");
											}

										}











                                    }
                                
                                
                                }  case 2 : {

                                        System.out.println("Thank you for Selecting Bhuhari");
                                        System.out.println("\t***********Your Menu**********");
                                        System.out.println("1.Mutton Briyani\n2.Chicken Briyani\n3.exit");
                                        System.out.println("Select your Dish");
                                        int food_selection = sc.nextInt();
                                        double mutton_price = 380;
    
                                        if (food_selection == 1) {
    
                                            System.out.println("Mutton Briyani " + mutton_price);
                                            System.out.println("Enter your Quantity");
                                            int qun = sc.nextInt();
    
                                            double Total = mutton_price * qun;
                                            System.out.println("Your Total Amount " + Total);
    
                                            System.out.println("\t\tSelect your Payment Method");
                                            System.out.println("1.Google Pay\n2.paytm\n3.exit");
    
                                            int pay = sc.nextInt();
    
                                            if (pay == 1) {
    
                                                System.out.println("Enter you Contact Number");
    
                                                 phx = sc.nextInt();
    
                                                System.out.println("Waiting For your Otp");
    
                                               
    
                                                int otpNo = (int) (Math.random() * 9000) + 1000;
                                                System.out.println(otpNo);
    
                                                System.out.println("Enter your Otp");
    
                                                int otpx = sc.nextInt();
    
                                                if (otpx == otpNo) {
                                                    System.out.println("Payment Successfully");
    
                                                } else {
                                                    System.out.println("Invalid Otp");
                                                }
    
                                            }
    
    
    
                                           
    
                                        }} 



                                        break;}
							

						
						
					
				

			

		} while (true);

	}
}
