package model;

import static org.junit.Assert.*;

import java.awt.Image;

import javax.swing.ImageIcon;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DarkGroundTest {

	private static DarkGround darkground;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		darkground =new DarkGround(0,0);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.darkground =new DarkGround();
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
		darkground.setWidth(32);
		assertEquals(expected, darkground.getWidth());
	}

	/**
	 * test getHeight() and setHeight()
	 */
	@Test
	public void testGetHeight() {
		int expected = 32;
		darkground.setHeight(32);
		assertEquals(expected, darkground.getHeight());
	}

	/**
	 * tests getX() and setX()
	 */
	@Test
	public void testGetX() {
		int expected = 2;
		darkground.setX(2);
		assertEquals(expected, darkground.getX());
	}

	/**
	 * tests getY() and setY()
	 */
	@Test
	public void testGetY() {
		int expected = 2;
		darkground.setY(2);
		assertEquals(expected, darkground.getY());
	}

	/**
	 * tests getImgObject() and setImgObject()
	 */
	@Test
	public void testGetImgObject() {
		Image expected = null;
		darkground.setImgObject(null);
		assertEquals(expected, darkground.getImgObject());
	}

	/**
	 * tests getIcoObject() and setIcoObject()
	 */
	@Test
	public void testGetIcoObject() {
		ImageIcon expected = null;
		darkground.setIcoObject(null);
		assertEquals(expected, darkground.getIcoObject());
	}

}

