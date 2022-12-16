package edu.miu.springdatademo.seeder;

import edu.miu.springdatademo.entity.*;
import edu.miu.springdatademo.repository.CategoryRepo;
import edu.miu.springdatademo.repository.ProductRepo;
import edu.miu.springdatademo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Component
public class Seed implements CommandLineRunner {
    @Autowired
    UserRepo userRepository;

    @Autowired
    CategoryRepo categoryRepo;
    @Autowired
    ProductRepo productRepo;

    @Override
    public void run(String... args) throws Exception {
        loadUserData();
        loadCategoryData();
        loadProductData();
    }

    private void loadUserData() {

    }

    public void loadCategoryData(){
        List<Category> categoryList=List.of(
            new Category("category1"),
            new Category("category2"),
            new Category("category3"),
            new Category("category4"),
            new Category("category5"),
            new Category("category6"),
            new Category("category7")

        );
        categoryRepo.saveAll(categoryList);

    }

    public void loadProductData(){

        List<Address> addressList=new ArrayList<>();
        List<User> userList=new ArrayList<>();
        for(int i=0;i<10;i++){
            Address address=new Address("street"+i,i,"city"+i);
            String firstname="firstname"+i;
            String lastname="lastname"+i;
            String email="email"+i;
            String password="password"+i;
            User user= new User(firstname,
                    lastname,
                    email,
                    password
            );
            user.setAddressWithMap(address);
            userList.add(user);
        }

        this.userRepository.saveAll(userList);


        List<Product> productList=List.of(
            new Product("product1",1000,1),
            new Product("product2",500,2),
            new Product("product3",300,3),
            new Product("product11",250,5),
            new Product("product111",800,4)
        );
        List<Category> categoryList=new ArrayList<>();
        categoryRepo.findAll().forEach(categoryList::add);
        productList.get(0).setCategory(categoryList.get(0));
        productList.get(1).setCategory(categoryList.get(1));
        productList.get(3).setCategory(categoryList.get(1));
        productList.get(2).setCategory(categoryList.get(2));
        productList.get(4).setCategory(categoryList.get(0));
        //categoryRepo.saveAll(categoryList);
        productRepo.saveAll(productList);
        //categoryRepo.saveAll(categoryList);

        List<Review> reviews=new ArrayList<>();
        reviews.add(new Review("comment1",userList.get(0)));
        reviews.add(new Review("comment2",userList.get(1)));
        reviews.add(new Review("comment3",userList.get(2)));

        reviews.add(new Review("comment4",userList.get(3)));

        productList.get(0).addReview(reviews.get(0));
        productList.get(0).addReview(reviews.get(1));
        productList.get(0).addReview(reviews.get(2));

        productList.get(1).addReview(reviews.get(3));


    }



}
