import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void validGrade() {
        assertEquals("A", SkillDemo.gradeCalculator(91));
        assertEquals("B", SkillDemo.gradeCalculator(84));
        assertEquals("C", SkillDemo.gradeCalculator(70));
        assertEquals("D", SkillDemo.gradeCalculator(67));
        assertEquals("F", SkillDemo.gradeCalculator(35)); // Fail test
        assertEquals("Invalid grade.", SkillDemo.gradeCalculator(110));
    }
}