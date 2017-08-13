/**
 * 
 */
package org.kgzt.iftest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Guo
 *
 */
public class ListIteratorTest extends IteratorTest
{
	protected Iterator makeNoMoreElementsIterator()
	{
		List empty = new ArrayList();
		return empty.iterator();
	}
}