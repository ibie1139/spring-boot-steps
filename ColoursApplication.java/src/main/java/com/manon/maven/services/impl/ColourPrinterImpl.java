package com.manon.maven.services.impl;

import com.manon.maven.services.ColourPrinter;
import com.manon.maven.services.RedPrinter;
import com.manon.maven.services.BluePrinter;
import com.manon.maven.services.GreenPrinter;

public class ColourPrinterImpl implements ColourPrinter {
    private final RedPrinter redPrinter;
    private final BluePrinter bluePrinter;
    private final GreenPrinter greenPrinter;

    // After the printer beans are created, they are declared in constructor.
    // Spring's IoC container wires the implementation class of the interface to ColourPrinterImpl
    public ColourPrinterImpl(final RedPrinter redPrinter, final BluePrinter bluePrinter, final GreenPrinter greenPrinter) {
        this.redPrinter = redPrinter;
        this.bluePrinter = bluePrinter;
        this.greenPrinter = greenPrinter;
    }

    @Override
    public String print() {
        return String.join(", ", redPrinter.print(), bluePrinter.print(), greenPrinter.print());
    }
}
