import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


/**
 *  @author johnmadaj
 *  @version 20210422
 */
public class Asg4insertAlreadyThereTests2 {

	/** thrown is thrown. */
	@SuppressWarnings("deprecation")
    @Rule
	public ExpectedException thrown = ExpectedException.none();

	/**
	 * <b,a,c>.insert(a) !! IllegalArgumentException
	 * @throws IllegalArgumentException new
	 */
	@Test
	public void a() throws IllegalArgumentException {
		BstADT o = Asg4States.state0();
		thrown.expect(IllegalArgumentException.class);
	    o.insert('a');

		
	}

	/**
	 * <b>.insert(b) !! IllegalArgumentException
	 * @throws IllegalArgumentException new
	 */
	@Test
	public void b() throws IllegalArgumentException {
		BstADT o = Asg4States.state1();
		thrown.expect(IllegalArgumentException.class);
	    o.insert('b');

		
	}
}
