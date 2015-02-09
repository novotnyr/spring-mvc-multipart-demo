package sk.upjs.ics.novotnyr.smmd;


import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	
    private static final String DEFAULT_UPLOAD_LOCATION = null;

	@Override
    protected Class<?>[] getServletConfigClasses() {
    	return null;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/*" };
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] {
                WebApplicationContext.class
        };
    }
    
    @Override
    protected void customizeRegistration(Dynamic registration) {
    	registration.setMultipartConfig(new MultipartConfigElement(DEFAULT_UPLOAD_LOCATION));
    }
}