package DSA.aRRAY;

import java.util.Stack;

public class File1{
    public static void main(String[] args) {
        float arr[]=new float[5];
        for(float e : arr){
            System.out.print(e + "      ");
        }
        System.out.println();

        int arr2[] = {1,2,5,4,3,8,8,9,6,3};
        System.out.println("Size of the array is : " + arr2.length);
        System.out.println("Array at index 7 : " + arr2[7]);

        String str = new String("Heyy");
        System.out.println(str);

        Stack<Integer> myStack = new Stack<>();
        // Push elements into stack
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println("After pushing: \n" + myStack);
        // Pop an element from stack
        System.out.println("\nAfter popping:\n" + myStack.pop());
        System.out.println("Updated Stack Is : " + myStack);
        System.out.println("Size of the stack is : " + myStack.size());
    }
}