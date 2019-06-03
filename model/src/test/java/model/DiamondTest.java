package model;

import static org.junit.Assert.*;

import java.awt.Image;

import javax.swing.ImageIcon;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DiamondTest {

	private static Diamond diamond;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		diamond =new Diamond(0,0);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.diamond =new Diamond();
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
		diamond.setWidth(32);
		assertEquals(expected, diamond.getWidth());
	}

	/**
	 * test getHeight() and setHeight()
	 */
	@Test
	public void testGetHeight() {
		int expected = 32;
		diamond.setHeight(32);
		assertEquals(expected, diamond.getHeight());
	}

	/**
	 * tests getX() and setX()
	 */
	@Test
	public void testGetX() {
		int expected = 2;
		diamond.setX(2);
		assertEquals(expected, diamond.getX());
	}

	/**
	 * tests getY() and setY()
	 */
	@Test
	public void testGetY() {
		int expected = 2;
		diamond.setY(2);
		assertEquals(expected, diamond.getY());
	}

	/**
	 * tests getImgObject() and setImgObject()
	 */
	@Test
	public void testGetImgObject() {
		Image expected = null;
		diamond.setImgObject(null);
		assertEquals(expected, diamond.getImgObject());
	}

	/**
	 * tests getIcoObject() and setIcoObject()
	 */
	@Test
	public void testGetIcoObject() {
		ImageIcon expected = null;
		diamond.setIcoObject(null);
		assertEquals(expected, diamond.getIcoObject());
	}

}

