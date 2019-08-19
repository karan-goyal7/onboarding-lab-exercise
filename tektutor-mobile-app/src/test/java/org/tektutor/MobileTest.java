package org.tektutor;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class MobileTest {

	@Test
	public void testStartPhotoAppWhenCameraOnFunctionsNormally() {
		
		//mocking- create dummy camera object with no original code
		Camera mockedCamera = Mockito.mock(Camera.class);
		
		//Stubbing - hard coding the response of dependent method
		Mockito.when(mockedCamera.on()).thenReturn(true);
		
		//dependency injection
		Mobile mobile = new Mobile(mockedCamera);
		
		boolean actualResponse = mobile.startPhototApp();
		boolean expectedResponse = true;
		
		assertEquals(expectedResponse, actualResponse);
		
		Mockito.verify(mockedCamera, Mockito.times(1)).on();
	}

}
