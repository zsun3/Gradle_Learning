package com.gradlehero.themepark

import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test

class RideStatusServiceIntegrationTest {
    @Test
    fun `test main`() {
        assertNotNull(RideStatusService.getRideStatus("teacups"))
    }
}