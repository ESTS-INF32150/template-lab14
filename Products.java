/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.Month;
import java.util.HashSet;

/**
 *
 * @author lcassaca
 */
public class Products extends HashSet<Product> implements Serializable{
    private static final String FILE_NAME = "products.dat";    
    
    public void saveProducts() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
            oos.writeObject(this);
            oos.flush();
            oos.close();
            System.out.println("Dados guardados com sucesso!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Products loadProducts() {
        Products products;
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME));
            products = (Products) ois.readObject();
            ois.close();
            System.out.println("Dados carregados com sucesso!");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
            products = new Products();
        }
        return products;
    }
    
    public static void createSampleData()
    {
        
        Products p = new Products();
        p.add(new Product("1", "Samsung S21", "Samsubg S21 Ultra 5G", 250.0, LocalDate.of(2021, Month.MARCH, 2)));
        p.add(new Product("2", "Auscultadores Sennheiser HD 450", "Auscultadores Bluetooth Sennheiser HD 450 com ANC - Preto", 119.99, LocalDate.of(2021, Month.APRIL, 1)));
        p.add(new Product("3", "Apple MacBook Pro 13", "Apple MacBook Pro 13'' Retina M1 | 16 GB | 256GB SSD | GPU 8-core - Prateado", 1509.0, LocalDate.of(2021, Month.JULY, 31)));
        p.add(new Product("4", "Canon EOS M50 ", "Canon EOS M50 Mark II + EF-M 15-45mm f/3.5-6.3 IS STM - Preto", 659.99, LocalDate.of(2021, Month.AUGUST, 2)));
        p.saveProducts();
    }
}
