package com.gradlehero.themepark

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.node.ObjectNode
import org.apache.commons.lang3.StringUtils
import java.io.InputStreamReader
import java.nio.charset.StandardCharsets
import java.util.Random

object RideStatusService {
    @JvmStatic
    fun main(args: Array<String>) {
        if (args.size != 1) {
            println("A single ride name must be passed")
            java.lang.System.exit(1)
        }
        val rideName: String = args.get(0)
        val rideStatus: String = getRideStatus(rideName).toString()
        java.lang.System.out.printf("Current status of %s is '%s'%n", rideName, rideStatus)
    }

    @JvmStatic
    fun getRideStatus(ride: String?): ObjectNode {
        val rideStatuses: List<String> = readFile(String.format("%s.txt", StringUtils.trim(ride)))
        val rideStatus = rideStatuses[Random().nextInt(rideStatuses.size)]
        val node = ObjectMapper().createObjectNode()
        node.put("status", rideStatus)
        return node
    }

    private fun readFile(filename: String): List<String> {
        val resourceStream: java.io.InputStream = RideStatusService::class.java.getClassLoader()
            .getResourceAsStream(filename)
        requireNotNull(resourceStream) { "Ride not found" }
        val result: MutableList<String> = java.util.ArrayList<String>()
        try {
            java.io.BufferedReader(
                InputStreamReader(resourceStream, StandardCharsets.UTF_8)).use { bufferedInputStream ->
                while (bufferedInputStream.ready()) {
                    result.add(bufferedInputStream.readLine())
                }
            }
        } catch (exception: java.io.IOException) {
            throw java.lang.RuntimeException("Couldn't read file", exception)
        }
        return result
    }
}