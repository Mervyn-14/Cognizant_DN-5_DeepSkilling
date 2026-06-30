package com.cognizant.ormlearn;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.cognizant.ormlearn.model.Product;
import com.cognizant.ormlearn.service.ProductService;
@SpringBootApplication
public class OrmLearnApplication {
    private static ProductService productService;
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run( OrmLearnApplication.class, args);
        productService = context.getBean(ProductService.class);
        List<Product> products = productService.getAllProducts();
        products.forEach(System.out::println);
    }
}
