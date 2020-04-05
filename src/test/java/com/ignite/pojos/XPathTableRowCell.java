package com.ignite.pojos;

public class XPathTableRowCell {

    public String  Xpath(int table,int row,int cell){

        return "(//table)["+table+"]//tr["+row+"]//td["+cell+"]";

    }

}
