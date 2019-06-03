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
 * tests the class Rock
 * @author Pline
 *
 */
public class RockTest {

	private static Rock rock;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		rock =new Rock(0,0);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.rock =new Rock();
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
		rock.setWidth(32);
		assertEquals(expected, rock.getWidth());
	}

	/**
	 * test getHeight() and setHeight()
	 */
	@Test
	public void testGetHeight() {
		int expected = 32;
		rock.setHeight(32);
		assertEquals(expected, rock.getHeight());
	}

	/**
	 * tests getX() and setX()
	 */
	@Test
	public void testGetX() {
		int expected = 2;
		rock.setX(2);
		assertEquals(expected, rock.getX());
	}

	/**
	 * tests getY() and setY()
	 */
	@Test
	public void testGetY() {
		int expected = 2;
		rock.setY(2);
		assertEquals(expected, rock.getY());
	}

	/**
	 * tests getImgObject() and setImgObject()
	 */
	@Test
	public void testGetImgObject() {
		Image expected = null;
		rock.setImgObject(null);
		assertEquals(expected, rock.getImgObject());
	}

	/**
	 * tests getIcoObject() and setIcoObject()
	 */
	@Test
	public void testGetIcoObject() {
		ImageIcon expected = null;
		rock.setIcoObject(null);
		assertEquals(expected, rock.getIcoObject());
	}

}
