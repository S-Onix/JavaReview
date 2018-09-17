package thisIsJAVA.Practice.chapter11.messageformatEx;

import java.text.MessageFormat;

public class MessageFormatEx {

    public void run(){
        MessageFormatEx fe = new MessageFormatEx();
        System.out.println(fe.insert("String1", "String2"));

    }

    public String insert(Object value1, Object value2){
        String sql = "insert into values ( {0} , {1} )";
        Object argument[] = {"'"+value1+"'", "'"+value2+"'"};
        return MessageFormat.format(sql,argument);
    }
}
