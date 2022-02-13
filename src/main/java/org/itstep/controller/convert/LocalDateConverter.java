package org.itstep.controller.convert;

import org.springframework.core.convert.converter.Converter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateConverter implements Converter<String, LocalDate> {

    private final String datePattern;

    public LocalDateConverter() {
        datePattern = "yyyy-MM-dd";
    }

    public LocalDateConverter(String datePattern) {
        this.datePattern = datePattern;
    }

    @Override
    public LocalDate convert(String source) {
        return LocalDate.parse(source, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
}
