import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**

 *  @author johnmadaj
 *  @version 20210422
 */
public class Asg4removeRemoveFromRightTests {

	/** thrown is thrown. */
	@SuppressWarnings("deprecation")
    @Rule
	public ExpectedException thrown = ExpectedException.none();

	/**
	 * <b,a,c>.remove(c) -> <b,a>
	 */
	@Test
	public void bac() {
		BstADT o = Asg4States.state0();
		o.remove('c');
		String actual = o.toString();
		String expected = "<b,a>";
		assertEquals(expected, actual);
	}

	/**
	 * <c,b,a,d,e>.remove(d) -> <c,b,a,e>
	 */
	@Test
	public void cbade() {
		BstADT o = Asg4States.state4();
		o.remove('d');
		String actual = o.toString();
		String expected = "<c,b,a,e>";
		assertEquals(expected, actual);
	}

	/**
	 * <c,b,a,d,e>.remove(e) -> <c,b,a,d>
	 */
	@Test
	public void cbade2() {
		BstADT o = Asg4States.state4();
		o.remove('e');
		String actual = o.toString();
		String expected = "<c,b,a,d>";
		assertEquals(expected, actual);
	}
}
