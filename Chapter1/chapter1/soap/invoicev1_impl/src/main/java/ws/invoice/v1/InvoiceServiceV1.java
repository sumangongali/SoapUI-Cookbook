package ws.invoice.v1;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.1
 * 2015-01-09T17:15:30.753Z
 * Generated source version: 3.0.1
 * 
 */
@WebServiceClient(name = "InvoiceServiceV1", 
                  wsdlLocation = "invoice_v1.wsdl",
                  targetNamespace = "http://soapui.cookbook.samples/contract/invoice") 
public class InvoiceServiceV1 extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://soapui.cookbook.samples/contract/invoice", "InvoiceServiceV1");
    public final static QName InvoicePort = new QName("http://soapui.cookbook.samples/contract/invoice", "InvoicePort");
    static {
        URL url = InvoiceServiceV1.class.getResource("invoice_v1.wsdl");
        if (url == null) {
            url = InvoiceServiceV1.class.getClassLoader().getResource("invoice_v1.wsdl");
        } 
        if (url == null) {
            java.util.logging.Logger.getLogger(InvoiceServiceV1.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "invoice_v1.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public InvoiceServiceV1(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public InvoiceServiceV1(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public InvoiceServiceV1() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public InvoiceServiceV1(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public InvoiceServiceV1(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public InvoiceServiceV1(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns InvoicePortType
     */
    @WebEndpoint(name = "InvoicePort")
    public InvoicePortType getInvoicePort() {
        return super.getPort(InvoicePort, InvoicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InvoicePortType
     */
    @WebEndpoint(name = "InvoicePort")
    public InvoicePortType getInvoicePort(WebServiceFeature... features) {
        return super.getPort(InvoicePort, InvoicePortType.class, features);
    }

}
