public class SkillDemo {
    public static Object gradeCalculator(int grade) {
        if (grade < 0 || grade > 100) {
            return "Invalid grade.";
        }
        // Grade is F
        if (grade < 60) {
            return "F";
        }
        // Grade is D
        if (grade < 70) {
            return "D";
        }
        // Grade is C
        if (grade < 80) {
            return "C";
        }
        // Grade is B
        if (grade < 90) {
            return "B";
        }
        // Grade is A
        else {
            return "A";
        }
    }
}
