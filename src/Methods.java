public class Methods {
    public static void main(String[] args) {
    }
    public static void add2Numbers(int x, int y) {
        System.out.println(x + y);
    }
    public static void myInfo(String name, int age) {
        System.out.println("Name is: " + name + " , age is: " + age);
    }
    public static void findLargestNumber(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is largest");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is largest");
        } else if (num3 >= num1 && num3 >= num2) {
            System.out.println(num3 + " is largest");
        }
    }
    public static void loginPage(String userName, String passWord){
        String username = "Abc123$";
        String password = "1234$";
        if (userName.equals(username) && passWord.equals(password)){
            System.out.println("Log in successed ");
            System.out.println("Home Page is displayed");
        } else{
            System.out.println("Invalid UserName or PassWord");
        }
    }
    // creat a java method take 2 String args : firstName , lastName
    // call methods & print your fName & lName
    public static void printName(String firstName, String lastName){
        System.out.println(firstName + " " + lastName);
    }
    //TASK:
    //creat a java method with 1 char args
    //creat a logic to check if the car is vowel or not
    //if is is vowel print : it is vowel
    //if not : ptint "it is nota vovel"
    //if it is not char letter : print " invalid input"
    public static void vowel (char ch) {
        if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
            switch (ch) {
                case 'a':
                case 'e':
                case 'o':
                case 'u':
                case 'i':
                case 'A':
                case 'E':
                case 'I':
                case 'U':
                case 'O':
                    System.out.println(ch + " is a vowel letter");
                    break;
                default:
                    System.out.println (ch + " is not a vowel");
            }
        }else {
            System.out.println ( "this is not a letter");
        }
    }
    // TASK:
    // java method that takes 2 int rags x y = done
    // prints from x to y
    //EX: 1, 8 => 1 2 3 4 5 6 7 8
    // 4 12 => 4 5 6 7 8 9 10 11 12
    // if pass: 12 1 => invalid input!
    public static void printFromTo(int x , int y){
        if ( x < y){
            for ( int i = x; i <= y; i++){
                System.out.print(i + " ");
            }
        }else if (x > y){
            for ( int j = x; j >= y; j--){
                System.out.print(j + " ");
            }
        }
    }




}
