package com.wan.multi.api.image;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

@Service
@RequiredArgsConstructor
public class ImageDownloadService {

    public void download() {
        try {
            byte[] response = createImageByte("http://www.yahoo.com/image_to_read.jpg");
            saveFile(response);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    private byte[] createImageByte(String url) throws IOException {
        URL urlObject = new URL(url);
        InputStream in = new BufferedInputStream(urlObject.openStream());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        int n = 0;
        while (-1 != (n = in.read(buf))) {
            out.write(buf, 0, n);
        }
        out.close();
        in.close();
        return out.toByteArray();
    }

    private void saveFile(byte[] response) throws IOException {
        FileOutputStream fos = new FileOutputStream("C://borrowed_image.jpg");
        fos.write(response);
        fos.close();
    }
}


// https://stackoverflow.com/questions/5882005/how-to-download-image-from-any-web-page-in-java