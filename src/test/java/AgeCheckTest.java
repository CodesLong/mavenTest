import org.junit.Assert;
import org.junit.Test;

public class AgeCheckTest {
//   String AgeCheck.getName{int age}

    @Test
    public void testAgeCheck() {
        //given
        Assert.assertEquals(AgeCheck.getAgeName(6),"儿童");
        //when
        //then
    } @Test
    public void testAgeCheck1() {
        //given
        Assert.assertEquals(AgeCheck.getAgeName(7),"少年");
        Assert.assertEquals(AgeCheck.getAgeName(18),"青年");
        Assert.assertEquals(AgeCheck.getAgeName(51),"中年");
        //when
        //then
    }
}
