package com.sidibrahim.oms.controller;

import com.sidibrahim.oms.entity.Item;
import com.sidibrahim.oms.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/api/items")
@RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;

    @PostMapping
    public ResponseEntity<Item> save(@RequestBody Item item) {
        return ResponseEntity.ok(itemService.save(item));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Item> getById(Integer id) {
        return ResponseEntity.ok(itemService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(Integer id) {
        itemService.deleteById(id);
        return ResponseEntity.ok(200);
    }

    @GetMapping
    public ResponseEntity<List<Item>> getAll() {
        return ResponseEntity.ok(itemService.findAll());
    }
}
