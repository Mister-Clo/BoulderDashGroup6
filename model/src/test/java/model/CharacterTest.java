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
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * test of getWidth()
	 */
	@Test
	public void testGetWidth() {
		final int expected = 32;
		assertEquals(expected, rockford.getWidth());
		
		//fail("Not yet implemented");
	}

	/**
	 * test of setWidth()
	 */
	@Test
	public void testSetWidth() {
		final int expected =64;
		rockford.setWidth(expected);;
		assertEquals(expected, rockford.getWidth());
		
	//	fail("Not yet implemented");
	}

	/**
	 * test of getHeight()
	 */
	@Test
	public void testGetHeight() {
		final int expected = 32;
		assertEquals(expected, rockford.getHeight());
	
	//	fail("Not yet implemented");
	}

	/**
	 * test of setHeight()
	 */
	@Test
	public void testSetHeight() {
		final int expected =64;
		rockford.setHeight(expected);
		assertEquals(expected, rockford.getHeight());
	//	fail("Not yet implemented");
	}

	/**
	 * test of getX()
	 */
	@Test
	public void testGetX() {
		final int expected = 64;
		assertEquals(expected, rockford.getX());
	
	//	fail("Not yet implemented");
	}

	/**
	 * test of setX()
	 */
	@Test
	public void testSetX() {
		final int expected =64;
		rockford.setX(expected);

		assertEquals(expected, rockford.getX());
		
	//	fail("Not yet implemented");
	}

	@Test
	public void testGetY() {
		final int expected = 128;
		assertEquals(expected, rockford.getY());
		
		//	fail("Not yet implemented");
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
	 * tes of getImgChar
	 */
	@Test
	public void testGetImgChar() {
		String str = new String();
		if(this.rockford.isMove()==false) {str="/images/persoface2.png";}
		if(this.rockford.isMove()==true) {str="/images/persoface.png";}
		final Image expected = new ImageIcon(getClass().getResource(str)).getImage();
		assertEquals(expected, rockford.getImgChar());
		
	}

	/**
	 * tes of setImgChar()
	 */
	@Test
	public void testSetImgChar() {
		final Image expected = null;
		rockford.setImgChar(expected);

		assertEquals(expected, rockford.getImgChar());
		
	}

	@Test
	public void testGetCounter() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetCounter() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsMove() {
		fail("Not yet implemented");
	}

	/**
	 * tes of the method setMove()
	 */
	@Test
	public void testSetMove() {
		boolean move = true;
		rockford.setMove(move);
		
		assertEquals(move, rockford.isMove());
		
	}

	@Test
	public void testMove() {
		fail("Not yet implemented");
	}

}
