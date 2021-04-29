import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 *  @author johnmadaj
 *  @version 20210422
 */
public class Asg4insertInsertsToRightTests {

	/** thrown is thrown. */
	@SuppressWarnings("deprecation")
    @Rule
	public ExpectedException thrown = ExpectedException.none();

	/**
	 * <b,a>.insert(c) -> <b,a,c>
	 */
	@Test
	public void c() {
		BstADT o = Asg4States.state6();
		o.insert('c');
		String actual = o.toString();
		String expected = "<b,a,c>";
		assertEquals(expected, actual);
	}

	/**
	 * <b,a,c>.insert(d) -> <b,a,c,d>
	 */
	@Test
	public void d() {
		BstADT o = Asg4States.state0();
		o.insert('d');
		String actual = o.toString();
		String expected = "<b,a,c,d>";
		assertEquals(expected, actual);
	}
}
