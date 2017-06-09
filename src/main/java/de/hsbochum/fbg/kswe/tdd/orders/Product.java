
package de.hsbochum.fbg.kswe.tdd.orders;

import java.io.File;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class Product {
    
    private final String nmae;
    private final File productFile;

    public Product(String nmae, File productFile) {
        this.nmae = nmae;
        this.productFile = productFile;
    }

    public String getNmae() {
        return nmae;
    }

    public File getProductFile() {
        return productFile;
    }

}
