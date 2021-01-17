package edu.ucam.calidad.practica4;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Result result = JUnitCore.runClasses(CalculosTest.class);

				System.out.print("\n\n------- TEST RUNNER: -------\n");
				for (Failure failure : result.getFailures()) {
					System.out.println(failure.toString());
				}

				System.out.print("Resultado: \n\t");
		        System.out.println(result.wasSuccessful());

	}

}
