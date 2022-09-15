package com.example.testmethods;

import com.example.testmethods.models.Configuration;
import com.example.testmethods.tests.FormatXmlString;
import com.example.testmethods.tests.PlaceHolder;
import com.example.testmethods.tests.XmlToJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestMethodsApplication {

    @Autowired
    private static Configuration config;

    public static void main(String[] args) {
        SpringApplication.run(TestMethodsApplication.class, args);

//       String XML_STRING =
//                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
//                        "<root>" +
//                        "<firstName>John</firstName>" +
//                        "<lastName>Snow</lastName>" +
//                        "<age>25</age>" +
//                        "<spouse/>" +
//                        "<address>" +
//                        "<street>237 Harrison Street</street>" +
//                        "<city>Brooklyn, NY</city>" +
//                        "<state>New York</state>" +
//                        "<postalCode>11238</postalCode>" +
//                        "</address>" +
//                        "<phoneNumbers>" +
//                        "<type>mobile</type>" +
//                        "<number>212 555-3346</number>" +
//                        "</phoneNumbers>" +
//                        "<phoneNumbers>" +
//                        "<type>fax</type>" +
//                        "<number>646 555-4567</number>" +
//                        "</phoneNumbers>" +
//                        "</root>";
//
//        XmlToJson method= new XmlToJson();
//        method.xmlToJson(XML_STRING);
//
////        String templateString = "The ${animal} jumped over the ${target}.";

        PlaceHolder placeHolder = new PlaceHolder();
        placeHolder.replaceValues();


         String sampleXml ="\n" +
                "<S:Envelope xmlns:S=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "   <S:Body>\n" +
                "      <ns10:KCBCurrencyListingResponse xmlns:ns10=\"http://temenos.com/KCBIbankInquiry\" xmlns:ns9=\"http://temenos.com/KCBGETLOANDETAIL\" xmlns:ns8=\"http://temenos.com/KCBGETCUSTINFO\" xmlns:ns7=\"http://temenos.com/KCBGETCUSTLOANDETAILS\" xmlns:ns6=\"http://temenos.com/KCBIBMWECURRENCY\" xmlns:ns5=\"http://temenos.com/KCBIBMMBYCONT\" xmlns:ns4=\"http://temenos.com/KCBIBANKSTMTONLINE1\" xmlns:ns3=\"http://temenos.com/KCBMWESTANDINGORDER\" xmlns:ns2=\"http://temenos.com/KCBCHANNELACCTSDATA\">\n" +
                "         <Status>\n" +
                "            <successIndicator>Success</successIndicator>\n" +
                "         </Status>\n" +
                "         <KCBIBMWECURRENCYType>\n" +
                "            <ns6:gKCBIBMWECURRENCYDetailType>\n" +
                "               <ns6:mKCBIBMWECURRENCYDetailType>\n" +
                "                  <ns6:CurrencyName>US Dollar</ns6:CurrencyName>\n" +
                "                  <ns6:CurrencyCode>USD</ns6:CurrencyCode>\n" +
                "                  <ns6:CurrencyMarket>1</ns6:CurrencyMarket>\n" +
                "                  <ns6:MidRevalRate>109.6</ns6:MidRevalRate>\n" +
                "                  <ns6:BuyRate>104.25</ns6:BuyRate>\n" +
                "                  <ns6:SellRate>104.75</ns6:SellRate>\n" +
                "                  <ns6:CurrencyMarketDesc>Currency Market</ns6:CurrencyMarketDesc>\n" +
                "               </ns6:mKCBIBMWECURRENCYDetailType>\n" +
                "               <ns6:mKCBIBMWECURRENCYDetailType>\n" +
                "                  <ns6:CurrencyName/>\n" +
                "                  <ns6:CurrencyCode/>\n" +
                "                  <ns6:CurrencyMarket>3</ns6:CurrencyMarket>\n" +
                "                  <ns6:MidRevalRate>109.6</ns6:MidRevalRate>\n" +
                "                  <ns6:BuyRate>104.35</ns6:BuyRate>\n" +
                "                  <ns6:SellRate>104.85</ns6:SellRate>\n" +
                "                  <ns6:CurrencyMarketDesc>T.T.</ns6:CurrencyMarketDesc>\n" +
                "               </ns6:mKCBIBMWECURRENCYDetailType>\n" +
                "               <ns6:mKCBIBMWECURRENCYDetailType>\n" +
                "                  <ns6:CurrencyName/>\n" +
                "                  <ns6:CurrencyCode/>\n" +
                "                  <ns6:CurrencyMarket>10</ns6:CurrencyMarket>\n" +
                "                  <ns6:MidRevalRate>109.6</ns6:MidRevalRate>\n" +
                "                  <ns6:BuyRate>104.25</ns6:BuyRate>\n" +
                "                  <ns6:SellRate>104.75</ns6:SellRate>\n" +
                "                  <ns6:CurrencyMarketDesc>Cash</ns6:CurrencyMarketDesc>\n" +
                "               </ns6:mKCBIBMWECURRENCYDetailType>\n" +
                "               <ns6:mKCBIBMWECURRENCYDetailType>\n" +
                "                  <ns6:CurrencyName/>\n" +
                "                  <ns6:CurrencyCode/>\n" +
                "                  <ns6:CurrencyMarket>11</ns6:CurrencyMarket>\n" +
                "                  <ns6:MidRevalRate>109.6</ns6:MidRevalRate>\n" +
                "                  <ns6:BuyRate>104.45</ns6:BuyRate>\n" +
                "                  <ns6:SellRate>104.95</ns6:SellRate>\n" +
                "                  <ns6:CurrencyMarketDesc>Coastal Rates</ns6:CurrencyMarketDesc>\n" +
                "               </ns6:mKCBIBMWECURRENCYDetailType>\n" +
                "            </ns6:gKCBIBMWECURRENCYDetailType>\n" +
                "         </KCBIBMWECURRENCYType>\n" +
                "      </ns10:KCBCurrencyListingResponse>\n" +
                "   </S:Body>\n" +
                "</S:Envelope>\n";

//        FormatXmlString formatXmlString = new FormatXmlString();
//        String fromattedXml = formatXmlString.sanitizeXmlString(sampleXml);
//        System.out.println("Formatted XML \n"+fromattedXml);


    }
}
