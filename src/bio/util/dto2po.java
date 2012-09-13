package bio.util;

import java.beans.PropertyDescriptor;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.StringUtils;

public class dto2po {
	 public static Object convert(Object dto, Object po) throws Exception {
	        if (dto == null) {
	            return null;
	        }
	        PropertyDescriptor[] origDescriptors =
	                PropertyUtils.getPropertyDescriptors(po);

	        for (int i = 0; i < origDescriptors.length; i++) {
	            String name = origDescriptors[i].getName();
	            if (!StringUtils.equals(name, "class")) {
	            	PropertyUtils.setProperty(po, name, PropertyUtils.getSimpleProperty(dto, name));
	            }
	        }
	        return po;
	    }
}
