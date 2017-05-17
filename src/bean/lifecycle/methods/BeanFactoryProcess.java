package bean.lifecycle.methods;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class BeanFactoryProcess implements BeanFactoryPostProcessor {

	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0)
			throws BeansException {
            BeanDefinition bd = arg0.getBeanDefinition("restobean");	
            MutablePropertyValues val = bd.getPropertyValues();
            val.addPropertyValue("welcome", "welcome...");
	}

}
