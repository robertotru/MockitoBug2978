package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ServiceTest extends AbstractTest {

	@Mock
	Dependency1 dependency1;
	@Mock
	Dependency2 dependency2;
	@InjectMocks
	Service service;

	@Test
	void injectionFails1() {
		Assertions.assertNotNull(service);
	}

}