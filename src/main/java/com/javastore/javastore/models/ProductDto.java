package com.javastore.javastore.models;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class ProductDto {
    @NotEmpty(message = "Name is required")
    private String name;

    @NotEmpty(message = "Brand is required")
    private String brand;

    @NotEmpty(message = "Category is required")
    private String category;

    @Min(0)

    @Size(min = 10, message = "Description should be minimum 10 characters")
    @Size(max = 2000, message = "Description should be maximum 2000 characters")
    private String description;

    private MultipartFile imageFile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MultipartFile getImageFile() {
        return imageFile;
    }

    public void setImageFile(MultipartFile imageFile) {
        this.imageFile = imageFile;
    }

    
}
