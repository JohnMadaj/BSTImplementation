import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * 
 *  @author johnmadaj
 *  @version 20210422
 */
public class Asg4insertInsertsToLeftTests {

	/** thrown is thrown. */
	@SuppressWarnings("deprecation")
    @Rule
	public ExpectedException thrown = ExpectedException.none();

	/**
	 * <b,c>.insert(a) -> <b,a,c>
	 */
	@Test
	public void a() {
		BstADT o = Asg4States.state3();
		o.insert('a');
		String actual = o.toString();
		String expected = "<b,a,c>";
		assertEquals(expected, actual);
	}

	/**
	 * <d,c,b,e>.insert(a) -> <d,c,b,a,e>
	 */
	@Test
	public void a2() {
		BstADT o = Asg4States.state8();
		o.insert('a');
		String actual = o.toString();
		String expected = "<d,c,b,a,e>";
		assertEquals(expected, actual);
	}
}
