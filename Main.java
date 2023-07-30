import java.util.*;

public class Main
{

    // main method to test below-implemented method

    public static void main(String[] args) {


        // test method CheckBalancedBrackets
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the brackets :");

        String str1 = sc.nextLine();

        {
            if (CheckBalancedBrackets(str1) == true)
            {
                System.out.println(" The entered string has Balanced Brackets");
            }
            if (CheckBalancedBrackets(str1) == false)
            {
                System.out.println(" The entered Strings do not contain Balanced Brackets");
            }

        }


    }

//     method CheckBalancedBrackets to check the given String
// is a Balanced Brackets or Unbalanced String

    public static boolean CheckBalancedBrackets(String str)
    {

        Stack<Character> stack = new Stack<Character>();


        for (int i = 0; i < str.length(); i++)
        {
            char x = str.charAt(i);

            if (x == '(' || x == '[' || x == '{')
            {
                // Push the opening parenthesis into the stack
                stack.push(x);
                continue;
            }

            // If the current character is not opening
            // bracket, then it must be closing. So stack
            // cannot be empty at this point.

            if (stack.isEmpty())
                return false;

            char check;


            // and here check them by popping out

            if(x == ')'){

                check = stack.pop();
                if (check == '{' || check == '[')
                    return false;
            }

            else if(x == '}'){
                check = stack.pop();
                if (check == '(' || check == '[')
                    return false;
            }

            else if(x == ']'){
                check = stack.pop();
                if (check == '(' || check == '{')
                    return false;
            }

        }

        //If the stack is empty then the string entered is a Balanced Brackets

        return (stack.isEmpty());
    }

}