package com.manon.maven.services.impl;

import com.manon.maven.services.ColourPrinter;
import com.manon.maven.services.RedPrinter;
import com.manon.maven.services.BluePrinter;
import com.manon.maven.services.GreenPrinter;

public class ColourPrinterImpl implements ColourPrinter {
    final private RedPrinter redPrinter;
    final private BluePrinter bluePrinter;
    final private GreenPrinter greenPrinter;

    public ColourPrinterImpl() {
        this.redPrinter = new EnglishRedPrinter();
        this.bluePrinter = new EnglishBluePrinter();
        this.greenPrinter = new EnglishGreenPrinter();
    }

    @Override
    public String print() {
        return String.join(", ", redPrinter.print(), bluePrinter.print(), greenPrinter.print());
    }
}
