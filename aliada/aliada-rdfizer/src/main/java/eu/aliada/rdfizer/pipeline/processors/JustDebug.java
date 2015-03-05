package eu.aliada.rdfizer.pipeline.processors;

import java.util.Collection;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import eu.aliada.rdfizer.pipeline.format.xml.NullObject;

/**
 * A simple debug processor.
 * 
 * @author Andrea Gazzarini
 * @since 1.0
 */
public class JustDebug implements Processor {

	@SuppressWarnings("rawtypes")
	@Override
	public void process(final Exchange exchange) throws Exception {
		final Object o = exchange.getIn().getBody();
		if (o instanceof NullObject) {
			return;
		}

		if (o != null && o instanceof Collection) {
			Collection c = (Collection) o;
			
			for (Object object : c) {
				System.out.println(object);
			}
		} else {
			System.out.println(o);
		}
	}
}
