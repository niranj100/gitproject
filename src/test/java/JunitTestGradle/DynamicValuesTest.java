package JunitTestGradle;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.stream.Stream;

//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
//import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class DynamicValuesTest {

	private SumNumbers obj;
	@BeforeAll
	void setUpBeforeClass() throws Exception {
		obj = new SumNumbers();
		System.out.println("In the beginning");
	}
	
	@TestFactory
	public Stream<DynamicTest> testAdditions(){
		int[][] data = new int[][] {{1,2,3},{5,3,7},{6,7,13}};
		return Arrays.stream(data).map(entry-> {
            int a=entry[0];
		    int b=entry[1];
		    int sum=entry[2];
		    return dynamicTest(a+"+"+b+"="+sum,()-> {
		    	assertEquals(sum,obj.sum(a, b));
		    });				
    	});
	}
}
