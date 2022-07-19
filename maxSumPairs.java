import java.util.*;
public class maxSumPairs{
  
public static int biggestIndexVal = 0;
public static int secondBiggestIndexVal = 0;


  

public static void main(String[] args){
  int biggestPairSum = 0;
  List<Integer> aList = new ArrayList<Integer>();
  aList.add(100);
  aList.add(20);
  aList.add(30);
  aList.add(40);
  aList.add(0);
  aList.add(-2);
  aList.add(-1);
  aList.add(-99);
  aList.add(-38);
  aList.add(1001);
  aList.add(100001);
  int firstMaxValue = obtainBiggestVal(aList);
  biggestPairSum = biggestPairSum + firstMaxValue;
  
  
  modifyList(aList);
  System.out.println();

  int secondMaxValue = obtainUpdatedBiggestVal(aList);
  biggestPairSum = biggestPairSum + secondMaxValue;
  



   
   

  
  



  System.out.println("The biggest pair sum value is: "+biggestPairSum+"");
  System.out.println();
  System.out.println("The first max value is: "+firstMaxValue);
  System.out.println("The index of the first max value is: "+biggestIndexVal);
  System.out.println();
  System.out.println("The second max value is: "+secondMaxValue);
   System.out.println("The index of the second max value is: "+secondBiggestIndexVal);
}


public static int obtainBiggestVal(List<Integer> myLis){
  int biggestValue = Integer.MIN_VALUE;
  int i = 0;
  for(i=0; i< myLis.size(); i++){
    if(myLis.get(i)>=biggestValue){
      biggestValue = myLis.get(i);
      biggestIndexVal = i;
    }
  }
  return biggestValue;
}


public static void modifyList(List<Integer>myLis){
  myLis.set(biggestIndexVal,Integer.MIN_VALUE);
}
  
public static int obtainUpdatedBiggestVal(List<Integer>myLis){
  int largestVal = myLis.get(0);
  int j = 0;
  for(j=0; j<myLis.size(); j++){
    if(myLis.get(j)>=largestVal){
      largestVal = myLis.get(j);
      secondBiggestIndexVal = j;
    }
  }

  return largestVal;
}
  
}



