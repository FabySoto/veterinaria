package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.Conexion;

class ConexionTest {

	@Test
	void test() {
		if (Conexion.getConexion()==null) 
		{
			fail("No se pudo conextar al servidor de mysql!");
		}
	}
}
