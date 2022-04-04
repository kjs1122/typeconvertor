package hello.typeconvertor.convertor;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class IntegerToStringConvertorTest {

    @Test
    void convertString() {
        StringToIntegerConverter converter = new StringToIntegerConverter();
        Integer result = converter.convert("10");
        Assertions.assertThat(result).isEqualTo(10);
    }
    @Test
    void convertInteger() {
        IntegerToStringConvertor convertor = new IntegerToStringConvertor();
        String result = convertor.convert(10);
        Assertions.assertThat(result).isEqualTo("10");
    }

}