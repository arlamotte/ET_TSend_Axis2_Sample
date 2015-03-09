import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.ConfigurationContextFactory;

import com.exacttarget.client.PropertiesUtil;
import com.exacttarget.wsdl.partnerapi.APIObject;
import com.exacttarget.wsdl.partnerapi.Attribute;
import com.exacttarget.wsdl.partnerapi.CreateOptions;
import com.exacttarget.wsdl.partnerapi.CreateRequestDocument;
import com.exacttarget.wsdl.partnerapi.CreateRequestDocument.CreateRequest;
import com.exacttarget.wsdl.partnerapi.CreateResponseDocument;
import com.exacttarget.wsdl.partnerapi.PartnerAPIStub;
import com.exacttarget.wsdl.partnerapi.RequestType;
import com.exacttarget.wsdl.partnerapi.Subscriber;
import com.exacttarget.wsdl.partnerapi.TriggeredSend;
import com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition;

/**
 * 
 */

/**
 * @author alamotte
 *
 */
public class TSend {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 try {
			 
	            		 
			    ConfigurationContext configurationContext = ConfigurationContextFactory.createConfigurationContextFromFileSystem(PropertiesUtil.getInstance().getProperty("repositoryFolder"), PropertiesUtil.getInstance().getProperty("axis2File")); 
			    PartnerAPIStub stub = new PartnerAPIStub(configurationContext, PropertiesUtil.getInstance().getProperty("endPoint"));
			    
			     TriggeredSendDefinition confirmationTrigger = TriggeredSendDefinition.Factory.newInstance();
			     confirmationTrigger.setCustomerKey("REST_TEST");
			     confirmationTrigger.setNilObjectID();
			     confirmationTrigger.setNilPartnerKey();
			     
			     Subscriber subscriber = Subscriber.Factory.newInstance();
			     subscriber.setEmailAddress("alamotte@salesforce.com");
			     subscriber.setSubscriberKey("alamotte@salesforce.com");
			     
			     Attribute  Att1 =  Attribute.Factory.newInstance();
			     
			     Att1.setName("Name");
			     Att1.setValue("Archimedes");
			     
                Attribute  Att2 =  Attribute.Factory.newInstance();
			     
			     Att2.setName("Subject");
			     Att2.setValue("Teste Triggered");

                Attribute  Att3 =  Attribute.Factory.newInstance();
			     
			     Att3.setName("HtmlBody");
			     Att3.setValue("<p> Teste Triggered");

                Attribute  Att4 =  Attribute.Factory.newInstance();
			     
			     Att4.setName("TxtBody");
			     Att4.setValue("Teste Triggered");
			     
			     
			     subscriber.setAttributesArray(new Attribute[] { Att1,Att2,Att3,Att4});

			     TriggeredSend triggeredSend = TriggeredSend.Factory.newInstance();
			     triggeredSend.setSubscribersArray(new Subscriber[] {subscriber});
			     
			     triggeredSend.setTriggeredSendDefinition(confirmationTrigger);

	             		     
			     try {
			         CreateOptions createOptions = CreateOptions.Factory.newInstance();
			         createOptions.setRequestType(RequestType.ASYNCHRONOUS);
			 
			            CreateRequest createRequest = CreateRequest.Factory.newInstance();
			            createRequest.setObjectsArray(new APIObject[] {triggeredSend});
			            createRequest.setOptions(createOptions);
			 
			            CreateRequestDocument createRequestDocument = CreateRequestDocument.Factory.newInstance();
			            createRequestDocument.setCreateRequest(createRequest);
			 
			            CreateResponseDocument createResponseDocument = stub.create(createRequestDocument);
			            System.out.println(createResponseDocument.getCreateResponse());
			                                 
			        }
			        catch (Exception e) {
			            e.printStackTrace();
			        } 
			     
		 }
		 catch (Exception e) {
	            e.printStackTrace();
		 }


	}

}
