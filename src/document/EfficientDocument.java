package document;

import java.util.List;

/** 
 * @author UC San Diego Intermediate Programming MOOC team
 */
public class EfficientDocument extends Document {

	private int numWords;  // The number of words in the document
	private int numSentences;  // The number of sentences in the document
	private int numSyllables;  // The number of syllables in the document
	
	public EfficientDocument(String text)
	{
		super(text);
		processText();
	}
	
	
	/** 
	 * Take a string that either contains only alphabetic characters,
	 * @param tok The string to check
	 * @return true if tok is a word, false if it is punctuation. 
	 */
	private boolean isWord(String tok)
	{
		return !(tok.indexOf("!") >=0 || tok.indexOf(".") >=0 || tok.indexOf("?")>=0);
	}
	

	private void processText()
	{
		List<String> tokens = getTokens("[!?.]+|[a-zA-Z]+");
		numWords = 0;
		numSentences = 0;
		numSyllables = 0;
		for (int i=0;i<tokens.size();i++) {
			if (isWord(tokens.get(i))) {
				numWords += 1;
				numSyllables += countSyllables(tokens.get(i));
				if(i == tokens.size() -1) {
					numSentences += 1;
				}
			} else {
				numSentences += 1;
			}
		}
	}

	
	/**
	 * Get the number of sentences in the document.
	 * @return The number of sentences in the document.
	 */
	@Override
	public int getNumSentences() {
		return numSentences;
	}

	
	/**
	 * Get the number of words in the document.
	 * @return The number of words in the document.
	 */
	@Override
	public int getNumWords() {
	    return numWords;
	}


	/**
	 * Get the total number of syllables in the document (the stored text). 
	 * @return The number of syllables in the document.
	 */
	@Override
	public int getNumSyllables() {
              return numSyllables;
	}
	
	
	public static void main(String[] args)
	{
//	    testCase(new EfficientDocument("This is a test.  How many???  "
//                + "Senteeeeeeeeeences are here... there should be 5!  Right?"),
//                16, 13, 5);
//        testCase(new EfficientDocument(""), 0, 0, 0);
//        testCase(new EfficientDocument("sentence, with, lots, of, commas.!  "
//                + "(And some poaren)).  The output is: 7.5."), 15, 11, 4);
//        testCase(new EfficientDocument("many???  Senteeeeeeeeeences are"), 6, 3, 2); 
//        testCase(new EfficientDocument("Here is a series of test sentences. Your program should "
//				+ "find 3 sentences, 33 words, and 49 syllables. Not every word will have "
//				+ "the correct amount of syllables (example, for example), "
//				+ "but most of them will."), 49, 33, 3);
//		testCase(new EfficientDocument("Segue"), 2, 1, 1);
//		testCase(new EfficientDocument("Sentence"), 2, 1, 1);
//		testCase(new EfficientDocument("Sentences?!"), 3, 1, 1);
//		testCase(new EfficientDocument("Lorem ipsum dolor sit amet, qui ex choro quodsi moderatius, nam dolores explicari forensibus ad."),
//		         32, 15, 1);
//		
		Document doc=new EfficientDocument("Once upon a time there lived a queen who had been the mother of a great many children, and of them all only one daughter was left. But then SHE was worth at least a thousand.\r\n" + 
				"\r\n" + 
				"Her mother, who, since the death of the King, her father, had nothing in the world she cared for so much as this little Princess, was so terribly afraid of losing her that she quite spoiled her, and never tried to correct any of her faults. The consequence was that this little person, who was as pretty as possible, and was one day to wear a crown, grew up so proud and so much in love with her own beauty that she despised everyone else in the world.\r\n" + 
				"\r\n" + 
				"The Queen, her mother, by her caresses and flatteries, helped to make her believe that there was nothing too good for her. She was dressed almost always in the prettiest frocks, as a fairy, or as a queen going out to hunt, and the ladies of the Court followed her dressed as forest fairies.\r\n" + 
				"\r\n" + 
				"And to make her more vain than ever the Queen caused her portrait to be taken by the cleverest painters and sent it to several neighboring kings with whom she was very friendly.\r\n" + 
				"\r\n" + 
				"When they saw this portrait they fell in love with the Princess--every one of them, but upon each it had a different effect. One fell ill, one went quite crazy, and a few of the luckiest set off to see her as soon as possible, but these poor princes became her slaves the moment they set eyes on her");
		 System.out.println(doc.getFleschScore()+" "+
				doc.getNumSentences() + 
				" "+ doc.getNumSyllables()+ 
				" "+ doc.getNumWords());
		
	}
	

}