package entitys;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Tracker.class)
public abstract class Tracker_ {

	public static volatile SingularAttribute<Tracker, Date> date;
	public static volatile SingularAttribute<Tracker, String> gpsPosition;
	public static volatile SingularAttribute<Tracker, Integer> fuel;
	public static volatile SingularAttribute<Tracker, Integer> cropWeight;
	public static volatile SingularAttribute<Tracker, Integer> id;
	public static volatile SingularAttribute<Tracker, Transport> transport;
	public static volatile SingularAttribute<Tracker, User> user;
	public static volatile SingularAttribute<Tracker, Integer> speed;

}

