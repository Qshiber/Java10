package com.sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

class MethodsTest {

    @Test
    void testCapitalizeSuccess() {
        //give
        String name = "KRZYSZTOF";
        String expectedName = "Krzysztof";

        //when
        String actualName = Methods.capitalize(name);

        //then
        Assertions.assertEquals(expectedName, actualName);

    }

    @Test
    @SuppressWarnings("all")
    void testCapitalizeNullParam() {
        //give
        String s = null;
        //when
        String actualResult = Methods.capitalize(s);
        //then
        Assertions.assertNull(actualResult);

    }

    //    @MethodSource()
//    @EmptySource()
    @ParameterizedTest
    @ValueSource(strings = {"", "       ", "    "})
    void testCapitalizeEmptyOrBlank(String expectedName) {
        //when
        String actualName = Methods.capitalize(expectedName);

        //then
        Assertions.assertEquals(expectedName, actualName);

    }

    @Test
    void testCapitalizeEmptyOrBlank() {
        //given
        String expectedName = "";
        //when
        String actualName = Methods.capitalize(expectedName);

        //then
        Assertions.assertEquals(expectedName, actualName);

    }

    @ParameterizedTest
    @ValueSource(ints = {2, 34, -44, 22, 40, 41560, 1234578})
    void testIsEvenWithEvenNumbers(int num) {
        //given

        //when
        Assertions.assertTrue(Methods.isEven(num));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 43, 79, -49, 1025, 58911})
    void testIsEvenWithOddNumbers(int num) {
        //given

        //when
        Assertions.assertFalse(Methods.isEven(num));
    }

//    @ParameterizedTest
//    @ValueSource(strings = {"civic", "racecar", "rotator"})
//    void testPalindromeWithPalindromes(String s){
//        Assertions.assertTrue(Methods.isPalindrome(s));
//
//    }
//
//    @ParameterizedTest
//    @ValueSource(strings = {"civsic", "racedacar", "rodsftator"})
//    void testPalindromeWithNonPalindromes(String s){
//        Assertions.assertFalse(Methods.isPalindrome(s));
//
//    }

    public static Stream<Arguments> paramsSuppler() {
        return Stream.of(
                Arguments.of(new double[]{2, 2, 4, 10, 2}, 20),
                Arguments.of(new double[]{2, 2, 4, 40, 2}, 50),
                Arguments.of(new double[]{2, 4, 4, 10, 2}, 22)
        );
    }

    @ParameterizedTest
    @MethodSource("paramsSuppler")
    void testSumArrayHappyPath2(double[] array, double expectedResult) {
        // when
        double actualResult = Methods.sumArray(array);

        // then
        Assertions.assertEquals(expectedResult, actualResult);
    }

}