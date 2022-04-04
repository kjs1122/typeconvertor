package hello.typeconvertor;

import hello.typeconvertor.convertor.IntegerToStringConvertor;
import hello.typeconvertor.convertor.IpPortToStringConvertor;
import hello.typeconvertor.convertor.StringToIntegerConverter;
import hello.typeconvertor.convertor.StringToIpPortConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new StringToIpPortConverter());
        registry.addConverter(new IpPortToStringConvertor());
        registry.addConverter(new StringToIntegerConverter());
        registry.addConverter(new IntegerToStringConvertor());
    }
}
