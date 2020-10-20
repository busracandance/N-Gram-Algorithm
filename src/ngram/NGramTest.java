package ngram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class NGramTest {
	
	public static String[] ngrams(String s, int len) {
		
	    String[] parts = s.split(" ");
	    String[] result = new String[parts.length - len + 1];
	    for(int i = 0; i < parts.length - len + 1; i++) {
	       StringBuilder sb = new StringBuilder();
	       for(int k = 0; k < len; k++) {
	           if(k > 0) sb.append(' ');
	           sb.append(parts[i+k]);
	       }
	       result[i] = sb.toString();
	    }
	    return result;
	}

	public static void main(String[] args) throws IOException {
		
		String input = JOptionPane.showInputDialog("Enter N:", "2");
		int n = Integer.parseInt(input);
        
		while(n<1 || n>3) {
			input = JOptionPane.showInputDialog("Error N (value must be between 1 and 3):","2");
			n = Integer.parseInt(input);
		}
			
		
		long start_time = System.nanoTime();
		
		File folder = new File("Novel-Samples\\");
     	File[] listOfFiles = folder.listFiles();
	
	
		for (File file : listOfFiles) {
		 
			 if (!file.isFile()) 
				 	continue;
			 
			 BufferedReader br = new BufferedReader(new FileReader(file)); 
			  
			  String st; 
			  List<String> rows =new ArrayList<String>();
			  int index = 0;
			  while ((st = br.readLine()) != null) {
				  st = st.trim();
				  if(st.equals(""))
					  continue;
				  if(!st.contains(" ")) {
					  if(index!=0)
						  	rows.set(index-1, rows.get(index-1).concat(" "+ st));
				  }
					 
				  else {
					  rows.add(st);
					  index++;
				  }
				  	
			  } 
		
			  int count = 0;
			  for (String string : rows) {
				  String[] result = ngrams(string, n);
				 
			 if(count<100) {
					  for (int i = 0; i < result.length; i++) {
						  	count++;
							System.out.println(result[i]);
							if(count==100)
								break;
						}
				  }
					
			}
		}
		long end_time = System.nanoTime(); 
		long running_time = end_time - start_time; // Geçen süre nanosaniye cinsinden elde edilir
		double seconds = (double)running_time/1000000000;
		System.out.println("Total running time (s)="+seconds);
		
	}

}
