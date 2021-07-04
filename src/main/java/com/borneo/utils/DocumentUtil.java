package com.borneo.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.Strings;
import org.apache.tika.Tika;

import java.io.File;

public class DocumentUtil {
    private static Logger log = LogManager.getLogger(DocumentUtil.class);
    private static Tika tika = new Tika();

    public String parseDocument(String documentPath) {
        File docFile = new File(documentPath);

        try{
            return tika.parseToString(docFile);
        } catch(Exception ex){
            log.error("Exception occurred while parsing document: "
                    +documentPath+ " Exception: "+ex.getMessage());
        }

        return Strings.EMPTY;
    }
}
