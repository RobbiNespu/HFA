package io.robbinespu.tables;

public class CustomHashRandomProbing {
    /* Todo: answers are duplicate, maybe it have same index?
      for example eg: {q1,r1} = {y} and {q1,r2} = {y} , which mean the both answered Y on Question 1
      so we should hash(answers) and copy the index on arrays

    --------
    |___Y__| index 0 <-- store (q1,r1) and (q1,r2) here (index : 0) == array answersQ1 = [ 0,0,1.....]
    |___N__| index 1 <--- q1,r3
    |__NIL_|

    */
}
