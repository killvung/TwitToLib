/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twittermadlibs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;
import static twittermadlibs.TwitterMadLibs.words;

/**
 *
 * @author justi
 */
public class WordSet {
    int[] counts = new int[7];
    public ArrayList<Word> nouns = new ArrayList<Word>();
    public ArrayList<Word> pluralNouns = new ArrayList<Word>();
    public ArrayList<Word> verbs = new ArrayList<Word>();
    public ArrayList<Word> pastVerbs = new ArrayList<Word>();
    public ArrayList<Word> adverbs = new ArrayList<Word>();
    public ArrayList<Word> adjectives = new ArrayList<Word>();
    public ArrayList<Word> numbers = new ArrayList<Word>();
    
    public void sortAndCountSets()
    {
        Collections.sort(words.numbers);
        for(Word w : words.numbers)
        {
            System.out.print(w.word + " (" + w.weight + ") ");
            counts[6]+=w.weight;
        }
        System.out.println();

        Collections.sort(words.nouns);
        for(Word w : words.nouns)
        {
            System.out.print(w.word + " (" + w.weight + ") ");
            counts[0]+=w.weight;
        }
        System.out.println("");

        Collections.sort(words.pluralNouns);
        for(Word w : words.pluralNouns)
        {
            System.out.print(w.word + " (" + w.weight + ") ");
            counts[1]+=w.weight;
        }
        System.out.println("");

        Collections.sort(words.verbs);
        for(Word w : words.verbs)
        {
            System.out.print(w.word + " (" + w.weight + ") ");
            counts[2]+=w.weight;
        }
        System.out.println("");

        Collections.sort(words.pastVerbs);
        for(Word w : words.pastVerbs)
        {
            System.out.print(w.word + " (" + w.weight + ") ");
            counts[3]+=w.weight;
        }
        System.out.println("");

        Collections.sort(words.adverbs);
        for(Word w : words.adverbs)
        {
            System.out.print(w.word + " (" + w.weight + ") ");
            counts[4]+=w.weight;
        }
        System.out.println("");

        Collections.sort(words.adjectives);
        for(Word w : words.adjectives)
        {
            System.out.print(w.word + " (" + w.weight + ") ");
            counts[5]+=w.weight;
        }
        System.out.println("");
        
        System.out.println(randomNoun());
        System.out.println(randomPluralNoun());
        System.out.println(randomVerb());
        System.out.println(randomPastVerb());
        System.out.println(randomAdverb());
        System.out.println(randomAdjective());
        System.out.println(randomNumber());
    }
    
    public String randomNoun()
    {
        if(counts[0]==0)
            return "";
        int randomInt = (int)(Math.random() * (counts[0]));
        int i = 0;
        for(; randomInt > 0; i++)
        {
            randomInt -= nouns.get(i).weight;
        }
        return nouns.get(i).word;
    }
    
    public String randomPluralNoun()
    {
        if(counts[1]==0)
            return "";
        int randomInt = (int)(Math.random() * (counts[1]));
        int i = 0;
        for(; randomInt > 0; i++)
        {
            randomInt -= pluralNouns.get(i).weight;
        }
        return pluralNouns.get(i).word;
    }
    
    public String randomVerb()
    {
        if(counts[2]==0)
            return "";
        int randomInt = (int)(Math.random() * (counts[2]));
        int i = 0;
        for(; randomInt > 0; i++)
        {
            randomInt -= verbs.get(i).weight;
        }
        return verbs.get(i).word;
    }
    
    public String randomPastVerb()
    {
        if(counts[3]==0)
            return "";
        int randomInt = (int)(Math.random() * (counts[3]));
        int i = 0;
        for(; randomInt > 0; i++)
        {
            randomInt -= pastVerbs.get(i).weight;
        }
        return pastVerbs.get(i).word;
    }
    
    public String randomAdverb()
    {
        if(counts[4]==0)
            return "";
        int randomInt = (int)(Math.random() * (counts[4]));
        int i = 0;
        for(; randomInt > 0; i++)
        {
            randomInt -= adverbs.get(i).weight;
        }
        return adverbs.get(i).word;
    }
    
    public String randomAdjective()
    {
        if(counts[5]==0)
            return "";
        int randomInt = (int)(Math.random() * (counts[5]));
        int i = 0;
        for(; randomInt > 0; i++)
        {
            randomInt -= adjectives.get(i).weight;
        }
        return adjectives.get(i).word;
    }
    
    public String randomNumber()
    {
        if(counts[6]==0)
            return "";
        int randomInt = (int)(Math.random() * (counts[6]));
        int i = 0;
        for(; randomInt > 0; i++)
        {
            randomInt -= numbers.get(i).weight;
        }
        return numbers.get(i).word;
    }
}