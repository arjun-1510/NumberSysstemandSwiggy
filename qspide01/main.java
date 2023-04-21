import java.util.*;

class MainClass {

    static Scanner sc = new Scanner(System.in);

    static boolean flag =false;

    static int attempt ;

    static int std_id ;

    static int std_psw ;

    static int forget_std_id ;

    static int forget_std_psw ;

    static int forget_std_confim ;

    static int forget_std_Age ;

    

    public static void main(String[] args)  {

        do {

            System.out.println("1.SignUp\n2.Login\n3.Forget Password\n4.exit");
            System.out.println("Enter to Select Number");
            int num = sc.nextInt();

            switch (num) {

                case 1:
                    System.out.println("\t\tThis is SignUp page");

                    System.out.println("Enter Your Student Id");
                    std_id = sc.nextInt();

                    System.out.println("Enter your Password");
                    std_psw = sc.nextInt();

                    System.out.println("Enter your  Confirm Password");
                    int std_confim = sc.nextInt();

                    System.out.println("Enter your Age");
                    int std_Age = sc.nextInt();

                    if (std_psw == std_confim) {

                        System.out.println("Signup Sucessfull");
                    } else {
                        System.out.println("invalid Password or Phone Numner");
                    }

                    flag = true;

                    break;

                case 2:

                    if (flag) {

                        // Login Page validation

                        System.out.println(" \t\tLogin Page ");

                        System.out.println("Enter your Student Id");
                        int Login_std_id = sc.nextInt();

                        System.out.println("Enter your Password");
                        int Login_std_psw = sc.nextInt();

                        if (Login_std_id == std_id && Login_std_psw == std_psw
                                || forget_std_id == Login_std_id && Login_std_psw == forget_std_psw) {

                            System.out.println("\t\tLogin Sucessfull");

                            System.out.println("Welcome to My Programming World");

                            System.out.println("1.Number System \n2.Swiggy App\n3.About MySelf\n4.Exit");
                            System.out.println("Enter your selection");
                            int Select_App = sc.nextInt();

                             switch(Select_App) {

                                case 1 : {

                                    Numbersystem n = new Numbersystem();
                                    n.numberapplication(args);
                                    
                                    break;
                                }

                                case 2 : {

                                    Arjunhotels arju = new Arjunhotels();
                                    arju.swiggyapplication(args);
                                                   
                                  
                                    
                                    break;}
                             }


                        }

                        System.out.println("This is Login Page");
                        break;

                    } else {

                        System.out.println("First Signup");

                        attempt++;

                        if (attempt == 2) {
                            System.out.println("Please second time i say Signup First");

                            if (attempt == 3) {
                                System.out.println("Thank you");
                                flag = false;
                            }

                        }

                    }

                    break;

                case 3: {


                


                    while (true) {

                    System.out.println("Forget password Page");

                    System.out.println("student Id Age");
                    int forget_Sid = sc.nextInt();

                    System.out.println("Phone number your Age");
                    int forget_ph = sc.nextInt();

                    System.out.println("Waiting For your Otp");

                    flag=true;

                    

                    int otpNo = (int) (Math.random() * 9000) + 1000;
                    System.out.println(otpNo);

                    System.out.println("Enter your Otp");

                    int otpx = sc.nextInt();

                    if (otpx == otpNo) {
                        System.out.println("\t\t Successfully");

                        System.out.println("Enter Your Student Id");
                        forget_std_id = sc.nextInt();

                        System.out.println("Enter your Password");
                        forget_std_psw = sc.nextInt();

                        System.out.println("Enter your  Confirm Password");
                        forget_std_confim = sc.nextInt();

                        System.out.println("Enter your Age");
                        forget_std_Age = sc.nextInt();
                        attempt++;
                        
                    
                        if (attempt == 2) {
                            System.out.println("Thank you");
                            flag = false;

                        }

                    } else {
                        System.out.println("Invalid Otp");
                    }
                

                    System.out.println("Exit");
                    int exit = sc.nextInt();
                    break;

                   

                   
                
                }break;
            }
            

        }} while (flag);

    }
}
