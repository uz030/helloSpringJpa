package kr.ac.hansung.cse.controller;

import kr.ac.hansung.cse.repository.CategoryRepository;
import kr.ac.hansung.cse.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/categories")
public class CategoryController {

    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {this.categoryService = categoryService;}

    @GetMapping // GET /categories → 목록
        public String listCategories(Model model) {
            model.addAttribute("categories", categoryService.getAllCategories());
            return "categoryList"; }


}
