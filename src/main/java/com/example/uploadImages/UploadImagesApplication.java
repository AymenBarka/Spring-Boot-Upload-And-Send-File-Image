package com.example.uploadImages;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.example.uploadImages.utilis.FileStorageProperties;


@SpringBootApplication
@EnableConfigurationProperties({FileStorageProperties.class})

public class UploadImagesApplication {

	public static void main(String[] args) {
		SpringApplication.run(UploadImagesApplication.class, args);
	}

}
