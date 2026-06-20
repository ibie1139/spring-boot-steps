package com.manon.maven;

import com.manon.maven.services.ColourPrinter;
import com.manon.maven.services.impl.ColourPrinterImpl;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class ColoursApplication implements CommandLineRunner {
    private final ColourPrinter colourPrinter;

    public ColoursApplication(final ColourPrinter colourPrinter) {
        this.colourPrinter = colourPrinter;
    }

    public static void main(String[] args) {
        SpringApplication.run(ColoursApplication.class, args);
    }

    @Override
    public void run(final String... args) {
        log.info(colourPrinter.print());
    }

}
