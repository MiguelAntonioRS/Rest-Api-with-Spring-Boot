package com.application.rest.controllers.dto;

import com.application.rest.entities.Maker;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class ProductDTO {

    private long id;
    private String name;
    private BigDecimal price;
    private Maker maker;
}
