package com.alexo.springframework.basics.xml;

public class XmlPersonDAO {

    XmlJdbcConnection xmljdbcConnection;

    public XmlJdbcConnection getXmljdbcConnection() {
        return xmljdbcConnection;
    }

    public void setXmljdbcConnection(XmlJdbcConnection xmljdbcConnection) {
        this.xmljdbcConnection = xmljdbcConnection;
    }
}
