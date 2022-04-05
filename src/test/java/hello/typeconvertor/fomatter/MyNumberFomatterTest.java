package hello.typeconvertor.fomatter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.util.Locale;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MyNumberFomatterTest {

    private MyNumberFomatter myNumberFomatter = new MyNumberFomatter();

    @Test
    void parse() throws ParseException {
        Number result = myNumberFomatter.parse("1,000", Locale.KOREA);
        assertThat(result).isEqualTo(1000L);
    }

    @Test
    void print() {
        String result = myNumberFomatter.print(1000, Locale.KOREA);
        assertThat(result).isEqualTo("1,000");
    }
}