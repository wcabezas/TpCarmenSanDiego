package Tests;
import org.junit.Assert;
import org.junit.Test;
import Tp.Villano;

class TestVillano {


	@Test
	void obtenerNombreDelVillanoTest() {
		Villano villano= new Villano();
		villano.setNombre("Carmen San Diego");
		Assert.assertEquals("Carmen San Diego", villano.getNombre());
	}
	

}
