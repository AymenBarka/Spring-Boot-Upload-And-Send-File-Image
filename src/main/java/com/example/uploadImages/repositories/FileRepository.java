package com.example.uploadImages.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.uploadImages.entities.Image;

public interface FileRepository extends JpaRepository<Image, Integer> {

}
