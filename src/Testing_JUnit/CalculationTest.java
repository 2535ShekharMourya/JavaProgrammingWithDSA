package Testing_JUnit;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CalculationTest {
    @Test(timeout = 1000)
    public void testFindMax() {
        int[] arr = { 10, 5, 20, 15 };
        int expectedMax = 20;
        int actualMax = Calculation.findMax(arr);
       assertEquals(expectedMax, actualMax);
       //or you can write
        assertEquals(20,Calculation.findMax(new int[]{10, 5, 20, 15 }));
        assertEquals(10,Calculation.findMax(new int[]{10, 5, 20, 15 }));
        assertEquals(15,Calculation.findMax(new int[]{10, 5, 20, 15 }));
        assertEquals(5,Calculation.findMax(new int[]{10, 5, 20, 15 }));
    }
    @Test
    public void testFindTarget(){
        int arr2[]={1,2,4,7,9,12,14,15,16,23,27};
        int expected_target=23;
        int actual_target=Calculation.findTarget(arr2);
        assertEquals(actual_target,expected_target);
        // or you can write
        assertEquals(23,Calculation.findTarget(new int[]{1,2,4,7,9,12,14,15,16,23,27} ));
        assertEquals(4,Calculation.findTarget(new int[]{1,2,4,7,9,12,14,15,16,23,27} ));
        assertEquals(15,Calculation.findTarget(new int[]{1,2,4,7,9,12,14,15,16,23,27} ));
        assertEquals(9,Calculation.findTarget(new int[]{1,2,4,7,9,12,14,15,16,23,27} ));
    }
   /* @Test
    public  void testFindObj(){
        student s=new student();
        s.name="azad";
        student expected_name=s;
        student actual_name=Calculation.findObj(s);
        assertEquals(actual_name,expected_name);

    }*/
}
