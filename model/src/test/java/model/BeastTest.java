package model;

import static org.junit.Assert.*;

import java.awt.Image;

import javax.swing.ImageIcon;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * tests of the method of Beast
 * @author Pline
 *
 */
public class BeastTest {

	private static Beast beast;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		beast = new Beast(0, 0);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.beast = new Beast(0,0);
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * tests getWidth()
	 */
	@Test
	public void testGetWidth() {
		beast.width=16;
		int expected = 16;
		assertEquals(expected, beast.getWidth());
	}

	/**
	 * tests setWidth()
	 */
	@Test
	public void testSetWidth() {
		beast.setWidth(16);
		int expected = 16;
		assertEquals(expected, beast.width);
		
	}

	/**
	 * tests getHeight()
	 */
	@Test
	public void testGetHeight() {
		beast.height=16;
		int expected = 16;
		assertEquals(expected, beast.getHeight());
	}

	/**
	 * tests setHeight()
	 */
	@Test
	public void testSetHeight() {
		beast.setHeight(16);
		int expected = 16;
		assertEquals(expected, beast.height);
	}

	/**
	 * test of getX()
	 */
	@Test
	public void testGetX() {
		int expected = 0;
		assertEquals(expected, beast.getX());
	}

	/**
	 * test of setX()
	 */
	@Test
	public void testSetX() {
		int expected = 4;
		beast.setX(4);
		assertEquals(expected, beast.x);
	}

	/**
	 * tests getY()
	 */
	@Test
	public void testGetY() {
		int expected = 0;
		assertEquals(expected, beast.getY());
	}

	/**
	 * tests setY()
	 */
	@Test
	public void testSetY() {
		int expected = 4;
		beast.setY(4);
		assertEquals(expected, beast.y);
	}


	/**
	 * test of getImgChar and setImgChar()
	 */
	@Test
	public void testGetImgChar() {
		final Image expected = null;
		beast.setImgChar(null);

		assertEquals(expected, beast.getImgChar());
	}

	/**
	 * test of the method getCounter()
	 */
	@Test
	public void testGetCounter() {
		int expected = 100;
		beast.count=100;
		assertEquals(expected, beast.getCounter());		
	}

	/**
	 * test of the method setCounter()
	 */
	@Test
	public void testSetCounter() {
		int expected =100;
		beast.setCounter(100);
		assertEquals(expected, beast.getCounter());
	}

	/**
	 * test of the method isMove()
	 */
	@Test
	public void testIsMove() {
		boolean expected = true;
		beast.move=true;
		assertEquals(expected, beast.isMove());
	}

	/**
	 * test of the method setMove()
	 */
	@Test
	public void testSetMove() {
		boolean expected = true;
		beast.setMove(true);
		
		assertEquals(expected, beast.isMove());
	}
	

	/**
	 * test of the method isMoveRight()
	 */
	@Test
	public void testIsMoveRight() {
		boolean expected = true;
		beast.moveRight=true;
		assertEquals(expected, beast.isMoveRight());
	}

	/**
	 * test of the method setHasContactright()
	 */
	@Test
	public void testSetHasContactRight() {
		boolean expected = true;
		beast.setHasContactright(true);
		
		assertEquals(expected, beast.isHasContactright());
		
	}

	
	/**
	 * test of the method setHasContactleft()
	 */
	@Test
	public void testSetHasContactLeft() {
		boolean expected = true;
		beast.setHasContactleft(true);
		
		assertEquals(expected, beast.isHasContactleft());
		
	}
	
	/**
	 * test of the method setHasContactabove()
	 */
	@Test
	public void testSetHasContactAbove() {
		boolean expected = true;
		beast.setHasContactabove(true);
		
		assertEquals(expected, beast.isHasContactabove());
		
	}
	
	/**
	 * test of the method setHasContactbelow()
	 */
	@Test
	public void testSetHasContactBelow() {
		boolean expected = true;
		beast.setHasContactbelow(true);
		
		assertEquals(expected, beast.isHasContactbelow());
		
	}
	/**
	 * test of setIcoChar()
	 */
	@Test
	public void testSetIcoChar() {
		ImageIcon expected = null;
		beast.setIcoChar(null);
		assertEquals(expected, beast.icoChar);
	}

	/**
	 * test of getIcoChar()
	 */
	@Test
	public void testGetIcoChar() {
		ImageIcon expected = null;
		beast.icoChar = null;
		assertEquals(expected, beast.getIcoChar());
	}

}
