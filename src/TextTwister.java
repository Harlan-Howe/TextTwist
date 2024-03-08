import java.io.*;
import java.util.ArrayList;

public class TextTwister
{

    ArrayList<String> dictionary;

    public TextTwister()
    {
        loadDictionary();
    }

    /**
     * reads the words in the file "word_list_moby_crossword.flat.txt" into the "dictionary" ArrayList.
     */
    private static void loadDictionary() {
        ArrayList<String> dictionary = new ArrayList<String>();
        File inputFile = new File("word_list_moby_crossword.flat.txt");
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String word;
            while((word = reader.readLine())!=null)
            {
                dictionary.add(word);
            }

        }catch (FileNotFoundException fnfExp)
        {
            System.out.println("File not found.");
            fnfExp.printStackTrace();
        }
        catch (IOException ioExp)
        {
            ioExp.printStackTrace();
        }
        System.out.println("Dictionary Loaded. "+dictionary.size());
    }

    /**
     * takes a string and makes a copy with the letter at index i removed.
     * For example:
     *      stringWithLetterAtIndexRemoved("bird", 2) --> "bid"
     *      stringWithLetterAtIndexRemoved("bird", 0) --> "ird"
     *      stringWithLetterAtIndexRemoved("rodent", 5) --> "roden"
     *      stringWithLetterAtIndexRemoved("rodent", 6) --> throws an exception.
     * @param s - the source string
     * @param i - the index of the character to remove
     * @return - a string that is one character shorter than s.
     */
    public String stringWithLetterAtIndexRemoved(String s, int i)
    {
        String result = "";
        // TODO: (OPTIONAL) you write this! (I think you will find this helpful later....)

        return result;
    }


    /**
     * given a source word, returns an ArrayList of all the strings that are composed of the letters contained in
     * wordToTwist in any order, where each letter appears exactly zero on one time.
     * In the case of repeated letters, like "Hello," there might be repeats or the letter "l" might be used twice.
     * -- So getting "Heo," "Helo," "Helo," and "Hello" (amongst many others) would be expected.
     * Optional: return just the list of "real" words.
     * @param wordToTwist - the source string to manipulate.
     * @return - an ArrayList of strings build from the wordToTwist.
     */
    public ArrayList<String> twistWord(String wordToTwist)
    {
        ArrayList<String> result = null;
        // TODO: write this method.
        // This is almost certainly a wrapper method that should
        // call a recursive method that returns an ArrayList of
        // Strings that you will subsequently return.

        return result;
    }

    // TODO: write a recursive method that receives a String for
    //  the "prefix" and the String for the "pool" and returns
    //  an ArrayList of all the possible "words" that start with the
    //  prefix and contain some, none, or all of the letters in the pool.

    /**
     * returns a new list of words that all start with contents of "prefix" and have combinations of the letters in
     * "pool"
     * @param prefix - the starting part of all words to be generated
     * @param pool - the letters available to "play" with to make new words
     * @return - a list of words that start with "prefix" and end with a combination of letters in "pool" zero or one
     * times.
     */
    public ArrayList<String> twistWord(String prefix, String pool)
    {
        System.out.println("prefix: '"+prefix+"'\tpool: '"+pool+";"); // recommended for debugging.
        ArrayList<String> result = null;
        // TODO: write this recursive method.

        return result;
    }

    // TODO: (optional) given an ArrayList of "words," returns another
    //  ArrayList of all the words on this list that are actually found
    //  in the dictionary.

    /**
     * given a list of strings, returns a list of strings contained in the original list that were also contained in
     * the "word_list_moby_crossword.flat.txt" file.
     * @param randomWords - an ArrayList of random strings
     * @return an ArrayList of strings found in randomWords that are actual words.
     */
    public ArrayList<String> getRealWordsFromList(ArrayList<String> randomWords)
    {
        ArrayList<String> realWords = new ArrayList<String>();
        // TODO (Optional) - Load in the "word_list_moby_crossword.flat.txt" file (See Boggle or BST for how to do this)
        //                   and search in that dictionary for each word in randomWords, appending each one you find to
        //                   result. Your search can be linear, or a binary search. (If you wish to do a recursive
        //                   binary search, you'll want to write a separate, recursive method - this method isn't
        //                   recursive.)
        //loads the words from the dictionary file into memory.


        return realWords;
    }
}
