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
 * Test class of the class Character
 * @author Pline
 *
 */
public class CharacterTest {

	final Character rockford = new Character(32, 32, 64, 128);

	/**
	 * test of getWidth()
	 */
	@Test
	public void testGetWidth() {
		final int expected = 32;
		assertEquals(expected, rockford.getWidth());
	}

	/**
	 * test of setWidth()
	 */
	@Test
	public void testSetWidth() {
		final int expected =64;
		rockford.setWidth(expected);;
		assertEquals(expected, rockford.getWidth());
	}

	/**
	 * test of getHeight()
	 */
	@Test
	public void testGetHeight() {
		final int expected = 32;
		assertEquals(expected, rockford.getHeight());
	}

	/**
	 * test of setHeight()
	 */
	@Test
	public void testSetHeight() {
		final int expected =64;
		rockford.setHeight(expected);
		assertEquals(expected, rockford.getHeight());
	}

	/**
	 * test of getX()
	 */
	@Test
	public void testGetX() {
		final int expected = 64;
		assertEquals(expected, rockford.getX());
	}

	/**
	 * test of setX()
	 */
	@Test
	public void testSetX() {
		final int expected =64;
		rockford.setX(expected);

		assertEquals(expected, rockford.getX());
	}

	/**
	 * test of getY()
	 */
	@Test
	public void testGetY() {
		final int expected = 128;
		assertEquals(expected, rockford.getY());		
	}

	/**
	 * test of setY()
	 */
	@Test
	public void testSetY() {
		final int expected =64;
		rockford.setY(expected);

		assertEquals(expected, rockford.getY());
		
	}

	/**
	 * test of getImgChar and setImgChar()
	 */
	@Test
	public void testGetImgChar() {
		final Image expected = null;
		rockford.setImgChar(null);

		assertEquals(expected, rockford.getImgChar());
		
	}

	/**
	 * test of the method getCounter()
	 */
	@Test
	public void testGetCounter() {
		int expected = 100;
		rockford.count=100;
		assertEquals(expected, rockford.getCounter());		
	}

	/**
	 * test of the method setCounter()
	 */
	@Test
	public void testSetCounter() {
		int expected =100;
		rockford.setCounter(100);
		assertEquals(expected, rockford.getCounter());
	}

	/**
	 * test of the method isMove()
	 */
	@Test
	public void testIsMove() {
		boolean expected = true;
		rockford.move=true;
		assertEquals(expected, rockford.isMove());
	}
	
	/**
	 * test of the method isMoveRight()
	 */
	@Test
	public void testIsMoveRight() {
		boolean expected = true;
		rockford.moveRight=true;
		assertEquals(expected, rockford.isMoveRight());
	}
		
	/**
	 * test of the method isMoveUp()
	 */
	@Test
	public void testIsMoveUp() {
		boolean expected = true;
		rockford.moveUp=true;
		assertEquals(expected, rockford.isMoveUp());
	}
	
	/**
	 * test of the method setMove()
	 */
	@Test
	public void testSetMove() {
		boolean expected = true;
		rockford.setMove(true);
		
		assertEquals(expected, rockford.isMove());
		
	}
	
	/**
	 * test of the method setHasContactright()
	 */
	@Test
	public void testSetHasContactRight() {
		boolean expected = true;
		rockford.setHasContactright(true);
		
		assertEquals(expected, rockford.isHasContactright());
		
	}

	
	/**
	 * test of the method setHasContactleft()
	 */
	@Test
	public void testSetHasContactLeft() {
		boolean expected = true;
		rockford.setHasContactleft(true);
		
		assertEquals(expected, rockford.isHasContactleft());
		
	}
	
	/**
	 * test of the method setHasContactabove()
	 */
	@Test
	public void testSetHasContactAbove() {
		boolean expected = true;
		rockford.setHasContactabove(true);
		
		assertEquals(expected, rockford.isHasContactabove());
		
	}
	
	/**
	 * test of the method setHasContactbelow()
	 */
	@Test
	public void testSetHasContactBelow() {
		boolean expected = true;
		rockford.setHasContactbelow(true);
		
		assertEquals(expected, rockford.isHasContactbelow());
		
	}
	
	/**
	 * test of setIcoChar()
	 */
	@Test
	public void testSetIcoChar() {
		ImageIcon expected = null;
		rockford.setIcoChar(null);
		assertEquals(expected, rockford.icoChar);
	}

	/**
	 * test of getIcoChar()
	 */
	@Test
	public void testGetIcoChar() {
		ImageIcon expected = null;
		rockford.icoChar = null;
		assertEquals(expected, rockford.getIcoChar());
	}
	
}
