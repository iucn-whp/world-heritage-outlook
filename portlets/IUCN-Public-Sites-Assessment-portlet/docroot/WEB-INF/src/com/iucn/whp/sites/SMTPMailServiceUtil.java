package com.iucn.whp.sites;

import java.io.UnsupportedEncodingException;

import javax.mail.internet.*;

import com.liferay.mail.service.MailServiceUtil;
import com.liferay.portal.kernel.mail.MailMessage;

public class SMTPMailServiceUtil {

	public static void send(String fromName, String fromAddress, String toName, String toAddress, String subject, String mailBody) throws AddressException {
		InternetAddress from = null;
		InternetAddress to = null;
		try {
		from = new InternetAddress(fromAddress, fromName);
		to = new InternetAddress(toAddress, toName);
		} catch (UnsupportedEncodingException usee) {
		// ignore
		}
		if (from != null && to != null) {
			MailMessage mailMessage = new MailMessage(from, subject, mailBody, false);

			InternetAddress[] toAddr = InternetAddress.parse(toAddress);
			mailMessage.setTo(toAddr);
			MailServiceUtil.sendEmail(mailMessage);
	
			/*MailMessage message = new MailMessage(from, to, subject, mailBody, true);
			MailServiceUtil.sendEmail(message);*/
				
			
		}

	}
}