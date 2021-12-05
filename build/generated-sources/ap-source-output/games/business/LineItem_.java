package games.business;

import games.business.Products;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-30T22:45:00")
@StaticMetamodel(LineItem.class)
public class LineItem_ { 

    public static volatile SingularAttribute<LineItem, Long> lineitemid;
    public static volatile SingularAttribute<LineItem, Products> product;
    public static volatile SingularAttribute<LineItem, Integer> quantity;

}