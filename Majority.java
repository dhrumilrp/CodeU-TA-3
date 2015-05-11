	Integer hasMajority(ArrayList<Integer> a){

		HashMap<Integer, Integer> dict = new HashMap<Integer,Integer>();
		int i = 0;
		while(i < a.size()){
			if(!dict.containsKey(i)){
				dict.put(i, Collections.frequency(i));
			}
			if(100*dict.get(i)/a.size() > 50){
				return a.get(i);
			}
			i++;
		}
	}

	Integer hasMajority(ArrayList<Integer> a){
		ArrayList<Integer> b = Collections.sort(a);
		int maj = b.get(0);
		int count = 1;
		int count2 = 1; //holds actually maj count 

		while(i < b.size()){
			if(b.get(i) == b.get(i-1)){
				count++;
			} 
			else{
				if(count > count2){
					count2 = count;
					maj = b.get(i-1);
				}
				count = 1;
			}
			i++;
		}
	}