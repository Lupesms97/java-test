package com.product.api.dto;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ProductDTO{

    private int id;
    private String name;
    private String description;
    private double price;
    private int amount;
    private CategoryDTO category;
}