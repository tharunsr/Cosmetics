package com.cosmetics.service;

import com.cosmetics.entities.Customer;
import com.cosmetics.entities.Product;
import com.cosmetics.repository.CustomerRepository;
import com.cosmetics.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class CustomerService {

        @Autowired
        CustomerRepository repo;

        @Autowired
        ProductRepository proRepo;

        public List<Customer> getAll() {
            return repo.findAll();
        }

        public Customer getCustomerById(int id) {
            return repo.findById(id).orElse(null);
        }

        public void addCustomer(Customer customer) {
//            Set<Product> products = new HashSet<>();
//            if (customer.getProduct() != null && !customer.getProduct().isEmpty()) {
//                for (Product product : customer.getProduct()) {
//                    Product existingProduct = proRepo.findById(product.getId()).orElse(null);
//                    if (existingProduct != null) {
//                        products.add(existingProduct);  // Add the existing product to the set
//                    } else {
//                        // Handle the case where the product is not found, could throw an exception or log the error
//                        System.out.println("Product with ID " + product.getId() + " not found.");
//                    }
//                }
//                // Set the fetched products for the customer
//                customer.setProduct(products);
//            }
            repo.save(customer);
        }

        public void update(Customer prod) {
            repo.save(prod);
        }

        public void deleteById(int id) {
            repo.deleteById(id);
        }
    }

