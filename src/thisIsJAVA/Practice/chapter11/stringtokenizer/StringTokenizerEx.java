package thisIsJAVA.Practice.chapter11.stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerEx {
    public void run(){
        String inputText = "gkgkgkgkgkg.gkgkgkgkgkqkqkq.zosdfmoqwef.kwadjpfoiz";
        StringTokenizer st = new StringTokenizer(inputText,".");
        String [] resultText = new String[st.countTokens()];

        while (st.hasMoreTokens()){
            resultText[resultText.length-st.countTokens()] = st.nextToken();
        }

        for(int i = 0; i < resultText.length; i++){
            System.out.println(resultText[i]);
        }
    }
}
