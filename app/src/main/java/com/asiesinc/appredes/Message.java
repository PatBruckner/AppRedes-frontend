package com.asiesinc.appredes;

public class Message {
    private String idMessage;
    private String idUser;
    private String messageText;

    public Message(String idMessage, String idUser, String messageText) {
        this.idMessage = idMessage;
        this.idUser = idUser;
        this.messageText = messageText;
    }

    public String getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(String idMessage) {
        this.idMessage = idMessage;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }
}
