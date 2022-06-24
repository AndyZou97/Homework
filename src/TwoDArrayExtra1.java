public class TwoDArrayExtra1 {
    public static void main(String[] args) {
        char[][] answers = {
                {'A', 'D', 'B', 'A', 'B', 'E', 'A', 'D', 'E', 'B'},
                {'B', 'C', 'E', 'C', 'E', 'E', 'E', 'D', 'E', 'B'},
                {'A', 'B', 'D', 'E', 'A', 'D', 'C', 'D', 'A', 'B'},
                {'B', 'B', 'D', 'E', 'B', 'E', 'C', 'C', 'A', 'D'},
                {'A', 'B', 'D', 'E', 'C', 'A', 'B', 'D', 'E', 'C'},
                {'A', 'B', 'D', 'E', 'D', 'C', 'E', 'B', 'C', 'E'},
                {'B', 'D', 'E', 'C', 'A', 'D', 'B', 'E', 'B', 'B'},
                {'C', 'D', 'D', 'C', 'B', 'E', 'A', 'D', 'E', 'B'},
                {'B', 'D', 'E', 'A', 'B', 'D', 'E', 'A', 'C', 'D'},
                {'B', 'E', 'E', 'A', 'A', 'E', 'A', 'B', 'E', 'B'},
                {'B', 'D', 'E', 'A', 'B', 'D', 'E', 'D', 'E', 'B'},
                {'B', 'D', 'E', 'C', 'B', 'E', 'B', 'D', 'C', 'E'}};

        char[] key = {'B','D','E','A','B','E','E','D','E','B'};

        System.out.println(numberOfStudentsPassed(answers, key));

    }
    public static int numberOfStudentsPassed(char[][] answers, char[] key){
        int passed = 0;
        int correct = 0;
        for(int student = 0; student < answers.length; student++){
            for(int question = 0; question <answers[student].length;question++){
                if (answers[student][question] == key[question]){
                        correct += 1;
                }
            }
            if(correct >= 6){
                passed += 1;
            }
            correct = 0;
        }
        return passed;
    }
}
