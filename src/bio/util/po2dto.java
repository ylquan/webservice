package bio.util;

import java.beans.PropertyDescriptor;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.StringUtils;

public class po2dto {
	 public static Object convert(Object po, Object dto) throws Exception {
	        if (po == null) {
	            return null;
	        }
	        PropertyDescriptor[] origDescriptors =
	                PropertyUtils.getPropertyDescriptors(po);

	        for (int i = 0; i < origDescriptors.length; i++) {
	            String name = origDescriptors[i].getName();
	            if (!StringUtils.equals(name, "class")) {
	            	PropertyUtils.setProperty(dto, name, PropertyUtils.getSimpleProperty(po, name));
	            }
	        }
	        return dto;
	    }
}
