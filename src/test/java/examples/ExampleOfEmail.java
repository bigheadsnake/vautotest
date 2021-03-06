package examples;

import org.testng.annotations.Test;
import basic.EmailProvider;
import clients.EmailClient;
import examples.classes.lists.MyList;
import factories.RequestsFactory;
import requests.EmailRequest;

public class ExampleOfEmail {

	@Test
	public void test() {

		// initiate all elements.
		EmailClient ec = new EmailClient(EmailProvider.SMTP, "smtp.xxx.com");
		MyList list = RequestsFactory.initElements(ec, MyList.class);
		EmailRequest myEmail = list.myEmail;

		// print some information of elements
		System.out.println(String.valueOf(myEmail.getMessages()));

		// execute email
		myEmail.execute();

		// print some response of email
		System.out.println(String.valueOf(myEmail.getResponses()));

	}
}
