/**
 * 
 */
package org.kgzt.iftest;
/**
 * @author Guo
 *
 */
import java.util.Iterator;
import java.util.NoSuchElementException;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public abstract class IteratorTest
{
	private Iterator	noMoreElementsIterator;
	protected abstract Iterator makeNoMoreElementsIterator();
	@Before
	public void setUp() throws Exception
	{
		noMoreElementsIterator = makeNoMoreElementsIterator();
	}
	@Test
	public void testHasNextNoMoreElements()
	{
		assertFalse(noMoreElementsIterator.hasNext());
	}
	@Test
	public void testNextNoMoreElements()
	{
		try
		{
			noMoreElementsIterator.next();
	    } catch (NoSuchElementException expected)
		{
			fail("No exception with no elements remaining!");
		}
	}
	@Test
	public void testRemoveNoMoreElements()
	{
		try
		{
			noMoreElementsIterator.remove();
		} catch (IllegalStateException expected)
		{
			fail("No exception with no elements remaining!");
		}
	}
}