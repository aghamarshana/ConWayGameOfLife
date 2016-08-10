import static org.junit.Assert.*;
import org.junit.Assert;
//this is to create new remote branch in the git
import org.junit.Test;

public class ConwayTest {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		Conway test=new Conway();
		char f='.';
		char t='o';
		
		char[][] input=new char[][]{
			{f,f,f,f,f,f,f,f,f,f,},
			{f,f,f,f,f,f,f,t,f,f,},
			{f,t,t,t,f,f,f,t,f,f,},
			{f,f,f,f,f,f,f,t,f,f,},
			{f,f,f,f,f,f,f,f,f,f,},
			{f,f,f,f,t,t,f,f,f,f,},
			{f,f,f,f,t,t,f,f,f,f,},
			{f,f,f,f,f,f,f,f,f,f,}
			                           
		};
		
		char[][] expected=new char[][]{
			{f,f,f,f,f,f,f,f,f,f,},
			{f,f,t,f,f,f,f,f,f,f,},
			{f,f,t,f,f,f,t,t,t,f,},
			{f,f,t,f,f,f,f,f,f,f,},
			{f,f,f,f,f,f,f,f,f,f,},
			{f,f,f,f,t,t,f,f,f,f,},
			{f,f,f,f,t,t,f,f,f,f,},
			{f,f,f,f,f,f,f,f,f,f,}
			                           
		};
		
		
		
char[][] output=new char[8][10];
		output=test.getUpdatedGrid(input);
		Assert.assertArrayEquals(expected, output);
		
	}

}
