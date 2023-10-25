package com.programmingtechie.inventoryservice.controller;

import com.programmingtechie.inventoryservice.service.InventoryService;
import dto.InventoryResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    //passing several values as Path variable
    // http://localhost:8082/api/inventory/iphone-13,iphone13-red
    // @GetMapping("/{sku-code}") and @PathVariable("sku-code")

    //passing several values as RequestParameters
    // http://localhost:8082/api/inventory?sku-code=iphone-13&sku-code=iphone13-red
    // @RequestParam List<String> skuCode
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode) {
        return inventoryService.isInStock(skuCode);
    }

}
