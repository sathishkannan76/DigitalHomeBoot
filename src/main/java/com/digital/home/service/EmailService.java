package com.digital.home.service;

import java.util.Properties;
import java.util.UUID;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import com.digital.home.model.User;

public class EmailService {

	public void sendEmail(com.digital.home.model.User user) {

		Properties prop = new Properties();
		prop.put("mail.smtp.auth", true);
		prop.put("mail.smtp.starttls.enable", "true");
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.port", "587");
		prop.put("mail.smtp.ssl.trust", "*");
		//String host = "http://167.99.153.42:4200/";
		String host = "http://localhost:4200/";
		
		Session session = Session.getInstance(prop, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("indiancommunity2019@gmail.com", "Test2019");
			}
		});
		
		String uniqueID = UUID.randomUUID().toString();
		System.out.println("Unique ID" + uniqueID);
		System.out.println("User ID " + user.getUserId());

		Message message = new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress("indiancommunity2019@gmail.com"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(user.getEmail()));
			message.setSubject("Finish setting up your new IndianCommunity account");
			String emailLink = host + "confirmRegistration?email=" + user.getEmail();
			String msg = "<h4>Hi,<br/><br/>" + "Welcome to Indian Community. Your new account comes with access to few services.\n"
					+ "Here are a few tips to get you started."
					+ "<br/> Please <a href=\"" + emailLink + "\" > Click the link to confirm</a>"
					+ "<br/><br/>Regards"
					+ "<br/>Admin</h4>";

			MimeBodyPart mimeBodyPart = new MimeBodyPart();
			mimeBodyPart.setContent(msg, "text/html");

			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(mimeBodyPart);

			message.setContent(multipart, "text/html");

			Transport.send(message);
			
		} catch (AddressException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
            e.printStackTrace();                                                                                    			e.printStackTrace();
		}
	}
}
