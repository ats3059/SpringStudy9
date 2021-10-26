package hello.typeconverter.converter;

import hello.typeconverter.type.IpPort;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConverterTest {

    @Test
    void stringToInteger(){
        StringToIntegerConverter stringToIntegerConverter = new StringToIntegerConverter();
        Integer result = stringToIntegerConverter.convert("123");
        assertThat(result).isEqualTo(123);

    }

    @Test
    void IntegerToString() {
        IntegerToStringConverter converter = new IntegerToStringConverter();
        String result = converter.convert(10);
        System.out.println(result.equals("10"));
        assertThat(result).isEqualTo("10");
    }

    @Test
    void stringToIpPort(){
        IpPortToStringConverter ipPortToStringConverter = new IpPortToStringConverter();
        String convert = ipPortToStringConverter.convert(new IpPort("127.0.0.1", 8000));
        assertThat(convert).isEqualTo("127.0.0.1:8000");
    }

    @Test
    void ipPortToString(){
        StringToIpPortConverter converter = new StringToIpPortConverter();
        String source = "127.0.0.1:8000";
        IpPort result = converter.convert(source);
        assertThat(result).isEqualTo(new IpPort("127.0.0.1", 8000));
    }
}
