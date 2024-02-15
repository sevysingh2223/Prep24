package DSA.FUNCTIONS;

public class File2 {

    static void addby5(int n){
        n = n+5;
        System.out.println("inside funct value of n is  : " + n);
    }
    public static void main(String[] args) {
        int n =56;
        System.out.println("First value of n is : " + n);
        addby5(n);
        System.out.println("The new value of n after calling the function is: "+ n);
    }
}
