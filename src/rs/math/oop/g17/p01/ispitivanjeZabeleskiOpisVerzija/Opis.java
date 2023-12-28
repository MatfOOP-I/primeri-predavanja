package rs.math.oop.g17.p01.ispitivanjeZabeleskiOpisVerzija;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Specifying runtime retention policy
@Retention( RetentionPolicy.RUNTIME )
// Specifying target
@Target( { ElementType.METHOD, ElementType.TYPE } )
@interface Opis
{
	String autor() default "Vlado";
	
	String datum();
}