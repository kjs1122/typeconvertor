package hello.typeconvertor;

import hello.typeconvertor.convertor.IntegerToStringConvertor;
import hello.typeconvertor.convertor.IpPortToStringConvertor;
import hello.typeconvertor.convertor.StringToIntegerConverter;
import hello.typeconvertor.convertor.StringToIpPortConverter;
import hello.typeconvertor.fomatter.MyNumberFomatter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        // 주석처리 우선순위 비슷한 기능들은 컨버터가 우선순위가 생김
//        registry.addConverter(new StringToIntegerConverter());
//        registry.addConverter(new IntegerToStringConvertor());
        registry.addConverter(new StringToIpPortConverter());
        registry.addConverter(new IpPortToStringConvertor());


        // 추가
        registry.addFormatter(new MyNumberFomatter());
    }
}
