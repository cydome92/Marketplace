package com.domenicozagaria.admin.product;

import com.domenicozagaria.admin.util.dto.GenericDTO;
import com.domenicozagaria.admin.util.mapper.GenericDTOMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public GenericDTO saveProduct(@RequestBody @Valid ProductDTO productDTO) {
        return productService.saveProduct(productDTO.getName(), productDTO.getStock());
    }
}