import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 *  @author johnmadaj
 *  @version 20210422
 */
public class Asg4EqualToIsEqualTests {

	/** thrown is thrown. */
	@SuppressWarnings("deprecation")
    @Rule
	public ExpectedException thrown = ExpectedException.none();

	/**
	 * <a>.equalTo(x) == true
	 */
	@Test
	public void noBranches() {
		BstADT o = Asg4States.state12();
		BstIMP x = new BstIMP(new Node('a'));
		boolean actual = o.equalTo(x);
		boolean expected = true;
		assertEquals(expected, actual);
	}

	/**
	 * <b,a,c>.equalTo(x) == true
	 */
	@Test
	public void branches() {
		BstADT o = Asg4States.state0();
	    BstIMP x = new BstIMP(new Node('b'));
	    x.insert('a');
	    x.insert('c');
		boolean actual = o.equalTo(x);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	/**
	 * Place a description of your method here.
	 */
	@Test
	public void emptyTree() {
	    BstIMP x = new BstIMP();
	    BstIMP y = new BstIMP();
	    boolean actual = x.equalTo(y);
	    assertEquals(true, actual);
	}
}
