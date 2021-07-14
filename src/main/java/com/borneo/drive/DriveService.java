package com.borneo.drive;

import com.google.api.services.drive.model.File;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

public interface DriveService {
    List<File> fetchFiles() throws IOException, GeneralSecurityException;
}
