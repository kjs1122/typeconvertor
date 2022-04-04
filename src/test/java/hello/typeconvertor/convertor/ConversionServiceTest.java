package hello.typeconvertor.convertor;

import hello.typeconvertor.type.IpPort;
import org.junit.jupiter.api.Test;
import org.springframework.core.convert.support.DefaultConversionService;

public class ConversionServiceTest {

    @Test
    void conversionService() {
        //등록
        DefaultConversionService conversionService = new DefaultConversionService();
        conversionService.addConverter(new StringToIntegerConverter());
        conversionService.addConverter(new IntegerToStringConvertor());
        conversionService.addConverter(new StringToIpPortConverter());
        conversionService.addConverter(new IpPortToStringConvertor());

        IpPort ipPort = conversionService.convert("127.0.0.1:8080", IpPort.class);
        System.out.println("ipPort = " + ipPort);

    }
}
