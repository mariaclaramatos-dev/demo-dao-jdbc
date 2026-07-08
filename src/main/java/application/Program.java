package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        Department obj = new Department(1, "Books");
        System.out.println(obj);

        Seller seller = new Seller("Bob", 21, "bob@gmail.com",
                obj, LocalDate.of(1978, 7, 2) ,
                3000.0);

        SellerDao sellerDao = DaoFactory.createSellerDao(); // Injeção de depensência

        System.out.println(seller);
    }
}
