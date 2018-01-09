package nl.kristalsoftware.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Simple test")
public class TestResourceTest {

    private TestResource cut = new TestResource();

    @Test
    public void testGetTest() {
        String testValue = cut.getTest();
        assertNotNull(testValue);
    }

}