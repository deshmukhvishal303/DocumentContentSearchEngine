package com.borneo.utils;

import static org.junit.Assert.assertEquals;

import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.sax.BodyContentHandler;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DocumentUtilTest {

    @Mock
    private AutoDetectParser parser;

    @Mock
    private BodyContentHandler handler;

    @Mock
    private Metadata metadata;

    @InjectMocks
    DocumentUtil documentParser = new DocumentUtil();

    @Before
    public void init(){
    }

    @Test
    public void testParseDocument() {
        String actualStr = documentParser.parseDocument("src/test/resources/TestDocument.pdf");
        String expectedStr = "\nTest Document content.\n\n\n";
        expectedStr = expectedStr.trim();
        actualStr = actualStr.trim();
        assertEquals("Document content are different", expectedStr, actualStr);
    }
}
