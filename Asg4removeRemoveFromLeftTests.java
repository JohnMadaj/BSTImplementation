import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**

 *  @author johnmadaj
 *  @version 20210422
 */
public class Asg4removeRemoveFromLeftTests {

	/** thrown is thrown. */
	@SuppressWarnings("deprecation")
    @Rule
	public ExpectedException thrown = ExpectedException.none();

	/**
	 * <b,a,c>.remove(a) -> <b,c>
	 */
	@Test
	public void bac() {
		BstADT o = Asg4States.state0();
		o.remove('a');
		String actual = o.toString();
		String expected = "<b,c>";
		assertEquals(expected, actual);
	}

	/**
	 * <c,b,a,d,e>.remove(b) -> <c,a,d,e>
	 */
	@Test
	public void cbade() {
		BstADT o = Asg4States.state4();
		o.remove('b');
		String actual = o.toString();
		String expected = "<c,a,d,e>";
		assertEquals(expected, actual);
	}
}
