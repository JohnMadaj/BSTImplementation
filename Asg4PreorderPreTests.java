import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**

 *  @author johnmadaj
 *  @version 20210422
 */
public class Asg4PreorderPreTests {

	/** thrown is thrown. */
	@SuppressWarnings("deprecation")
    @Rule
	public ExpectedException thrown = ExpectedException.none();

	/**
	 * <b,a,c>.preorder() == "bac"
	 */
	@Test
	public void bac() {
		BstADT o = Asg4States.state0();
		String actual = o.preorder();
		String expected = "bac";
		assertEquals(expected, actual);
	}

	/**
	 * <c,b,a,d,e>.preorder() == "cbade"
	 */
	@Test
	public void cbade() {
		BstADT o = Asg4States.state4();
		String actual = o.preorder();
		String expected = "cbade";
		assertEquals(expected, actual);
	}
}
