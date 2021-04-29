import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 *  @author johnmadaj
 *  @version 20210422
 */
public class Asg4EqualToNotEqualTests {

	/** thrown is TODO write a brief description. */
	@SuppressWarnings("deprecation")
    @Rule
	public ExpectedException thrown = ExpectedException.none();

	/**
	 * <b,a,c>.equalTo(x) == false
	 */
	@Test
	public void isNull() {
		BstADT o = Asg4States.state0();
		boolean actual = o.equalTo(Asg4States.state2());
		boolean expected = false;
		assertEquals(expected, actual);
	}

	/**
	 * <b,a,c>.equalTo(x) == false
	 */
	@Test
	public void isDifferent() {
		BstADT o = Asg4States.state0();
		boolean actual = o.equalTo(Asg4States.state2());
		boolean expected = false;
		assertEquals(expected, actual);
	}
}
