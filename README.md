# N-Gram-Algorithm

I.	INTRODUCTION 

N-Gram Algorithm is the method for finding the repeat rate in a given sequence. The name is composed of n and grams. N is the value at which the repeat is checked. Gram was used to express the pain in this sequence.
In this study, an n-gram algorithm was implemented in Java. The program was tested for 1-gram, 2-grams, and 3-grams on a part of Turkish Novel Corpus, which includes 5 novels. The program outputs were analyzed separately according to the total running time and items-numbers of item list (top 100 items) for 1, 2, and 3-grams.

II.	DEFINITION OF THE ALGORITHM

A.	Methods, Inputs, and Outputs of the Program

The following methods were used in the program:

  •	N-grams method- The n-gram algorithm was used in this method. This method is hearth of the code. [1]
  
  •	main method – 
  
      *Which of the 1-gram, 2-grams or 3-grams is to be executed,
      *File operations, [2]
      *Calculating total running time, [3] are included in this method.
      
  •	Inputs- Value of N
  
  •	Outputs- Total running time and items list (top 100 items)


IV.	TEST RESULTS

Average Total Running Time(s)
1-gram	0.5239747
2-grams	0.308274827
3-grams	0.217310733

The average value of running times in 30 trials is given in Table 1 in seconds. According to the Table 1, 1-gram running time is bigger than 2-grams, and 2-grams running time also bigger than 3-grams.

REFERENCES

[1]	https://stackoverflow.com/questions/3656762/n-gram-generation-from-a-sentence

[2]	https://stackoverflow.com/questions/1844688/how-to-read-all-files-in-a-folder-from-java

[3]	https://github.com/belenyasin/Java-Gecen-Sure-Hesaplama

