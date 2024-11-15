package com.gradlehero.themepark;

//import org.testng.Assert.assertNotNull
//import org.testng.annotations.Test
//import org.junit.Assert.assertNotNull
//import org.junit.Test
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class RideStatusServiceFailureTest {
    @Test
    fun unknownRideCausesFailure() {
        assertThrows<Exception> {
            RideStatusService.getRideStatus("dodgems");
        }
    }
//    @Test
//    fun `get status`() {
//        assertNotNull(RideStatusService.getRideStatus("rollercoaster"))
//    }
//    @Test
//    fun `get status`() {
//        assertNotNull(RideStatusService.getRideStatus("rollercoaster"))
//    }
}