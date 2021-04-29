import java.lang.annotation.*;
/**

 * 
 *  @author johnmadaj
 *  @version 20210422
 */
public class Asg4States {
	/**
	 * 
	 */
	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.RUNTIME)
	public @interface State {
		@SuppressWarnings("javadoc")
        public String state() default "";
	}
	/**
	 * State
	 * @return state
	 */
	@State(state="<b,a,c>")
	public static BstADT state0() {
		BstADT o = new BstIMP(new Node('b'));
		o.insert('a');
		o.insert('c');
		return o;
	}
	/**
     * State
     * @return state
     */
	@State(state="<b>")
	public static BstADT state1() {
		BstADT o = new BstIMP(new Node('b'));
		return o;
	}
	/**
     * State
     * @return state
     */
	@State(state="<>")
	public static BstADT state2() {
		BstADT o = new BstIMP(null);
		return o;
	}
	/**
     * State
     * @return state
     */
	@State(state="<b,c>")
	public static BstADT state3() {
        BstADT o = new BstIMP(new Node('b'));
        o.insert('c');
        return o;
	}
	/**
     * State
     * @return state
     */
	@State(state="<c,b,a,d,e>")
	public static BstADT state4() {
        BstADT o = new BstIMP(new Node('c'));
        o.insert('b');
        o.insert('a');
        o.insert('d');
        o.insert('e');
		return o;
	}
	/**
     * State
     * @return state
     */
	@State(state="<c,a,d,e>")
	public static BstADT state5() {
	    BstADT o = new BstIMP(new Node('c'));
        o.insert('a');
        o.insert('d');
        o.insert('e');
		return o;
	}
	/**
     * State
     * @return state
     */
	@State(state="<b,a>")
	public static BstADT state6() {
	    BstADT o = new BstIMP(new Node('b'));
        o.insert('a');
		return o;
	}
	/**
     * State
     * @return state
     */
	@State(state="<b,a,c,d>")
	public static BstADT state7() {
	    BstADT o = new BstIMP(new Node('b'));
        o.insert('a');
        o.insert('c');
        o.insert('d');
		return o;
	}
	/**
     * State
     * @return state
     */
	@State(state="<d,c,b,e>")
	public static BstADT state8() {
	    BstADT o = new BstIMP(new Node('d'));
        o.insert('c');
        o.insert('b');
        o.insert('e');
		return o;
	}
	/**
     * State
     * @return state
     */
	@State(state="<d,c,b,a,e>")
	public static BstADT state9() {
	    BstADT o = new BstIMP(new Node('d'));
        o.insert('c');
        o.insert('b');
        o.insert('a');
        o.insert('e');
		return o;
	}
	/**
     * State
     * @return state
     */
	@State(state="<c,b,a,e>")
	public static BstADT state10() {
	    BstADT o = new BstIMP(new Node('c'));
        o.insert('b');
        o.insert('a');
        o.insert('e');
		return o;
	}
	/**
     * State
     * @return state
     */
	@State(state="<c,b,a,d>")
	public static BstADT state11() {
	    BstADT o = new BstIMP(new Node('c'));
        o.insert('b');
        o.insert('a');
        o.insert('d');
		return o;
	}
	/**
     * State
     * @return state
     */
	@State(state="<a>")
	public static BstADT state12() {
		BstADT o = new BstIMP(new Node('a'));
		return o;
	}
}
