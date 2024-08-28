package com.sidibrahim.oms.mapper;

import com.sidibrahim.oms.dto.ItemDto;
import com.sidibrahim.oms.entity.Category;
import com.sidibrahim.oms.entity.Item;
import com.sidibrahim.oms.service.CategoryService;

public class ItemMapper {
    private final CategoryService categoryService;

    public ItemMapper(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    public ItemDto toItemDto(Item item){
        return new ItemDto(item.getId(),
                item.getName(),
                item.getDescription(),
                item.getPrice(),
                item.getCategory()!=null?item.getCategory().getName():null,
                item.getImageUrl(),
                item.getCategory()!=null?item.getCategory().getId():null);
    }

    public Item toItem(ItemDto itemDto){
        Category category = null;
        if(itemDto.categoryId() != null && itemDto.categoryId() > 0){
            category = categoryService.fetchCategory(itemDto.categoryId());
        }
        return Item.builder()
                .id(itemDto.id())
                .name(itemDto.name())
                .description(itemDto.description())
                .price(itemDto.price())
                .category(category)
                .imageUrl(itemDto.imageUrl())
                .build();
    }
}