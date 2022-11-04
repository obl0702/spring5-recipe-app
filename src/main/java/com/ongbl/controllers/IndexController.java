package com.ongbl.controllers;

import com.ongbl.domain.Category;
import com.ongbl.domain.UnitOfMeasure;
import com.ongbl.repositories.CategoryRepository;
import com.ongbl.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.swing.text.html.Option;
import java.util.Optional;

/**
 * @created: 4/11/2022
 * @author: boonloong
 */
@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(){
        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("categoryOptional: " + categoryOptional.get().getId());
        System.out.println("unitOfMeasureOptional: " + unitOfMeasureOptional.get().getId());
        return "index";
    }
}
