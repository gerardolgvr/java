package dev.gerardo.exercises.stacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BalancedBracketsTest {

    @Test
    public void test0(){
        assertEquals("NO", BalancedBrackets.isBalanced("}][}}(}][))]"));
        assertEquals("YES", BalancedBrackets.isBalanced("[](){()}"));
        assertEquals("YES", BalancedBrackets.isBalanced("()"));
        assertEquals("YES", BalancedBrackets.isBalanced("({}([][]))[]()"));
        assertEquals("NO", BalancedBrackets.isBalanced("{)[](}]}]}))}(())("));
        assertEquals("NO", BalancedBrackets.isBalanced("([[)"));
    }

    @Test
    public void test1(){
        assertEquals("YES", BalancedBrackets.isBalanced("{}"));
        assertEquals("NO", BalancedBrackets.isBalanced("}([[{)[]))]{){}["));
        assertEquals("NO", BalancedBrackets.isBalanced("{]]{()}{])"));
        assertEquals("YES", BalancedBrackets.isBalanced("(){}"));
        assertEquals("YES", BalancedBrackets.isBalanced("{}{()}{{}}"));
    }

    @Test
    public void test18(){
        assertEquals("YES", BalancedBrackets.isBalanced("{[()]}"));
        assertEquals("NO", BalancedBrackets.isBalanced("{[(])}"));
        assertEquals("YES", BalancedBrackets.isBalanced("{{[[(())]]}}"));
    }

    @Test
    public void test19(){
        assertEquals("NO", BalancedBrackets.isBalanced("{(([])[])[]]}"));
    }

}
