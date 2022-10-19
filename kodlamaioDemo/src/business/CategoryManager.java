package business;

import dataAccess.CategoryDao;
import entities.Category;
import logging.Logger;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;

    private List<Category> categories = new ArrayList<Category>();

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }
    public void add(Category category) throws Exception{
        for (Category c: categories){
            if(c.getName().equalsIgnoreCase(category.getName())){
                throw new Exception("Boyle bir kategori mevcut");

            }
        }
        categoryDao.add(category);
        categories.add(category);
        for (Logger logger : loggers){
            logger.log(category.getName());
        }
    }
}
