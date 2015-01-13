// ALIADA - Automatic publication under Linked Data paradigm
//          of library and museum data
//
// Component: aliada-ckan-datahub-page-creation
// Responsible: ALIADA Consortium
package eu.aliada.ckancreation.model;


import javax.xml.bind.annotation.XmlRootElement;

/**
 * Response to "Create Dataset" CKAN API function.
 * 
 * @author Idoia Murua
 * @since 2.0
 */
@XmlRootElement
public class CKANDatasetResponse {

	/** Help text for the API function. */
	private String help;
	/** API function result. */
	private Dataset result;
	/** It indicates if the API function was executed successfully or not. */
	private String success;
	/** If success=false, this field indicates the exception. */
	private CKANResponseError error;

	public CKANDatasetResponse() {
	}

	public String getHelp() {
		return this.help;
	}
	public void setHelp(String help) {
		this.help = help;
	}

	public Dataset getResult() {
		return this.result;
	}
	public void setResult(Dataset result) {
		this.result = result;
	}

	public String getSuccess() {
		return this.success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}

	public CKANResponseError getError() {
		return this.error;
	}
	public void setError(CKANResponseError error) {
		this.error = error;
	}
}