package com.onset.onpage.hubapi.client;

public class HubApiClient {
    public static void main(String[] args) {
        // Specify recipient's list
        Recipient[] recipients = new Recipient[1];
        recipients[0] = new Recipient("RECIPIENT_PAGER_NUMBER");

        // Specify Sender email address
        Sender sender = new Sender(SENDER_TYPE.EMAIL, "SENDER_EMAIL_ADDRESS");

        // Request ENTERPRISE_NAME and TOKEN from OnPage Support
        sendPage("ENTERPRISE_NAME", "TOKEN", sender, recipients, "YOUR_SUBJECT", "YOUR_MESSAGE");
    }

    private static void sendPage(
            String name, String token, Sender sender, Recipient[] recipients, String subject, String body
    ) {
        try {
            if (subject == null) {
                if (body != null) {
                    int len = Math.min(80, body.length());
                    subject = body.substring(0, len) + "...";
                } else {
                    subject = "<EMPTY_MESSAGE>";
                }
            }

            HubStub binding = (HubStub) new OnPage_x0020_HUB_x0020_APILocator().getOnPage_x0020_HUB_x0020_APISoap12();
            Credentials credentials = new Credentials();
            credentials.setToken(name + "+" + token);
            Message[] messages = new Message[1];
            Message page = new Message(
                    null, // GENERATE MESSAGE ID INSTEAD OF NULL
                    sender,
                    recipients,
                    subject,
                    body,
                    null, // LEAVE THIS NULL
                    null, // LEAVE THIS NULL
                    0 // LEAVE THIS 0
            );
            messages[0] = page;

            SendMessageResult sendMessageResult = binding.sendMessage(credentials, messages);

            final MessageResult[] sentMessages = sendMessageResult.getMessages();
            for (MessageResult sentMessage : sentMessages) {
                if(sentMessage.isACCEPTED()) {
                    System.out.println("Message is ACCEPTED");
                } else {
                    System.out.println("Message is NOT ACCEPTED");
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}