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
 * test class of the class Wall
 * @author Pline
 *
 */
public class WallTest {

	private static Wall wall;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		wall =new Wall(0,0);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.wall =new Wall();
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * tests getWidth() and setWidth
	 */
	@Test
	public void testGetWidth() {
		int expected = 32;
		wall.setWidth(32);
		assertEquals(expected, wall.getWidth());
	}

	/**
	 * test getHeight() and setHeight()
	 */
	@Test
	public void testGetHeight() {
		int expected = 32;
		wall.setHeight(32);
		assertEquals(expected, wall.getHeight());
	}

	/**
	 * tests getX() and setX()
	 */
	@Test
	public void testGetX() {
		int expected = 2;
		wall.setX(2);
		assertEquals(expected, wall.getX());
	}

	/**
	 * tests getY() and setY()
	 */
	@Test
	public void testGetY() {
		int expected = 2;
		wall.setY(2);
		assertEquals(expected, wall.getY());
	}

	/**
	 * tests getImgObject() and setImgObject()
	 */
	@Test
	public void testGetImgObject() {
		Image expected = null;
		wall.setImgObject(null);
		assertEquals(expected, wall.getImgObject());
	}

	/**
	 * tests getIcoObject() and setIcoObject()
	 */
	@Test
	public void testGetIcoObject() {
		ImageIcon expected = null;
		wall.setIcoObject(null);
		assertEquals(expected, wall.getIcoObject());
	}

}
