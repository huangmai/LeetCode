package huangmai.leetCode.problems.stringProblem;

public class P0520 {
    public boolean detectCapitalUse(String word) {
        return word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+");
    }
}
