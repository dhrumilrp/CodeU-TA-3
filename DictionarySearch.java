package TrivialDictionary;

class DictionarySearch{
	HashMap<String, Integer> calls = new HashMap<String, Integer>();
	
	Integer isInDictionary(String word){
		if(calls.containsKey(word)) return calls.get(word);
		calls.put(word, TrivialDictionary.wordAt(word));
		return TrivialDictionary.wordAt(word);
	}
}