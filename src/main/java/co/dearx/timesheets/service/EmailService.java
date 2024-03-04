package co.dearx.timesheets.service;

public interface EmailService {

	void sendEmailWithAttachment(String to, String subject, String text, String attachmentPath);
}