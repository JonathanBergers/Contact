package nl.saxion.template.myproject.test;

import nl.saxion.template.myproject.model.Model;
import android.test.AndroidTestCase;

public class ModelTest extends AndroidTestCase {
	private Model model;
	
	public void setUp() {
		this.model = new Model();
	}
	public void testModel() {
		assertTrue(model.isWorking());
	}
}
