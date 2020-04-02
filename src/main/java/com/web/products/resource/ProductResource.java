package com.web.products.resource;

import com.web.products.model.dto.ProductDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductResource {

    @PostMapping
    public ResponseEntity<ProductDto> createProduct(){
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
