package games.business;

import games.business.LineItem;
import games.business.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-30T22:45:00")
@StaticMetamodel(Invoice.class)
public class Invoice_ { 

    public static volatile ListAttribute<Invoice, LineItem> lineItems;
    public static volatile SingularAttribute<Invoice, Long> invoiceNumber;
    public static volatile SingularAttribute<Invoice, Boolean> isProcessed;
    public static volatile SingularAttribute<Invoice, User> userUserId;
    public static volatile SingularAttribute<Invoice, Date> invoiceDate;

}