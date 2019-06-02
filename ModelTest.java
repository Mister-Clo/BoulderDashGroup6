/**
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
package model;

import static org.junit.Assert.assertEquals;

import java.awt.Image;

import javax.swing.ImageIcon;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Tests of the Model class
 * @author Pline
 *
 */
public class ModelTest {
    private static Model model;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    	model = new Model();
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        this.model = new Model();
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of getXsolnoir method
     */
    @Test
    public void testGetXsolnoir() {
    	int expected = 0;
    	assertEquals(expected, model.getXsolnoir());
    }
 
    /**
     * Test of setXsolnoir method
     */
    @Test
    public void testSetXsolnoir() {
    	model.setXsolnoir(4);
    	int expected = 4;
    	assertEquals(expected, model.getXsolnoir());
    }
    
    /**
     * Test of setYsolnoir method
     */
    @Test
    public void testSetYsolnoir() {
    	model.setYsolnoir(4);
    	int expected = 4;
    	assertEquals(expected, model.getYsolnoir());
    }
    
    /**
     * Test of getYsolnoir method
     */
    @Test
    public void testGetYsolnoir() {
    	int expected = 0;
    	assertEquals(expected, model.getYsolnoir());
    }
    
    /**
     * Test of getImgFond
     */
    @Test
    public void testGetImgFond() {
    	Image expected = new ImageIcon(getClass().getResource("/images/solnoir.png")).getImage();
    	assertEquals(expected, model.getImgFond());
    }
    
   /* @Test
    public void testGetMessage() {
        Assert.assertEquals("", this.model.getHelloWorld().getMessage());
    }*/

    /**
     * Test method for {@link model.Model#loadHelloWorld(java.lang.String)}.
     */
   /*@Test
    public void testGetMessageString() {
        this.model.loadHelloWorld("GB");
        Assert.assertEquals("Hello world", this.model.getHelloWorld().getMessage());
        this.model.loadHelloWorld("FR");
        Assert.assertEquals("Bonjour le monde", this.model.getHelloWorld().getMessage());
        this.model.loadHelloWorld("DE");
        Assert.assertEquals("Hallo Welt", this.model.getHelloWorld().getMessage());
        this.model.loadHelloWorld("ID");
        Assert.assertEquals("Salamat pagi dunia", this.model.getHelloWorld().getMessage());
    }*/
}
