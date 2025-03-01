package com.codeAlpha.chatBot;

import opennlp.tools.tokenize.SimpleTokenizer;
import org.springframework.stereotype.Component;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component

public class NLPProcessor {

    public String preprocessText(String text){
        text=text.toLowerCase().trim();

        SimpleTokenizer tokenizer=SimpleTokenizer.INSTANCE;
        String [] tokens=tokenizer.tokenize(text);

        List<String> stopwords =Arrays.asList("is","a","the","of","at","and");
        List<String>filteredTokens=Arrays.stream(tokens)
                .filter(token ->!stopwords.contains(token))
                .collect(Collectors.toList());
        return String.join(" ", filteredTokens);
    }

}
