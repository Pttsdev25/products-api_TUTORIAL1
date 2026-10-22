package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private List<Product> products= new ArrayList<>();
    private Long nextId=1L;  //1L-1 Long

    public ProductService(){
        products.add(new DigitalProduct(nextId++, "E-Book",20.99,"user/downloads/e-book.pdf",2.3));
        products.add(new PhysicalProduct(nextId++, "Table",90.99,1.6,"90cm x 70cm x 100cm" ));
    }


    public List<Product> getAllProducts(){
        return products;
    }

    public Product addProduct(Product product){
        product.setId(nextId++);
        //Use currentid  then increment by 1
        products.add(product);
        return product;
    }

    public Optional<Product> getProductById(Long id) {
        return products.stream().filter(p -> p.getId().equals(id)).findFirst();  //((  -> Lambda operator;given this product, check the following.))
//.equals instead of == ; coz == compares references, not values.
    }


    public void deleteProduct(Long id){
        products.removeIf(p->p.getId().equals(id));
    }

    public List<Product> findByName(String name){
       return products.stream().filter(p->p.getName().contains(name)).toList();
    }
}
