package com.aktar.selenium;

import org.junit.Test;

public class HomePage4 extends BrowserOpens {
@Test
public void SignOnpage4(){
selene.click("primaryMenu2");
selene.type("usr_name", "sanakt6161");
selene.type("usr_password" ,"SS567567!");
//selene.click("Log_In_To_ Accounts");
}
}
