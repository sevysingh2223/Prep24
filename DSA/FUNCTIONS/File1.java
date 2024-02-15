package DSA.FUNCTIONS;

class File1 {

    // how to write
    static void greetUser(String name){
        System.out.println("Hello, " + name);
    }

    static  int addTwoNumbers(int a, int b) {
        return (a+b);
    }
    public static void main(String[] args) {
        greetUser("ANKIT");
        int x = 10 , y=20;
        int ans = addTwoNumbers(x, y);
        System.out.println("Value of sum is  : "+ ans);
        int ans2 = addTwoNumbers(x+25, y*9);
        System.out.println("Value of sum is  : "+ ans2);

        String str = "Hello Friend..";
        System.out.println(str.length());
    }
}