package solid;

import java.awt.*;

public class SingleResponsibility {

    // single responsibility principle - bad example

    interface IEmail {
        public void setSender(String sender);

        public void setReceiver(String receiver);

        public void setContent(String content);
    }

    class Email implements IEmail {

        public void setSender(String sender) {/* set sender; */}

        public void setReceiver(String receiver) {/* set receiver; */}

        public void setContent(String content) {/* set content; */}

    }
}


// single responsibility principle - good example
interface IEmail {
    public void setSender(String sender);
    public void setReceiver(String receiver);
    public void setContent(IContent content);
}

interface IContent {
    public String getAsString(); // used for serialization
    public Image getAsImage();
}

class Email implements IContent {
    @Override
    public String getAsString() {
        return null;
    }

    @Override
    public Image getAsImage() {
        return null;
    }

    public void setSender(String sender) {// set sender;
    }

    public void setReceiver(String receiver) {// set receiver;
    }

    public void setContent(IContent content) {// set content;
    }

    public void anyMethod() {

        Email email = new Email();

        IContent iContent = new Email();
        email.setContent((IContent) iContent);
        iContent.getAsImage();

    }
}