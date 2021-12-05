package games.business;

import games.business.Categories;
import games.business.LineItem;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-30T22:45:00")
@StaticMetamodel(Products.class)
public class Products_ { 

    public static volatile SingularAttribute<Products, String> code;
    public static volatile SingularAttribute<Products, Long> productID;
    public static volatile SingularAttribute<Products, Double> price;
    public static volatile SingularAttribute<Products, String> name;
    public static volatile SingularAttribute<Products, String> description;
    public static volatile SingularAttribute<Products, Categories> categoryID;
    public static volatile CollectionAttribute<Products, LineItem> lineitemCollection;

}