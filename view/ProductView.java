package view;

import model.Product;
import service.UtilService;
import serviceImpl.UtilServiceImpl;

public class ProductView {
    public static void main(String[] args) {

        UtilService util = UtilServiceImpl.getInstance();
        Product product = Product.builder()
                .pno(util.createRandomInteger(1, 8))
                .name(util.createRandomWriter())
                .company(util.createRandomCompany())
                .price(util.createRandomInteger(0,100))
                .build();
        System.out.println(product.toString());
    }
}


