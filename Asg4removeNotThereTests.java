import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**

 *  @author johnmadaj
 *  @version 20210422
 */
public class Asg4removeNotThereTests {

	/** thrown is thrown. */
	@SuppressWarnings("deprecation")
    @Rule
	public ExpectedException thrown = ExpectedException.none();

	/**
	 * <b,a,c>.remove(d) -> <b,a,c>
	 */
	@Test
	public void bac() {
		BstADT o = Asg4States.state0();
		o.remove('d');
		String actual = o.toString();
		String expected = "<b,a,c>";
		assertEquals(expected, actual);
	}

	/**
	 * <b>.remove(a) -> <b>
	 */
	@Test
	public void b() {
		BstADT o = Asg4States.state1();
		o.remove('a');
		String actual = o.toString();
		String expected = "<b>";
		assertEquals(expected, actual);
	}
}
