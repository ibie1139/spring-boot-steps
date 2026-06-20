package com.manon.maven.config;

import com.manon.maven.services.BluePrinter;
import com.manon.maven.services.ColourPrinter;
import com.manon.maven.services.GreenPrinter;
import com.manon.maven.services.RedPrinter;
import com.manon.maven.services.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Beans created are available in our spring context. They can be injected where they are needed
 * So the place using them look for them in spring context, not instantiating them with `new xxx()`.
 */
@Configuration
public class PrinterConfig {
    @Bean
    public BluePrinter bluePrinter() {
        return new SpanishBluePrinter();
    }

    @Bean
    public RedPrinter redPrinter() {
        return new SpanishRedPrinter();
    }

    @Bean
    public GreenPrinter greenPrinter() {
        return new SpanishGreenPrinter();
    }

    // Create the colorPrinters beans first. Then inject them when creating colourPrinter bean.
    @Bean
    public ColourPrinter colourPrinter(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter) {
        return new ColourPrinterImpl(redPrinter, bluePrinter, greenPrinter);
    }
}
