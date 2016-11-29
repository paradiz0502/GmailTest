package utils;

import pages.*;
import pages.POLogin.LoginPage;
import pages.POMain.MainPage;
import pages.POSendMessageForm.*;
import pages.POSentMessage.SentMessage;


public class PageProvider {
    private SentMessage sentMessage;
    private MainPage mainPage;
    private SendMessageForm sendMessageForm;
    private LoginPage loginPage;



    public SentMessage SentMessagePage(){
        if (sentMessage == null){
            return  sentMessage = new SentMessage();
        }
        return sentMessage;
    }



    public MainPage Main(){
        if (mainPage == null){
            return  mainPage = new MainPage();
        }
        return mainPage;
    }

    public SendMessageForm SendMessageForm(){
        if (sendMessageForm == null){
            return  sendMessageForm = new SendMessageForm();
        }
        return sendMessageForm;
    }


    public LoginPage Login(){
        if (loginPage== null){
            return  loginPage = new LoginPage();
        }
        return loginPage;
    }








}
