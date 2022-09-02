class JavaException4
{
	static void checkAge(int age) throws ArithmeticException{
            if (age < 18) {
				 System.out.println("Access denied!");
      
            }
            else {
                System.out.println("Access granted - You are old enough!");
            }
        }

        public static void main(String[] args) {
			 
        checkAge(15);

    }

}
