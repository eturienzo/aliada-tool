// ALIADA - Automatic publication under Linked Data paradigm
//          of library and museum data
//
// Component: aliada-user-interface
// Responsible: ALIADA Consortium

package eu.aliada.inputValidation;

import eu.aliada.shared.log.Log;
import junit.framework.TestCase;

/**
 * @author elena
 * @since 1.0
 */
public class WellFormedTest extends TestCase{
    private final Log log = new Log(WellFormedTest.class);
    /**
     * @see
     * @since 1.0
     */
    public void testWellFormed() {
        WellFormed wf = new WellFormed();
        //LIDO
        //boolean result = wf.isWellFormedXML("src/test/resources/lido/lidoMFAB_modified.xml");
        //MARC bib
        //boolean result = wf.isWellFormedXML("src/test/resources/marc/Parte8_corregido.xml");
        //MARC aut
        //boolean result = wf.isWellFormedXML("src/test/resources/marc/marc_aut.xml");
        //DC
        boolean result = wf.isWellFormedXML("src/test/resources/drupal/dc_ART.xml");
        if (result) {
            log.info("BIEN");
        } else {
            log.info("MAL");
        }
    }
}
