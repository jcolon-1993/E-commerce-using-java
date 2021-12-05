package games.business;

import games.business.Invoice;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-30T22:45:00")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> zip;
    public static volatile SingularAttribute<User, String> country;
    public static volatile SingularAttribute<User, String> creditCardExpirationDate;
    public static volatile SingularAttribute<User, String> city;
    public static volatile SingularAttribute<User, String> address1;
    public static volatile SingularAttribute<User, String> creditCardType;
    public static volatile SingularAttribute<User, Long> userID;
    public static volatile SingularAttribute<User, String> lastname;
    public static volatile SingularAttribute<User, String> firstName;
    public static volatile CollectionAttribute<User, Invoice> invoiceCollection;
    public static volatile SingularAttribute<User, String> creditCardNumber;
    public static volatile SingularAttribute<User, String> state;
    public static volatile SingularAttribute<User, String> email;

}