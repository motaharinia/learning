package ir.micser.config.mvc;

import com.motaharinia.msutility.json.CustomObjectMapper;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.util.List;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-10-07 <br>
 * Time: 11:28:11 <br>
 * Description: کلاس تنظیمات وب و عمومی
 */
@Configuration
public class MvcConfiguration  implements WebMvcConfigurer {

    /**
     * تنظیمات آپلود فایل در سامانه
     * pom dependency: commons-fileupload
     * @return خروجی: ریزالور آپلود فایل با تنظیمات سفارشی شده
     */
    @Bean
    public MultipartResolver multipartResolver() {
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
        multipartResolver.setMaxUploadSize(200 * 1024 * 1024);
        return multipartResolver;
    }

    /**
     * تنظیمات چندزبانی سامانه
     * @return خروجی: منبع ترجمه برای چندزبانی با تنظیمات سفارشی شده
     */
    @Bean(name = "messageSource")
    public MessageSource configureMessageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasenames(new String[]{"classpath:lang/module/common/etcitem/etcItem",});
        messageSource.setCacheSeconds(5);
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }

    /**
     * تنظیمات جکسون برای سریالایز و دیسریالایز سامانه
     * @param converters مبدل جکسون با تنظیمات سفارشی شده
     */
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        Jackson2ObjectMapperBuilder jackson2ObjectMapperBuilder = new Jackson2ObjectMapperBuilder();
        jackson2ObjectMapperBuilder.failOnEmptyBeans(false);
        jackson2ObjectMapperBuilder.failOnUnknownProperties(false);
        MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter(jackson2ObjectMapperBuilder.build());
        CustomObjectMapper customObjectMapper = new CustomObjectMapper(configureMessageSource());
        mappingJackson2HttpMessageConverter.setObjectMapper(customObjectMapper);
        converters.add(mappingJackson2HttpMessageConverter);
    }
}
