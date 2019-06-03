package model;

import static org.junit.Assert.*;

import java.awt.Image;

import javax.swing.ImageIcon;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GroundTest {

	private static Ground ground;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ground =new Ground(0,0);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.ground =new Ground();
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
		ground.setWidth(32);
		assertEquals(expected, ground.getWidth());
	}

	/**
	 * test getHeight() and setHeight()
	 */
	@Test
	public void testGetHeight() {
		int expected = 32;
		ground.setHeight(32);
		assertEquals(expected, ground.getHeight());
	}

	/**
	 * tests getX() and setX()
	 */
	@Test
	public void testGetX() {
		int expected = 2;
		ground.setX(2);
		assertEquals(expected, ground.getX());
	}

	/**
	 * tests getY() and setY()
	 */
	@Test
	public void testGetY() {
		int expected = 2;
		ground.setY(2);
		assertEquals(expected, ground.getY());
	}

	/**
	 * tests getImgObject() and setImgObject()
	 */
	@Test
	public void testGetImgObject() {
		Image expected = null;
		ground.setImgObject(null);
		assertEquals(expected, ground.getImgObject());
	}

	/**
	 * tests getIcoObject() and setIcoObject()
	 */
	@Test
	public void testGetIcoObject() {
		ImageIcon expected = null;
		ground.setIcoObject(null);
		assertEquals(expected, ground.getIcoObject());
	}

}
