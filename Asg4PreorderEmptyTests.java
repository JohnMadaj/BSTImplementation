import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 *  @author johnmadaj
 *  @version 20210422
 */
public class Asg4PreorderEmptyTests {

	/** thrown is thrown. */
	@SuppressWarnings("deprecation")
    @Rule
	public ExpectedException thrown = ExpectedException.none();

	/**
	 * <>.preorder() == ""
	 */
	@Test
	public void emptyPre() {
		BstADT o = Asg4States.state2();
		String actual = o.preorder();
		String expected = "";
		assertEquals(expected, actual);
	}
}
