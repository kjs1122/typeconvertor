package hello.typeconvertor.convertor;

import hello.typeconvertor.type.IpPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;

@Slf4j
public class IpPortToStringConvertor implements Converter<IpPort, String> {

    @Override
    public String convert(IpPort source) {
        log.info("convert source = {}", source);
        String ip = source.getIp();
        int port = source.getPort();
        return ip + ":" + port;
    }
}
