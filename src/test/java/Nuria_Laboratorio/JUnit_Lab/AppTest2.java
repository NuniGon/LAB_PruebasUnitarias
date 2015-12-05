package Nuria_Laboratorio.JUnit_Lab;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Nuria_Laboratorio.JUnit_Lab.Nuria_Laboratorio.JUnit_Lab.App;

public class AppTest2 {
	private App app;

	  @Before
	  public void setup() {
	    app = new App();
	  }
	 

	  @Test
	  public void testComparatorEqual() {
	    assertEquals(1.0, app.mostrarCambios("roma", "amor"));
	  }
	  
	  @Test
	  public void testComparatorEqual2() {
	    assertEquals(1.0, app.mostrarCambios("caso", "rosa"));
	  }
	  
	  @Test
	  public void testComparatorEqual3() {
	    assertEquals(1.0, app.mostrarCambios("patata", "zanahoria"));
	  }
	  
	  @Test
	  public void testComparatorEqual4() {
	    assertEquals(1.0, app.mostrarCambios("casco", "barco"));
	  }
	  
	
	  @Test
	  public void testEmpty() {
	    assertEquals(0, App.mostrarCambios(" ", ""));
	  }
	  
	  @After
	  public void runAfterEveryTest() {
		  app = null;
	  }

}
