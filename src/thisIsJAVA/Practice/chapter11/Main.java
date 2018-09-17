package thisIsJAVA.Practice.chapter11;

import thisIsJAVA.Practice.chapter11.clone.CloneExample;
import thisIsJAVA.Practice.chapter11.member.MemberExample;
import thisIsJAVA.Practice.chapter11.messageformatEx.MessageFormatEx;
import thisIsJAVA.Practice.chapter11.regularexpression.RegularExpEx;
import thisIsJAVA.Practice.chapter11.stringtokenizer.StringTokenizerEx;

public class Main {
    public static void main(String[] args) {
        MemberExample me = new MemberExample();
        me.run();

        CloneExample ce = new CloneExample();
        ce.run();

        StringTokenizerEx ste = new StringTokenizerEx();
        ste.run();

        RegularExpEx ree = new RegularExpEx();
        ree.run();

        MessageFormatEx mfe = new MessageFormatEx();
        mfe.run();
    }
}
