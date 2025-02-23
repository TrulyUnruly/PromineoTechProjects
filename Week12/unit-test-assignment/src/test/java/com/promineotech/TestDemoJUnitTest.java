package com.promineotech;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

class TestDemoJUnitTest {
	private TestDemo testDemo;

	@BeforeEach
	void setUp() throws Exception {
		testDemo = new TestDemo();
	}

	@ParameterizedTest
	@MethodSource("com.promineotech.TestDemoJUnitTest#argumentsForAddPositive")
	 void assertThatTwoPositiveNumbersAreAddedCorrectly(int a, int b, int expected, boolean expectException) {
        if (!expectException) {
            assertThat(testDemo.addPositive(a, b)).isEqualTo(expected);
        } else {
            assertThatThrownBy(() -> testDemo.addPositive(a, b))
                    .isInstanceOf(IllegalArgumentException.class)
                    .hasMessage("Both parameters must be positive!");
		}
	}
	
	static Stream<Arguments> argumentsForAddPositive() {
		return Stream.of(
				arguments(2, 4, 6, false), // Valid case
	            arguments(3, 12, 15, false), // Valid case
	            arguments(0, 2, 0, true), // Invalid: First parameter is zero
	            arguments(-7, 4, 1, true), // Invalid: First parameter is negative
	            arguments(8, -1, 0, true) // Invalid: Second parameter is negative
		);
	}

	@Test
	void assertThatPairsOfPositiveNumbersAreAddedCorrectly() {
		assertThat(testDemo.addPositive(4, 5)).isEqualTo(9);
		assertThat(testDemo.addPositive(40,50)).isEqualTo(90);
		assertThat(testDemo.addPositive(17, 11)).isEqualTo(28);
		assertThat(testDemo.addPositive(2,12)).isEqualTo(14);
		assertThat(testDemo.addPositive(32,5)).isEqualTo(37);
	}
	
	@Test
	// test that method is working correctly to square non zero number
	void assertThatNumberIsDivisibleByFiveCorrectly() {
		assertThat(testDemo.numberDivisibleByFive(5)).isEqualTo(1);
		assertThat(testDemo.numberDivisibleByFive(45)).isEqualTo(9);
		assertThat(testDemo.numberDivisibleByFive(-10)).isEqualTo(-2);
		assertThat(testDemo.numberDivisibleByFive(15)).isEqualTo(3);
		
	}
	 //Step 4-2
    @Test
    void assertThatNumberSquaredIsCorrect() {
        TestDemo mockDemo = spy(testDemo);
        doReturn(5).when(mockDemo).getRandomInt();
        int fiveSquared = mockDemo.randomNumberSquared();
        assertThat(fiveSquared).isEqualTo(25);

}
}
