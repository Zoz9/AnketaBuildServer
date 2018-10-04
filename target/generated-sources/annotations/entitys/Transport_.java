package entitys;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Transport.class)
public abstract class Transport_ {

	public static volatile SetAttribute<Transport, Tracker> trackers;
	public static volatile SingularAttribute<Transport, String> transportNum;
	public static volatile SingularAttribute<Transport, String> transportTitle;
	public static volatile SingularAttribute<Transport, Integer> id;
	public static volatile SingularAttribute<Transport, User> user;

}

