package org.springframework.android.config;

public class ReadConfig {

	public String getUrl(){
		Configuration conf = new Configuration();
		Class<?> c = conf.getClass();
		ClientConfig cfg = (ClientConfig)c.getAnnotation(ClientConfig.class);
		return cfg.url();
	} // 
}
