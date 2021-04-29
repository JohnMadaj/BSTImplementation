import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 *  Write a one-sentence summary of your class here.
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 * 
 *  @author johnmadaj
 *  @version 20210422
 */
public class Asg4insertInsertsToNullTests {

	/** thrown is thrown. */
	@SuppressWarnings("deprecation")
    @Rule
	public ExpectedException thrown = ExpectedException.none();

	/**
	 * <>.insert(b) -> <b>
	 */
	@Test
	public void nullInsert() {
		BstADT o = Asg4States.state2();
		o.insert('b');
		String actual = o.toString();
		String expected = "<b>";
		assertEquals(expected, actual);
	}
}
