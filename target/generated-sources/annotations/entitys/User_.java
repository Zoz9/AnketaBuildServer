package entitys;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(User.class)
public abstract class User_ {

	public static volatile SingularAttribute<User, String> firstName;
	public static volatile SingularAttribute<User, String> lastName;
	public static volatile SetAttribute<User, Transport> transports;
	public static volatile SetAttribute<User, Tracker> trackers;
	public static volatile SingularAttribute<User, String> password;
	public static volatile SingularAttribute<User, Access> access;
	public static volatile SingularAttribute<User, Integer> id;
	public static volatile SingularAttribute<User, String> login;

}

