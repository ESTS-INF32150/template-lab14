/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

import java.io.Serializable;
import java.time.LocalDate;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author lcassaca
 */
public class Product implements Serializable {
    private transient StringProperty codeProperty;
    private transient StringProperty nameProperty;
    private transient StringProperty descriptionProperty;
    private transient DoubleProperty priceProperty;
    private transient ObjectProperty<LocalDate> expirationProperty;
    
    private String code;
    private String name;
    private String description;
    private double price;
    private LocalDate expiration;

    public Product(){
        this.codeProperty = new SimpleStringProperty();
        this.nameProperty = new SimpleStringProperty();
        this.descriptionProperty = new SimpleStringProperty();
        this.priceProperty = new SimpleDoubleProperty();
        this.expirationProperty = new SimpleObjectProperty<>();
    }
    
    public Product(String code, String name, String description, double price, LocalDate expiration)
    {
        this.codeProperty = new SimpleStringProperty(code);
        this.nameProperty = new SimpleStringProperty(name);
        this.descriptionProperty = new SimpleStringProperty(description);
        this.priceProperty = new SimpleDoubleProperty(price);
        this.expirationProperty = new SimpleObjectProperty<>(expiration);        
        
        this.code = code;
        this.name = name;
        this.description = description;
        this.price = price;
        this.expiration = expiration;
    }
    
    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;  
        this.codeProperty.setValue(code);
    }

    public StringProperty codeProperty()
    {
        if (codeProperty == null)
        {
            codeProperty = new SimpleStringProperty(code);
        }
        return codeProperty;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
        this.nameProperty.setValue(name);
    }

    public StringProperty nameProperty()
    {
        if (nameProperty == null)
        {
            nameProperty = new SimpleStringProperty(name);
        }
        return nameProperty;
    }
    
    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
        this.descriptionProperty.setValue(description);
    }
    
    public StringProperty descriptionProperty()
    {
        if (descriptionProperty == null)
        {
            descriptionProperty = new SimpleStringProperty(description);
        }
        return this.descriptionProperty;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
        this.priceProperty.setValue(price);
    }
    
    public DoubleProperty priceProperty()
    {
        if (priceProperty == null)
        {
            priceProperty = new SimpleDoubleProperty(price);
        }
        return priceProperty;
    }

    /**
     * @return the expiration
     */
    public LocalDate getExpiration() {
        return expiration;
    }

    /**
     * @param expiration the expiration to set
     */
    public void setExpiration(LocalDate expiration) {
        this.expiration = expiration;
        this.expirationProperty.setValue(expiration);
    }

    public ObjectProperty<LocalDate> expirationProperty()
    {
        if (expirationProperty == null)
        {
            expirationProperty = new SimpleObjectProperty<>(expiration);
        }
        return this.expirationProperty;
    }    
}
