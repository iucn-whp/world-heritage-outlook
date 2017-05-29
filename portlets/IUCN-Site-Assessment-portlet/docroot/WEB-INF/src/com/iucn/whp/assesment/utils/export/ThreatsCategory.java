package com.iucn.whp.assesment.utils.export;

import java.util.ArrayList;
import java.util.List;

public class ThreatsCategory {

    private String category;

    private List<String> subcategories = new ArrayList<>();

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<String> getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(List<String> subcategories) {
        this.subcategories = subcategories;
    }
}
