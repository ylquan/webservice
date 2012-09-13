package bio.util;

import java.beans.PropertyDescriptor;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.StringUtils;


public class Bean2Bean {
	 public static Object convertMapToBean(Object o, Object p) throws Exception {
	        if (o == null) {
	            return null;
	        }
	        PropertyDescriptor[] origDescriptors =
	                PropertyUtils.getPropertyDescriptors(o);

	        for (int i = 0; i < origDescriptors.length; i++) {
	            String name = origDescriptors[i].getName();
	            if (!StringUtils.equals(name, "class")) {
	            	System.out.println(name);
	            	System.out.println(PropertyUtils.getSimpleProperty(o, name));
//	            	System.out.println(PropertyUtils.getSimpleProperty(p, name));
	            	//PropertyUtils.setProperty(p, name, PropertyUtils.getSimpleProperty(o, name));
//	                if (map.get(name) != null) {
//	                    PropertyUtils.setProperty(o, name, org.apache.commons.beanutils.ConvertUtils.convert(map.get(name).toString(), origDescriptors[i].getPropertyType()));
//	                } else {
//	                    PropertyUtils.setProperty(o, name, null);
//	                }
	            }
	        }
	        return o;
	    }
}
