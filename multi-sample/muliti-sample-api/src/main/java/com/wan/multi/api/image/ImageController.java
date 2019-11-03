package com.wan.multi.api.image;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ImageController {

    private ImageDownloadService imageDownloadService;

    @PostMapping
    public void dowloadImage(){
        imageDownloadService.download();
    }
}
