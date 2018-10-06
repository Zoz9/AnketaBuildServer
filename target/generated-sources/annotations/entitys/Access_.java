package entitys;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Access.class)
public abstract class Access_ {

	public static volatile SingularAttribute<Access, String> accesTitle;
	public static volatile SingularAttribute<Access, Integer> id;
	public static volatile SetAttribute<Access, User> users;

}

