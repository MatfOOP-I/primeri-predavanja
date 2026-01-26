package rs.math.oop.g16.p11.ispitivanjeTipaAnalizaObjekta;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class AnalizaObjekta {
    private PovezanaLista<Object> obuhvaceni = new PovezanaLista<>();

    public String prikaz(Object obj) {
        if (obj == null)
            return "null";
        if (obuhvaceni.sadrzi(obj))
            return "...";
        obuhvaceni.dodajElement(obj);
        Class<?> cl = obj.getClass();
        if (cl.isPrimitive())
            return obj.toString();
        if (cl == String.class)
            return "\"" + (String) obj + "\"";
        if(cl == Character.class)
            return "'" + obj.toString() + "'";
        if( cl == Boolean.class ||
            cl == Byte.class ||
            cl == Short.class ||
            cl == Integer.class ||
            cl == Long.class ||
            cl == Float.class ||
            cl == Double.class )
            return cl.getSimpleName() + "(" + obj.toString() + ")";
        if (cl.isArray()) {
            StringBuilder r = new StringBuilder();
            r.append(cl.getComponentType() + "[]{");
            for (int i = 0; i < Array.getLength(obj); i++) {
                if (i > 0)
                    r.append(",");
                Object val = Array.get(obj, i);
                if (cl.getComponentType().isPrimitive())
                    r.append(val);
                else
                    r.append(prikaz(val));
            }
            r.append("}");
            return r.toString();
        }
        StringBuilder r = new StringBuilder();
        r.append( cl.getName() );
        // inspect the fields of this class and all superclasses
        do {
            r.append( "[" );
            Field[] fields = cl.getDeclaredFields();
            AccessibleObject.setAccessible(fields, true);
            // get the names and values of all fields
            for (Field f : fields) {
                if (!Modifier.isStatic(f.getModifiers())) {
                    if (!r.toString().endsWith("["))
                        r.append( "," );
                    r.append( f.getName() + "=" );
                    try {
                        Class<?> t = f.getType();
                        Object val = f.get(obj);
                        if (t.isPrimitive())
                            r.append( val );
                        else
                            r.append( prikaz(val) );
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            r.append( "]" );
            cl = cl.getSuperclass();
        } while (cl != null);
        return r.toString();
    }
}

