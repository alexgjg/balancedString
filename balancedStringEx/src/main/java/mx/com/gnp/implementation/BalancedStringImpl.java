/**
 * @author Alex GJG
 *
 */
package mx.com.gnp.implementation;

import java.util.Stack;

import mx.com.gnp.facade.BalancedString;

public class BalancedStringImpl implements BalancedString {

	public boolean isCorrect(String op) {
        Stack<Character> stack = new Stack<Character>();
        for(char chr : op.toCharArray())
        {
            switch(chr) {

                case '{':
                case '(':
                case '[':
                	stack.push(chr);
                    break;

                case ']':
                    if(stack.isEmpty() || stack.pop() != '[') 
                        return false;
                    break;
                case ')':
                    if(stack.isEmpty() || stack.pop() != '(')
                        return false;
                    break;
                case '}':
                    if(stack.isEmpty() || stack.pop() != '{')
                        return false;
                    break;
            }
        }
        return stack.isEmpty();
    }

}
