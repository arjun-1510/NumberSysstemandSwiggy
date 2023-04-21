import java.util.Scanner;

 class Numbersystem {

    static Scanner sc = new Scanner(System.in);

    static boolean flag = true;

     void numberapplication(String[] args) {
        System.out.println("\t\tSelection of Number System Application");
        System.out.println("1.Palindrome\n2.Prime Number or Not \n3.Perfect Number or not\n4.Factorial\n5.Exit");
        System.out.println("Enter Your selection");
        int select = sc.nextInt();

        do {
            switch (select) {

                case 1: {

                    System.out.println("Enter your Number");
                    int num = sc.nextInt();

                    int rev = 0;

                    int temp = num;

                    while (num > 0) {

                        rev = rev * 10 + num % 10;
                        num = num / 10;

                    }
                    System.out.println("Reverse number is " + rev);

                    if (rev == temp) {

                        System.out.println("Its Palindrome");

                    } else {
                        System.out.println("Its is not Palindrome");
                    }

                    break;
                }
                case 2: {

                    System.out.println("Enter to find Prime or not ");

                    int num = sc.nextInt();

                    int count = 0;

                    for (int i = 1; i <= num; i++) {

                        if (num % i == 0) {
                            count++;
                        }
                    }
                    if (count == 2) {
                        System.out.println("Its is prime number");
                    } else {
                        System.out.println("Its is not Prime number");
                    }

                    break;
                }
                case 3: {

                    System.out.println("Enter to find Perfect or not ");

                    int num = sc.nextInt();
                    int sum = 0;

                    for (int i = 1; i < num; i++) {

                        if (num % i == 0) {

                            sum = sum + i;
                        }

                    }

                    if (sum == num) {

                        System.out.println("its is Perfect number");
                    } else {
                        System.out.println("Its is Not Perfect number");
                    }

                    break;
                }
                case 4: {

                    System.out.println("Enter To find  Factorila Number");

                    int num = sc.nextInt();

                    int fact = 1;

                    for (int i = 2; i <= num; i++) {
                        fact = fact * i;
                    }
                    System.out.println("Factorial number is" + fact);

                    break;
                }
                case 5: {

                    flag = false;
                    break;
                }

            }
        } while (flag);
        System.out.println("Thank you Tataaa");
        {

        }

    }

}
